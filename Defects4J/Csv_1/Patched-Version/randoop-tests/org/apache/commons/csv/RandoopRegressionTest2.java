package org.apache.commons.csv;

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
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser29 = new org.apache.commons.csv.CSVParser("", cSVFormat28);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withHeader(strArray31);
        java.lang.String str33 = cSVFormat24.format(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray37 = cSVFormat34.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap38 = null;
        org.apache.commons.csv.CSVRecord cSVRecord39 = new org.apache.commons.csv.CSVRecord(strArray37, strMap38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = new org.apache.commons.csv.CSVFormat('a', ',', ' ', '4', false, false, "[, , , hi!, hi!]", strArray37);
        java.lang.String str41 = cSVFormat9.format(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat42 = new org.apache.commons.csv.CSVFormat('a', '4', 'a', 'a', false, false, "Delimiter=<,> Encapsulator=<\">", strArray37);
        boolean boolean43 = cSVFormat42.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1002");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withEscape('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat17.withEmptyLinesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withEmptyLinesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser54 = new org.apache.commons.csv.CSVParser("", cSVFormat53);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat53.withHeader(strArray56);
        java.lang.String str58 = cSVFormat49.format(strArray56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray56);
        java.util.Map<java.lang.String, java.lang.Integer> strMap60 = null;
        org.apache.commons.csv.CSVRecord cSVRecord61 = new org.apache.commons.csv.CSVRecord(strArray56, strMap60);
        java.util.Map<java.lang.String, java.lang.Integer> strMap62 = null;
        org.apache.commons.csv.CSVRecord cSVRecord63 = new org.apache.commons.csv.CSVRecord(strArray56, strMap62);
        java.util.Iterator<java.lang.String> strItor64 = cSVRecord63.iterator();
        java.lang.String[] strArray65 = cSVRecord63.values();
        org.apache.commons.csv.CSVFormat cSVFormat66 = new org.apache.commons.csv.CSVFormat('#', '#', '\"', '\t', true, false, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray65);
        org.apache.commons.csv.CSVFormat cSVFormat67 = new org.apache.commons.csv.CSVFormat('\ufffe', '\"', 'a', '\ufffe', true, true, "[, , , hi!, hi!]", strArray65);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat27.withHeader(strArray65);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(strItor64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(cSVFormat68);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1003");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape('\ufffe');
        boolean boolean22 = cSVFormat19.isSurroundingSpacesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1004");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = null;
        org.apache.commons.csv.CSVLexer cSVLexer15 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader14);
        char char16 = cSVFormat0.getEncapsulator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1005");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        char char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.CSVLexer cSVLexer7 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader6);
        boolean boolean8 = cSVFormat4.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean13 = cSVFormat12.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat12);
        java.lang.String str15 = cSVFormat12.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withDelimiter('4');
        cSVFormat17.validate();
        java.lang.String str19 = cSVFormat17.toString();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser22 = new org.apache.commons.csv.CSVParser("", cSVFormat21);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap27);
        java.lang.String str29 = cSVFormat10.format(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat10.withLineSeparator("Delimiter=< > Encapsulator=<\"> EmptyLines:ignored");
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withLineSeparator("Delimiter=<4> Encapsulator=<\">");
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser55 = new org.apache.commons.csv.CSVParser("", cSVFormat54);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat54.withHeader(strArray57);
        java.lang.String str59 = cSVFormat50.format(strArray57);
        org.apache.commons.csv.CSVFormat cSVFormat60 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray57);
        java.lang.String[] strArray61 = cSVFormat60.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat62 = new org.apache.commons.csv.CSVFormat('\"', ',', '#', '#', false, true, "Delimiter=< > Encapsulator=<\"> EmptyLines:ignored", strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat31.withHeader(strArray61);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\r\n" + "'", str15, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str19, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(cSVFormat63);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1006");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray15);
        java.lang.String str19 = cSVFormat0.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat0.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser34 = new org.apache.commons.csv.CSVParser("", cSVFormat33);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withHeader(strArray36);
        java.lang.String str38 = cSVFormat29.format(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray36);
        java.util.Map<java.lang.String, java.lang.Integer> strMap40 = null;
        org.apache.commons.csv.CSVRecord cSVRecord41 = new org.apache.commons.csv.CSVRecord(strArray36, strMap40);
        java.util.Map<java.lang.String, java.lang.Integer> strMap42 = null;
        org.apache.commons.csv.CSVRecord cSVRecord43 = new org.apache.commons.csv.CSVRecord(strArray36, strMap42);
        java.util.Iterator<java.lang.String> strItor44 = cSVRecord43.iterator();
        java.lang.String[] strArray45 = cSVRecord43.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap46 = null;
        org.apache.commons.csv.CSVRecord cSVRecord47 = new org.apache.commons.csv.CSVRecord(strArray45, strMap46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat21.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat48.withEncapsulator('#');
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat48.withLineSeparator("\"\"   hi! hi!");
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader55 = null;
        org.apache.commons.csv.CSVLexer cSVLexer56 = new org.apache.commons.csv.CSVLexer(cSVFormat48, extendedBufferedReader55);
        boolean boolean57 = cSVFormat48.isSurroundingSpacesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(strItor44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1007");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        boolean boolean6 = cSVFormat5.isSurroundingSpacesIgnored();
        char char7 = cSVFormat5.getDelimiter();
        boolean boolean8 = cSVFormat5.isCommentingEnabled();
        java.lang.String str9 = cSVFormat5.toString();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean12 = cSVFormat11.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat11);
        java.lang.String str14 = cSVFormat11.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withDelimiter('4');
        cSVFormat16.validate();
        java.lang.String str18 = cSVFormat16.toString();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser21 = new org.apache.commons.csv.CSVParser("", cSVFormat20);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withHeader(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat16.withHeader(strArray23);
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray23, strMap26);
        int int28 = cSVRecord27.size();
        java.lang.String str29 = cSVRecord27.toString();
        java.lang.String[] strArray30 = cSVRecord27.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap31 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray30, strMap31);
        java.lang.String str33 = cSVFormat5.format(strArray30);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ',' + "'", char7 == ',');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<,> Encapsulator=<\"> EmptyLines:ignored" + "'", str9, "Delimiter=<,> Encapsulator=<\"> EmptyLines:ignored");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\r\n" + "'", str14, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str18, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[hi!]" + "'", str29, "[hi!]");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1008");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withLineSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withDelimiter(',');
        java.lang.String[] strArray29 = cSVFormat24.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat30 = new org.apache.commons.csv.CSVFormat(' ', '4', ',', 'a', true, true, "[hi!]", strArray29);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader31 = null;
        org.apache.commons.csv.CSVLexer cSVLexer32 = new org.apache.commons.csv.CSVLexer(cSVFormat30, extendedBufferedReader31);
        char char33 = cSVFormat30.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + 'a' + "'", char33 == 'a');
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1009");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat7);
        java.lang.String str10 = cSVFormat7.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        cSVFormat12.validate();
        java.lang.String str14 = cSVFormat12.toString();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser("", cSVFormat16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray19);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat3.withHeader(strArray19);
        boolean boolean25 = cSVFormat3.isEmptyLinesIgnored();
        char char26 = cSVFormat3.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat3.withEncapsulator(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str14, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\"' + "'", char26 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1010");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        char char4 = cSVFormat3.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withDelimiter(',');
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ' ' + "'", char4 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1011");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("", cSVFormat6);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(strArray9);
        java.lang.String str11 = cSVFormat2.format(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withLineSeparator("\"\"   hi! hi!");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat0.withLineSeparator("hi!hi!");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1012");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser29 = new org.apache.commons.csv.CSVParser("", cSVFormat28);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withHeader(strArray31);
        java.lang.String str33 = cSVFormat24.format(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray37 = cSVFormat34.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap38 = null;
        org.apache.commons.csv.CSVRecord cSVRecord39 = new org.apache.commons.csv.CSVRecord(strArray37, strMap38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = new org.apache.commons.csv.CSVFormat('a', ',', ' ', '4', false, false, "[, , , hi!, hi!]", strArray37);
        java.lang.String str41 = cSVFormat9.format(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat42 = new org.apache.commons.csv.CSVFormat(',', ' ', ',', '\ufffe', false, false, "", strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentStart('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat63 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser64 = new org.apache.commons.csv.CSVParser("", cSVFormat63);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat63.withHeader(strArray66);
        java.lang.String str68 = cSVFormat59.format(strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat70 = new org.apache.commons.csv.CSVFormat('\ufffe', ' ', '\"', '\ufffe', true, true, "\"\",,,hi!,hi!,", strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat44.withHeader(strArray66);
        java.util.Map<java.lang.String, java.lang.Integer> strMap72 = null;
        org.apache.commons.csv.CSVRecord cSVRecord73 = new org.apache.commons.csv.CSVRecord(strArray66, strMap72);
        int int74 = cSVRecord73.size();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1013");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart(' ');
        char char6 = cSVFormat5.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = null;
        org.apache.commons.csv.CSVLexer cSVLexer8 = new org.apache.commons.csv.CSVLexer(cSVFormat5, extendedBufferedReader7);
        boolean boolean10 = cSVLexer8.isWhitespace(0);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVLexer8.format;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Escape=<a> Encapsulator=<\"> SurroundingSpaces:ignored", cSVFormat11);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser14.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser14.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\ufffe' + "'", char6 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNull(cSVRecord16);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1014");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withEscape('\t');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withEncapsulator('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1015");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser29 = new org.apache.commons.csv.CSVParser("", cSVFormat28);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withHeader(strArray31);
        java.lang.String str33 = cSVFormat24.format(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray37 = cSVFormat34.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap38 = null;
        org.apache.commons.csv.CSVRecord cSVRecord39 = new org.apache.commons.csv.CSVRecord(strArray37, strMap38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = new org.apache.commons.csv.CSVFormat('a', ',', ' ', '4', false, false, "[, , , hi!, hi!]", strArray37);
        java.lang.String str41 = cSVFormat9.format(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat42 = new org.apache.commons.csv.CSVFormat(',', ' ', ',', '\ufffe', false, false, "", strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentStart('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat63 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser64 = new org.apache.commons.csv.CSVParser("", cSVFormat63);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat63.withHeader(strArray66);
        java.lang.String str68 = cSVFormat59.format(strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat70 = new org.apache.commons.csv.CSVFormat('\ufffe', ' ', '\"', '\ufffe', true, true, "\"\",,,hi!,hi!,", strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat44.withHeader(strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat71.withLineSeparator("Delimiter=<,> Encapsulator=< > CommentStart=<,>");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1016");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = null;
        org.apache.commons.csv.CSVLexer cSVLexer24 = new org.apache.commons.csv.CSVLexer(cSVFormat22, extendedBufferedReader23);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = cSVLexer24.getLineNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1017");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray15);
        java.lang.String str19 = cSVFormat0.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat0.withEmptyLinesIgnored(false);
        java.lang.String[] strArray22 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat0.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat0.withEmptyLinesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withEncapsulator('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1018");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withDelimiter('4');
        org.apache.commons.csv.CSVParser cSVParser15 = new org.apache.commons.csv.CSVParser("\"\",,,hi!,hi!,", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser15.getRecord();
        java.util.Iterator<java.lang.String> strItor17 = cSVRecord16.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVRecord16);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1019");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser13.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser13.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor16 = cSVParser13.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNotNull(cSVRecordItor16);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1020");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str19 = cSVFormat11.format(strArray18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray18, strMap20);
        java.lang.String[] strArray22 = cSVRecord21.values();
        java.lang.String[] strArray23 = cSVRecord21.values();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"   hi! hi!" + "'", str19, "\"\"   hi! hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1021");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withDelimiter(',');
        char char22 = cSVFormat21.getEscape();
        java.lang.String str23 = cSVFormat21.toString();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + ' ' + "'", char22 == ' ');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Delimiter=<,> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored" + "'", str23, "Delimiter=<,> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1022");
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser27 = new org.apache.commons.csv.CSVParser("", cSVFormat26);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withHeader(strArray29);
        java.lang.String str31 = cSVFormat22.format(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withLineSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat32.withDelimiter(',');
        char char37 = cSVFormat36.getEscape();
        org.apache.commons.csv.CSVParser cSVParser38 = new org.apache.commons.csv.CSVParser("[, , , hi!, hi!]", cSVFormat36);
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser51 = new org.apache.commons.csv.CSVParser("", cSVFormat50);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat50.withHeader(strArray53);
        java.lang.String str55 = cSVFormat46.format(strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat56 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withLineSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat56.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean62 = cSVFormat61.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat64.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat68 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean69 = cSVFormat68.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser70 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat68);
        java.lang.String str71 = cSVFormat68.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat68.withDelimiter('4');
        cSVFormat73.validate();
        java.lang.String str75 = cSVFormat73.toString();
        org.apache.commons.csv.CSVFormat cSVFormat77 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser78 = new org.apache.commons.csv.CSVParser("", cSVFormat77);
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat77.withHeader(strArray80);
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat73.withHeader(strArray80);
        java.util.Map<java.lang.String, java.lang.Integer> strMap83 = null;
        org.apache.commons.csv.CSVRecord cSVRecord84 = new org.apache.commons.csv.CSVRecord(strArray80, strMap83);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat64.withHeader(strArray80);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat60.withHeader(strArray80);
        java.lang.String str87 = cSVFormat36.format(strArray80);
        org.apache.commons.csv.CSVFormat cSVFormat88 = new org.apache.commons.csv.CSVFormat('\ufffe', '\t', ',', '\"', true, true, "Delimiter=< > Encapsulator=<\"> EmptyLines:ignored", strArray80);
        org.apache.commons.csv.CSVFormat cSVFormat89 = new org.apache.commons.csv.CSVFormat('a', '4', '#', '4', true, false, "Delimiter=<,> Encapsulator=<\">", strArray80);
        org.apache.commons.csv.CSVFormat cSVFormat91 = cSVFormat89.withSurroundingSpacesIgnored(false);
        boolean boolean92 = cSVFormat91.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + ' ' + "'", char37 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\r\n" + "'", str71, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str75, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(cSVFormat85);
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!hi!" + "'", str87, "hi!hi!");
        org.junit.Assert.assertNotNull(cSVFormat91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1023");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withLineSeparator("\r\n");
        char char23 = cSVFormat22.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser38 = new org.apache.commons.csv.CSVParser("", cSVFormat37);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat37.withHeader(strArray40);
        java.lang.String str42 = cSVFormat33.format(strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray40);
        java.util.Map<java.lang.String, java.lang.Integer> strMap44 = null;
        org.apache.commons.csv.CSVRecord cSVRecord45 = new org.apache.commons.csv.CSVRecord(strArray40, strMap44);
        java.util.Map<java.lang.String, java.lang.Integer> strMap46 = null;
        org.apache.commons.csv.CSVRecord cSVRecord47 = new org.apache.commons.csv.CSVRecord(strArray40, strMap46);
        java.lang.String str48 = cSVRecord47.toString();
        java.lang.String[] strArray49 = cSVRecord47.values();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat22.withHeader(strArray49);
        char char51 = cSVFormat22.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '4' + "'", char23 == '4');
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[hi!]" + "'", str48, "[hi!]");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertTrue("'" + char51 + "' != '" + '#' + "'", char51 == '#');
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1024");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.CSVLexer cSVLexer10 = new org.apache.commons.csv.CSVLexer(cSVFormat6, extendedBufferedReader9);
        org.apache.commons.csv.Token token11 = new org.apache.commons.csv.Token();
        token11.isReady = false;
        boolean boolean14 = token11.isReady;
        org.apache.commons.csv.Token token15 = new org.apache.commons.csv.Token();
        token15.isReady = false;
        boolean boolean18 = token15.isReady;
        boolean boolean19 = token15.isReady;
        org.apache.commons.csv.Token token20 = token15.reset();
        java.lang.StringBuilder stringBuilder21 = token15.content;
        token11.content = stringBuilder21;
        boolean boolean23 = token11.isReady;
        org.apache.commons.csv.Token.Type type24 = token11.type;
        java.lang.StringBuilder stringBuilder25 = token11.content;
        cSVLexer10.trimTrailingSpaces(stringBuilder25);
        boolean boolean28 = cSVLexer10.isWhitespace((int) '4');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type24.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1025");
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withSurroundingSpacesIgnored(true);
        boolean boolean21 = cSVFormat20.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEncapsulator(',');
        java.lang.String str26 = cSVFormat25.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVParser cSVParser29 = new org.apache.commons.csv.CSVParser("[\"\"   hi! hi!, hi!, , \"\"   hi! hi!]", cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1026");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.CSVLexer cSVLexer21 = new org.apache.commons.csv.CSVLexer(cSVFormat17, extendedBufferedReader20);
        boolean boolean22 = cSVFormat17.isEmptyLinesIgnored();
        char char23 = cSVFormat17.getEncapsulator();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '#' + "'", char23 == '#');
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1027");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        int int4 = cSVParser3.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser3.getRecord();
        java.lang.String[] strArray6 = cSVRecord5.values();
        java.util.Spliterator<java.lang.String> strSpliterator7 = cSVRecord5.spliterator();
        int int8 = cSVRecord5.size();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(cSVRecord5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1028");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        char char14 = cSVFormat13.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withLineSeparator("[, , , hi!, hi!]");
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentStart('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ',' + "'", char14 == ',');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1029");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser("", cSVFormat10);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeader(strArray13);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap16);
        java.lang.String[] strArray18 = cSVRecord17.values();
        java.lang.String[] strArray19 = cSVRecord17.values();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1030");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser("", cSVFormat10);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeader(strArray13);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray13, strMap16);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray13, strMap18);
        java.lang.String str20 = cSVRecord19.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!]" + "'", str20, "[hi!]");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1031");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withSurroundingSpacesIgnored(true);
        boolean boolean7 = cSVFormat6.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean10 = cSVFormat9.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat9);
        java.lang.String str12 = cSVFormat9.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('4');
        cSVFormat14.validate();
        java.lang.String str16 = cSVFormat14.toString();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeader(strArray21);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray21, strMap24);
        java.lang.String[] strArray26 = cSVRecord25.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray26, strMap27);
        java.util.Spliterator<java.lang.String> strSpliterator29 = cSVRecord28.spliterator();
        java.lang.String[] strArray30 = cSVRecord28.values();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat6.withHeader(strArray30);
        char char32 = cSVFormat6.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat6.withDelimiter('a');
        org.apache.commons.csv.CSVParser cSVParser35 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\r\n" + "'", str12, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str16, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strSpliterator29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\"' + "'", char32 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat34);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1032");
        org.apache.commons.csv.Token token0 = new org.apache.commons.csv.Token();
        token0.isReady = false;
        boolean boolean3 = token0.isReady;
        org.apache.commons.csv.Token token4 = new org.apache.commons.csv.Token();
        token4.isReady = false;
        boolean boolean7 = token4.isReady;
        boolean boolean8 = token4.isReady;
        org.apache.commons.csv.Token token9 = token4.reset();
        java.lang.StringBuilder stringBuilder10 = token4.content;
        token0.content = stringBuilder10;
        boolean boolean12 = token0.isReady;
        org.apache.commons.csv.Token token13 = new org.apache.commons.csv.Token();
        token13.isReady = false;
        org.apache.commons.csv.Token.Type type16 = token13.type;
        org.apache.commons.csv.Token token17 = new org.apache.commons.csv.Token();
        token17.isReady = false;
        org.apache.commons.csv.Token.Type type20 = token17.type;
        token13.type = type20;
        org.apache.commons.csv.Token.Type type22 = token13.type;
        token0.type = type22;
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentStart(' ');
        char char29 = cSVFormat28.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader30 = null;
        org.apache.commons.csv.CSVLexer cSVLexer31 = new org.apache.commons.csv.CSVLexer(cSVFormat28, extendedBufferedReader30);
        boolean boolean33 = cSVLexer31.isCommentStart((int) (byte) 0);
        boolean boolean35 = cSVLexer31.isEscape(0);
        boolean boolean37 = cSVLexer31.isCommentStart((int) '#');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean40 = cSVFormat39.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser41 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat39);
        java.lang.String str42 = cSVFormat39.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withDelimiter('4');
        cSVFormat44.validate();
        java.lang.String str46 = cSVFormat44.toString();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader47 = null;
        org.apache.commons.csv.CSVLexer cSVLexer48 = new org.apache.commons.csv.CSVLexer(cSVFormat44, extendedBufferedReader47);
        boolean boolean50 = cSVLexer48.isWhitespace((int) '\ufffe');
        boolean boolean52 = cSVLexer48.isWhitespace((int) (short) -1);
        org.apache.commons.csv.Token token53 = new org.apache.commons.csv.Token();
        token53.isReady = false;
        org.apache.commons.csv.Token.Type type56 = token53.type;
        token53.isReady = false;
        org.apache.commons.csv.Token.Type type59 = token53.type;
        java.lang.StringBuilder stringBuilder60 = token53.content;
        cSVLexer48.trimTrailingSpaces(stringBuilder60);
        cSVLexer31.trimTrailingSpaces(stringBuilder60);
        token0.content = stringBuilder60;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type16.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type20.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type22.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\ufffe' + "'", char29 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\r\n" + "'", str42, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str46, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + type56 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type56.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type59 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type59.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(stringBuilder60);
        org.junit.Assert.assertEquals(stringBuilder60.toString(), "");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1033");
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser21 = new org.apache.commons.csv.CSVParser("", cSVFormat20);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withHeader(strArray23);
        java.lang.String str25 = cSVFormat16.format(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray23);
        java.lang.String str27 = cSVFormat8.format(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat28 = new org.apache.commons.csv.CSVFormat('#', '\"', 'a', ' ', false, false, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray23);
        org.apache.commons.csv.CSVParser cSVParser29 = new org.apache.commons.csv.CSVParser("hi!Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat28);
        int int30 = cSVParser29.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord31 = cSVParser29.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(cSVRecord31);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1034");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        char char4 = cSVFormat2.getEncapsulator();
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Escape=<a> Encapsulator=<\"> SurroundingSpaces:ignored", cSVFormat2);
        boolean boolean6 = cSVFormat2.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\"' + "'", char4 == '\"');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1035");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        char char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.CSVLexer cSVLexer7 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader6);
        boolean boolean8 = cSVFormat4.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean13 = cSVFormat12.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat12);
        java.lang.String str15 = cSVFormat12.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withDelimiter('4');
        cSVFormat17.validate();
        java.lang.String str19 = cSVFormat17.toString();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser22 = new org.apache.commons.csv.CSVParser("", cSVFormat21);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeader(strArray24);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray24, strMap27);
        java.lang.String str29 = cSVFormat10.format(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat10.withSurroundingSpacesIgnored(true);
        java.lang.String str32 = cSVFormat31.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withEmptyLinesIgnored(true);
        boolean boolean35 = cSVFormat31.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat31.withDelimiter('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\r\n" + "'", str15, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str19, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\r\n" + "'", str32, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(cSVFormat37);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1036");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withSurroundingSpacesIgnored(true);
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable23 = cSVFormat21.parse(reader22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1037");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        int int14 = cSVParser13.getLineNumber();
        int int15 = cSVParser13.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord16 = cSVParser13.getRecord();
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord16.spliterator();
        int int18 = cSVRecord16.size();
        java.lang.String[] strArray19 = cSVRecord16.values();
        java.lang.String str21 = cSVRecord16.get((int) (short) 1);
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord16.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(cSVRecord16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strItor22);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1038");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord3 = cSVParser2.getRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser2.iterator();
        int int5 = cSVParser2.getLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser2.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(cSVRecord3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cSVRecordList6);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1039");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart(' ');
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("\"\",,,hi!,hi!,", cSVFormat3);
        int int7 = cSVParser6.getLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser6.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser6.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecord10);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1040");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat14.withDelimiter(' ');
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str33 = cSVFormat25.format(strArray32);
        java.lang.String str34 = cSVFormat13.format(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat13.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withSurroundingSpacesIgnored(false);
        boolean boolean39 = cSVFormat38.isSurroundingSpacesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"   hi! hi!" + "'", str33, "\"\"   hi! hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\",,,hi!,hi!," + "'", str34, "\"\",,,hi!,hi!,");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1041");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord19.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord19.spliterator();
        java.lang.String str22 = cSVRecord19.toString();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord19.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord19.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
        org.junit.Assert.assertNotNull(strSpliterator23);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1042");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("", cSVFormat6);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(strArray9);
        java.lang.String str11 = cSVFormat2.format(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat2.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEncapsulator('4');
        char char16 = cSVFormat13.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat13.withLineSeparator("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser33 = new org.apache.commons.csv.CSVParser("", cSVFormat32);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat32.withHeader(strArray35);
        java.lang.String str37 = cSVFormat28.format(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat38.withEscape('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat38.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser52 = new org.apache.commons.csv.CSVParser("", cSVFormat51);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat51.withHeader(strArray54);
        java.lang.String str56 = cSVFormat47.format(strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat47.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat47.withEscape(' ');
        char char61 = cSVFormat60.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat69 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat73 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser74 = new org.apache.commons.csv.CSVParser("", cSVFormat73);
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat73.withHeader(strArray76);
        java.lang.String str78 = cSVFormat69.format(strArray76);
        org.apache.commons.csv.CSVFormat cSVFormat79 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray76);
        java.lang.String str80 = cSVFormat60.format(strArray76);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat44.withHeader(strArray76);
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat13.withHeader(strArray76);
        java.lang.String str83 = cSVFormat0.format(strArray76);
        java.io.Reader reader84 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable85 = cSVFormat0.parse(reader84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertTrue("'" + char61 + "' != '" + ',' + "'", char61 == ',');
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1043");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray15);
        java.lang.String str19 = cSVFormat0.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat0.withEmptyLinesIgnored(false);
        java.lang.String[] strArray22 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat0.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withLineSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser40 = new org.apache.commons.csv.CSVParser("", cSVFormat39);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat39.withHeader(strArray42);
        java.lang.String str44 = cSVFormat35.format(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray42);
        java.lang.String str46 = cSVFormat27.format(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat27.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat60 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser61 = new org.apache.commons.csv.CSVParser("", cSVFormat60);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat60.withHeader(strArray63);
        java.lang.String str65 = cSVFormat56.format(strArray63);
        org.apache.commons.csv.CSVFormat cSVFormat66 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray63);
        java.util.Map<java.lang.String, java.lang.Integer> strMap67 = null;
        org.apache.commons.csv.CSVRecord cSVRecord68 = new org.apache.commons.csv.CSVRecord(strArray63, strMap67);
        java.util.Map<java.lang.String, java.lang.Integer> strMap69 = null;
        org.apache.commons.csv.CSVRecord cSVRecord70 = new org.apache.commons.csv.CSVRecord(strArray63, strMap69);
        java.util.Iterator<java.lang.String> strItor71 = cSVRecord70.iterator();
        java.lang.String[] strArray72 = cSVRecord70.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap73 = null;
        org.apache.commons.csv.CSVRecord cSVRecord74 = new org.apache.commons.csv.CSVRecord(strArray72, strMap73);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat48.withHeader(strArray72);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat26.withHeader(strArray72);
        boolean boolean77 = cSVFormat26.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(strItor71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1044");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        char char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.CSVLexer cSVLexer7 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader6);
        boolean boolean8 = cSVFormat4.isCommentingEnabled();
        boolean boolean9 = cSVFormat4.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEncapsulator('#');
        boolean boolean12 = cSVFormat11.isEmptyLinesIgnored();
        boolean boolean13 = cSVFormat11.isEmptyLinesIgnored();
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable15 = cSVFormat11.parse(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1045");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('4');
        boolean boolean22 = cSVFormat21.isEncapsulating();
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat21.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same (\"4\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1046");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart(' ');
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("\"\",,,hi!,hi!,", cSVFormat3);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser6.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1047");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        int int14 = cSVParser13.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor16 = cSVParser13.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor17 = cSVParser13.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord18 = cSVParser13.getRecord();
        org.apache.commons.csv.CSVRecord cSVRecord19 = cSVParser13.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertNotNull(cSVRecordItor16);
        org.junit.Assert.assertNotNull(cSVRecordItor17);
        org.junit.Assert.assertNull(cSVRecord18);
        org.junit.Assert.assertNull(cSVRecord19);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1048");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray14, strMap20);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray14, strMap22);
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord23.spliterator();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord23.iterator();
        int int26 = cSVRecord23.size();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1049");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        java.lang.String str20 = cSVFormat17.toString();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withSurroundingSpacesIgnored(true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored" + "'", str20, "Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1050");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat14.withDelimiter(' ');
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str33 = cSVFormat25.format(strArray32);
        java.lang.String str34 = cSVFormat13.format(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat13.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withSurroundingSpacesIgnored(false);
        cSVFormat36.validate();
        boolean boolean40 = cSVFormat36.isEscaping();
        char char41 = cSVFormat36.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"   hi! hi!" + "'", str33, "\"\"   hi! hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\",,,hi!,hi!," + "'", str34, "\"\",,,hi!,hi!,");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\ufffe' + "'", char41 == '\ufffe');
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1051");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        int int3 = cSVParser2.getLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator4 = cSVParser2.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser2.iterator();
        int int6 = cSVParser2.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1052");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('\ufffe');
        char char7 = cSVFormat6.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withLineSeparator("Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\ufffe' + "'", char7 == '\ufffe');
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1053");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('4');
        java.lang.String[] strArray27 = new java.lang.String[] { "Delimiter=<4> Encapsulator=<\">", "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", "hi!", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat21.withHeader(strArray27);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader29 = null;
        org.apache.commons.csv.CSVLexer cSVLexer30 = new org.apache.commons.csv.CSVLexer(cSVFormat28, extendedBufferedReader29);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1054");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser20 = new org.apache.commons.csv.CSVParser("", cSVFormat19);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withHeader(strArray22);
        java.lang.String str24 = cSVFormat15.format(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat15.withDelimiter(' ');
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str34 = cSVFormat26.format(strArray33);
        java.lang.String str35 = cSVFormat14.format(strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat14.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat14.withLineSeparator("Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withSurroundingSpacesIgnored(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser42 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\"   hi! hi!" + "'", str34, "\"\"   hi! hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\",,,hi!,hi!," + "'", str35, "\"\",,,hi!,hi!,");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1055");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withEscape('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEncapsulator(',');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser55 = new org.apache.commons.csv.CSVParser("", cSVFormat54);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat54.withHeader(strArray57);
        java.lang.String str59 = cSVFormat50.format(strArray57);
        org.apache.commons.csv.CSVFormat cSVFormat60 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray57);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat60.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray63 = cSVFormat60.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap64 = null;
        org.apache.commons.csv.CSVRecord cSVRecord65 = new org.apache.commons.csv.CSVRecord(strArray63, strMap64);
        org.apache.commons.csv.CSVFormat cSVFormat66 = new org.apache.commons.csv.CSVFormat('a', ',', ' ', '4', false, false, "[, , , hi!, hi!]", strArray63);
        java.lang.String str67 = cSVFormat35.format(strArray63);
        org.apache.commons.csv.CSVFormat cSVFormat68 = new org.apache.commons.csv.CSVFormat('a', '4', 'a', 'a', false, false, "Delimiter=<,> Encapsulator=<\">", strArray63);
        java.util.Map<java.lang.String, java.lang.Integer> strMap69 = null;
        org.apache.commons.csv.CSVRecord cSVRecord70 = new org.apache.commons.csv.CSVRecord(strArray63, strMap69);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat23.withHeader(strArray63);
        boolean boolean72 = cSVFormat71.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1056");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentStart('4');
        boolean boolean10 = cSVFormat9.isEncapsulating();
        java.lang.String[] strArray36 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray36);
        boolean boolean38 = cSVFormat37.isSurroundingSpacesIgnored();
        java.lang.String[] strArray39 = cSVFormat37.getHeader();
        java.lang.String[] strArray40 = cSVFormat37.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat41 = new org.apache.commons.csv.CSVFormat(',', '\"', '#', '#', true, false, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat42 = new org.apache.commons.csv.CSVFormat('#', 'a', ' ', ',', true, true, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat9.withHeader(strArray40);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(cSVFormat43);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1057");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("Delimiter=<4> Encapsulator=<\">", cSVFormat1);
        int int3 = cSVParser2.getLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator4 = cSVParser2.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser2.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator4);
        org.junit.Assert.assertNotNull(cSVRecord5);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1058");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        char char14 = cSVFormat13.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withLineSeparator("[, , , hi!, hi!]");
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = null;
        org.apache.commons.csv.CSVLexer cSVLexer20 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader19);
        boolean boolean22 = cSVLexer20.isEncapsulator(0);
        boolean boolean24 = cSVLexer20.isDelimiter((int) (byte) 0);
        org.apache.commons.csv.Token token25 = new org.apache.commons.csv.Token();
        token25.isReady = false;
        boolean boolean28 = token25.isReady;
        boolean boolean29 = token25.isReady;
        org.apache.commons.csv.Token.Type type30 = token25.type;
        org.apache.commons.csv.Token token31 = token25.reset();
        org.apache.commons.csv.Token token32 = token25.reset();
        token32.isReady = false;
        org.apache.commons.csv.Token token35 = token32.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token36 = cSVLexer20.nextToken(token35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ',' + "'", char14 == ',');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + type30 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type30.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(token31);
        org.junit.Assert.assertNotNull(token32);
        org.junit.Assert.assertNotNull(token35);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1059");
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withSurroundingSpacesIgnored(true);
        boolean boolean21 = cSVFormat20.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withLineSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat20.withDelimiter(' ');
        char char30 = cSVFormat20.getDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser31 = new org.apache.commons.csv.CSVParser("[Delimiter=<, > Encapsulator=<\"> CommentStart=< > EmptyLines:ignored]", cSVFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The encapsulator character and the delimiter cannot be the same (\"#\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '#' + "'", char30 == '#');
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1060");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor14 = cSVParser13.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator15 = cSVParser13.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor16 = cSVParser13.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator17 = cSVParser13.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordItor14);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator15);
        org.junit.Assert.assertNotNull(cSVRecordItor16);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator17);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1061");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter('4');
        boolean boolean22 = cSVFormat21.isSurroundingSpacesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1062");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser13.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator15 = cSVParser13.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator15);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1063");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord3 = cSVParser2.getRecord();
        int int4 = cSVParser2.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser2.getRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser2.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(cSVRecord3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1064");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape(' ');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1065");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord19.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord19.spliterator();
        java.lang.String str22 = cSVRecord19.toString();
        java.lang.String str23 = cSVRecord19.toString();
        int int24 = cSVRecord19.size();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!]" + "'", str23, "[hi!]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1066");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        char char3 = cSVFormat1.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        char char11 = cSVFormat1.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\ufffe' + "'", char11 == '\ufffe');
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1067");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEncapsulator('4');
        char char14 = cSVFormat11.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withCommentStart(',');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = null;
        org.apache.commons.csv.CSVLexer cSVLexer18 = new org.apache.commons.csv.CSVLexer(cSVFormat11, extendedBufferedReader17);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = cSVLexer18.in;
        boolean boolean21 = cSVLexer18.isCommentStart(1);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(extendedBufferedReader19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1068");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        java.lang.String[] strArray4 = cSVFormat3.getHeader();
        java.lang.String str5 = cSVFormat3.getLineSeparator();
        boolean boolean6 = cSVFormat3.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withEscape('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\r\n" + "'", str5, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1069");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord19.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord19.spliterator();
        java.lang.String str22 = cSVRecord19.toString();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord19.spliterator();
        java.lang.String[] strArray24 = cSVRecord19.values();
        java.lang.String str25 = cSVRecord19.toString();
        java.lang.String str27 = cSVRecord19.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[hi!]" + "'", str25, "[hi!]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1070");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat12);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser13.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord15 = cSVParser13.getRecord();
        java.lang.String str16 = cSVRecord15.toString();
        java.lang.String[] strArray17 = cSVRecord15.values();
        java.lang.String[] strArray18 = cSVRecord15.values();
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord15.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[, , , hi!, hi!]" + "'", str16, "[, , , hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strSpliterator19);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1071");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart(' ');
        char char6 = cSVFormat5.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = null;
        org.apache.commons.csv.CSVLexer cSVLexer8 = new org.apache.commons.csv.CSVLexer(cSVFormat5, extendedBufferedReader7);
        boolean boolean10 = cSVLexer8.isDelimiter((int) (byte) 10);
        boolean boolean12 = cSVLexer8.isEndOfLine(0);
        boolean boolean14 = cSVLexer8.isDelimiter((int) (short) 10);
        boolean boolean15 = cSVLexer8.emptyLinesIgnored;
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = cSVLexer8.in;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVLexer8.format;
        char char18 = cSVFormat17.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withLineSeparator("");
        org.apache.commons.csv.CSVParser cSVParser21 = new org.apache.commons.csv.CSVParser("Delimiter=<4> Encapsulator=<\">", cSVFormat17);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList22 = cSVParser21.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\ufffe' + "'", char6 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(extendedBufferedReader16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\ufffe' + "'", char18 == '\ufffe');
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVRecordList22);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1072");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        char char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.CSVLexer cSVLexer7 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader6);
        boolean boolean9 = cSVLexer7.isWhitespace(0);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVLexer7.format;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withLineSeparator("Delimiter=<,> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser27 = new org.apache.commons.csv.CSVParser("", cSVFormat26);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withHeader(strArray29);
        java.lang.String str31 = cSVFormat22.format(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray29);
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = null;
        org.apache.commons.csv.CSVRecord cSVRecord34 = new org.apache.commons.csv.CSVRecord(strArray29, strMap33);
        java.util.Map<java.lang.String, java.lang.Integer> strMap35 = null;
        org.apache.commons.csv.CSVRecord cSVRecord36 = new org.apache.commons.csv.CSVRecord(strArray29, strMap35);
        java.util.Iterator<java.lang.String> strItor37 = cSVRecord36.iterator();
        java.lang.String[] strArray38 = cSVRecord36.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap39 = null;
        org.apache.commons.csv.CSVRecord cSVRecord40 = new org.apache.commons.csv.CSVRecord(strArray38, strMap39);
        java.lang.String[] strArray41 = cSVRecord40.values();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat10.withHeader(strArray41);
        boolean boolean43 = cSVFormat42.isEncapsulating();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strItor37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1073");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat1, extendedBufferedReader3);
        boolean boolean6 = cSVLexer4.isCommentStart((int) (byte) -1);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart(' ');
        char char12 = cSVFormat11.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = null;
        org.apache.commons.csv.CSVLexer cSVLexer14 = new org.apache.commons.csv.CSVLexer(cSVFormat11, extendedBufferedReader13);
        boolean boolean16 = cSVLexer14.isWhitespace(0);
        boolean boolean18 = cSVLexer14.isCommentStart((int) ',');
        boolean boolean20 = cSVLexer14.isCommentStart(0);
        boolean boolean21 = cSVLexer14.surroundingSpacesIgnored;
        org.apache.commons.csv.Token token22 = new org.apache.commons.csv.Token();
        token22.isReady = false;
        boolean boolean25 = token22.isReady;
        boolean boolean26 = token22.isReady;
        org.apache.commons.csv.Token.Type type27 = token22.type;
        java.lang.StringBuilder stringBuilder28 = token22.content;
        cSVLexer14.trimTrailingSpaces(stringBuilder28);
        boolean boolean31 = cSVLexer14.isEscape((int) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withCommentStart(' ');
        char char37 = cSVFormat36.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader38 = null;
        org.apache.commons.csv.CSVLexer cSVLexer39 = new org.apache.commons.csv.CSVLexer(cSVFormat36, extendedBufferedReader38);
        boolean boolean41 = cSVLexer39.isWhitespace(0);
        boolean boolean43 = cSVLexer39.isCommentStart((int) ',');
        boolean boolean45 = cSVLexer39.isCommentStart((int) (byte) 1);
        boolean boolean47 = cSVLexer39.isWhitespace((int) (short) -1);
        boolean boolean48 = cSVLexer39.emptyLinesIgnored;
        boolean boolean50 = cSVLexer39.isEndOfFile((int) (short) -1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader51 = cSVLexer39.in;
        org.apache.commons.csv.Token token52 = new org.apache.commons.csv.Token();
        token52.isReady = false;
        boolean boolean55 = token52.isReady;
        org.apache.commons.csv.Token.Type type56 = org.apache.commons.csv.Token.Type.TOKEN;
        token52.type = type56;
        boolean boolean58 = token52.isReady;
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withCommentStart(' ');
        char char64 = cSVFormat63.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader65 = null;
        org.apache.commons.csv.CSVLexer cSVLexer66 = new org.apache.commons.csv.CSVLexer(cSVFormat63, extendedBufferedReader65);
        boolean boolean68 = cSVLexer66.isWhitespace(0);
        org.apache.commons.csv.Token token69 = new org.apache.commons.csv.Token();
        token69.isReady = false;
        boolean boolean72 = token69.isReady;
        boolean boolean73 = token69.isReady;
        org.apache.commons.csv.Token token74 = token69.reset();
        java.lang.StringBuilder stringBuilder75 = token69.content;
        cSVLexer66.trimTrailingSpaces(stringBuilder75);
        token52.content = stringBuilder75;
        cSVLexer39.trimTrailingSpaces(stringBuilder75);
        cSVLexer14.trimTrailingSpaces(stringBuilder75);
        cSVLexer4.trimTrailingSpaces(stringBuilder75);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\ufffe' + "'", char12 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type27.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\ufffe' + "'", char37 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(extendedBufferedReader51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + type56 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type56.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertTrue("'" + char64 + "' != '" + '\ufffe' + "'", char64 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(token74);
        org.junit.Assert.assertNotNull(stringBuilder75);
        org.junit.Assert.assertEquals(stringBuilder75.toString(), "");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1074");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser16 = new org.apache.commons.csv.CSVParser("", cSVFormat15);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withHeader(strArray18);
        java.lang.String str20 = cSVFormat11.format(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withDelimiter('4');
        boolean boolean26 = cSVFormat25.isEmptyLinesIgnored();
        java.lang.String[] strArray27 = cSVFormat25.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat0.withHeader(strArray27);
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = null;
        org.apache.commons.csv.CSVRecord cSVRecord30 = new org.apache.commons.csv.CSVRecord(strArray27, strMap29);
        java.lang.String[] strArray31 = cSVRecord30.values();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1075");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser20 = new org.apache.commons.csv.CSVParser("", cSVFormat19);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withHeader(strArray22);
        java.lang.String str24 = cSVFormat15.format(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat15.withDelimiter(' ');
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str34 = cSVFormat26.format(strArray33);
        java.lang.String str35 = cSVFormat14.format(strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat14.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat14.withLineSeparator("Delimiter=<,> Encapsulator=<\">");
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat14.withEncapsulator('\ufffe');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser42 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\"   hi! hi!" + "'", str34, "\"\"   hi! hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\",,,hi!,hi!," + "'", str35, "\"\",,,hi!,hi!,");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1076");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = null;
        org.apache.commons.csv.CSVLexer cSVLexer15 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader14);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = cSVLexer15.in;
        boolean boolean18 = cSVLexer15.isEndOfLine(10);
        boolean boolean20 = cSVLexer15.isEscape((int) (byte) 100);
        boolean boolean22 = cSVLexer15.isEndOfLine((int) ',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(extendedBufferedReader16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1077");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray15);
        java.lang.String str19 = cSVFormat0.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat0.withEmptyLinesIgnored(false);
        java.lang.String[] strArray22 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat0.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat0.withEmptyLinesIgnored(true);
        char char27 = cSVFormat26.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\t' + "'", char27 == '\t');
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1078");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.getRecord();
        java.lang.String[] strArray9 = cSVRecord8.values();
        java.lang.String[] strArray10 = cSVRecord8.values();
        java.lang.String str12 = cSVRecord8.get("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        java.lang.String[] strArray13 = cSVRecord8.values();
        java.lang.String str15 = cSVRecord8.get((int) (byte) 0);
        java.lang.String str16 = cSVRecord8.toString();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Delimiter=<" + "'", str15, "Delimiter=<");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[Delimiter=<, > Encapsulator=<\"> CommentStart=< > EmptyLines:ignored]" + "'", str16, "[Delimiter=<, > Encapsulator=<\"> CommentStart=< > EmptyLines:ignored]");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1079");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray15);
        java.lang.String str19 = cSVFormat0.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat0.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser34 = new org.apache.commons.csv.CSVParser("", cSVFormat33);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withHeader(strArray36);
        java.lang.String str38 = cSVFormat29.format(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray36);
        java.util.Map<java.lang.String, java.lang.Integer> strMap40 = null;
        org.apache.commons.csv.CSVRecord cSVRecord41 = new org.apache.commons.csv.CSVRecord(strArray36, strMap40);
        java.util.Map<java.lang.String, java.lang.Integer> strMap42 = null;
        org.apache.commons.csv.CSVRecord cSVRecord43 = new org.apache.commons.csv.CSVRecord(strArray36, strMap42);
        java.util.Iterator<java.lang.String> strItor44 = cSVRecord43.iterator();
        java.lang.String[] strArray45 = cSVRecord43.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap46 = null;
        org.apache.commons.csv.CSVRecord cSVRecord47 = new org.apache.commons.csv.CSVRecord(strArray45, strMap46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat21.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat48.withEncapsulator('#');
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat48.withLineSeparator("\"\"   hi! hi!");
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader55 = null;
        org.apache.commons.csv.CSVLexer cSVLexer56 = new org.apache.commons.csv.CSVLexer(cSVFormat48, extendedBufferedReader55);
        boolean boolean57 = cSVFormat48.isCommentingEnabled();
        char char58 = cSVFormat48.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(strItor44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + char58 + "' != '" + '\t' + "'", char58 == '\t');
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1080");
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean9 = cSVFormat8.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat8);
        java.lang.String str11 = cSVFormat8.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withDelimiter('4');
        cSVFormat13.validate();
        java.lang.String str15 = cSVFormat13.toString();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser18 = new org.apache.commons.csv.CSVParser("", cSVFormat17);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat13.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = new org.apache.commons.csv.CSVFormat(',', '#', '\ufffe', '4', true, false, "Delimiter=<4> Encapsulator=<\">", strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser36 = new org.apache.commons.csv.CSVParser("", cSVFormat35);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withHeader(strArray38);
        java.lang.String str40 = cSVFormat31.format(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray44 = cSVFormat41.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap45 = null;
        org.apache.commons.csv.CSVRecord cSVRecord46 = new org.apache.commons.csv.CSVRecord(strArray44, strMap45);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat23.withHeader(strArray44);
        char char48 = cSVFormat23.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r\n" + "'", str11, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str15, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + '\ufffe' + "'", char48 == '\ufffe');
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1081");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser20 = new org.apache.commons.csv.CSVParser("", cSVFormat19);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withHeader(strArray22);
        java.lang.String str24 = cSVFormat15.format(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat15.withDelimiter(' ');
        java.lang.String[] strArray33 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str34 = cSVFormat26.format(strArray33);
        java.lang.String str35 = cSVFormat14.format(strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat14.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.CSVParser cSVParser40 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored", cSVFormat37);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withEscape('\ufffe');
        char char43 = cSVFormat42.getEscape();
        boolean boolean44 = cSVFormat42.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\"   hi! hi!" + "'", str34, "\"\"   hi! hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\",,,hi!,hi!," + "'", str35, "\"\",,,hi!,hi!,");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + char43 + "' != '" + '\ufffe' + "'", char43 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1082");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withEscape('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat17.withEscape('a');
        char char26 = cSVFormat17.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat17.withEscape('#');
        java.lang.String[] strArray29 = cSVFormat17.getHeader();
        char char30 = cSVFormat17.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '#' + "'", char26 == '#');
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + ' ' + "'", char30 == ' ');
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1083");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        char char10 = cSVFormat0.getDelimiter();
        char char11 = cSVFormat0.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEmptyLinesIgnored(false);
        java.lang.String str14 = cSVFormat13.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<,> Encapsulator=<\">" + "'", str14, "Delimiter=<,> Encapsulator=<\">");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1084");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat7);
        java.lang.String str10 = cSVFormat7.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        cSVFormat12.validate();
        java.lang.String str14 = cSVFormat12.toString();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser("", cSVFormat16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray19);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat3.withHeader(strArray19);
        boolean boolean25 = cSVFormat3.isEmptyLinesIgnored();
        char char26 = cSVFormat3.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat3.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat3.withDelimiter(',');
        boolean boolean31 = cSVFormat3.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat3.withEscape('\ufffe');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str14, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + 'a' + "'", char26 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(cSVFormat33);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1085");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        java.lang.String str14 = cSVFormat13.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<,> Escape=< > Encapsulator=<\"> EmptyLines:ignored" + "'", str14, "Delimiter=<,> Escape=< > Encapsulator=<\"> EmptyLines:ignored");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1086");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser33 = new org.apache.commons.csv.CSVParser("", cSVFormat32);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat32.withHeader(strArray35);
        java.lang.String str37 = cSVFormat28.format(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray35);
        java.lang.String str39 = cSVFormat20.format(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat20.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser54 = new org.apache.commons.csv.CSVParser("", cSVFormat53);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat53.withHeader(strArray56);
        java.lang.String str58 = cSVFormat49.format(strArray56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray56);
        java.util.Map<java.lang.String, java.lang.Integer> strMap60 = null;
        org.apache.commons.csv.CSVRecord cSVRecord61 = new org.apache.commons.csv.CSVRecord(strArray56, strMap60);
        java.util.Map<java.lang.String, java.lang.Integer> strMap62 = null;
        org.apache.commons.csv.CSVRecord cSVRecord63 = new org.apache.commons.csv.CSVRecord(strArray56, strMap62);
        java.util.Iterator<java.lang.String> strItor64 = cSVRecord63.iterator();
        java.lang.String[] strArray65 = cSVRecord63.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap66 = null;
        org.apache.commons.csv.CSVRecord cSVRecord67 = new org.apache.commons.csv.CSVRecord(strArray65, strMap66);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat41.withHeader(strArray65);
        org.apache.commons.csv.CSVFormat cSVFormat70 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser71 = new org.apache.commons.csv.CSVParser("", cSVFormat70);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat70.withHeader(strArray73);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat41.withHeader(strArray73);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str76 = cSVFormat17.format(strArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The encapsulator character and the delimiter cannot be the same (\"#\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(strItor64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat75);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1087");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("Delimiter=<4> Encapsulator=<\">", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList4 = cSVParser2.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser2.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNotNull(cSVRecordList4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1088");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String str1 = cSVFormat0.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withSurroundingSpacesIgnored(true);
        char char6 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean9 = cSVFormat8.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat8);
        java.lang.String str11 = cSVFormat8.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withDelimiter('4');
        cSVFormat13.validate();
        java.lang.String str15 = cSVFormat13.toString();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser18 = new org.apache.commons.csv.CSVParser("", cSVFormat17);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat13.withHeader(strArray20);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap23);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray20, strMap25);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray20, strMap27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat0.withHeader(strArray20);
        java.lang.String str30 = cSVFormat29.getLineSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\ufffe' + "'", char6 == '\ufffe');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r\n" + "'", str11, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str15, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\r\n" + "'", str30, "\r\n");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1089");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.CSVLexer cSVLexer10 = new org.apache.commons.csv.CSVLexer(cSVFormat6, extendedBufferedReader9);
        boolean boolean12 = cSVLexer10.isWhitespace((int) '\ufffe');
        boolean boolean14 = cSVLexer10.isCommentStart(2);
        org.apache.commons.csv.Token token15 = new org.apache.commons.csv.Token();
        token15.isReady = false;
        boolean boolean18 = token15.isReady;
        boolean boolean19 = token15.isReady;
        org.apache.commons.csv.Token token20 = token15.reset();
        org.apache.commons.csv.Token.Type type21 = token15.type;
        org.apache.commons.csv.Token.Type type22 = token15.type;
        org.apache.commons.csv.Token token23 = new org.apache.commons.csv.Token();
        token23.isReady = false;
        boolean boolean26 = token23.isReady;
        boolean boolean27 = token23.isReady;
        org.apache.commons.csv.Token token28 = token23.reset();
        org.apache.commons.csv.Token.Type type29 = token23.type;
        org.apache.commons.csv.Token.Type type30 = token23.type;
        org.apache.commons.csv.Token token31 = token23.reset();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withCommentStart(' ');
        char char37 = cSVFormat36.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader38 = null;
        org.apache.commons.csv.CSVLexer cSVLexer39 = new org.apache.commons.csv.CSVLexer(cSVFormat36, extendedBufferedReader38);
        boolean boolean41 = cSVLexer39.isDelimiter((int) (byte) 10);
        boolean boolean43 = cSVLexer39.isEndOfLine(0);
        boolean boolean45 = cSVLexer39.isCommentStart((int) ' ');
        boolean boolean47 = cSVLexer39.isEscape((-1));
        org.apache.commons.csv.Token token48 = new org.apache.commons.csv.Token();
        token48.isReady = false;
        boolean boolean51 = token48.isReady;
        org.apache.commons.csv.Token.Type type52 = org.apache.commons.csv.Token.Type.TOKEN;
        token48.type = type52;
        java.lang.StringBuilder stringBuilder54 = token48.content;
        cSVLexer39.trimTrailingSpaces(stringBuilder54);
        token31.content = stringBuilder54;
        token15.content = stringBuilder54;
        cSVLexer10.trimTrailingSpaces(stringBuilder54);
        boolean boolean59 = cSVLexer10.emptyLinesIgnored;
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type21.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type22.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(token28);
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type29.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type30 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type30.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(token31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\ufffe' + "'", char37 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + type52 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type52.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertNotNull(stringBuilder54);
        org.junit.Assert.assertEquals(stringBuilder54.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1090");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.getRecord();
        java.lang.String[] strArray9 = cSVRecord8.values();
        java.lang.String[] strArray10 = cSVRecord8.values();
        java.lang.String str12 = cSVRecord8.get("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        java.lang.String str14 = cSVRecord8.get("\"\"   hi! hi!");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1091");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat7);
        java.lang.String str10 = cSVFormat7.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        cSVFormat12.validate();
        java.lang.String str14 = cSVFormat12.toString();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser("", cSVFormat16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray19);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat3.withHeader(strArray19);
        boolean boolean25 = cSVFormat3.isEmptyLinesIgnored();
        char char26 = cSVFormat3.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = null;
        org.apache.commons.csv.CSVLexer cSVLexer28 = new org.apache.commons.csv.CSVLexer(cSVFormat3, extendedBufferedReader27);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str14, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + 'a' + "'", char26 == 'a');
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1092");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat7);
        java.lang.String str10 = cSVFormat7.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        cSVFormat12.validate();
        java.lang.String str14 = cSVFormat12.toString();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser("", cSVFormat16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray19);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat3.withHeader(strArray19);
        boolean boolean25 = cSVFormat3.isEmptyLinesIgnored();
        boolean boolean26 = cSVFormat3.isEscaping();
        boolean boolean27 = cSVFormat3.isEscaping();
        boolean boolean28 = cSVFormat3.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str14, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1093");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat7);
        java.lang.String str10 = cSVFormat7.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        cSVFormat12.validate();
        java.lang.String str14 = cSVFormat12.toString();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser("", cSVFormat16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeader(strArray19);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = null;
        org.apache.commons.csv.CSVRecord cSVRecord23 = new org.apache.commons.csv.CSVRecord(strArray19, strMap22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat3.withHeader(strArray19);
        java.lang.String[] strArray25 = cSVFormat24.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = null;
        org.apache.commons.csv.CSVRecord cSVRecord27 = new org.apache.commons.csv.CSVRecord(strArray25, strMap26);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str14, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1094");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withEscape('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withEscape(' ');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = null;
        org.apache.commons.csv.CSVLexer cSVLexer25 = new org.apache.commons.csv.CSVLexer(cSVFormat17, extendedBufferedReader24);
        boolean boolean26 = cSVLexer25.emptyLinesIgnored;
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1095");
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser26 = new org.apache.commons.csv.CSVParser("", cSVFormat25);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withHeader(strArray28);
        java.lang.String str30 = cSVFormat21.format(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray34 = cSVFormat31.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap35 = null;
        org.apache.commons.csv.CSVRecord cSVRecord36 = new org.apache.commons.csv.CSVRecord(strArray34, strMap35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = new org.apache.commons.csv.CSVFormat('\"', 'a', 'a', 'a', false, false, "Delimiter=<,> Encapsulator=<\"> EmptyLines:ignored", strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat38 = new org.apache.commons.csv.CSVFormat('\"', 'a', '\"', '4', false, true, "\r\n", strArray34);
        java.lang.String[] strArray39 = cSVFormat38.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray39);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1096");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withLineSeparator("[, , , hi!, hi!]");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withLineSeparator("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1097");
        java.lang.String[] strArray11 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray11);
        java.lang.String[] strArray13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser20 = new org.apache.commons.csv.CSVParser("", cSVFormat19);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withHeader(strArray22);
        java.lang.String str24 = cSVFormat15.format(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat14.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat14.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withLineSeparator("> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1098");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEncapsulator('4');
        char char14 = cSVFormat11.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withCommentStart(',');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = null;
        org.apache.commons.csv.CSVLexer cSVLexer18 = new org.apache.commons.csv.CSVLexer(cSVFormat11, extendedBufferedReader17);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader19 = cSVLexer18.in;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = cSVLexer18.getLineNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(extendedBufferedReader19);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1099");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.CSVLexer cSVLexer10 = new org.apache.commons.csv.CSVLexer(cSVFormat6, extendedBufferedReader9);
        boolean boolean12 = cSVLexer10.isEndOfLine((-1));
        boolean boolean13 = cSVLexer10.surroundingSpacesIgnored;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVLexer10.format;
        boolean boolean16 = cSVLexer10.isEncapsulator((int) (byte) 100);
        boolean boolean17 = cSVLexer10.surroundingSpacesIgnored;
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1100");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("", cSVFormat6);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(strArray9);
        java.lang.String str11 = cSVFormat2.format(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withHeader(strArray9);
        cSVFormat12.validate();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withSurroundingSpacesIgnored(false);
        boolean boolean18 = cSVFormat12.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1101");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray20 = cSVFormat17.getHeader();
        boolean boolean21 = cSVFormat17.isEncapsulating();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = null;
        org.apache.commons.csv.CSVLexer cSVLexer23 = new org.apache.commons.csv.CSVLexer(cSVFormat17, extendedBufferedReader22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat17.withCommentStart(' ');
        java.lang.String[] strArray26 = cSVFormat25.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1102");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.getRecord();
        java.lang.String[] strArray9 = cSVRecord8.values();
        java.lang.String str11 = cSVRecord8.get((int) (byte) 1);
        int int12 = cSVRecord8.size();
        java.lang.String str13 = cSVRecord8.toString();
        java.lang.String str15 = cSVRecord8.get("Delimiter=<,> Escape=< > Encapsulator=<\"> EmptyLines:ignored");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored" + "'", str11, "> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[Delimiter=<, > Encapsulator=<\"> CommentStart=< > EmptyLines:ignored]" + "'", str13, "[Delimiter=<, > Encapsulator=<\"> CommentStart=< > EmptyLines:ignored]");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1103");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray27 = cSVFormat24.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray27, strMap28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = new org.apache.commons.csv.CSVFormat('a', ',', ' ', '4', false, false, "[, , , hi!, hi!]", strArray27);
        java.util.Map<java.lang.String, java.lang.Integer> strMap31 = null;
        org.apache.commons.csv.CSVRecord cSVRecord32 = new org.apache.commons.csv.CSVRecord(strArray27, strMap31);
        java.util.Iterator<java.lang.String> strItor33 = cSVRecord32.iterator();
        java.lang.String str34 = cSVRecord32.toString();
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strItor33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[hi!]" + "'", str34, "[hi!]");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1104");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.CSVLexer cSVLexer10 = new org.apache.commons.csv.CSVLexer(cSVFormat6, extendedBufferedReader9);
        boolean boolean12 = cSVLexer10.isWhitespace((int) '\ufffe');
        boolean boolean14 = cSVLexer10.isWhitespace((int) (short) -1);
        boolean boolean15 = cSVLexer10.emptyLinesIgnored;
        boolean boolean16 = cSVLexer10.emptyLinesIgnored;
        boolean boolean17 = cSVLexer10.emptyLinesIgnored;
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1105");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withDelimiter(',');
        char char22 = cSVFormat21.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withDelimiter('#');
        boolean boolean25 = cSVFormat21.isSurroundingSpacesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + ' ' + "'", char22 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1106");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEncapsulator('4');
        char char14 = cSVFormat11.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withCommentStart(',');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader17 = null;
        org.apache.commons.csv.CSVLexer cSVLexer18 = new org.apache.commons.csv.CSVLexer(cSVFormat11, extendedBufferedReader17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withDelimiter('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1107");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        int int3 = cSVParser2.getLineNumber();
        int int4 = cSVParser2.getLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser2.iterator();
        java.lang.Class<?> wildcardClass6 = cSVRecordItor5.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1108");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        char char10 = cSVFormat0.getDelimiter();
        char char11 = cSVFormat0.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape('\t');
        boolean boolean14 = cSVFormat13.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSurroundingSpacesIgnored(false);
        boolean boolean17 = cSVFormat13.isEncapsulating();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1109");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Spliterator<java.lang.String> strSpliterator20 = cSVRecord19.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord19.spliterator();
        java.lang.String str22 = cSVRecord19.toString();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord19.iterator();
        java.lang.String[] strArray24 = cSVRecord19.values();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord19.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strSpliterator25);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1110");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("", cSVFormat6);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(strArray9);
        java.lang.String str11 = cSVFormat2.format(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withHeader(strArray9);
        cSVFormat12.validate();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser26 = new org.apache.commons.csv.CSVParser("", cSVFormat25);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withHeader(strArray28);
        java.lang.String str30 = cSVFormat21.format(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withDelimiter('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader34 = null;
        org.apache.commons.csv.CSVLexer cSVLexer35 = new org.apache.commons.csv.CSVLexer(cSVFormat31, extendedBufferedReader34);
        java.lang.String[] strArray36 = cSVFormat31.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap37 = null;
        org.apache.commons.csv.CSVRecord cSVRecord38 = new org.apache.commons.csv.CSVRecord(strArray36, strMap37);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat12.withHeader(strArray36);
        java.util.Map<java.lang.String, java.lang.Integer> strMap40 = null;
        org.apache.commons.csv.CSVRecord cSVRecord41 = new org.apache.commons.csv.CSVRecord(strArray36, strMap40);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat39);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1111");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withLineSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withEncapsulator('#');
        char char27 = cSVFormat19.getEscape();
        boolean boolean28 = cSVFormat19.isSurroundingSpacesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + ' ' + "'", char27 == ' ');
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1112");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = null;
        org.apache.commons.csv.CSVRecord cSVRecord19 = new org.apache.commons.csv.CSVRecord(strArray14, strMap18);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray14, strMap20);
        java.lang.String str22 = cSVRecord21.toString();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord21.spliterator();
        java.lang.String[] strArray24 = cSVRecord21.values();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord21.spliterator();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord21.iterator();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertNotNull(strItor26);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1113");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser29 = new org.apache.commons.csv.CSVParser("", cSVFormat28);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withHeader(strArray31);
        java.lang.String str33 = cSVFormat24.format(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray37 = cSVFormat34.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap38 = null;
        org.apache.commons.csv.CSVRecord cSVRecord39 = new org.apache.commons.csv.CSVRecord(strArray37, strMap38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = new org.apache.commons.csv.CSVFormat('a', ',', ' ', '4', false, false, "[, , , hi!, hi!]", strArray37);
        java.lang.String str41 = cSVFormat9.format(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat42 = new org.apache.commons.csv.CSVFormat(',', ' ', ',', '\ufffe', false, false, "", strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentStart('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat63 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser64 = new org.apache.commons.csv.CSVParser("", cSVFormat63);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat63.withHeader(strArray66);
        java.lang.String str68 = cSVFormat59.format(strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat70 = new org.apache.commons.csv.CSVFormat('\ufffe', ' ', '\"', '\ufffe', true, true, "\"\",,,hi!,hi!,", strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat44.withHeader(strArray66);
        java.util.Map<java.lang.String, java.lang.Integer> strMap72 = null;
        org.apache.commons.csv.CSVRecord cSVRecord73 = new org.apache.commons.csv.CSVRecord(strArray66, strMap72);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = cSVRecord73.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat71);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1114");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        char char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.CSVLexer cSVLexer7 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader6);
        boolean boolean9 = cSVLexer7.isCommentStart((int) ' ');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = cSVLexer7.in;
        boolean boolean12 = cSVLexer7.isEscape((int) ',');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = cSVLexer7.in;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVLexer7.format;
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable16 = cSVFormat14.parse(reader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(extendedBufferedReader10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(extendedBufferedReader13);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1115");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.CSVLexer cSVLexer10 = new org.apache.commons.csv.CSVLexer(cSVFormat6, extendedBufferedReader9);
        boolean boolean12 = cSVLexer10.isEndOfLine((-1));
        boolean boolean13 = cSVLexer10.surroundingSpacesIgnored;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVLexer10.format;
        boolean boolean16 = cSVLexer10.isEncapsulator((int) (byte) 100);
        boolean boolean18 = cSVLexer10.isWhitespace((-1));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1116");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        char char3 = cSVFormat1.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentStart('\ufffe');
        boolean boolean6 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser28 = new org.apache.commons.csv.CSVParser("", cSVFormat27);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withHeader(strArray30);
        java.lang.String str32 = cSVFormat23.format(strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray30);
        java.util.Map<java.lang.String, java.lang.Integer> strMap34 = null;
        org.apache.commons.csv.CSVRecord cSVRecord35 = new org.apache.commons.csv.CSVRecord(strArray30, strMap34);
        java.util.Map<java.lang.String, java.lang.Integer> strMap36 = null;
        org.apache.commons.csv.CSVRecord cSVRecord37 = new org.apache.commons.csv.CSVRecord(strArray30, strMap36);
        java.util.Iterator<java.lang.String> strItor38 = cSVRecord37.iterator();
        java.lang.String[] strArray39 = cSVRecord37.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap40 = null;
        org.apache.commons.csv.CSVRecord cSVRecord41 = new org.apache.commons.csv.CSVRecord(strArray39, strMap40);
        org.apache.commons.csv.CSVFormat cSVFormat42 = new org.apache.commons.csv.CSVFormat('\t', '\"', 'a', ',', true, false, "Delimiter=<,> Encapsulator=<\"> EmptyLines:ignored", strArray39);
        java.lang.String str43 = cSVFormat8.format(strArray39);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1117");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.getRecord();
        java.lang.String[] strArray9 = cSVRecord8.values();
        java.lang.String[] strArray10 = cSVRecord8.values();
        java.util.Spliterator<java.lang.String> strSpliterator11 = cSVRecord8.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord8.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strSpliterator12);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1118");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withDelimiter('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withSurroundingSpacesIgnored(false);
        char char22 = cSVFormat21.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\ufffe' + "'", char22 == '\ufffe');
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1119");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        int int3 = cSVParser2.getLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator4 = cSVParser2.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser2.iterator();
        java.lang.Class<?> wildcardClass6 = cSVRecordItor5.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1120");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("hi!");
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.CSVLexer cSVLexer21 = new org.apache.commons.csv.CSVLexer(cSVFormat17, extendedBufferedReader20);
        boolean boolean22 = cSVLexer21.surroundingSpacesIgnored;
        boolean boolean24 = cSVLexer21.isEndOfLine(0);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1121");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withEncapsulator(',');
        java.lang.String str25 = cSVFormat24.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withEncapsulator('\"');
        java.io.Reader reader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable29 = cSVFormat27.parse(reader28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1122");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEmptyLinesIgnored(true);
        char char6 = cSVFormat5.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withLineSeparator("\"\"\"\"\"   hi! hi!\",hi!,,\"\"\"\"\"   hi! hi!\"");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withEmptyLinesIgnored(false);
        boolean boolean11 = cSVFormat5.isEncapsulating();
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withCommentStart('\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ',' + "'", char6 == ',');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1123");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEmptyLinesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withEmptyLinesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean8 = cSVFormat7.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        char char14 = cSVFormat12.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser("", cSVFormat16);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withHeader(strArray19);
        java.lang.String str21 = cSVFormat12.format(strArray19);
        java.lang.String str22 = cSVFormat7.format(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat2.withHeader(strArray19);
        char char24 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat2.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentStart(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + ' ' + "'", char24 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1124");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentStart('#');
        boolean boolean20 = cSVFormat17.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withLineSeparator("Delimiter=<,> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1125");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray20 = cSVFormat17.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap23);
        java.lang.String str25 = cSVRecord24.toString();
        java.util.Spliterator<java.lang.String> strSpliterator26 = cSVRecord24.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = cSVRecord24.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[hi!]" + "'", str25, "[hi!]");
        org.junit.Assert.assertNotNull(strSpliterator26);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1126");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean9 = cSVFormat8.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat8);
        java.lang.String str11 = cSVFormat8.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withDelimiter('4');
        cSVFormat13.validate();
        java.lang.String str15 = cSVFormat13.toString();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser18 = new org.apache.commons.csv.CSVParser("", cSVFormat17);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat13.withHeader(strArray20);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        org.apache.commons.csv.CSVRecord cSVRecord24 = new org.apache.commons.csv.CSVRecord(strArray20, strMap23);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat4.withHeader(strArray20);
        org.apache.commons.csv.CSVParser cSVParser26 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat4);
        boolean boolean27 = cSVFormat4.isEncapsulating();
        java.lang.String[] strArray28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat4.withHeader(strArray28);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r\n" + "'", str11, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str15, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1127");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        char char14 = cSVFormat13.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSurroundingSpacesIgnored(true);
        java.lang.String str17 = cSVFormat16.getLineSeparator();
        boolean boolean18 = cSVFormat16.isEncapsulating();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ',' + "'", char14 == ',');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r\n" + "'", str17, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1128");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat14.withDelimiter(' ');
        java.lang.String[] strArray32 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str33 = cSVFormat25.format(strArray32);
        java.lang.String str34 = cSVFormat13.format(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat13.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader37 = null;
        org.apache.commons.csv.CSVLexer cSVLexer38 = new org.apache.commons.csv.CSVLexer(cSVFormat36, extendedBufferedReader37);
        boolean boolean40 = cSVLexer38.isWhitespace((int) '\"');
        boolean boolean42 = cSVLexer38.isEncapsulator((int) (byte) 0);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"   hi! hi!" + "'", str33, "\"\"   hi! hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\",,,hi!,hi!," + "'", str34, "\"\",,,hi!,hi!,");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1129");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader20 = null;
        org.apache.commons.csv.CSVLexer cSVLexer21 = new org.apache.commons.csv.CSVLexer(cSVFormat17, extendedBufferedReader20);
        boolean boolean23 = cSVLexer21.isEndOfFile((int) '\"');
        boolean boolean24 = cSVLexer21.surroundingSpacesIgnored;
        boolean boolean25 = cSVLexer21.surroundingSpacesIgnored;
        boolean boolean27 = cSVLexer21.isEncapsulator((int) ',');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1130");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEncapsulator('4');
        char char15 = cSVFormat12.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat12.withLineSeparator("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser32 = new org.apache.commons.csv.CSVParser("", cSVFormat31);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withHeader(strArray34);
        java.lang.String str36 = cSVFormat27.format(strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat37 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat37.withEscape('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat37.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser51 = new org.apache.commons.csv.CSVParser("", cSVFormat50);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat50.withHeader(strArray53);
        java.lang.String str55 = cSVFormat46.format(strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat46.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat46.withEscape(' ');
        char char60 = cSVFormat59.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat68 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat68.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat72 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser73 = new org.apache.commons.csv.CSVParser("", cSVFormat72);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat72.withHeader(strArray75);
        java.lang.String str77 = cSVFormat68.format(strArray75);
        org.apache.commons.csv.CSVFormat cSVFormat78 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray75);
        java.lang.String str79 = cSVFormat59.format(strArray75);
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat43.withHeader(strArray75);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat12.withHeader(strArray75);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat12.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat12.withEncapsulator(',');
        org.apache.commons.csv.CSVParser cSVParser86 = new org.apache.commons.csv.CSVParser("Delimiter=<\t> Escape=<\\>", cSVFormat85);
        int int87 = cSVParser86.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\"' + "'", char15 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertTrue("'" + char60 + "' != '" + ',' + "'", char60 == ',');
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNotNull(cSVFormat83);
        org.junit.Assert.assertNotNull(cSVFormat85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1131");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        char char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.CSVLexer cSVLexer7 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader6);
        boolean boolean9 = cSVLexer7.isWhitespace(0);
        boolean boolean11 = cSVLexer7.isCommentStart((int) ',');
        boolean boolean13 = cSVLexer7.isCommentStart(0);
        boolean boolean14 = cSVLexer7.surroundingSpacesIgnored;
        boolean boolean16 = cSVLexer7.isEndOfLine((int) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVLexer7.format;
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser30 = new org.apache.commons.csv.CSVParser("", cSVFormat29);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withHeader(strArray32);
        java.lang.String str34 = cSVFormat25.format(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray32);
        java.util.Map<java.lang.String, java.lang.Integer> strMap36 = null;
        org.apache.commons.csv.CSVRecord cSVRecord37 = new org.apache.commons.csv.CSVRecord(strArray32, strMap36);
        java.util.Map<java.lang.String, java.lang.Integer> strMap38 = null;
        org.apache.commons.csv.CSVRecord cSVRecord39 = new org.apache.commons.csv.CSVRecord(strArray32, strMap38);
        java.util.Iterator<java.lang.String> strItor40 = cSVRecord39.iterator();
        java.lang.String[] strArray41 = cSVRecord39.values();
        java.lang.String str42 = cSVFormat17.format(strArray41);
        java.lang.String str43 = cSVFormat17.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat17.withCommentStart('\"');
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser58 = new org.apache.commons.csv.CSVParser("", cSVFormat57);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat57.withHeader(strArray60);
        java.lang.String str62 = cSVFormat53.format(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withLineSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat63.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat68 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean69 = cSVFormat68.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat68.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat71.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat75 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean76 = cSVFormat75.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser77 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat75);
        java.lang.String str78 = cSVFormat75.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat75.withDelimiter('4');
        cSVFormat80.validate();
        java.lang.String str82 = cSVFormat80.toString();
        org.apache.commons.csv.CSVFormat cSVFormat84 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser85 = new org.apache.commons.csv.CSVParser("", cSVFormat84);
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat88 = cSVFormat84.withHeader(strArray87);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat80.withHeader(strArray87);
        java.util.Map<java.lang.String, java.lang.Integer> strMap90 = null;
        org.apache.commons.csv.CSVRecord cSVRecord91 = new org.apache.commons.csv.CSVRecord(strArray87, strMap90);
        org.apache.commons.csv.CSVFormat cSVFormat92 = cSVFormat71.withHeader(strArray87);
        org.apache.commons.csv.CSVFormat cSVFormat93 = cSVFormat67.withHeader(strArray87);
        org.apache.commons.csv.CSVFormat cSVFormat94 = cSVFormat45.withHeader(strArray87);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(strItor40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\r\n" + "'", str43, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\r\n" + "'", str78, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str82, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat84);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(cSVFormat88);
        org.junit.Assert.assertNotNull(cSVFormat89);
        org.junit.Assert.assertNotNull(cSVFormat92);
        org.junit.Assert.assertNotNull(cSVFormat93);
        org.junit.Assert.assertNotNull(cSVFormat94);
    }
}

