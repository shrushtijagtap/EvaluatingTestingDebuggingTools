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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1002");
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1003");
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1004");
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
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1005");
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1006");
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

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1007");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withEscape(' ');
        char char15 = cSVFormat14.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withEscape(' ');
        cSVFormat19.validate();
        org.apache.commons.csv.CSVParser cSVParser21 = new org.apache.commons.csv.CSVParser("[Delimiter=<, > Encapsulator=<\"> CommentStart=< > EmptyLines:ignored]", cSVFormat19);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList22 = cSVParser21.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + ',' + "'", char15 == ',');
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVRecordList22);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1008");
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
        java.io.Reader reader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable26 = cSVFormat24.parse(reader25);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1009");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("hi!");
        char char20 = cSVFormat17.getDelimiter();
        boolean boolean21 = cSVFormat17.isCommentingEnabled();
        char char22 = cSVFormat17.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat17.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withEncapsulator('4');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '#' + "'", char20 == '#');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '#' + "'", char22 == '#');
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1010");
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
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withCommentStart('a');
        char char27 = cSVFormat19.getCommentStart();
        java.io.Reader reader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable29 = cSVFormat19.parse(reader28);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '4' + "'", char27 == '4');
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1011");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEncapsulator(',');
        char char4 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=< > CommentStart=<,>", cSVFormat3);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser5.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser5.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser5.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\t' + "'", char4 == '\t');
        org.junit.Assert.assertNotNull(cSVRecordItor6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1012");
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
        boolean boolean30 = cSVLexer28.isWhitespace((-1));
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1013");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray21);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray21, strMap25);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray21, strMap27);
        java.util.Iterator<java.lang.String> strItor29 = cSVRecord28.iterator();
        java.lang.String[] strArray30 = cSVRecord28.values();
        org.apache.commons.csv.CSVFormat cSVFormat31 = new org.apache.commons.csv.CSVFormat('#', '#', '\"', '\t', true, false, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray30);
        java.lang.String str32 = cSVFormat31.getLineSeparator();
        boolean boolean33 = cSVFormat31.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withEncapsulator('4');
        java.lang.Class<?> wildcardClass36 = cSVFormat35.getClass();
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored" + "'", str32, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1014");
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
        org.apache.commons.csv.CSVFormat cSVFormat91 = cSVFormat89.withEscape('a');
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
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1015");
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
        boolean boolean14 = cSVFormat13.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withEmptyLinesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape('4');
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
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1016");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        int int8 = cSVParser7.getLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1017");
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
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withLineSeparator("\"\",,,hi!,hi!,");
        boolean boolean17 = cSVFormat16.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withEncapsulator('a');
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1018");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        char char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.CSVLexer cSVLexer7 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader6);
        boolean boolean9 = cSVLexer7.isCommentStart((int) (byte) 10);
        boolean boolean11 = cSVLexer7.isCommentStart((int) '\t');
        boolean boolean12 = cSVLexer7.emptyLinesIgnored;
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean15 = cSVFormat14.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser16 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat14);
        java.lang.String str17 = cSVFormat14.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withDelimiter('4');
        cSVFormat19.validate();
        java.lang.String str21 = cSVFormat19.toString();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader22 = null;
        org.apache.commons.csv.CSVLexer cSVLexer23 = new org.apache.commons.csv.CSVLexer(cSVFormat19, extendedBufferedReader22);
        boolean boolean25 = cSVLexer23.isWhitespace((int) '\ufffe');
        boolean boolean27 = cSVLexer23.isWhitespace((int) (short) -1);
        org.apache.commons.csv.Token token28 = new org.apache.commons.csv.Token();
        token28.isReady = false;
        org.apache.commons.csv.Token.Type type31 = token28.type;
        token28.isReady = false;
        org.apache.commons.csv.Token.Type type34 = token28.type;
        java.lang.StringBuilder stringBuilder35 = token28.content;
        cSVLexer23.trimTrailingSpaces(stringBuilder35);
        cSVLexer7.trimTrailingSpaces(stringBuilder35);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r\n" + "'", str17, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str21, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type31.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type34.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1019");
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
        char char43 = cSVFormat42.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withDelimiter('#');
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
        org.junit.Assert.assertTrue("'" + char43 + "' != '" + 'a' + "'", char43 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat45);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1020");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        char char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.CSVLexer cSVLexer7 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader6);
        boolean boolean9 = cSVLexer7.isCommentStart((int) (byte) 0);
        boolean boolean11 = cSVLexer7.isEscape(0);
        boolean boolean13 = cSVLexer7.isCommentStart((int) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean16 = cSVFormat15.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat15);
        java.lang.String str18 = cSVFormat15.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withDelimiter('4');
        cSVFormat20.validate();
        java.lang.String str22 = cSVFormat20.toString();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader23 = null;
        org.apache.commons.csv.CSVLexer cSVLexer24 = new org.apache.commons.csv.CSVLexer(cSVFormat20, extendedBufferedReader23);
        boolean boolean26 = cSVLexer24.isWhitespace((int) '\ufffe');
        boolean boolean28 = cSVLexer24.isWhitespace((int) (short) -1);
        org.apache.commons.csv.Token token29 = new org.apache.commons.csv.Token();
        token29.isReady = false;
        org.apache.commons.csv.Token.Type type32 = token29.type;
        token29.isReady = false;
        org.apache.commons.csv.Token.Type type35 = token29.type;
        java.lang.StringBuilder stringBuilder36 = token29.content;
        cSVLexer24.trimTrailingSpaces(stringBuilder36);
        cSVLexer7.trimTrailingSpaces(stringBuilder36);
        boolean boolean40 = cSVLexer7.isEncapsulator((int) ' ');
        boolean boolean41 = cSVLexer7.emptyLinesIgnored;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\r\n" + "'", str18, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str22, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type32.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type35.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
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
        boolean boolean20 = cSVFormat17.isEscaping();
        boolean boolean21 = cSVFormat17.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1022");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser20 = new org.apache.commons.csv.CSVParser("", cSVFormat19);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withHeader(strArray22);
        java.lang.String str24 = cSVFormat15.format(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray22);
        java.lang.String str26 = cSVFormat7.format(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat27 = new org.apache.commons.csv.CSVFormat('#', '\"', 'a', ' ', false, false, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withEmptyLinesIgnored(false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1023");
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
        char char14 = cSVFormat13.getEncapsulator();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = null;
        org.apache.commons.csv.CSVLexer cSVLexer16 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVLexer16.format;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1024");
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
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat17.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withEncapsulator('4');
        boolean boolean28 = cSVFormat27.isEncapsulating();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1025");
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
        int int16 = cSVParser13.getLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor17 = cSVParser13.iterator();
        int int18 = cSVParser13.getLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser13.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(cSVRecordItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(cSVRecordList19);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1026");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray21);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray21, strMap25);
        java.util.Spliterator<java.lang.String> strSpliterator27 = cSVRecord26.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator28 = cSVRecord26.spliterator();
        java.lang.String str29 = cSVRecord26.toString();
        java.util.Iterator<java.lang.String> strItor30 = cSVRecord26.iterator();
        java.lang.String[] strArray31 = cSVRecord26.values();
        org.apache.commons.csv.CSVFormat cSVFormat32 = new org.apache.commons.csv.CSVFormat('#', ',', '\"', 'a', false, true, "\"\",,,hi!,hi!,", strArray31);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator27);
        org.junit.Assert.assertNotNull(strSpliterator28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[hi!]" + "'", str29, "[hi!]");
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1027");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("hi!");
        char char20 = cSVFormat17.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withLineSeparator("Delimiter=<\t> Escape=<\\>");
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = null;
        org.apache.commons.csv.CSVLexer cSVLexer26 = new org.apache.commons.csv.CSVLexer(cSVFormat22, extendedBufferedReader25);
        boolean boolean27 = cSVFormat22.isCommentingEnabled();
        boolean boolean28 = cSVFormat22.isSurroundingSpacesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '#' + "'", char20 == '#');
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1028");
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
        int int18 = cSVRecord17.size();
        java.lang.String str19 = cSVRecord17.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = cSVRecord17.get((int) '\"');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!]" + "'", str19, "[hi!]");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1029");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        boolean boolean6 = cSVFormat5.isSurroundingSpacesIgnored();
        char char7 = cSVFormat5.getDelimiter();
        boolean boolean8 = cSVFormat5.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withEncapsulator('\ufffe');
        boolean boolean11 = cSVFormat5.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ',' + "'", char7 == ',');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1030");
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentStart(' ');
        char char13 = cSVFormat12.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = null;
        org.apache.commons.csv.CSVLexer cSVLexer15 = new org.apache.commons.csv.CSVLexer(cSVFormat12, extendedBufferedReader14);
        boolean boolean16 = cSVFormat12.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean21 = cSVFormat20.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser22 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat20);
        java.lang.String str23 = cSVFormat20.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withDelimiter('4');
        cSVFormat25.validate();
        java.lang.String str27 = cSVFormat25.toString();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser30 = new org.apache.commons.csv.CSVParser("", cSVFormat29);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat25.withHeader(strArray32);
        java.util.Map<java.lang.String, java.lang.Integer> strMap35 = null;
        org.apache.commons.csv.CSVRecord cSVRecord36 = new org.apache.commons.csv.CSVRecord(strArray32, strMap35);
        java.lang.String str37 = cSVFormat18.format(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat18.withLineSeparator("Delimiter=< > Encapsulator=<\"> EmptyLines:ignored");
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser52 = new org.apache.commons.csv.CSVParser("", cSVFormat51);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat51.withHeader(strArray54);
        java.lang.String str56 = cSVFormat47.format(strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat57 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray54);
        java.util.Map<java.lang.String, java.lang.Integer> strMap58 = null;
        org.apache.commons.csv.CSVRecord cSVRecord59 = new org.apache.commons.csv.CSVRecord(strArray54, strMap58);
        java.util.Map<java.lang.String, java.lang.Integer> strMap60 = null;
        org.apache.commons.csv.CSVRecord cSVRecord61 = new org.apache.commons.csv.CSVRecord(strArray54, strMap60);
        java.util.Iterator<java.lang.String> strItor62 = cSVRecord61.iterator();
        java.lang.String[] strArray63 = cSVRecord61.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap64 = null;
        org.apache.commons.csv.CSVRecord cSVRecord65 = new org.apache.commons.csv.CSVRecord(strArray63, strMap64);
        java.lang.String[] strArray66 = cSVRecord65.values();
        java.lang.String[] strArray67 = cSVRecord65.values();
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat39.withHeader(strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat69 = new org.apache.commons.csv.CSVFormat('4', '\ufffe', '#', 'a', false, true, "Delimiter=<\t> Escape=<\\>", strArray67);
        cSVFormat69.validate();
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat69.withEscape('\"');
        org.apache.commons.csv.CSVParser cSVParser73 = new org.apache.commons.csv.CSVParser("", cSVFormat72);
        int int74 = cSVParser73.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\ufffe' + "'", char13 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\r\n" + "'", str23, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str27, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(strItor62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1031");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        char char20 = cSVFormat19.getDelimiter();
        boolean boolean21 = cSVFormat19.isEncapsulating();
        boolean boolean22 = cSVFormat19.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\"' + "'", char20 == '\"');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1032");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart(' ');
        char char6 = cSVFormat5.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = null;
        org.apache.commons.csv.CSVLexer cSVLexer8 = new org.apache.commons.csv.CSVLexer(cSVFormat5, extendedBufferedReader7);
        boolean boolean9 = cSVFormat5.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean14 = cSVFormat13.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser15 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat13);
        java.lang.String str16 = cSVFormat13.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withDelimiter('4');
        cSVFormat18.validate();
        java.lang.String str20 = cSVFormat18.toString();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser23 = new org.apache.commons.csv.CSVParser("", cSVFormat22);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat18.withHeader(strArray25);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray25, strMap28);
        java.lang.String str30 = cSVFormat11.format(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat11.withLineSeparator("Delimiter=< > Encapsulator=<\"> EmptyLines:ignored");
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVParser cSVParser35 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> EmptyLines:ignored", cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\ufffe' + "'", char6 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\r\n" + "'", str16, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str20, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1033");
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
        int int16 = cSVParser13.getLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList17 = cSVParser13.getRecords();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor18 = cSVParser13.iterator();
        int int19 = cSVParser13.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(cSVRecordList17);
        org.junit.Assert.assertNotNull(cSVRecordItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1034");
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
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVLexer21.format;
        boolean boolean24 = cSVLexer21.isDelimiter((int) (short) -1);
        java.lang.Class<?> wildcardClass25 = cSVLexer21.getClass();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1035");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25);
        java.lang.String str27 = cSVRecord26.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[hi!]" + "'", str27, "[hi!]");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1036");
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
        int int18 = cSVRecord17.size();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord17.iterator();
        java.lang.String[] strArray20 = cSVRecord17.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord17.get("Delimiter=< > Escape=<\"> Encapsulator=<4> EmptyLines:ignored");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1037");
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
        java.lang.String str27 = cSVFormat19.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored" + "'", str27, "Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1038");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        char char7 = cSVFormat5.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser("", cSVFormat9);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withHeader(strArray12);
        java.lang.String str14 = cSVFormat5.format(strArray12);
        java.lang.String str15 = cSVFormat0.format(strArray12);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = null;
        org.apache.commons.csv.CSVRecord cSVRecord17 = new org.apache.commons.csv.CSVRecord(strArray12, strMap16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = cSVRecord17.get("Delimiter=<,> Escape=<#> Encapsulator=<\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\"' + "'", char7 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1039");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.getRecord();
        java.lang.String[] strArray9 = cSVRecord8.values();
        java.lang.String[] strArray10 = cSVRecord8.values();
        java.lang.String str12 = cSVRecord8.get(0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<" + "'", str12, "Delimiter=<");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1040");
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withDelimiter('4');
        boolean boolean23 = cSVFormat22.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withEmptyLinesIgnored(false);
        java.lang.String[] strArray26 = cSVFormat22.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser27 = new org.apache.commons.csv.CSVParser("Delimiter=<#> Escape=<4> Encapsulator=<\"> EmptyLines:ignored", cSVFormat22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same (\"4\")");
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
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray26);
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray14, strMap20);
        java.util.Spliterator<java.lang.String> strSpliterator22 = cSVRecord21.spliterator();
        java.lang.String[] strArray23 = cSVRecord21.values();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord21.spliterator();
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord21.iterator();
        java.lang.String str26 = cSVRecord21.toString();
        java.util.Iterator<java.lang.String> strItor27 = cSVRecord21.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = cSVRecord21.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[hi!]" + "'", str26, "[hi!]");
        org.junit.Assert.assertNotNull(strItor27);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1042");
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
        int int24 = cSVRecord23.size();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord23.spliterator();
        java.lang.String str27 = cSVRecord23.get(0);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1043");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser7.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser7.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser7.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser7.spliterator();
        int int13 = cSVParser7.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1044");
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
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = null;
        org.apache.commons.csv.CSVLexer cSVLexer26 = new org.apache.commons.csv.CSVLexer(cSVFormat24, extendedBufferedReader25);
        boolean boolean28 = cSVLexer26.isEndOfFile((int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1045");
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
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat30.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser42 = new org.apache.commons.csv.CSVParser("", cSVFormat41);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat41.withHeader(strArray44);
        java.lang.String str46 = cSVFormat37.format(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat37.withDelimiter(' ');
        java.lang.String[] strArray55 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str56 = cSVFormat48.format(strArray55);
        java.util.Map<java.lang.String, java.lang.Integer> strMap57 = null;
        org.apache.commons.csv.CSVRecord cSVRecord58 = new org.apache.commons.csv.CSVRecord(strArray55, strMap57);
        java.lang.String[] strArray59 = cSVRecord58.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap60 = null;
        org.apache.commons.csv.CSVRecord cSVRecord61 = new org.apache.commons.csv.CSVRecord(strArray59, strMap60);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat36.withHeader(strArray59);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\"\"   hi! hi!" + "'", str56, "\"\"   hi! hi!");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(cSVFormat62);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1046");
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
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withLineSeparator("[hi!]");
        boolean boolean25 = cSVFormat22.isCommentingEnabled();
        char char26 = cSVFormat22.getEncapsulator();
        char char27 = cSVFormat22.getEscape();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '#' + "'", char26 == '#');
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + ' ' + "'", char27 == ' ');
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1047");
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
        char char14 = cSVFormat13.getEncapsulator();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = null;
        org.apache.commons.csv.CSVLexer cSVLexer16 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader15);
        boolean boolean17 = cSVFormat13.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
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
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withEscape('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEncapsulator(',');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withEmptyLinesIgnored(false);
        java.lang.String str28 = cSVFormat25.toString();
        boolean boolean29 = cSVFormat25.isEscaping();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Delimiter=<#> Escape=< > Encapsulator=<,> CommentStart=<4> SurroundingSpaces:ignored" + "'", str28, "Delimiter=<#> Escape=< > Encapsulator=<,> CommentStart=<4> SurroundingSpaces:ignored");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1049");
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser("", cSVFormat13);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withHeader(strArray16);
        java.lang.String str18 = cSVFormat9.format(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser21 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat20);
        int int22 = cSVParser21.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord23 = cSVParser21.getRecord();
        java.lang.String[] strArray24 = cSVRecord23.values();
        org.apache.commons.csv.CSVFormat cSVFormat25 = new org.apache.commons.csv.CSVFormat('a', ',', '\t', '\"', false, true, "[, , , hi!, hi!, ]", strArray24);
        org.apache.commons.csv.CSVParser cSVParser26 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=< > CommentStart=<,>", cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(cSVRecord23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1050");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        int int4 = cSVParser3.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser3.getRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        int int7 = cSVParser3.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(cSVRecord5);
        org.junit.Assert.assertNotNull(cSVRecordList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1051");
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
        boolean boolean60 = cSVLexer10.emptyLinesIgnored;
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1052");
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
        cSVFormat2.validate();
        boolean boolean26 = cSVFormat2.isCommentingEnabled();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1053");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord3 = cSVParser2.getRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser2.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser2.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser2.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser2.getRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser2.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser2.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(cSVRecord3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertNull(cSVRecord7);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1054");
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
        org.apache.commons.csv.CSVRecord cSVRecord30 = cSVParser29.getRecord();
        int int31 = cSVParser29.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(cSVRecord30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1055");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEncapsulator('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\"');
        char char16 = cSVFormat15.getEscape();
        boolean boolean17 = cSVFormat15.isCommentingEnabled();
        cSVFormat15.validate();
        boolean boolean19 = cSVFormat15.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = null;
        org.apache.commons.csv.CSVRecord cSVRecord21 = new org.apache.commons.csv.CSVRecord(strArray13, strMap20);
        int int22 = cSVRecord21.size();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1057");
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
        boolean boolean22 = cSVFormat21.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1058");
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
        char char51 = cSVFormat50.getEncapsulator();
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1059");
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
        cSVFormat36.validate();
        cSVFormat36.validate();
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
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1060");
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
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat36.withDelimiter('a');
        java.io.Reader reader41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable42 = cSVFormat40.parse(reader41);
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
        org.junit.Assert.assertNotNull(cSVFormat40);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1061");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray18);
        boolean boolean20 = cSVFormat19.isSurroundingSpacesIgnored();
        java.lang.String[] strArray21 = cSVFormat19.getHeader();
        java.lang.String[] strArray22 = cSVFormat19.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat23 = new org.apache.commons.csv.CSVFormat(',', '\"', '#', '#', true, false, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser44 = new org.apache.commons.csv.CSVParser("", cSVFormat43);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat43.withHeader(strArray46);
        java.lang.String str48 = cSVFormat39.format(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray46);
        java.lang.String str50 = cSVFormat31.format(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat51 = new org.apache.commons.csv.CSVFormat('#', '\"', 'a', ' ', false, false, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat23.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat60 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat60.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser65 = new org.apache.commons.csv.CSVParser("", cSVFormat64);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat64.withHeader(strArray67);
        java.lang.String str69 = cSVFormat60.format(strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat70 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat70.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat70.withEscape('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat70.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat70.withEscape('a');
        char char79 = cSVFormat70.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat70.withEscape('#');
        java.lang.String[] strArray82 = cSVFormat70.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str83 = cSVFormat23.format(strArray82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start and the escape character cannot be the same (\"#\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertTrue("'" + char79 + "' != '" + '#' + "'", char79 == '#');
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNotNull(strArray82);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1062");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat7.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat7.withEscape(' ');
        char char21 = cSVFormat20.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser40 = new org.apache.commons.csv.CSVParser("", cSVFormat39);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat39.withHeader(strArray42);
        java.lang.String str44 = cSVFormat35.format(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray42);
        java.lang.String[] strArray46 = cSVFormat45.getHeader();
        java.lang.String str47 = cSVFormat27.format(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('a', 'a', ' ', ',', false, true, "\r\n", strArray46);
        char char49 = cSVFormat48.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + ',' + "'", char21 == ',');
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + ' ' + "'", char49 == ' ');
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1063");
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
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser51 = new org.apache.commons.csv.CSVParser("", cSVFormat50);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat50.withHeader(strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat21.withHeader(strArray53);
        char char56 = cSVFormat55.getEncapsulator();
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
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + '\ufffe' + "'", char56 == '\ufffe');
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1064");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.getRecord();
        java.lang.String[] strArray9 = cSVRecord8.values();
        java.lang.String[] strArray10 = cSVRecord8.values();
        java.lang.String[] strArray11 = cSVRecord8.values();
        java.util.Iterator<java.lang.String> strItor12 = cSVRecord8.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1065");
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
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat30.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withEmptyLinesIgnored(false);
        cSVFormat36.validate();
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1066");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord3 = cSVParser2.getRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser2.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser2.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser2.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser2.getRecord();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser2.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(cSVRecord3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertNull(cSVRecord7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1067");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.getRecord();
        java.lang.String[] strArray9 = cSVRecord8.values();
        java.lang.String[] strArray10 = cSVRecord8.values();
        java.lang.String str12 = cSVRecord8.get("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        java.lang.String str14 = cSVRecord8.get("Delimiter=<,> Encapsulator=<\">");
        java.lang.String str16 = cSVRecord8.get((int) (short) 1);
        java.util.Spliterator<java.lang.String> strSpliterator17 = cSVRecord8.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored" + "'", str16, "> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1068");
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
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withLineSeparator("\r\n");
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader26 = null;
        org.apache.commons.csv.CSVLexer cSVLexer27 = new org.apache.commons.csv.CSVLexer(cSVFormat23, extendedBufferedReader26);
        boolean boolean29 = cSVLexer27.isDelimiter((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1069");
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
        char char74 = cSVFormat73.getEscape();
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
        org.junit.Assert.assertTrue("'" + char74 + "' != '" + '\ufffe' + "'", char74 == '\ufffe');
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1070");
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
        java.lang.String[] strArray14 = cSVRecord8.values();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1071");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat7.withDelimiter(' ');
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str26 = cSVFormat18.format(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = new org.apache.commons.csv.CSVFormat(' ', ',', ',', '\t', true, false, "hi!hi!", strArray25);
        boolean boolean28 = cSVFormat27.isCommentingEnabled();
        boolean boolean29 = cSVFormat27.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"   hi! hi!" + "'", str26, "\"\"   hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1072");
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
        char char14 = cSVFormat13.getEncapsulator();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = null;
        org.apache.commons.csv.CSVLexer cSVLexer16 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat13.withEmptyLinesIgnored(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1073");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withEscape('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat24.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser38 = new org.apache.commons.csv.CSVParser("", cSVFormat37);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat37.withHeader(strArray40);
        java.lang.String str42 = cSVFormat33.format(strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat33.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat33.withEscape(' ');
        char char47 = cSVFormat46.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser60 = new org.apache.commons.csv.CSVParser("", cSVFormat59);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat59.withHeader(strArray62);
        java.lang.String str64 = cSVFormat55.format(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat65 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray62);
        java.lang.String str66 = cSVFormat46.format(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat30.withHeader(strArray62);
        char char68 = cSVFormat67.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat67.withCommentStart('4');
        java.lang.String[] strArray71 = cSVFormat67.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat72 = new org.apache.commons.csv.CSVFormat(' ', ',', '\t', '\t', false, false, "", strArray71);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + char47 + "' != '" + ',' + "'", char47 == ',');
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertTrue("'" + char68 + "' != '" + ' ' + "'", char68 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(strArray71);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1074");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.getRecord();
        java.lang.String[] strArray9 = cSVRecord8.values();
        java.lang.String[] strArray10 = cSVRecord8.values();
        java.lang.String str12 = cSVRecord8.get("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        java.lang.String str14 = cSVRecord8.get("Delimiter=<,> Encapsulator=<\">");
        java.lang.String[] strArray15 = cSVRecord8.values();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1075");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withEmptyLinesIgnored(false);
        boolean boolean12 = cSVFormat11.isEncapsulating();
        char char13 = cSVFormat11.getEncapsulator();
        boolean boolean14 = cSVFormat11.isEscaping();
        cSVFormat11.validate();
        boolean boolean16 = cSVFormat11.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\"' + "'", char13 == '\"');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
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
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("[, , , hi!, hi!]");
        char char20 = cSVFormat17.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withLineSeparator("\"\"   hi! hi!");
        char char23 = cSVFormat17.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\ufffe' + "'", char20 == '\ufffe');
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '4' + "'", char23 == '4');
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1077");
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
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEmptyLinesIgnored(false);
        char char26 = cSVFormat25.getEncapsulator();
        java.lang.String[] strArray27 = cSVFormat25.getHeader();
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
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1078");
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
        char char22 = cSVFormat17.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + ' ' + "'", char22 == ' ');
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1079");
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
        int int16 = cSVParser13.getLineNumber();
        int int17 = cSVParser13.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1080");
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
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withLineSeparator("Delimiter=<,> Escape=<#> Encapsulator=<\">");
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
        org.junit.Assert.assertNotNull(cSVFormat45);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1081");
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
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withEmptyLinesIgnored(true);
        char char27 = cSVFormat24.getDelimiter();
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
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '#' + "'", char27 == '#');
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1082");
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
        boolean boolean30 = cSVFormat10.isEmptyLinesIgnored();
        boolean boolean31 = cSVFormat10.isEncapsulating();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1083");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat1, extendedBufferedReader3);
        boolean boolean6 = cSVLexer4.isCommentStart((int) (byte) -1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = cSVLexer4.in;
        boolean boolean9 = cSVLexer4.isEndOfFile((int) (byte) 10);
        boolean boolean11 = cSVLexer4.isEscape((int) (short) -1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(extendedBufferedReader7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1084");
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
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat17.withCommentStart('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser45 = new org.apache.commons.csv.CSVParser("", cSVFormat44);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat44.withHeader(strArray47);
        java.lang.String str49 = cSVFormat40.format(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray53 = cSVFormat50.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap54 = null;
        org.apache.commons.csv.CSVRecord cSVRecord55 = new org.apache.commons.csv.CSVRecord(strArray53, strMap54);
        org.apache.commons.csv.CSVFormat cSVFormat56 = new org.apache.commons.csv.CSVFormat('a', ',', ' ', '4', false, false, "[, , , hi!, hi!]", strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat17.withHeader(strArray53);
        char char58 = cSVFormat57.getCommentStart();
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
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertTrue("'" + char58 + "' != '" + '4' + "'", char58 == '4');
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1085");
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean16 = cSVFormat15.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat15);
        java.lang.String str18 = cSVFormat15.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withDelimiter('4');
        cSVFormat20.validate();
        java.lang.String str22 = cSVFormat20.toString();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser25 = new org.apache.commons.csv.CSVParser("", cSVFormat24);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat20.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = new org.apache.commons.csv.CSVFormat(',', '#', '\ufffe', '4', true, false, "Delimiter=<4> Encapsulator=<\">", strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser43 = new org.apache.commons.csv.CSVParser("", cSVFormat42);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat42.withHeader(strArray45);
        java.lang.String str47 = cSVFormat38.format(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray51 = cSVFormat48.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap52 = null;
        org.apache.commons.csv.CSVRecord cSVRecord53 = new org.apache.commons.csv.CSVRecord(strArray51, strMap52);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat30.withHeader(strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat55 = new org.apache.commons.csv.CSVFormat(' ', ',', ' ', '\ufffe', false, false, "hi!Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", strArray51);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\r\n" + "'", str18, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str22, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(cSVFormat54);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1086");
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
        java.lang.String[] strArray18 = cSVRecord16.values();
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord16.iterator();
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strItor19);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1087");
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
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = cSVLexer10.in;
        boolean boolean29 = cSVLexer10.isEscape((int) (byte) 0);
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
        org.junit.Assert.assertNull(extendedBufferedReader27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1088");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        char char3 = cSVFormat1.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        boolean boolean11 = cSVFormat1.isSurroundingSpacesIgnored();
        cSVFormat1.validate();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = null;
        org.apache.commons.csv.CSVLexer cSVLexer14 = new org.apache.commons.csv.CSVLexer(cSVFormat1, extendedBufferedReader13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVLexer14.format;
        org.apache.commons.csv.Token token16 = new org.apache.commons.csv.Token();
        token16.isReady = false;
        boolean boolean19 = token16.isReady;
        boolean boolean20 = token16.isReady;
        org.apache.commons.csv.Token token21 = token16.reset();
        org.apache.commons.csv.Token.Type type22 = token16.type;
        org.apache.commons.csv.Token.Type type23 = token16.type;
        org.apache.commons.csv.Token token24 = token16.reset();
        org.apache.commons.csv.Token.Type type25 = token24.type;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token26 = cSVLexer14.nextToken(token24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type22.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type23.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(token24);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type25.equals(org.apache.commons.csv.Token.Type.INVALID));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1089");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEncapsulator(',');
        java.lang.String str3 = cSVFormat0.toString();
        char char4 = cSVFormat0.getDelimiter();
        cSVFormat0.validate();
        char char6 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart(' ');
        char char12 = cSVFormat11.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = null;
        org.apache.commons.csv.CSVLexer cSVLexer14 = new org.apache.commons.csv.CSVLexer(cSVFormat11, extendedBufferedReader13);
        boolean boolean15 = cSVFormat11.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withCommentStart('#');
        boolean boolean18 = cSVFormat17.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withDelimiter('a');
        char char21 = cSVFormat17.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser27 = new org.apache.commons.csv.CSVParser("", cSVFormat26);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withHeader(strArray29);
        org.apache.commons.csv.CSVParser cSVParser31 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat30);
        org.apache.commons.csv.CSVRecord cSVRecord32 = cSVParser31.getRecord();
        java.lang.String[] strArray33 = cSVRecord32.values();
        java.lang.String str34 = cSVFormat23.format(strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat0.withHeader(strArray33);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored" + "'", str3, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\t' + "'", char4 == '\t');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\ufffe' + "'", char6 == '\ufffe');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\ufffe' + "'", char12 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '#' + "'", char21 == '#');
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVRecord32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Delimiter=<,\"> Encapsulator=<\"\"> CommentStart=< > EmptyLines:ignored\"" + "'", str34, "Delimiter=<,\"> Encapsulator=<\"\"> CommentStart=< > EmptyLines:ignored\"");
        org.junit.Assert.assertNotNull(cSVFormat35);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1090");
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
        int int22 = cSVRecord21.size();
        int int23 = cSVRecord21.size();
        java.lang.String[] strArray24 = cSVRecord21.values();
        int int25 = cSVRecord21.size();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1091");
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
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor20 = cSVParser13.iterator();
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
        org.junit.Assert.assertNotNull(cSVRecordItor20);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1092");
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
        java.util.Iterator<java.lang.String> strItor25 = cSVRecord21.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = cSVRecord21.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strItor25);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1093");
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
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("[, , , hi!, hi!]");
        char char20 = cSVFormat17.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withLineSeparator("\"\"   hi! hi!");
        boolean boolean23 = cSVFormat22.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\ufffe' + "'", char20 == '\ufffe');
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1094");
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
        char char37 = cSVFormat36.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat64.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat68 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser69 = new org.apache.commons.csv.CSVParser("", cSVFormat68);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat68.withHeader(strArray71);
        java.lang.String str73 = cSVFormat64.format(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat74 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat74.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray77 = cSVFormat74.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap78 = null;
        org.apache.commons.csv.CSVRecord cSVRecord79 = new org.apache.commons.csv.CSVRecord(strArray77, strMap78);
        org.apache.commons.csv.CSVFormat cSVFormat80 = new org.apache.commons.csv.CSVFormat('a', ',', ' ', '4', false, false, "[, , , hi!, hi!]", strArray77);
        java.lang.String str81 = cSVFormat49.format(strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat82 = new org.apache.commons.csv.CSVFormat('a', '4', 'a', 'a', false, false, "Delimiter=<,> Encapsulator=<\">", strArray77);
        java.util.Map<java.lang.String, java.lang.Integer> strMap83 = null;
        org.apache.commons.csv.CSVRecord cSVRecord84 = new org.apache.commons.csv.CSVRecord(strArray77, strMap83);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat39.withHeader(strArray77);
        boolean boolean86 = cSVFormat39.isCommentingEnabled();
        java.lang.String str87 = cSVFormat39.toString();
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
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + ' ' + "'", char37 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Delimiter=<,> Escape=<#> Encapsulator=<\"> EmptyLines:ignored" + "'", str87, "Delimiter=<,> Escape=<#> Encapsulator=<\"> EmptyLines:ignored");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1095");
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
        java.lang.String[] strArray22 = cSVFormat17.getHeader();
        boolean boolean23 = cSVFormat17.isSurroundingSpacesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1096");
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
        java.util.Spliterator<java.lang.String> strSpliterator19 = cSVRecord16.spliterator();
        java.util.Iterator<java.lang.String> strItor20 = cSVRecord16.iterator();
        int int21 = cSVRecord16.size();
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
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1097");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        int int3 = cSVParser2.getLineNumber();
        int int4 = cSVParser2.getLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser2.iterator();
        int int6 = cSVParser2.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
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
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader14 = null;
        org.apache.commons.csv.CSVLexer cSVLexer15 = new org.apache.commons.csv.CSVLexer(cSVFormat0, extendedBufferedReader14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withDelimiter('4');
        java.lang.String[] strArray18 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat0.withEmptyLinesIgnored(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1099");
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
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat36.withEmptyLinesIgnored(false);
        char char41 = cSVFormat40.getEncapsulator();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader42 = null;
        org.apache.commons.csv.CSVLexer cSVLexer43 = new org.apache.commons.csv.CSVLexer(cSVFormat40, extendedBufferedReader42);
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
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\"' + "'", char41 == '\"');
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1100");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withEmptyLinesIgnored(false);
        boolean boolean12 = cSVFormat11.isCommentingEnabled();
        char char13 = cSVFormat11.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\ufffe' + "'", char13 == '\ufffe');
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1101");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser7.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser7.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser7.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList12 = cSVParser7.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertNotNull(cSVRecordList12);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1102");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.CSVLexer cSVLexer10 = new org.apache.commons.csv.CSVLexer(cSVFormat6, extendedBufferedReader9);
        boolean boolean12 = cSVLexer10.isEscape((-2));
        boolean boolean14 = cSVLexer10.isCommentStart((int) (short) -1);
        boolean boolean15 = cSVLexer10.emptyLinesIgnored;
        boolean boolean17 = cSVLexer10.isEncapsulator((-1));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
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
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat14.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat14.withEscape(' ');
        char char28 = cSVFormat27.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat27.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat27.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser47 = new org.apache.commons.csv.CSVParser("", cSVFormat46);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat46.withHeader(strArray49);
        java.lang.String str51 = cSVFormat42.format(strArray49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray49);
        java.lang.String[] strArray53 = cSVFormat52.getHeader();
        java.lang.String str54 = cSVFormat34.format(strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat55 = new org.apache.commons.csv.CSVFormat('a', 'a', ' ', ',', false, true, "\r\n", strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat56 = new org.apache.commons.csv.CSVFormat('4', ' ', ',', ',', false, true, "Delimiter=< > Escape=<\"> Encapsulator=<4> EmptyLines:ignored", strArray53);
        boolean boolean57 = cSVFormat56.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + ',' + "'", char28 == ',');
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1104");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        boolean boolean6 = cSVFormat5.isSurroundingSpacesIgnored();
        char char7 = cSVFormat5.getDelimiter();
        boolean boolean8 = cSVFormat5.isCommentingEnabled();
        boolean boolean9 = cSVFormat5.isEmptyLinesIgnored();
        java.lang.String str10 = cSVFormat5.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ',' + "'", char7 == ',');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<,> Encapsulator=<\"> EmptyLines:ignored" + "'", str10, "Delimiter=<,> Encapsulator=<\"> EmptyLines:ignored");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1105");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        char char5 = cSVFormat4.getEscape();
        boolean boolean6 = cSVFormat4.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray21);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray21, strMap25);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray21, strMap27);
        java.lang.String str29 = cSVRecord28.toString();
        java.lang.String[] strArray30 = cSVRecord28.values();
        java.lang.String[] strArray31 = cSVRecord28.values();
        java.lang.String str32 = cSVFormat4.format(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat4.withCommentStart('\t');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[hi!]" + "'", str29, "[hi!]");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat34);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1106");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("Delimiter=<4> Encapsulator=<\">", cSVFormat1);
        int int3 = cSVParser2.getLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList4 = cSVParser2.getRecords();
        int int5 = cSVParser2.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(cSVRecordList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1107");
        java.io.Reader reader0 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray12);
        java.lang.String[] strArray14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser21 = new org.apache.commons.csv.CSVParser("", cSVFormat20);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withHeader(strArray23);
        java.lang.String str25 = cSVFormat16.format(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat15.withHeader(strArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser27 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat26);
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
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat36.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat36.withEncapsulator('a');
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
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
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
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat19.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray23 = cSVFormat22.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withLineSeparator("\"\"   hi! hi!");
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader26 = null;
        org.apache.commons.csv.CSVLexer cSVLexer27 = new org.apache.commons.csv.CSVLexer(cSVFormat25, extendedBufferedReader26);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1110");
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
        int int18 = cSVRecord17.size();
        java.lang.String str19 = cSVRecord17.toString();
        java.lang.String[] strArray20 = cSVRecord17.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = null;
        org.apache.commons.csv.CSVRecord cSVRecord22 = new org.apache.commons.csv.CSVRecord(strArray20, strMap21);
        int int23 = cSVRecord22.size();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!]" + "'", str19, "[hi!]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1111");
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
        char char14 = cSVFormat13.getEncapsulator();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = null;
        org.apache.commons.csv.CSVLexer cSVLexer16 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader15);
        boolean boolean18 = cSVLexer16.isWhitespace(0);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1112");
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
        int int16 = cSVParser15.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord17 = cSVParser15.getRecord();
        int int18 = cSVRecord17.size();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(cSVRecord17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1113");
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
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withEncapsulator('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("Delimiter=<,> Encapsulator=<4> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1114");
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
        java.lang.String[] strArray17 = cSVFormat16.getHeader();
        boolean boolean18 = cSVFormat16.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withDelimiter('\ufffe');
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
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1115");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        boolean boolean1 = cSVFormat0.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser8 = new org.apache.commons.csv.CSVParser("", cSVFormat7);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withHeader(strArray10);
        java.lang.String str12 = cSVFormat3.format(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser15 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat14);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator16 = cSVParser15.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord17 = cSVParser15.getRecord();
        java.lang.String str18 = cSVRecord17.toString();
        java.lang.String[] strArray19 = cSVRecord17.values();
        java.lang.String str20 = cSVFormat0.format(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator16);
        org.junit.Assert.assertNotNull(cSVRecord17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, , , hi!, hi!]" + "'", str18, "[, , , hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\",,,hi!,hi!" + "'", str20, "\"\",,,hi!,hi!");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1116");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        char char12 = cSVFormat11.getDelimiter();
        char char13 = cSVFormat11.getEscape();
        java.lang.String[] strArray25 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray25);
        java.lang.String[] strArray27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser34 = new org.apache.commons.csv.CSVParser("", cSVFormat33);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withHeader(strArray36);
        java.lang.String str38 = cSVFormat29.format(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat28.withHeader(strArray36);
        java.lang.String str40 = cSVFormat11.format(strArray36);
        char char41 = cSVFormat11.getCommentStart();
        boolean boolean42 = cSVFormat11.isCommentingEnabled();
        cSVFormat11.validate();
        java.lang.String str44 = cSVFormat11.getLineSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ' ' + "'", char12 == ' ');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\ufffe' + "'", char13 == '\ufffe');
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\ufffe' + "'", char41 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\r\n" + "'", str44, "\r\n");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1117");
        java.lang.String[] strArray32 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray32);
        boolean boolean34 = cSVFormat33.isSurroundingSpacesIgnored();
        java.lang.String[] strArray35 = cSVFormat33.getHeader();
        java.lang.String[] strArray36 = cSVFormat33.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat37 = new org.apache.commons.csv.CSVFormat(',', '\"', '#', '#', true, false, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser58 = new org.apache.commons.csv.CSVParser("", cSVFormat57);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat57.withHeader(strArray60);
        java.lang.String str62 = cSVFormat53.format(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray60);
        java.lang.String str64 = cSVFormat45.format(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat65 = new org.apache.commons.csv.CSVFormat('#', '\"', 'a', ' ', false, false, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat37.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat67 = new org.apache.commons.csv.CSVFormat(',', 'a', '4', '\t', false, false, "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat68 = new org.apache.commons.csv.CSVFormat('4', '\t', '\ufffe', '#', true, true, "\"\",,,hi!,hi!", strArray60);
        char char69 = cSVFormat68.getCommentStart();
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertTrue("'" + char69 + "' != '" + '\ufffe' + "'", char69 == '\ufffe');
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1118");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray21);
        java.lang.String[] strArray25 = cSVFormat24.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat26 = new org.apache.commons.csv.CSVFormat(' ', '#', '#', 'a', false, false, "", strArray25);
        boolean boolean27 = cSVFormat26.isEncapsulating();
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1119");
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
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser51 = new org.apache.commons.csv.CSVParser("", cSVFormat50);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat50.withHeader(strArray53);
        java.lang.String str55 = cSVFormat46.format(strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat56 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray59 = cSVFormat56.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap60 = null;
        org.apache.commons.csv.CSVRecord cSVRecord61 = new org.apache.commons.csv.CSVRecord(strArray59, strMap60);
        org.apache.commons.csv.CSVFormat cSVFormat62 = new org.apache.commons.csv.CSVFormat('a', ',', ' ', '4', false, false, "[, , , hi!, hi!]", strArray59);
        java.lang.String str63 = cSVFormat31.format(strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat64 = new org.apache.commons.csv.CSVFormat(',', ' ', ',', '\ufffe', false, false, "", strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat64.withCommentStart('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat81 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat81.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat85 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser86 = new org.apache.commons.csv.CSVParser("", cSVFormat85);
        java.lang.String[] strArray88 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat85.withHeader(strArray88);
        java.lang.String str90 = cSVFormat81.format(strArray88);
        org.apache.commons.csv.CSVFormat cSVFormat91 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray88);
        org.apache.commons.csv.CSVFormat cSVFormat92 = new org.apache.commons.csv.CSVFormat('\ufffe', ' ', '\"', '\ufffe', true, true, "\"\",,,hi!,hi!,", strArray88);
        org.apache.commons.csv.CSVFormat cSVFormat93 = cSVFormat66.withHeader(strArray88);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str94 = cSVFormat21.format(strArray88);
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
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNotNull(cSVFormat83);
        org.junit.Assert.assertNotNull(cSVFormat85);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(cSVFormat89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat93);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1120");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEmptyLinesIgnored(true);
        char char6 = cSVFormat5.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withLineSeparator("\"\"\"\"\"   hi! hi!\",hi!,,\"\"\"\"\"   hi! hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ',' + "'", char6 == ',');
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1121");
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
        boolean boolean15 = cSVFormat14.isSurroundingSpacesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser29 = new org.apache.commons.csv.CSVParser("", cSVFormat28);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withHeader(strArray31);
        java.lang.String str33 = cSVFormat24.format(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat24.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser36 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat35);
        int int37 = cSVParser36.getLineNumber();
        int int38 = cSVParser36.getLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor39 = cSVParser36.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor40 = cSVParser36.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord41 = cSVParser36.getRecord();
        java.lang.String[] strArray42 = cSVRecord41.values();
        org.apache.commons.csv.CSVFormat cSVFormat43 = new org.apache.commons.csv.CSVFormat('a', '4', '#', '#', true, true, "\r\n", strArray42);
        java.lang.String str44 = cSVFormat14.format(strArray42);
        char char45 = cSVFormat14.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(cSVRecordItor39);
        org.junit.Assert.assertNotNull(cSVRecordItor40);
        org.junit.Assert.assertNotNull(cSVRecord41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"\"444hi!4hi!" + "'", str44, "\"\"444hi!4hi!");
        org.junit.Assert.assertTrue("'" + char45 + "' != '" + '\ufffe' + "'", char45 == '\ufffe');
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1122");
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
        java.lang.String str26 = cSVRecord23.toString();
        java.lang.String str27 = cSVRecord23.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = cSVRecord23.get("Delimiter=<#> Escape=<4> Encapsulator=<\"> EmptyLines:ignored");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator24);
        org.junit.Assert.assertNotNull(strItor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[hi!]" + "'", str26, "[hi!]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[hi!]" + "'", str27, "[hi!]");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1123");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("hi!");
        char char20 = cSVFormat17.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withLineSeparator("Delimiter=<#> Escape=<4> Encapsulator=<\"> EmptyLines:ignored");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '#' + "'", char20 == '#');
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1124");
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
        int int24 = cSVRecord23.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord23.get("Delimiter=< > Escape=<\"> Encapsulator=<4> EmptyLines:ignored");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1125");
        java.io.Reader reader0 = null;
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
        org.apache.commons.csv.CSVFormat cSVFormat31 = new org.apache.commons.csv.CSVFormat('4', '4', 'a', ',', true, false, "\"\"   hi! hi!", strArray30);
        java.lang.String str32 = cSVFormat31.getLineSeparator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser33 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The encapsulator character and the delimiter cannot be the same (\"4\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"   hi! hi!" + "'", str32, "\"\"   hi! hi!");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1126");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.getRecord();
        java.lang.String[] strArray9 = cSVRecord8.values();
        java.lang.String[] strArray10 = cSVRecord8.values();
        java.lang.String str12 = cSVRecord8.get("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        java.lang.String str14 = cSVRecord8.get("Delimiter=<,> Encapsulator=<\">");
        java.lang.String str16 = cSVRecord8.get((int) (short) 1);
        java.lang.String str17 = cSVRecord8.toString();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored" + "'", str16, "> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[Delimiter=<, > Encapsulator=<\"> CommentStart=< > EmptyLines:ignored]" + "'", str17, "[Delimiter=<, > Encapsulator=<\"> CommentStart=< > EmptyLines:ignored]");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1127");
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
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat0.withEncapsulator('#');
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable23 = cSVFormat0.parse(reader22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1128");
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
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat5.withEmptyLinesIgnored(false);
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
        org.junit.Assert.assertNotNull(cSVFormat35);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1129");
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
        org.apache.commons.csv.CSVRecord cSVRecord17 = cSVParser15.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVRecord16);
        org.junit.Assert.assertNull(cSVRecord17);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1130");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.getRecord();
        java.lang.String[] strArray9 = cSVRecord8.values();
        java.lang.String str11 = cSVRecord8.get("hi!");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Delimiter=<" + "'", str11, "Delimiter=<");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1131");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray21);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray21, strMap25);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray21, strMap27);
        java.util.Iterator<java.lang.String> strItor29 = cSVRecord28.iterator();
        java.lang.String[] strArray30 = cSVRecord28.values();
        org.apache.commons.csv.CSVFormat cSVFormat31 = new org.apache.commons.csv.CSVFormat('#', '#', '\"', '\t', true, false, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray30);
        java.lang.String str32 = cSVFormat31.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withLineSeparator("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat31.withEscape('#');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strItor29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored" + "'", str32, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored");
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1132");
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
        boolean boolean16 = cSVLexer10.isDelimiter(5);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1133");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat1, extendedBufferedReader3);
        boolean boolean6 = cSVLexer4.isCommentStart((int) (byte) -1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = cSVLexer4.in;
        boolean boolean9 = cSVLexer4.isEndOfFile((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = cSVLexer4.getLineNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(extendedBufferedReader7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1134");
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
        java.lang.String str23 = cSVRecord21.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = cSVRecord21.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!]" + "'", str23, "[hi!]");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1135");
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
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser53 = new org.apache.commons.csv.CSVParser("", cSVFormat52);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat52.withHeader(strArray55);
        java.lang.String str57 = cSVFormat48.format(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat58.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray61 = cSVFormat58.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap62 = null;
        org.apache.commons.csv.CSVRecord cSVRecord63 = new org.apache.commons.csv.CSVRecord(strArray61, strMap62);
        org.apache.commons.csv.CSVFormat cSVFormat64 = new org.apache.commons.csv.CSVFormat('a', ',', ' ', '4', false, false, "[, , , hi!, hi!]", strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat65 = new org.apache.commons.csv.CSVFormat(' ', 'a', ' ', '\t', false, false, "hi!hi!", strArray61);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = cSVFormat26.format(strArray61);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(strArray61);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1136");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19);
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord20.spliterator();
        java.lang.String[] strArray22 = cSVRecord20.values();
        java.lang.String str23 = cSVRecord20.toString();
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord20.spliterator();
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
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!]" + "'", str23, "[hi!]");
        org.junit.Assert.assertNotNull(strSpliterator24);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1137");
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
        org.apache.commons.csv.Token token21 = new org.apache.commons.csv.Token();
        token21.isReady = false;
        boolean boolean24 = token21.isReady;
        token21.isReady = false;
        org.apache.commons.csv.Token.Type type27 = token21.type;
        token21.isReady = false;
        java.lang.StringBuilder stringBuilder30 = token21.content;
        token21.isReady = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token33 = cSVLexer20.nextToken(token21);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type27.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1138");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1139");
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
        char char28 = cSVFormat3.getEscape();
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
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + 'a' + "'", char28 == 'a');
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1140");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('\ufffe');
        char char7 = cSVFormat6.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withLineSeparator("Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader10 = null;
        org.apache.commons.csv.CSVLexer cSVLexer11 = new org.apache.commons.csv.CSVLexer(cSVFormat6, extendedBufferedReader10);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\ufffe' + "'", char7 == '\ufffe');
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1141");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("hi!");
        char char20 = cSVFormat17.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withLineSeparator("Delimiter=<\t> Escape=<\\>");
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader25 = null;
        org.apache.commons.csv.CSVLexer cSVLexer26 = new org.apache.commons.csv.CSVLexer(cSVFormat22, extendedBufferedReader25);
        boolean boolean27 = cSVFormat22.isEncapsulating();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '#' + "'", char20 == '#');
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1142");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat1, extendedBufferedReader3);
        boolean boolean5 = cSVFormat1.isEmptyLinesIgnored();
        java.lang.String[] strArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cSVFormat1.format(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1143");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser7.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord9 = cSVParser7.getRecord();
        int int10 = cSVParser7.getLineNumber();
        int int11 = cSVParser7.getLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList12 = cSVParser7.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator13 = cSVRecordList12.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertNull(cSVRecord9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(cSVRecordList12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator13);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1144");
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
        int int16 = cSVParser15.getLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList17 = cSVParser15.getRecords();
        int int18 = cSVParser15.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(cSVRecordList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1145");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = null;
        org.apache.commons.csv.CSVRecord cSVRecord31 = new org.apache.commons.csv.CSVRecord(strArray27, strMap30);
        java.lang.String[] strArray32 = cSVRecord31.values();
        org.apache.commons.csv.CSVFormat cSVFormat33 = new org.apache.commons.csv.CSVFormat(',', '\"', '#', '\t', true, false, "Delimiter=<\t> Escape=<\\>", strArray32);
        char char34 = cSVFormat33.getDelimiter();
        java.lang.String str35 = cSVFormat33.toString();
        boolean boolean36 = cSVFormat33.isEncapsulating();
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + ',' + "'", char34 == ',');
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Delimiter=<,> Escape=<\t> Encapsulator=<\"> CommentStart=<#> SurroundingSpaces:ignored" + "'", str35, "Delimiter=<,> Escape=<\t> Encapsulator=<\"> CommentStart=<#> SurroundingSpaces:ignored");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1146");
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
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentStart(' ');
        char char23 = cSVFormat22.getEscape();
        boolean boolean24 = cSVFormat22.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser37 = new org.apache.commons.csv.CSVParser("", cSVFormat36);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat36.withHeader(strArray39);
        java.lang.String str41 = cSVFormat32.format(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray39);
        java.util.Map<java.lang.String, java.lang.Integer> strMap43 = null;
        org.apache.commons.csv.CSVRecord cSVRecord44 = new org.apache.commons.csv.CSVRecord(strArray39, strMap43);
        java.util.Map<java.lang.String, java.lang.Integer> strMap45 = null;
        org.apache.commons.csv.CSVRecord cSVRecord46 = new org.apache.commons.csv.CSVRecord(strArray39, strMap45);
        java.lang.String str47 = cSVRecord46.toString();
        java.lang.String[] strArray48 = cSVRecord46.values();
        java.lang.String[] strArray49 = cSVRecord46.values();
        java.lang.String str50 = cSVFormat22.format(strArray49);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat12.withHeader(strArray49);
        boolean boolean52 = cSVFormat12.isEncapsulating();
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
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\ufffe' + "'", char23 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[hi!]" + "'", str47, "[hi!]");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1147");
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
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withEscape(' ');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader24 = null;
        org.apache.commons.csv.CSVLexer cSVLexer25 = new org.apache.commons.csv.CSVLexer(cSVFormat21, extendedBufferedReader24);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1148");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19);
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord20.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = cSVRecord20.get("[, , , hi!, hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1149");
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
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withLineSeparator("> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        boolean boolean41 = cSVFormat38.isSurroundingSpacesIgnored();
        boolean boolean42 = cSVFormat38.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1150");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String[] strArray6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(strArray6);
        boolean boolean8 = cSVFormat5.isSurroundingSpacesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1151");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEncapsulator(',');
        char char4 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=< > CommentStart=<,>", cSVFormat3);
        java.lang.String str6 = cSVFormat3.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\t' + "'", char4 == '\t');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<\t> Encapsulator=<,> EmptyLines:ignored SurroundingSpaces:ignored" + "'", str6, "Delimiter=<\t> Encapsulator=<,> EmptyLines:ignored SurroundingSpaces:ignored");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1152");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSurroundingSpacesIgnored(true);
        boolean boolean20 = cSVFormat17.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withEmptyLinesIgnored(true);
        boolean boolean23 = cSVFormat17.isSurroundingSpacesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1153");
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
        boolean boolean25 = cSVFormat24.isEncapsulating();
        char char26 = cSVFormat24.getEscape();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + 'a' + "'", char26 == 'a');
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1154");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEmptyLinesIgnored(true);
        java.lang.String str6 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape('a');
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("\"\",,,hi!,hi!", cSVFormat10);
        char char13 = cSVFormat10.getEscape();
        boolean boolean14 = cSVFormat10.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withEmptyLinesIgnored(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored" + "'", str6, "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'a' + "'", char13 == 'a');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1155");
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
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withEscape(',');
        java.lang.String str19 = cSVFormat13.getLineSeparator();
        boolean boolean20 = cSVFormat13.isEscaping();
        java.lang.String[] strArray21 = cSVFormat13.getHeader();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\r\n" + "'", str19, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1156");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        cSVFormat0.validate();
        java.lang.String[] strArray11 = cSVFormat0.getHeader();
        java.lang.String[] strArray44 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray44);
        boolean boolean46 = cSVFormat45.isSurroundingSpacesIgnored();
        java.lang.String[] strArray47 = cSVFormat45.getHeader();
        java.lang.String[] strArray48 = cSVFormat45.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat49 = new org.apache.commons.csv.CSVFormat(',', '\"', '#', '#', true, false, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat65.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat69 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser70 = new org.apache.commons.csv.CSVParser("", cSVFormat69);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat69.withHeader(strArray72);
        java.lang.String str74 = cSVFormat65.format(strArray72);
        org.apache.commons.csv.CSVFormat cSVFormat75 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray72);
        java.lang.String str76 = cSVFormat57.format(strArray72);
        org.apache.commons.csv.CSVFormat cSVFormat77 = new org.apache.commons.csv.CSVFormat('#', '\"', 'a', ' ', false, false, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray72);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat49.withHeader(strArray72);
        org.apache.commons.csv.CSVFormat cSVFormat79 = new org.apache.commons.csv.CSVFormat(',', 'a', '4', '\t', false, false, "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", strArray72);
        org.apache.commons.csv.CSVFormat cSVFormat80 = new org.apache.commons.csv.CSVFormat('4', '\t', '\ufffe', '#', true, true, "\"\",,,hi!,hi!", strArray72);
        java.lang.String str81 = cSVFormat0.format(strArray72);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat0.withEncapsulator(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat83);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1157");
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
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat3.withSurroundingSpacesIgnored(false);
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
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1158");
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
        char char34 = cSVFormat31.getCommentStart();
        boolean boolean35 = cSVFormat31.isEscaping();
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
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '#' + "'", char34 == '#');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1159");
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
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withEscape('a');
        boolean boolean27 = cSVFormat26.isEmptyLinesIgnored();
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
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1160");
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
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withDelimiter(' ');
        java.lang.Class<?> wildcardClass29 = cSVFormat19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1161");
        java.lang.String[] strArray7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = new org.apache.commons.csv.CSVFormat('4', '#', ',', 'a', false, true, "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser21 = new org.apache.commons.csv.CSVParser("", cSVFormat20);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withHeader(strArray23);
        java.lang.String str25 = cSVFormat16.format(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray23);
        java.lang.String str27 = cSVFormat8.format(strArray23);
        cSVFormat8.validate();
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored" + "'", str27, "hi!Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1162");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        int int3 = cSVParser2.getLineNumber();
        int int4 = cSVParser2.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser2.getRecord();
        org.apache.commons.csv.CSVRecord cSVRecord6 = cSVParser2.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(cSVRecord5);
        org.junit.Assert.assertNull(cSVRecord6);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1163");
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
        boolean boolean18 = cSVFormat17.isCommentingEnabled();
        boolean boolean19 = cSVFormat17.isEmptyLinesIgnored();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1164");
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
        java.lang.String str24 = cSVRecord19.toString();
        java.util.Spliterator<java.lang.String> strSpliterator25 = cSVRecord19.spliterator();
        java.lang.String[] strArray26 = cSVRecord19.values();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!]" + "'", str24, "[hi!]");
        org.junit.Assert.assertNotNull(strSpliterator25);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1165");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEncapsulator('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = null;
        org.apache.commons.csv.CSVLexer cSVLexer17 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVLexer17.format;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVLexer17.format;
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean22 = cSVFormat21.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser23 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat21);
        java.lang.String str24 = cSVFormat21.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withDelimiter('4');
        cSVFormat26.validate();
        java.lang.String str28 = cSVFormat26.toString();
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser31 = new org.apache.commons.csv.CSVParser("", cSVFormat30);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat30.withHeader(strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat26.withHeader(strArray33);
        java.util.Map<java.lang.String, java.lang.Integer> strMap36 = null;
        org.apache.commons.csv.CSVRecord cSVRecord37 = new org.apache.commons.csv.CSVRecord(strArray33, strMap36);
        java.lang.String[] strArray38 = cSVRecord37.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap39 = null;
        org.apache.commons.csv.CSVRecord cSVRecord40 = new org.apache.commons.csv.CSVRecord(strArray38, strMap39);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat19.withHeader(strArray38);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\r\n" + "'", str24, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str28, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(cSVFormat41);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1166");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withLineSeparator("hi!");
        java.lang.String str20 = cSVFormat19.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withDelimiter(',');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1167");
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
        boolean boolean30 = cSVFormat29.isSurroundingSpacesIgnored();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1168");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEmptyLinesIgnored(true);
        char char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withSurroundingSpacesIgnored(false);
        boolean boolean8 = cSVFormat4.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser("", cSVFormat13);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withHeader(strArray16);
        java.lang.String str18 = cSVFormat9.format(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat9.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat9.withEscape(' ');
        char char23 = cSVFormat22.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat22.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser42 = new org.apache.commons.csv.CSVParser("", cSVFormat41);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat41.withHeader(strArray44);
        java.lang.String str46 = cSVFormat37.format(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray44);
        java.lang.String str48 = cSVFormat29.format(strArray44);
        java.lang.String str49 = cSVFormat4.format(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat4.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withLineSeparator("");
        java.lang.String str54 = cSVFormat51.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + ',' + "'", char23 == ',');
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Delimiter=<,> Escape=<4> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored" + "'", str54, "Delimiter=<,> Escape=<4> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1169");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart(' ');
        char char6 = cSVFormat5.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = null;
        org.apache.commons.csv.CSVLexer cSVLexer8 = new org.apache.commons.csv.CSVLexer(cSVFormat5, extendedBufferedReader7);
        boolean boolean9 = cSVFormat5.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean14 = cSVFormat13.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser15 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat13);
        java.lang.String str16 = cSVFormat13.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withDelimiter('4');
        cSVFormat18.validate();
        java.lang.String str20 = cSVFormat18.toString();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser23 = new org.apache.commons.csv.CSVParser("", cSVFormat22);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat18.withHeader(strArray25);
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = null;
        org.apache.commons.csv.CSVRecord cSVRecord29 = new org.apache.commons.csv.CSVRecord(strArray25, strMap28);
        java.lang.String str30 = cSVFormat11.format(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat11.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentStart('\"');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser35 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the encapsulator cannot be the same (\"\"\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\ufffe' + "'", char6 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\r\n" + "'", str16, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str20, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1170");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        cSVFormat1.validate();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser("Delimiter=< > Encapsulator=<\"> EmptyLines:ignored", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1171");
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
        boolean boolean30 = cSVFormat10.isEmptyLinesIgnored();
        java.lang.String[] strArray31 = cSVFormat10.getHeader();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(strArray31);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1172");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        char char7 = cSVFormat5.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser("", cSVFormat9);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withHeader(strArray12);
        java.lang.String str14 = cSVFormat5.format(strArray12);
        java.lang.String str15 = cSVFormat0.format(strArray12);
        java.lang.String[] strArray16 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat0.withEncapsulator('\t');
        java.lang.String str19 = cSVFormat18.getLineSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\"' + "'", char7 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\r\n" + "'", str19, "\r\n");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1173");
        java.lang.String[] strArray11 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray11);
        java.lang.String[] strArray24 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray24);
        java.lang.String[] strArray26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser33 = new org.apache.commons.csv.CSVParser("", cSVFormat32);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat32.withHeader(strArray35);
        java.lang.String str37 = cSVFormat28.format(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat27.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat12.withHeader(strArray35);
        java.util.Map<java.lang.String, java.lang.Integer> strMap40 = null;
        org.apache.commons.csv.CSVRecord cSVRecord41 = new org.apache.commons.csv.CSVRecord(strArray35, strMap40);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1174");
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
        boolean boolean27 = cSVFormat22.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat22.withEncapsulator(',');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat22.withEncapsulator('4');
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1175");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        org.apache.commons.csv.CSVRecord cSVRecord26 = new org.apache.commons.csv.CSVRecord(strArray24, strMap25);
        int int27 = cSVRecord26.size();
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord26.iterator();
        int int29 = cSVRecord26.size();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1176");
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
        boolean boolean72 = cSVFormat71.isEscaping();
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1177");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.CSVRecord cSVRecord3 = cSVParser2.getRecord();
        int int4 = cSVParser2.getLineNumber();
        int int5 = cSVParser2.getLineNumber();
        int int6 = cSVParser2.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(cSVRecord3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1178");
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
        java.lang.String str23 = cSVRecord22.toString();
        java.lang.String[] strArray24 = cSVRecord22.values();
        java.lang.String str25 = cSVRecord22.toString();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[hi!]" + "'", str23, "[hi!]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[hi!]" + "'", str25, "[hi!]");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1179");
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
        java.lang.String[] strArray27 = cSVFormat24.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withSurroundingSpacesIgnored(false);
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
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1180");
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
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withLineSeparator("[hi!]");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withEmptyLinesIgnored(false);
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
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1181");
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
        char char29 = cSVFormat21.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat21.withSurroundingSpacesIgnored(false);
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
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + ' ' + "'", char29 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1182");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentStart(' ');
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("\"\",,,hi!,hi!,", cSVFormat3);
        int int7 = cSVParser6.getLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser6.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        int int10 = cSVParser6.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1183");
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
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withCommentStart('4');
        boolean boolean28 = cSVFormat27.isCommentingEnabled();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1184");
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
        boolean boolean22 = cSVFormat21.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withEmptyLinesIgnored(false);
        java.lang.String str25 = cSVFormat21.getLineSeparator();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1185");
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
        char char27 = cSVFormat3.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat3.withCommentStart('\t');
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
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\"' + "'", char27 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1186");
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
        boolean boolean14 = cSVFormat13.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentStart('\t');
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
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1187");
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
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser44 = new org.apache.commons.csv.CSVParser("", cSVFormat43);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat43.withHeader(strArray46);
        java.lang.String str48 = cSVFormat39.format(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray46);
        java.util.Map<java.lang.String, java.lang.Integer> strMap50 = null;
        org.apache.commons.csv.CSVRecord cSVRecord51 = new org.apache.commons.csv.CSVRecord(strArray46, strMap50);
        java.util.Map<java.lang.String, java.lang.Integer> strMap52 = null;
        org.apache.commons.csv.CSVRecord cSVRecord53 = new org.apache.commons.csv.CSVRecord(strArray46, strMap52);
        java.util.Iterator<java.lang.String> strItor54 = cSVRecord53.iterator();
        java.lang.String[] strArray55 = cSVRecord53.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap56 = null;
        org.apache.commons.csv.CSVRecord cSVRecord57 = new org.apache.commons.csv.CSVRecord(strArray55, strMap56);
        java.lang.String[] strArray58 = cSVRecord57.values();
        java.lang.String[] strArray59 = cSVRecord57.values();
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat31.withHeader(strArray59);
        java.lang.String str61 = cSVFormat31.toString();
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
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(strItor54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Delimiter=<,> Encapsulator=<\"> CommentStart=<#> EmptyLines:ignored" + "'", str61, "Delimiter=<,> Encapsulator=<\"> CommentStart=<#> EmptyLines:ignored");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1188");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        char char5 = cSVFormat4.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader6 = null;
        org.apache.commons.csv.CSVLexer cSVLexer7 = new org.apache.commons.csv.CSVLexer(cSVFormat4, extendedBufferedReader6);
        char char8 = cSVFormat4.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser42 = new org.apache.commons.csv.CSVParser("", cSVFormat41);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat41.withHeader(strArray44);
        java.lang.String str46 = cSVFormat37.format(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray50 = cSVFormat47.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap51 = null;
        org.apache.commons.csv.CSVRecord cSVRecord52 = new org.apache.commons.csv.CSVRecord(strArray50, strMap51);
        org.apache.commons.csv.CSVFormat cSVFormat53 = new org.apache.commons.csv.CSVFormat('a', ',', ' ', '4', false, false, "[, , , hi!, hi!]", strArray50);
        java.lang.String str54 = cSVFormat22.format(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat55 = new org.apache.commons.csv.CSVFormat(',', ' ', ',', '\ufffe', false, false, "", strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat12.withHeader(strArray50);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat56);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1189");
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
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withDelimiter('a');
        java.lang.String[] strArray19 = cSVFormat18.getHeader();
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
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1190");
        org.apache.commons.csv.Token token0 = new org.apache.commons.csv.Token();
        token0.isReady = false;
        boolean boolean3 = token0.isReady;
        boolean boolean4 = token0.isReady;
        org.apache.commons.csv.Token.Type type5 = token0.type;
        java.lang.StringBuilder stringBuilder6 = token0.content;
        java.lang.StringBuilder stringBuilder7 = token0.content;
        org.apache.commons.csv.Token token8 = new org.apache.commons.csv.Token();
        token8.isReady = false;
        boolean boolean11 = token8.isReady;
        org.apache.commons.csv.Token.Type type12 = org.apache.commons.csv.Token.Type.TOKEN;
        token8.type = type12;
        boolean boolean14 = token8.isReady;
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentStart(' ');
        char char20 = cSVFormat19.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = null;
        org.apache.commons.csv.CSVLexer cSVLexer22 = new org.apache.commons.csv.CSVLexer(cSVFormat19, extendedBufferedReader21);
        boolean boolean24 = cSVLexer22.isWhitespace(0);
        org.apache.commons.csv.Token token25 = new org.apache.commons.csv.Token();
        token25.isReady = false;
        boolean boolean28 = token25.isReady;
        boolean boolean29 = token25.isReady;
        org.apache.commons.csv.Token token30 = token25.reset();
        java.lang.StringBuilder stringBuilder31 = token25.content;
        cSVLexer22.trimTrailingSpaces(stringBuilder31);
        token8.content = stringBuilder31;
        token0.content = stringBuilder31;
        java.lang.StringBuilder stringBuilder35 = token0.content;
        java.lang.StringBuilder stringBuilder36 = token0.content;
        org.apache.commons.csv.Token.Type type37 = token0.type;
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser40 = new org.apache.commons.csv.CSVParser("", cSVFormat39);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader41 = null;
        org.apache.commons.csv.CSVLexer cSVLexer42 = new org.apache.commons.csv.CSVLexer(cSVFormat39, extendedBufferedReader41);
        boolean boolean44 = cSVLexer42.isEndOfFile((-1));
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withCommentStart(' ');
        char char50 = cSVFormat49.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader51 = null;
        org.apache.commons.csv.CSVLexer cSVLexer52 = new org.apache.commons.csv.CSVLexer(cSVFormat49, extendedBufferedReader51);
        boolean boolean54 = cSVLexer52.isCommentStart((int) (byte) 0);
        boolean boolean56 = cSVLexer52.isEscape(0);
        boolean boolean58 = cSVLexer52.isEndOfLine((-2));
        org.apache.commons.csv.Token token59 = new org.apache.commons.csv.Token();
        token59.isReady = false;
        boolean boolean62 = token59.isReady;
        boolean boolean63 = token59.isReady;
        org.apache.commons.csv.Token.Type type64 = token59.type;
        java.lang.StringBuilder stringBuilder65 = token59.content;
        java.lang.StringBuilder stringBuilder66 = token59.content;
        org.apache.commons.csv.Token token67 = new org.apache.commons.csv.Token();
        token67.isReady = false;
        boolean boolean70 = token67.isReady;
        org.apache.commons.csv.Token.Type type71 = org.apache.commons.csv.Token.Type.TOKEN;
        token67.type = type71;
        boolean boolean73 = token67.isReady;
        org.apache.commons.csv.CSVFormat cSVFormat74 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat74.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat76.withCommentStart(' ');
        char char79 = cSVFormat78.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader80 = null;
        org.apache.commons.csv.CSVLexer cSVLexer81 = new org.apache.commons.csv.CSVLexer(cSVFormat78, extendedBufferedReader80);
        boolean boolean83 = cSVLexer81.isWhitespace(0);
        org.apache.commons.csv.Token token84 = new org.apache.commons.csv.Token();
        token84.isReady = false;
        boolean boolean87 = token84.isReady;
        boolean boolean88 = token84.isReady;
        org.apache.commons.csv.Token token89 = token84.reset();
        java.lang.StringBuilder stringBuilder90 = token84.content;
        cSVLexer81.trimTrailingSpaces(stringBuilder90);
        token67.content = stringBuilder90;
        token59.content = stringBuilder90;
        java.lang.StringBuilder stringBuilder94 = token59.content;
        cSVLexer52.trimTrailingSpaces(stringBuilder94);
        cSVLexer42.trimTrailingSpaces(stringBuilder94);
        token0.content = stringBuilder94;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type5.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type12.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\ufffe' + "'", char20 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(token30);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type37.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + char50 + "' != '" + '\ufffe' + "'", char50 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + type64 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type64.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(stringBuilder65);
        org.junit.Assert.assertEquals(stringBuilder65.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder66);
        org.junit.Assert.assertEquals(stringBuilder66.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + type71 + "' != '" + org.apache.commons.csv.Token.Type.TOKEN + "'", type71.equals(org.apache.commons.csv.Token.Type.TOKEN));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertTrue("'" + char79 + "' != '" + '\ufffe' + "'", char79 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(token89);
        org.junit.Assert.assertNotNull(stringBuilder90);
        org.junit.Assert.assertEquals(stringBuilder90.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder94);
        org.junit.Assert.assertEquals(stringBuilder94.toString(), "");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1191");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("Delimiter=<4> Encapsulator=<\">", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList3 = cSVParser2.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList4 = cSVParser2.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser2.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser2.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVRecordList3);
        org.junit.Assert.assertNotNull(cSVRecordList4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1192");
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
        boolean boolean17 = cSVFormat16.isEmptyLinesIgnored();
        char char18 = cSVFormat16.getCommentStart();
        java.lang.String[] strArray19 = cSVFormat16.getHeader();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\ufffe' + "'", char18 == '\ufffe');
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1193");
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
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat2.withDelimiter('\t');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader29 = null;
        org.apache.commons.csv.CSVLexer cSVLexer30 = new org.apache.commons.csv.CSVLexer(cSVFormat28, extendedBufferedReader29);
        boolean boolean32 = cSVLexer30.isEscape((int) (short) -1);
        boolean boolean34 = cSVLexer30.isDelimiter((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1194");
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
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withLineSeparator("Delimiter=<#> Escape=<4> Encapsulator=<\"> EmptyLines:ignored");
        java.io.Reader reader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable33 = cSVFormat29.parse(reader32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1195");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        org.apache.commons.csv.CSVRecord cSVRecord14 = new org.apache.commons.csv.CSVRecord(strArray9, strMap13);
        java.util.Spliterator<java.lang.String> strSpliterator15 = cSVRecord14.spliterator();
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord14.iterator();
        java.lang.String str17 = cSVRecord14.toString();
        java.lang.String str18 = cSVRecord14.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strSpliterator15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!]" + "'", str17, "[hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!]" + "'", str18, "[hi!]");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1196");
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
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withEscape(' ');
        cSVFormat18.validate();
        java.lang.String[] strArray52 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat53 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray52);
        boolean boolean54 = cSVFormat53.isSurroundingSpacesIgnored();
        java.lang.String[] strArray55 = cSVFormat53.getHeader();
        java.lang.String[] strArray56 = cSVFormat53.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat57 = new org.apache.commons.csv.CSVFormat(',', '\"', '#', '#', true, false, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray56);
        org.apache.commons.csv.CSVFormat cSVFormat58 = new org.apache.commons.csv.CSVFormat('#', 'a', '\t', '\t', true, true, "hi!", strArray56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = new org.apache.commons.csv.CSVFormat('#', ',', '\ufffe', ' ', false, false, "Delimiter=<,\"> Encapsulator=<\"\"> CommentStart=< > EmptyLines:ignored\"", strArray56);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat18.withHeader(strArray56);
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
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(cSVFormat60);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1197");
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
        java.lang.String str48 = cSVFormat23.toString();
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Delimiter=<,> Escape=<4> Encapsulator=<#> SurroundingSpaces:ignored" + "'", str48, "Delimiter=<,> Escape=<4> Encapsulator=<#> SurroundingSpaces:ignored");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1198");
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
        char char22 = cSVFormat17.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat17.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withEncapsulator(' ');
        char char27 = cSVFormat26.getEncapsulator();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '#' + "'", char22 == '#');
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + ' ' + "'", char27 == ' ');
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1199");
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
        org.apache.commons.csv.CSVFormat cSVFormat30 = new org.apache.commons.csv.CSVFormat('a', ' ', 'a', 'a', false, true, "Delimiter=<\t> Encapsulator=<\"> EmptyLines:ignored SurroundingSpaces:ignored", strArray27);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1200");
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
        boolean boolean29 = cSVFormat28.isEscaping();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1201");
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
        java.lang.String str28 = cSVFormat27.toString();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Delimiter=<#> Escape=< > Encapsulator=<\"> CommentStart=<4> SurroundingSpaces:ignored" + "'", str28, "Delimiter=<#> Escape=< > Encapsulator=<\"> CommentStart=<4> SurroundingSpaces:ignored");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1202");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser7.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser7.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser7.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser7.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser7.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord13 = cSVParser7.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
        org.junit.Assert.assertNotNull(cSVRecordList11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertNull(cSVRecord13);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1203");
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
        char char31 = cSVFormat29.getEscape();
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
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\ufffe' + "'", char31 == '\ufffe');
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1204");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser7.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser7.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord10 = cSVParser7.getRecord();
        int int11 = cSVParser7.getLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecordList8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNull(cSVRecord10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1205");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentStart(' ');
        char char5 = cSVFormat4.getEscape();
        java.lang.String str6 = cSVFormat4.toString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart(' ');
        char char12 = cSVFormat11.getEscape();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = null;
        org.apache.commons.csv.CSVLexer cSVLexer14 = new org.apache.commons.csv.CSVLexer(cSVFormat11, extendedBufferedReader13);
        boolean boolean16 = cSVLexer14.isWhitespace(0);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVLexer14.format;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withLineSeparator("Delimiter=<,> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
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
        java.lang.String[] strArray48 = cSVRecord47.values();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat17.withHeader(strArray48);
        java.lang.String str50 = cSVFormat4.format(strArray48);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\ufffe' + "'", char5 == '\ufffe');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored" + "'", str6, "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\ufffe' + "'", char12 == '\ufffe');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(strItor44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1206");
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
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withCommentStart('4');
        java.lang.String str28 = cSVFormat27.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withDelimiter(',');
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat30);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1207");
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
        int int30 = cSVParser29.getLineNumber();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1208");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withHeader(strArray21);
        java.lang.String str23 = cSVFormat14.format(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = new org.apache.commons.csv.CSVFormat('\ufffe', ' ', '\"', '\ufffe', true, true, "\"\",,,hi!,hi!,", strArray21);
        java.lang.String str26 = cSVFormat25.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser39 = new org.apache.commons.csv.CSVParser("", cSVFormat38);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat38.withHeader(strArray41);
        java.lang.String str43 = cSVFormat34.format(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray41);
        java.util.Map<java.lang.String, java.lang.Integer> strMap45 = null;
        org.apache.commons.csv.CSVRecord cSVRecord46 = new org.apache.commons.csv.CSVRecord(strArray41, strMap45);
        java.util.Map<java.lang.String, java.lang.Integer> strMap47 = null;
        org.apache.commons.csv.CSVRecord cSVRecord48 = new org.apache.commons.csv.CSVRecord(strArray41, strMap47);
        java.util.Map<java.lang.String, java.lang.Integer> strMap49 = null;
        org.apache.commons.csv.CSVRecord cSVRecord50 = new org.apache.commons.csv.CSVRecord(strArray41, strMap49);
        int int51 = cSVRecord50.size();
        int int52 = cSVRecord50.size();
        java.lang.String[] strArray53 = cSVRecord50.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = cSVFormat25.format(strArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same (\"?\")");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\",,,hi!,hi!," + "'", str26, "\"\",,,hi!,hi!,");
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(strArray53);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1209");
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
        cSVFormat37.validate();
        org.apache.commons.csv.CSVParser cSVParser41 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Escape=<a> Encapsulator=<\"> SurroundingSpaces:ignored", cSVFormat37);
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
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1210");
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
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator41 = cSVParser40.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList42 = cSVParser40.getRecords();
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
        org.junit.Assert.assertNotNull(cSVRecordSpliterator41);
        org.junit.Assert.assertNotNull(cSVRecordList42);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1211");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat1.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat1.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser39 = new org.apache.commons.csv.CSVParser("", cSVFormat38);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat38.withHeader(strArray41);
        java.lang.String str43 = cSVFormat34.format(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray47 = cSVFormat44.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap48 = null;
        org.apache.commons.csv.CSVRecord cSVRecord49 = new org.apache.commons.csv.CSVRecord(strArray47, strMap48);
        org.apache.commons.csv.CSVFormat cSVFormat50 = new org.apache.commons.csv.CSVFormat('a', ',', ' ', '4', false, false, "[, , , hi!, hi!]", strArray47);
        java.lang.String str51 = cSVFormat18.format(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat18.withCommentStart('a');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat53);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1212");
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
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withLineSeparator("\"\",,,hi!,hi!,");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withDelimiter('\ufffe');
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
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1213");
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
        java.lang.String[] strArray23 = cSVFormat22.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24);
        java.lang.String[] strArray26 = cSVRecord25.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = null;
        org.apache.commons.csv.CSVRecord cSVRecord28 = new org.apache.commons.csv.CSVRecord(strArray26, strMap27);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1214");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        char char7 = cSVFormat6.getEncapsulator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\"' + "'", char7 == '\"');
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1215");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = null;
        org.apache.commons.csv.CSVRecord cSVRecord20 = new org.apache.commons.csv.CSVRecord(strArray18, strMap19);
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord20.spliterator();
        java.lang.String[] strArray22 = cSVRecord20.values();
        java.util.Spliterator<java.lang.String> strSpliterator23 = cSVRecord20.spliterator();
        int int24 = cSVRecord20.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = cSVRecord20.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strSpliterator21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strSpliterator23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1216");
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
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat13.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser33 = new org.apache.commons.csv.CSVParser("", cSVFormat32);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat32.withHeader(strArray35);
        java.lang.String str37 = cSVFormat28.format(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray35);
        java.lang.String str39 = cSVFormat20.format(strArray35);
        java.lang.String str40 = cSVFormat20.getLineSeparator();
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
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\r\n" + "'", str40, "\r\n");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1217");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.getRecord();
        java.lang.String[] strArray9 = cSVRecord8.values();
        java.lang.String str11 = cSVRecord8.get((int) (byte) 1);
        java.util.Spliterator<java.lang.String> strSpliterator12 = cSVRecord8.spliterator();
        java.lang.String[] strArray13 = cSVRecord8.values();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored" + "'", str11, "> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1218");
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
        java.util.Iterator<java.lang.String> strItor16 = cSVRecord15.iterator();
        java.lang.String[] strArray17 = cSVRecord15.values();
        java.lang.String str18 = cSVRecord15.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[, , , hi!, hi!]" + "'", str18, "[, , , hi!, hi!]");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1219");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withDelimiter('4');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader15 = null;
        org.apache.commons.csv.CSVLexer cSVLexer16 = new org.apache.commons.csv.CSVLexer(cSVFormat1, extendedBufferedReader15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat1.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withLineSeparator("[, , , hi!, hi!]");
        char char21 = cSVFormat18.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withEncapsulator('\t');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser26 = new org.apache.commons.csv.CSVParser("\ufffe> Encapsulator=<\"> EmptyLines:ignored", cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\ufffe' + "'", char21 == '\ufffe');
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1220");
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
        boolean boolean27 = cSVFormat3.isEmptyLinesIgnored();
        boolean boolean28 = cSVFormat3.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser48 = new org.apache.commons.csv.CSVParser("", cSVFormat47);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat47.withHeader(strArray50);
        java.lang.String str52 = cSVFormat43.format(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat53 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withSurroundingSpacesIgnored(true);
        java.lang.String[] strArray56 = cSVFormat53.getHeader();
        boolean boolean57 = cSVFormat53.isEncapsulating();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat53.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat67 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat67.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat71 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser72 = new org.apache.commons.csv.CSVParser("", cSVFormat71);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat71.withHeader(strArray74);
        java.lang.String str76 = cSVFormat67.format(strArray74);
        org.apache.commons.csv.CSVFormat cSVFormat77 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray74);
        java.util.Map<java.lang.String, java.lang.Integer> strMap78 = null;
        org.apache.commons.csv.CSVRecord cSVRecord79 = new org.apache.commons.csv.CSVRecord(strArray74, strMap78);
        java.util.Map<java.lang.String, java.lang.Integer> strMap80 = null;
        org.apache.commons.csv.CSVRecord cSVRecord81 = new org.apache.commons.csv.CSVRecord(strArray74, strMap80);
        java.lang.String str82 = cSVRecord81.toString();
        java.lang.String[] strArray83 = cSVRecord81.values();
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat53.withHeader(strArray83);
        org.apache.commons.csv.CSVFormat cSVFormat85 = new org.apache.commons.csv.CSVFormat(',', 'a', '4', '#', false, true, "Delimiter=<,> Escape=<a> Encapsulator=<\"> SurroundingSpaces:ignored", strArray83);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat3.withHeader(strArray83);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "[hi!]" + "'", str82, "[hi!]");
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(cSVFormat84);
        org.junit.Assert.assertNotNull(cSVFormat86);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1221");
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
        java.lang.String[] strArray16 = cSVRecord15.values();
        java.lang.String str17 = cSVRecord15.toString();
        java.lang.String[] strArray18 = cSVRecord15.values();
        java.lang.String str20 = cSVRecord15.get(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = cSVRecord15.get("Delimiter=<4> Encapsulator=<\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, , , hi!, hi!]" + "'", str17, "[, , , hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1222");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEncapsulator('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = null;
        org.apache.commons.csv.CSVLexer cSVLexer17 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withCommentStart(' ');
        cSVFormat13.validate();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1223");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat1, extendedBufferedReader3);
        boolean boolean6 = cSVLexer4.isCommentStart((int) (byte) -1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader7 = cSVLexer4.in;
        boolean boolean9 = cSVLexer4.isEndOfLine((int) ',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(extendedBufferedReader7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1224");
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
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader27 = cSVLexer10.in;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVLexer10.format;
        java.lang.String str29 = cSVFormat28.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withLineSeparator("Delimiter=<#> Escape=< > Encapsulator=<\"> CommentStart=<4> SurroundingSpaces:ignored");
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
        org.junit.Assert.assertNull(extendedBufferedReader27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\r\n" + "'", str29, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1225");
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
        java.lang.Class<?> wildcardClass17 = cSVParser13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1226");
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
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withDelimiter('a');
        boolean boolean51 = cSVFormat48.isSurroundingSpacesIgnored();
        java.lang.String[] strArray52 = cSVFormat48.getHeader();
        java.io.Reader reader53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable54 = cSVFormat48.parse(reader53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1227");
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
        char char24 = cSVFormat23.getCommentStart();
        char char25 = cSVFormat23.getEncapsulator();
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
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\"' + "'", char25 == '\"');
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1228");
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
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat13.withLineSeparator("Delimiter=<,> Encapsulator=<\">");
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat13.withEncapsulator('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat13.withEncapsulator('a');
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
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1229");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEncapsulator('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\"');
        char char16 = cSVFormat15.getEscape();
        boolean boolean17 = cSVFormat15.isCommentingEnabled();
        java.lang.String str18 = cSVFormat15.toString();
        cSVFormat15.validate();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Delimiter=< > Escape=<\"> Encapsulator=<4> EmptyLines:ignored" + "'", str18, "Delimiter=< > Escape=<\"> Encapsulator=<4> EmptyLines:ignored");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1230");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        char char9 = cSVFormat6.getEncapsulator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1231");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader3 = null;
        org.apache.commons.csv.CSVLexer cSVLexer4 = new org.apache.commons.csv.CSVLexer(cSVFormat1, extendedBufferedReader3);
        boolean boolean6 = cSVLexer4.isCommentStart((int) (byte) -1);
        boolean boolean8 = cSVLexer4.isEscape((int) (short) 10);
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = cSVLexer4.in;
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(extendedBufferedReader9);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1232");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        char char10 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withDelimiter('\ufffe');
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable14 = cSVFormat0.parse(reader13);
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
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1233");
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
        int int24 = cSVRecord23.size();
        java.lang.String str25 = cSVRecord23.toString();
        java.util.Iterator<java.lang.String> strItor26 = cSVRecord23.iterator();
        java.util.Iterator<java.lang.String> strItor27 = cSVRecord23.iterator();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[hi!]" + "'", str25, "[hi!]");
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertNotNull(strItor27);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1234");
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
        java.lang.String str16 = cSVFormat15.getLineSeparator();
        cSVFormat15.validate();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader18 = null;
        org.apache.commons.csv.CSVLexer cSVLexer19 = new org.apache.commons.csv.CSVLexer(cSVFormat15, extendedBufferedReader18);
        boolean boolean21 = cSVLexer19.isCommentStart((int) '#');
        boolean boolean22 = cSVLexer19.surroundingSpacesIgnored;
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\r\n" + "'", str16, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1235");
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
        java.lang.String[] strArray23 = cSVRecord21.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[hi!]" + "'", str22, "[hi!]");
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1236");
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
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withCommentStart('a');
        char char27 = cSVFormat26.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser33 = new org.apache.commons.csv.CSVParser("", cSVFormat32);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat32.withHeader(strArray35);
        java.lang.String str37 = cSVFormat28.format(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat28.withDelimiter(' ');
        java.lang.String[] strArray46 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        java.lang.String str47 = cSVFormat39.format(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat26.withHeader(strArray46);
        java.lang.Class<?> wildcardClass49 = cSVFormat48.getClass();
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
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '#' + "'", char27 == '#');
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"\"   hi! hi!" + "'", str47, "\"\"   hi! hi!");
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1237");
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
        boolean boolean23 = cSVFormat17.isEncapsulating();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored" + "'", str20, "Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1238");
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
        java.lang.String str37 = cSVFormat13.getLineSeparator();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader38 = null;
        org.apache.commons.csv.CSVLexer cSVLexer39 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVLexer39.format;
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\r\n" + "'", str37, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat40);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1239");
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
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withEscape('a');
        boolean boolean27 = cSVFormat26.isEscaping();
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
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1240");
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
        int int16 = cSVParser15.getLineNumber();
        int int17 = cSVParser15.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord18 = cSVParser15.getRecord();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor19 = cSVParser15.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList20 = cSVParser15.getRecords();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList21 = cSVParser15.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(cSVRecord18);
        org.junit.Assert.assertNotNull(cSVRecordItor19);
        org.junit.Assert.assertNotNull(cSVRecordList20);
        org.junit.Assert.assertNotNull(cSVRecordList21);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1241");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('\ufffe');
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray18);
        boolean boolean20 = cSVFormat19.isSurroundingSpacesIgnored();
        java.lang.String[] strArray21 = cSVFormat19.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat6.withHeader(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1242");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray14);
        char char18 = cSVFormat17.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withEscape('4');
        char char21 = cSVFormat17.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '4' + "'", char18 == '4');
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + ' ' + "'", char21 == ' ');
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1243");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.lang.String str4 = cSVFormat1.getLineSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('4');
        cSVFormat6.validate();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader9 = null;
        org.apache.commons.csv.CSVLexer cSVLexer10 = new org.apache.commons.csv.CSVLexer(cSVFormat6, extendedBufferedReader9);
        boolean boolean12 = cSVLexer10.isEscape((int) ',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVLexer10.format;
        org.apache.commons.csv.Token token14 = new org.apache.commons.csv.Token();
        token14.isReady = false;
        boolean boolean17 = token14.isReady;
        boolean boolean18 = token14.isReady;
        org.apache.commons.csv.Token token19 = token14.reset();
        org.apache.commons.csv.Token.Type type20 = token14.type;
        org.apache.commons.csv.Token.Type type21 = token14.type;
        org.apache.commons.csv.Token token22 = token14.reset();
        boolean boolean23 = token14.isReady;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.Token token24 = cSVLexer10.nextToken(token14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(token19);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type20.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.commons.csv.Token.Type.INVALID + "'", type21.equals(org.apache.commons.csv.Token.Type.INVALID));
        org.junit.Assert.assertNotNull(token22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1244");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        java.lang.String str10 = cSVFormat0.getLineSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1245");
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
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat13.withLineSeparator("Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withEmptyLinesIgnored(true);
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
        org.junit.Assert.assertNotNull(cSVFormat40);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1246");
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
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withEscape(' ');
        boolean boolean24 = cSVFormat21.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1247");
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
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEncapsulator(',');
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
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1248");
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
        boolean boolean22 = cSVFormat21.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withEmptyLinesIgnored(false);
        java.lang.String[] strArray25 = cSVFormat21.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat21.withLineSeparator("\"\"\"\"\"   hi! hi!\",hi!,,\"\"\"\"\"   hi! hi!\"");
        boolean boolean28 = cSVFormat21.isSurroundingSpacesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1249");
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
        boolean boolean40 = cSVLexer38.isEndOfFile((int) (byte) 0);
        boolean boolean42 = cSVLexer38.isEscape((int) '\"');
        boolean boolean44 = cSVLexer38.isCommentStart((int) (short) 0);
        boolean boolean46 = cSVLexer38.isEndOfLine((int) '4');
        boolean boolean48 = cSVLexer38.isDelimiter((int) '\"');
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1250");
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
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withLineSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser31 = new org.apache.commons.csv.CSVParser("", cSVFormat30);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat30.withHeader(strArray33);
        java.lang.String str35 = cSVFormat26.format(strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat26.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat26.withEscape(' ');
        char char40 = cSVFormat39.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser53 = new org.apache.commons.csv.CSVParser("", cSVFormat52);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat52.withHeader(strArray55);
        java.lang.String str57 = cSVFormat48.format(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray55);
        java.lang.String str59 = cSVFormat39.format(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat23.withHeader(strArray55);
        char char61 = cSVFormat60.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat60.withLineSeparator("[hi!]");
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
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + ',' + "'", char40 == ',');
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertTrue("'" + char61 + "' != '" + ' ' + "'", char61 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat63);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1251");
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
        boolean boolean40 = cSVLexer38.isEndOfFile((int) (byte) 0);
        boolean boolean42 = cSVLexer38.isEscape((int) '\"');
        boolean boolean44 = cSVLexer38.isCommentStart((int) (short) 0);
        boolean boolean46 = cSVLexer38.isCommentStart((int) '4');
        boolean boolean48 = cSVLexer38.isWhitespace(0);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1252");
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
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor17 = cSVParser13.iterator();
        int int18 = cSVParser13.getLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList19 = cSVParser13.getRecords();
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
        org.junit.Assert.assertNotNull(cSVRecordItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(cSVRecordList19);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1253");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        char char10 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withDelimiter('\ufffe');
        boolean boolean13 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withSurroundingSpacesIgnored(false);
        char char18 = cSVFormat15.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withSurroundingSpacesIgnored(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + ',' + "'", char18 == ',');
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1254");
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
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat13.withEscape(' ');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader21 = null;
        org.apache.commons.csv.CSVLexer cSVLexer22 = new org.apache.commons.csv.CSVLexer(cSVFormat20, extendedBufferedReader21);
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
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1255");
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
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withLineSeparator("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        boolean boolean19 = cSVFormat11.isEscaping();
        char char20 = cSVFormat11.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat11.withLineSeparator("Delimiter=<,> Escape=<\t> Encapsulator=<\"> CommentStart=<#> SurroundingSpaces:ignored");
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
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + ' ' + "'", char20 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1256");
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
        java.lang.String str22 = cSVFormat17.toString();
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat17.validate();
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
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored" + "'", str22, "Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1257");
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
        boolean boolean28 = cSVLexer10.isEscape((int) '\ufffe');
        boolean boolean30 = cSVLexer10.isEndOfFile((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1258");
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
        boolean boolean35 = cSVFormat13.isCommentingEnabled();
        boolean boolean36 = cSVFormat13.isEncapsulating();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1259");
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
        boolean boolean30 = cSVFormat29.isEscaping();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1260");
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
        java.lang.String[] strArray23 = cSVFormat22.getHeader();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24);
        java.lang.String str27 = cSVRecord25.get((int) (short) 0);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1261");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEncapsulator('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\"');
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader16 = null;
        org.apache.commons.csv.CSVLexer cSVLexer17 = new org.apache.commons.csv.CSVLexer(cSVFormat13, extendedBufferedReader16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withCommentStart(' ');
        java.io.Reader reader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable21 = cSVFormat13.parse(reader20);
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
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1262");
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
        java.util.Iterator<java.lang.String> strItor27 = cSVRecord24.iterator();
        int int28 = cSVRecord24.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = cSVRecord24.get("Delimiter=<#> Escape=< > Encapsulator=<\"> CommentStart=<4> SurroundingSpaces:ignored");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNotNull(strItor27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1263");
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
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withCommentStart(' ');
        boolean boolean19 = cSVFormat13.isEscaping();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1264");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean2 = cSVFormat1.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("hi!", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser3.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord5 = cSVParser3.getRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser3.getRecords();
        org.apache.commons.csv.CSVRecord cSVRecord7 = cSVParser3.getRecord();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser3.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
        org.junit.Assert.assertNotNull(cSVRecord5);
        org.junit.Assert.assertNotNull(cSVRecordList6);
        org.junit.Assert.assertNull(cSVRecord7);
        org.junit.Assert.assertNotNull(cSVRecordList8);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1265");
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
        int int21 = cSVRecord19.size();
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord19.iterator();
        java.util.Iterator<java.lang.String> strItor23 = cSVRecord19.iterator();
        int int24 = cSVRecord19.size();
        int int25 = cSVRecord19.size();
        java.lang.String[] strArray26 = cSVRecord19.values();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strSpliterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1266");
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
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withLineSeparator("Delimiter=<#> Escape=<4> Encapsulator=<\"> EmptyLines:ignored");
        boolean boolean32 = cSVFormat31.isEncapsulating();
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
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1267");
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
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor15 = cSVParser13.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator16 = cSVParser13.spliterator();
        org.apache.commons.csv.CSVRecord cSVRecord17 = cSVParser13.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecordItor15);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator16);
        org.junit.Assert.assertNotNull(cSVRecord17);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1268");
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
        java.util.Iterator<java.lang.String> strItor19 = cSVRecord15.iterator();
        int int20 = cSVRecord15.size();
        java.util.Spliterator<java.lang.String> strSpliterator21 = cSVRecord15.spliterator();
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
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1269");
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
        boolean boolean40 = cSVLexer38.isEndOfFile((int) (byte) 0);
        boolean boolean42 = cSVLexer38.isEscape((int) '\"');
        boolean boolean44 = cSVLexer38.isCommentStart((int) (short) 0);
        boolean boolean46 = cSVLexer38.isEndOfLine((int) '4');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVLexer38.format;
        boolean boolean48 = cSVFormat47.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat47.withEmptyLinesIgnored(true);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(cSVFormat50);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1270");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEmptyLinesIgnored(true);
        java.lang.String str5 = cSVFormat2.toString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser16 = new org.apache.commons.csv.CSVParser("", cSVFormat15);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withHeader(strArray18);
        java.lang.String str20 = cSVFormat11.format(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat11.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser23 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat22);
        int int24 = cSVParser23.getLineNumber();
        org.apache.commons.csv.CSVRecord cSVRecord25 = cSVParser23.getRecord();
        java.lang.String[] strArray26 = cSVRecord25.values();
        java.lang.String[] strArray27 = cSVRecord25.values();
        java.lang.String str28 = cSVFormat2.format(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser35 = new org.apache.commons.csv.CSVParser("", cSVFormat34);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat34.withHeader(strArray37);
        java.lang.String str39 = cSVFormat30.format(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat30.withDelimiter(' ');
        org.apache.commons.csv.CSVParser cSVParser42 = new org.apache.commons.csv.CSVParser("\"\"   hi! hi!", cSVFormat41);
        int int43 = cSVParser42.getLineNumber();
        int int44 = cSVParser42.getLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor45 = cSVParser42.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor46 = cSVParser42.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord47 = cSVParser42.getRecord();
        java.lang.String[] strArray48 = cSVRecord47.values();
        java.lang.String str49 = cSVFormat2.format(strArray48);
        java.lang.String str50 = cSVFormat2.toString();
        boolean boolean51 = cSVFormat2.isSurroundingSpacesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored" + "'", str5, "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(cSVRecord25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\",,,hi!,hi!" + "'", str28, "\"\",,,hi!,hi!");
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(cSVRecordItor45);
        org.junit.Assert.assertNotNull(cSVRecordItor46);
        org.junit.Assert.assertNotNull(cSVRecord47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\",,,hi!,hi!" + "'", str49, "\"\",,,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored" + "'", str50, "Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1271");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        char char4 = cSVFormat2.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withCommentStart('\ufffe');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentStart('\ufffe');
        char char9 = cSVFormat8.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEncapsulator('4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\"' + "'", char4 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1272");
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
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withLineSeparator("[hi!]");
        char char25 = cSVFormat24.getCommentStart();
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
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '4' + "'", char25 == '4');
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1273");
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
        boolean boolean27 = cSVLexer25.isEscape((int) (byte) 0);
        boolean boolean29 = cSVLexer25.isDelimiter((int) '\"');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = cSVLexer25.getLineNumber();
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
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1274");
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
        boolean boolean27 = cSVFormat26.isEmptyLinesIgnored();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withEmptyLinesIgnored(false);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1275");
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
        int int18 = cSVRecord17.size();
        java.lang.String str19 = cSVRecord17.toString();
        java.lang.String[] strArray20 = cSVRecord17.values();
        java.util.Iterator<java.lang.String> strItor21 = cSVRecord17.iterator();
        int int22 = cSVRecord17.size();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str8, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!]" + "'", str19, "[hi!]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1276");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("Delimiter=<4> Encapsulator=<\">", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord4 = cSVParser2.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNotNull(cSVRecord4);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1277");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser("", cSVFormat13);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withHeader(strArray16);
        java.lang.String str18 = cSVFormat9.format(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = new org.apache.commons.csv.CSVFormat('#', ' ', ' ', 'a', true, true, "\"\",,,hi!,hi!,", strArray16);
        java.lang.String str20 = cSVFormat1.format(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat1.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser35 = new org.apache.commons.csv.CSVParser("", cSVFormat34);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat34.withHeader(strArray37);
        java.lang.String str39 = cSVFormat30.format(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray37);
        java.util.Map<java.lang.String, java.lang.Integer> strMap41 = null;
        org.apache.commons.csv.CSVRecord cSVRecord42 = new org.apache.commons.csv.CSVRecord(strArray37, strMap41);
        java.util.Map<java.lang.String, java.lang.Integer> strMap43 = null;
        org.apache.commons.csv.CSVRecord cSVRecord44 = new org.apache.commons.csv.CSVRecord(strArray37, strMap43);
        java.util.Iterator<java.lang.String> strItor45 = cSVRecord44.iterator();
        java.lang.String[] strArray46 = cSVRecord44.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap47 = null;
        org.apache.commons.csv.CSVRecord cSVRecord48 = new org.apache.commons.csv.CSVRecord(strArray46, strMap47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat22.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat49.withEncapsulator('#');
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat49.withLineSeparator("\"\"   hi! hi!");
        org.apache.commons.csv.CSVParser cSVParser56 = new org.apache.commons.csv.CSVParser("\"\"444hi!4hi!", cSVFormat55);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList57 = cSVParser56.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(strItor45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVRecordList57);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1278");
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
        int int20 = cSVRecord19.size();
        java.lang.String str21 = cSVRecord19.toString();
        int int22 = cSVRecord19.size();
        java.lang.String[] strArray23 = cSVRecord19.values();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!]" + "'", str21, "[hi!]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1279");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat1.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat1.withEmptyLinesIgnored(false);
        org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser("", cSVFormat18);
        char char20 = cSVFormat18.getEncapsulator();
        java.lang.String str21 = cSVFormat18.toString();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withEmptyLinesIgnored(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\"' + "'", char20 == '\"');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Delimiter=<,> Encapsulator=<\">" + "'", str21, "Delimiter=<,> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1280");
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
        java.lang.String[] strArray16 = cSVRecord15.values();
        java.lang.String str17 = cSVRecord15.toString();
        java.util.Spliterator<java.lang.String> strSpliterator18 = cSVRecord15.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, , , hi!, hi!]" + "'", str17, "[, , , hi!, hi!]");
        org.junit.Assert.assertNotNull(strSpliterator18);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1281");
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
        // The following exception was thrown during execution in test generation
        try {
            int int26 = cSVLexer25.getLineNumber();
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
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1282");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser12 = new org.apache.commons.csv.CSVParser("", cSVFormat11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(strArray14);
        java.lang.String str16 = cSVFormat7.format(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat7.withDelimiter(' ');
        char char19 = cSVFormat18.getDelimiter();
        char char20 = cSVFormat18.getEscape();
        java.lang.String[] strArray32 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray32);
        java.lang.String[] strArray34 = null;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withHeader(strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser41 = new org.apache.commons.csv.CSVParser("", cSVFormat40);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat40.withHeader(strArray43);
        java.lang.String str45 = cSVFormat36.format(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat35.withHeader(strArray43);
        java.lang.String str47 = cSVFormat18.format(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat48 = new org.apache.commons.csv.CSVFormat('\"', '4', '4', 'a', false, false, "\n", strArray43);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + ' ' + "'", char19 == ' ');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\ufffe' + "'", char20 == '\ufffe');
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1283");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser("", cSVFormat4);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        java.lang.String str9 = cSVFormat0.format(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEncapsulator('4');
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable15 = cSVFormat13.parse(reader14);
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
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1284");
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
        boolean boolean16 = cSVFormat15.isEmptyLinesIgnored();
        boolean boolean17 = cSVFormat15.isEmptyLinesIgnored();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1285");
        java.lang.String[] strArray11 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray11);
        java.lang.String[] strArray24 = new java.lang.String[] { "\"\"   hi! hi!", "hi!", "", "\"\"   hi! hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = new org.apache.commons.csv.CSVFormat('#', '\"', '\ufffe', '4', false, true, "hi!", strArray24);
        java.lang.String[] strArray26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser33 = new org.apache.commons.csv.CSVParser("", cSVFormat32);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat32.withHeader(strArray35);
        java.lang.String str37 = cSVFormat28.format(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat27.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat12.withHeader(strArray35);
        boolean boolean40 = cSVFormat39.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withEscape('a');
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cSVFormat42);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1286");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray14, strMap24);
        java.lang.String[] strArray26 = cSVRecord25.values();
        java.lang.String str27 = cSVRecord25.toString();
        java.util.Iterator<java.lang.String> strItor28 = cSVRecord25.iterator();
        java.lang.String[] strArray29 = cSVRecord25.values();
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[hi!]" + "'", str27, "[hi!]");
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1287");
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
        java.util.Iterator<java.lang.String> strItor22 = cSVRecord21.iterator();
        java.lang.String[] strArray23 = cSVRecord21.values();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = null;
        org.apache.commons.csv.CSVRecord cSVRecord25 = new org.apache.commons.csv.CSVRecord(strArray23, strMap24);
        java.lang.String[] strArray26 = cSVRecord25.values();
        java.lang.String[] strArray27 = cSVRecord25.values();
        java.lang.String[] strArray28 = cSVRecord25.values();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = cSVRecord25.get("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No header was specified, the record values can't be accessed by name");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1288");
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
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withSurroundingSpacesIgnored(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withEmptyLinesIgnored(false);
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
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1289");
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
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat36.withDelimiter('a');
        cSVFormat40.validate();
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
        org.junit.Assert.assertNotNull(cSVFormat40);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1290");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser("", cSVFormat2);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(strArray5);
        org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser("Delimiter=<,> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored", cSVFormat6);
        org.apache.commons.csv.CSVRecord cSVRecord8 = cSVParser7.getRecord();
        java.lang.String[] strArray9 = cSVRecord8.values();
        java.lang.String str11 = cSVRecord8.get((int) (byte) 1);
        int int12 = cSVRecord8.size();
        java.lang.String[] strArray13 = cSVRecord8.values();
        java.lang.String str15 = cSVRecord8.get("Delimiter=<#> Escape=< > Encapsulator=<#> CommentStart=<4> SurroundingSpaces:ignored");
        java.lang.String str17 = cSVRecord8.get("Delimiter=<,> Encapsulator=<4> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVRecord8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored" + "'", str11, "> Encapsulator=<\"> CommentStart=< > EmptyLines:ignored");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1291");
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
        org.apache.commons.csv.CSVFormat cSVFormat24 = new org.apache.commons.csv.CSVFormat(',', '#', '\ufffe', '4', true, false, "Delimiter=<4> Encapsulator=<\">", strArray21);
        java.lang.String str25 = cSVFormat24.getLineSeparator();
        char char26 = cSVFormat24.getEncapsulator();
        org.apache.commons.csv.CSVParser cSVParser27 = new org.apache.commons.csv.CSVParser("Delimiter=< > Encapsulator=<\"> EmptyLines:ignored", cSVFormat24);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator28 = cSVParser27.spliterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor29 = cSVParser27.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor30 = cSVParser27.iterator();
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\r\n" + "'", str12, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str16, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Delimiter=<4> Encapsulator=<\">" + "'", str25, "Delimiter=<4> Encapsulator=<\">");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '#' + "'", char26 == '#');
        org.junit.Assert.assertNotNull(cSVRecordSpliterator28);
        org.junit.Assert.assertNotNull(cSVRecordItor29);
        org.junit.Assert.assertNotNull(cSVRecordItor30);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1292");
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
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withEncapsulator('\"');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1293");
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
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor15 = cSVParser13.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor16 = cSVParser13.iterator();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor17 = cSVParser13.iterator();
        org.apache.commons.csv.CSVRecord cSVRecord18 = cSVParser13.getRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
        org.junit.Assert.assertNotNull(cSVRecordItor15);
        org.junit.Assert.assertNotNull(cSVRecordItor16);
        org.junit.Assert.assertNotNull(cSVRecordItor17);
        org.junit.Assert.assertNotNull(cSVRecord18);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1294");
        java.io.Reader reader0 = null;
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
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withEncapsulator('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser28 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat27);
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
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1295");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser("", cSVFormat1);
        char char3 = cSVFormat1.getEncapsulator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser("", cSVFormat5);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(strArray8);
        java.lang.String str10 = cSVFormat1.format(strArray8);
        boolean boolean11 = cSVFormat1.isSurroundingSpacesIgnored();
        cSVFormat1.validate();
        org.apache.commons.csv.ExtendedBufferedReader extendedBufferedReader13 = null;
        org.apache.commons.csv.CSVLexer cSVLexer14 = new org.apache.commons.csv.CSVLexer(cSVFormat1, extendedBufferedReader13);
        boolean boolean16 = cSVLexer14.isCommentStart((int) ' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1296");
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser("", cSVFormat12);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat8.format(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = new org.apache.commons.csv.CSVFormat('#', '#', '4', ' ', true, false, "hi!", strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withSurroundingSpacesIgnored(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withEscape('\ufffe');
        boolean boolean23 = cSVFormat20.isSurroundingSpacesIgnored();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser24 = new org.apache.commons.csv.CSVParser("", cSVFormat20);
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
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1297");
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
        boolean boolean28 = cSVFormat27.isSurroundingSpacesIgnored();
        boolean boolean29 = cSVFormat27.isEmptyLinesIgnored();
        java.io.Reader reader30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<org.apache.commons.csv.CSVRecord> cSVRecordIterable31 = cSVFormat27.parse(reader30);
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
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1298");
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
        java.lang.String[] strArray16 = cSVRecord15.values();
        java.lang.String str17 = cSVRecord15.toString();
        java.lang.String[] strArray18 = cSVRecord15.values();
        int int19 = cSVRecord15.size();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(cSVRecord15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[, , , hi!, hi!]" + "'", str17, "[, , , hi!, hi!]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1299");
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
        cSVFormat63.validate();
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
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1300");
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
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withSurroundingSpacesIgnored(false);
        char char28 = cSVFormat27.getDelimiter();
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
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '#' + "'", char28 == '#');
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1301");
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
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withDelimiter('\"');
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
        org.junit.Assert.assertNotNull(cSVFormat29);
    }
}

