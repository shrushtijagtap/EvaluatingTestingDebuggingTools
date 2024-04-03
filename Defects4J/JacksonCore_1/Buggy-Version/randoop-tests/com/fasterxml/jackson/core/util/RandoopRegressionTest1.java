package com.fasterxml.jackson.core.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test501");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = readerBasedJsonParser14.nextToken();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler16, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer21 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext19, outputStream20);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding22 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext19.setEncoding(jsonEncoding22);
        java.io.Reader reader25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer27 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int29 = charsToNameCanonicalizer27.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser30 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext19, (-1697824632), reader25, objectCodec26, charsToNameCanonicalizer27);
        int int31 = readerBasedJsonParser30.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory(objectCodec32);
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean36 = feature34.enabledIn(3);
        boolean boolean37 = jsonFactory33.isEnabled(feature34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory(objectCodec38);
        com.fasterxml.jackson.core.JsonFactory.Feature feature40 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean42 = feature40.enabledIn(3);
        boolean boolean43 = jsonFactory39.isEnabled(feature40);
        com.fasterxml.jackson.core.JsonParser.Feature feature44 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory39.disable(feature44);
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory33.disable(feature44);
        java.lang.String str47 = jsonFactory33.getFormatName();
        java.io.InputStream inputStream48 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonFactory33.createParser(inputStream48);
        long long50 = jsonParser49.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = new com.fasterxml.jackson.core.JsonFactory(objectCodec51);
        java.io.Reader reader53 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonFactory52.createParser(reader53);
        boolean boolean55 = jsonParser54.requiresCustomCodec();
        java.lang.String str56 = jsonParser54.getText();
        java.lang.Object obj57 = jsonParser54.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter59 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString60 = defaultPrettyPrinter59._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler61 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer62 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler61);
        char[] charArray63 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer62.resetWithShared(charArray63, 2000, 2000);
        int int68 = serializableString60.appendUnquoted(charArray63, 0);
        boolean boolean69 = jsonParser54.nextFieldName(serializableString60);
        com.fasterxml.jackson.core.Version version70 = jsonParser54.version();
        double double72 = jsonParser54.getValueAsDouble((double) (byte) -1);
        char[] charArray73 = jsonParser54.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec74 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory75 = new com.fasterxml.jackson.core.JsonFactory(objectCodec74);
        com.fasterxml.jackson.core.JsonFactory.Feature feature76 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean78 = feature76.enabledIn(3);
        boolean boolean79 = jsonFactory75.isEnabled(feature76);
        com.fasterxml.jackson.core.ObjectCodec objectCodec80 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory81 = new com.fasterxml.jackson.core.JsonFactory(objectCodec80);
        com.fasterxml.jackson.core.JsonFactory.Feature feature82 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean84 = feature82.enabledIn(3);
        boolean boolean85 = jsonFactory81.isEnabled(feature82);
        com.fasterxml.jackson.core.JsonParser.Feature feature86 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory87 = jsonFactory81.disable(feature86);
        com.fasterxml.jackson.core.JsonFactory jsonFactory88 = jsonFactory75.disable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser89 = jsonParser54.enable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser91 = jsonParser49.configure(feature86, true);
        com.fasterxml.jackson.core.JsonParser jsonParser92 = readerBasedJsonParser30.enable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser93 = readerBasedJsonParser14.disable(feature86);
        int int95 = readerBasedJsonParser14.getValueAsInt((-1));
        com.fasterxml.jackson.core.JsonParser jsonParser96 = readerBasedJsonParser14.skipChildren();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1072218128) + "'", int13 == (-1072218128));
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + jsonEncoding22 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding22.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer27);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-993947342) + "'", int29 == (-993947342));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature40.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature44.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "JSON" + "'", str47, "JSON");
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(serializableString60);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(version70);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertNull(charArray73);
        org.junit.Assert.assertTrue("'" + feature76 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature76.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + feature82 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature82.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + feature86 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature86.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory87);
        org.junit.Assert.assertNotNull(jsonFactory88);
        org.junit.Assert.assertNotNull(jsonParser89);
        org.junit.Assert.assertNotNull(jsonParser91);
        org.junit.Assert.assertNotNull(jsonParser92);
        org.junit.Assert.assertNotNull(jsonParser93);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertNotNull(jsonParser96);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test502");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = jsonParser3.getSchema();
        java.lang.String str6 = jsonParser3.nextTextValue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        jsonParser3.setCodec(objectCodec7);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test503");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 60);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = readerBasedJsonParser14.getParsingContext();
        java.lang.String str20 = readerBasedJsonParser14.getCurrentName();
        java.lang.String str22 = readerBasedJsonParser14.getValueAsString(" ");
        // The following exception was thrown during execution in test generation
        try {
            double double23 = readerBasedJsonParser14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1539569472) + "'", int13 == (-1539569472));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test504");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray17 = textBuffer16.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test505");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        byte[] byteArray6 = iOContext3.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(3);
        boolean boolean17 = jsonFactory13.isEnabled(feature14);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory13.disable(feature18);
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory13.createGenerator(outputStream20);
        com.fasterxml.jackson.core.io.IOContext iOContext22 = null;
        byte[] byteArray23 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext22, byteArray23, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory13.createJsonParser(byteArray23, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory(objectCodec30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean34 = feature32.enabledIn(3);
        boolean boolean35 = jsonFactory31.isEnabled(feature32);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory31.disable(feature36);
        java.io.OutputStream outputStream38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonFactory31.createGenerator(outputStream38);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        byte[] byteArray41 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper44 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext40, byteArray41, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory31.createJsonParser(byteArray41, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter49 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString50 = defaultPrettyPrinter49._rootSeparator;
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int59 = serializableString50.appendQuotedUTF8(byteArray57, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory31.createJsonParser(byteArray57);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory13.createJsonParser(byteArray57, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream66 = new com.fasterxml.jackson.core.io.MergedStream(iOContext10, inputStream11, byteArray57, 10, 2000);
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory68 = new com.fasterxml.jackson.core.JsonFactory(objectCodec67);
        com.fasterxml.jackson.core.JsonFactory.Feature feature69 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean71 = feature69.enabledIn(3);
        boolean boolean72 = jsonFactory68.isEnabled(feature69);
        com.fasterxml.jackson.core.JsonParser.Feature feature73 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory74 = jsonFactory68.disable(feature73);
        java.io.OutputStream outputStream75 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator76 = jsonFactory68.createGenerator(outputStream75);
        com.fasterxml.jackson.core.io.IOContext iOContext77 = null;
        byte[] byteArray78 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper81 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext77, byteArray78, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser84 = jsonFactory68.createJsonParser(byteArray78, 1, (int) (short) 100);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader88 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, (java.io.InputStream) mergedStream66, byteArray78, (int) (short) -1, 1000, true);
        boolean boolean89 = uTF32Reader88.markSupported();
        boolean boolean90 = uTF32Reader88.ready();
        com.fasterxml.jackson.core.JsonLocation jsonLocation95 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) uTF32Reader88, 60L, (long) 4, 518492068, 0);
        // The following exception was thrown during execution in test generation
        try {
            uTF32Reader88.freeBuffers();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(serializableString50);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertTrue("'" + feature69 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature69.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + feature73 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature73.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory74);
        org.junit.Assert.assertNotNull(jsonGenerator76);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test506");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.toString();
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory(objectCodec3);
        com.fasterxml.jackson.core.JsonFactory.Feature feature5 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean7 = feature5.enabledIn(3);
        boolean boolean8 = jsonFactory4.isEnabled(feature5);
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = new com.fasterxml.jackson.core.JsonFactory(objectCodec9);
        com.fasterxml.jackson.core.JsonFactory.Feature feature11 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean13 = feature11.enabledIn(3);
        boolean boolean14 = jsonFactory10.isEnabled(feature11);
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory10.disable(feature15);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory4.disable(feature15);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = jsonFactory17._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        char[] charArray20 = textBuffer19.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray20, 0, (-842865234));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature5.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + feature11 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature11.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature15.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(bufferRecycler18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test507");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        boolean boolean15 = readerBasedJsonParser14.isClosed();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = readerBasedJsonParser14.getCurrentLocation();
        readerBasedJsonParser14.overrideCurrentName("2.2250738585072012e-308");
        com.fasterxml.jackson.core.JsonLocation jsonLocation19 = readerBasedJsonParser14.getCurrentLocation();
        readerBasedJsonParser14.clearCurrentToken();
        readerBasedJsonParser14.overrideCurrentName("");
        com.fasterxml.jackson.core.Version version23 = readerBasedJsonParser14.version();
        java.lang.String str25 = readerBasedJsonParser14.getValueAsString("hi!");
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 671864404 + "'", int13 == 671864404);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonLocation16);
        org.junit.Assert.assertNotNull(jsonLocation19);
        org.junit.Assert.assertNotNull(version23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test508");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory(objectCodec4);
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn(3);
        boolean boolean9 = jsonFactory5.isEnabled(feature6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory(objectCodec10);
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean14 = feature12.enabledIn(3);
        boolean boolean15 = jsonFactory11.isEnabled(feature12);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory11.disable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.disable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory5.createGenerator(outputStream19);
        defaultPrettyPrinter3.writeStartArray(jsonGenerator20);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter22 = defaultPrettyPrinter3._arrayIndenter;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext26 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler23, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream27 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer28 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext26, outputStream27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext34 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler31, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream35 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer36 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext34, outputStream35);
        uTF8Writer36.flush();
        java.io.Writer writer39 = uTF8Writer36.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator40 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext26, (-1703009269), objectCodec30, (java.io.Writer) uTF8Writer36);
        com.fasterxml.jackson.core.Version version41 = writerBasedJsonGenerator40.version();
        writerBasedJsonGenerator40.writeNumber((float) 10L);
        defaultPrettyPrinter3.writeObjectFieldValueSeparator((com.fasterxml.jackson.core.JsonGenerator) writerBasedJsonGenerator40);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory(objectCodec45);
        java.io.Reader reader47 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonFactory46.createParser(reader47);
        boolean boolean49 = jsonParser48.requiresCustomCodec();
        java.lang.String str50 = jsonParser48.getText();
        int int52 = jsonParser48.nextIntValue(0);
        com.fasterxml.jackson.core.JsonLocation jsonLocation53 = jsonParser48.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParser.Feature feature54 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean55 = jsonParser48.isEnabled(feature54);
        com.fasterxml.jackson.core.JsonToken jsonToken56 = jsonParser48.getCurrentToken();
        boolean boolean57 = jsonParser48.hasTextCharacters();
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator40.copyCurrentEvent(jsonParser48);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No current event to copy");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNotNull(indenter22);
        org.junit.Assert.assertNotNull(writer39);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(jsonLocation53);
        org.junit.Assert.assertTrue("'" + feature54 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature54.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(jsonToken56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test509");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter2 = lf2SpacesIndenter0.withLinefeed("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext6 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler3, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream7 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer8 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext6, outputStream7);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext14 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler11, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream15 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer16 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext14, outputStream15);
        uTF8Writer16.flush();
        java.io.Writer writer19 = uTF8Writer16.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator20 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext6, (-1703009269), objectCodec10, (java.io.Writer) uTF8Writer16);
        com.fasterxml.jackson.core.io.SerializedString serializedString22 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str23 = serializedString22.toString();
        char[] charArray24 = new char[] {};
        int int26 = serializedString22.appendQuoted(charArray24, (int) (byte) 10);
        byte[] byteArray27 = serializedString22.asQuotedUTF8();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = writerBasedJsonGenerator20.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString22);
        lf2SpacesIndenter2.writeIndentation(jsonGenerator28, (-1703009269));
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory(objectCodec31);
        com.fasterxml.jackson.core.JsonFactory.Feature feature33 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean35 = feature33.enabledIn(3);
        boolean boolean36 = jsonFactory32.isEnabled(feature33);
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = new com.fasterxml.jackson.core.JsonFactory(objectCodec37);
        com.fasterxml.jackson.core.JsonFactory.Feature feature39 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean41 = feature39.enabledIn(3);
        boolean boolean42 = jsonFactory38.isEnabled(feature39);
        com.fasterxml.jackson.core.JsonParser.Feature feature43 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory38.disable(feature43);
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory32.disable(feature43);
        java.io.OutputStream outputStream46 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator47 = jsonFactory32.createGenerator(outputStream46);
        jsonGenerator47.writeNumber((short) (byte) 10);
        lf2SpacesIndenter2.writeIndentation(jsonGenerator47, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator47.writeStringField("com.fasterxml.jackson.core.JsonParseException: \n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]", "");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Can not write a field name, expecting a value");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lf2SpacesIndenter0);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter2);
        org.junit.Assert.assertNotNull(writer19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[92, 110]");
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature43.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonGenerator47);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test510");
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext2 = com.fasterxml.jackson.core.json.JsonReadContext.createRootContext(79, (int) (byte) 1);
        boolean boolean3 = jsonReadContext2.inArray();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = jsonReadContext2.createChildArrayContext((int) (byte) 0, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream11 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer12 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext10, outputStream11);
        byte[] byteArray13 = iOContext10.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext17 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler14, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream18 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory(objectCodec19);
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean23 = feature21.enabledIn(3);
        boolean boolean24 = jsonFactory20.isEnabled(feature21);
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory20.disable(feature25);
        java.io.OutputStream outputStream27 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = jsonFactory20.createGenerator(outputStream27);
        com.fasterxml.jackson.core.io.IOContext iOContext29 = null;
        byte[] byteArray30 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper33 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext29, byteArray30, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser36 = jsonFactory20.createJsonParser(byteArray30, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = new com.fasterxml.jackson.core.JsonFactory(objectCodec37);
        com.fasterxml.jackson.core.JsonFactory.Feature feature39 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean41 = feature39.enabledIn(3);
        boolean boolean42 = jsonFactory38.isEnabled(feature39);
        com.fasterxml.jackson.core.JsonParser.Feature feature43 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory38.disable(feature43);
        java.io.OutputStream outputStream45 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator46 = jsonFactory38.createGenerator(outputStream45);
        com.fasterxml.jackson.core.io.IOContext iOContext47 = null;
        byte[] byteArray48 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper51 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext47, byteArray48, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonFactory38.createJsonParser(byteArray48, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter56 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString57 = defaultPrettyPrinter56._rootSeparator;
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int66 = serializableString57.appendQuotedUTF8(byteArray64, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser67 = jsonFactory38.createJsonParser(byteArray64);
        com.fasterxml.jackson.core.JsonParser jsonParser70 = jsonFactory20.createJsonParser(byteArray64, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream73 = new com.fasterxml.jackson.core.io.MergedStream(iOContext17, inputStream18, byteArray64, 10, 2000);
        com.fasterxml.jackson.core.ObjectCodec objectCodec74 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory75 = new com.fasterxml.jackson.core.JsonFactory(objectCodec74);
        com.fasterxml.jackson.core.JsonFactory.Feature feature76 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean78 = feature76.enabledIn(3);
        boolean boolean79 = jsonFactory75.isEnabled(feature76);
        com.fasterxml.jackson.core.JsonParser.Feature feature80 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory81 = jsonFactory75.disable(feature80);
        java.io.OutputStream outputStream82 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator83 = jsonFactory75.createGenerator(outputStream82);
        com.fasterxml.jackson.core.io.IOContext iOContext84 = null;
        byte[] byteArray85 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper88 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext84, byteArray85, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser91 = jsonFactory75.createJsonParser(byteArray85, 1, (int) (short) 100);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader95 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext10, (java.io.InputStream) mergedStream73, byteArray85, (int) (short) -1, 1000, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation96 = jsonReadContext6.getStartLocation((java.lang.Object) 1000);
        int int97 = jsonReadContext6.getEntryCount();
        org.junit.Assert.assertNotNull(jsonReadContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature43.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertNotNull(jsonGenerator46);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertNotNull(serializableString57);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(jsonParser67);
        org.junit.Assert.assertNotNull(jsonParser70);
        org.junit.Assert.assertTrue("'" + feature76 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature76.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + feature80 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature80.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory81);
        org.junit.Assert.assertNotNull(jsonGenerator83);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray85), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser91);
        org.junit.Assert.assertNotNull(jsonLocation96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test511");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory(objectCodec4);
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn(3);
        boolean boolean9 = jsonFactory5.isEnabled(feature6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory(objectCodec10);
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean14 = feature12.enabledIn(3);
        boolean boolean15 = jsonFactory11.isEnabled(feature12);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory11.disable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.disable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory5.createGenerator(outputStream19);
        defaultPrettyPrinter3.writeStartArray(jsonGenerator20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = new com.fasterxml.jackson.core.JsonFactory(objectCodec22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean26 = feature24.enabledIn(3);
        boolean boolean27 = jsonFactory23.isEnabled(feature24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory(objectCodec28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean32 = feature30.enabledIn(3);
        boolean boolean33 = jsonFactory29.isEnabled(feature30);
        com.fasterxml.jackson.core.JsonParser.Feature feature34 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory29.disable(feature34);
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory23.disable(feature34);
        java.io.OutputStream outputStream37 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = jsonFactory23.createGenerator(outputStream37);
        jsonGenerator38.writeNumber((short) (byte) 10);
        defaultPrettyPrinter3.beforeArrayValues(jsonGenerator38);
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = new com.fasterxml.jackson.core.JsonFactory(objectCodec42);
        java.io.Reader reader44 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser45 = jsonFactory43.createParser(reader44);
        com.fasterxml.jackson.core.Version version46 = jsonFactory43.version();
        java.io.OutputStream outputStream47 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator48 = jsonFactory43.createGenerator(outputStream47);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator49 = jsonGenerator48.useDefaultPrettyPrinter();
        defaultPrettyPrinter3.beforeObjectEntries(jsonGenerator49);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext54 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler51, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream55 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer56 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext54, outputStream55);
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler59 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext62 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler59, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream63 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer64 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext62, outputStream63);
        uTF8Writer64.flush();
        java.io.Writer writer67 = uTF8Writer64.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator68 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext54, (-1703009269), objectCodec58, (java.io.Writer) uTF8Writer64);
        com.fasterxml.jackson.core.Version version69 = writerBasedJsonGenerator68.version();
        writerBasedJsonGenerator68.writeRaw("com.fasterxml.jackson.core.JsonParseException: \n\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext72 = writerBasedJsonGenerator68.getOutputContext();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator73 = writerBasedJsonGenerator68.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.Version version74 = writerBasedJsonGenerator68.version();
        defaultPrettyPrinter3.writeStartObject((com.fasterxml.jackson.core.JsonGenerator) writerBasedJsonGenerator68);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertNotNull(jsonParser45);
        org.junit.Assert.assertNotNull(version46);
        org.junit.Assert.assertNotNull(jsonGenerator48);
        org.junit.Assert.assertNotNull(jsonGenerator49);
        org.junit.Assert.assertNotNull(writer67);
        org.junit.Assert.assertNotNull(version69);
        org.junit.Assert.assertNotNull(jsonWriteContext72);
        org.junit.Assert.assertNotNull(jsonGenerator73);
        org.junit.Assert.assertNotNull(version74);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test512");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream12 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer13 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext11, outputStream12);
        uTF8Writer13.flush();
        java.io.Writer writer16 = uTF8Writer13.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1703009269), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter19 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString20 = defaultPrettyPrinter19._rootSeparator;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int29 = serializableString20.appendQuotedUTF8(byteArray27, (int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext33 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler30, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream34 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory(objectCodec35);
        com.fasterxml.jackson.core.JsonFactory.Feature feature37 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean39 = feature37.enabledIn(3);
        boolean boolean40 = jsonFactory36.isEnabled(feature37);
        com.fasterxml.jackson.core.JsonParser.Feature feature41 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory36.disable(feature41);
        java.io.OutputStream outputStream43 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator44 = jsonFactory36.createGenerator(outputStream43);
        com.fasterxml.jackson.core.io.IOContext iOContext45 = null;
        byte[] byteArray46 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper49 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext45, byteArray46, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser52 = jsonFactory36.createJsonParser(byteArray46, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = new com.fasterxml.jackson.core.JsonFactory(objectCodec53);
        com.fasterxml.jackson.core.JsonFactory.Feature feature55 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean57 = feature55.enabledIn(3);
        boolean boolean58 = jsonFactory54.isEnabled(feature55);
        com.fasterxml.jackson.core.JsonParser.Feature feature59 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = jsonFactory54.disable(feature59);
        java.io.OutputStream outputStream61 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator62 = jsonFactory54.createGenerator(outputStream61);
        com.fasterxml.jackson.core.io.IOContext iOContext63 = null;
        byte[] byteArray64 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper67 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext63, byteArray64, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser70 = jsonFactory54.createJsonParser(byteArray64, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter72 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString73 = defaultPrettyPrinter72._rootSeparator;
        byte[] byteArray80 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int82 = serializableString73.appendQuotedUTF8(byteArray80, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser83 = jsonFactory54.createJsonParser(byteArray80);
        com.fasterxml.jackson.core.JsonParser jsonParser86 = jsonFactory36.createJsonParser(byteArray80, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream89 = new com.fasterxml.jackson.core.io.MergedStream(iOContext33, inputStream34, byteArray80, 10, 2000);
        int int91 = serializableString20.appendQuotedUTF8(byteArray80, 1716428639);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper94 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext3, byteArray80, 1, (-1702922759));
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader95 = byteSourceJsonBootstrapper94.constructReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(serializableString20);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + feature41 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature41.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory42);
        org.junit.Assert.assertNotNull(jsonGenerator44);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser52);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature59.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory60);
        org.junit.Assert.assertNotNull(jsonGenerator62);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser70);
        org.junit.Assert.assertNotNull(serializableString73);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(jsonParser83);
        org.junit.Assert.assertNotNull(jsonParser86);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test513");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("com.fasterxml.jackson.core.JsonParseException: \n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]", 1470709834);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1470709834 + "'", int2 == 1470709834);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test514");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = readerBasedJsonParser14.getTokenLocation();
        java.lang.String str18 = readerBasedJsonParser14.getValueAsString();
        java.lang.String str19 = readerBasedJsonParser14.getCurrentName();
        java.lang.String str20 = readerBasedJsonParser14.getText();
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        readerBasedJsonParser14.setCodec(objectCodec21);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType23 = readerBasedJsonParser14.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 803174918 + "'", int13 == 803174918);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jsonLocation17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test515");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray2, 1601635834, 1277633762);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1601635834");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test516");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream4 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory(objectCodec5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean9 = feature7.enabledIn(3);
        boolean boolean10 = jsonFactory6.isEnabled(feature7);
        com.fasterxml.jackson.core.JsonParser.Feature feature11 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory6.disable(feature11);
        java.io.OutputStream outputStream13 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = jsonFactory6.createGenerator(outputStream13);
        com.fasterxml.jackson.core.io.IOContext iOContext15 = null;
        byte[] byteArray16 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper19 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext15, byteArray16, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory6.createJsonParser(byteArray16, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory(objectCodec23);
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(3);
        boolean boolean28 = jsonFactory24.isEnabled(feature25);
        com.fasterxml.jackson.core.JsonParser.Feature feature29 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory24.disable(feature29);
        java.io.OutputStream outputStream31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory24.createGenerator(outputStream31);
        com.fasterxml.jackson.core.io.IOContext iOContext33 = null;
        byte[] byteArray34 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper37 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext33, byteArray34, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory24.createJsonParser(byteArray34, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter42 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString43 = defaultPrettyPrinter42._rootSeparator;
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int52 = serializableString43.appendQuotedUTF8(byteArray50, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory24.createJsonParser(byteArray50);
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory6.createJsonParser(byteArray50, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream59 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray50, 10, 2000);
        long long61 = mergedStream59.skip((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            mergedStream59.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + feature11 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature11.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(jsonGenerator14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature29.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNotNull(serializableString43);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test517");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        int int17 = readerBasedJsonParser14.getTokenLineNr();
        int int19 = readerBasedJsonParser14.getValueAsInt(0);
        int int20 = readerBasedJsonParser14.getTextLength();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1185739600 + "'", int13 == 1185739600);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test518");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream4 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory(objectCodec5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean9 = feature7.enabledIn(3);
        boolean boolean10 = jsonFactory6.isEnabled(feature7);
        com.fasterxml.jackson.core.JsonParser.Feature feature11 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory6.disable(feature11);
        java.io.OutputStream outputStream13 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = jsonFactory6.createGenerator(outputStream13);
        com.fasterxml.jackson.core.io.IOContext iOContext15 = null;
        byte[] byteArray16 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper19 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext15, byteArray16, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory6.createJsonParser(byteArray16, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory(objectCodec23);
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(3);
        boolean boolean28 = jsonFactory24.isEnabled(feature25);
        com.fasterxml.jackson.core.JsonParser.Feature feature29 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory24.disable(feature29);
        java.io.OutputStream outputStream31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory24.createGenerator(outputStream31);
        com.fasterxml.jackson.core.io.IOContext iOContext33 = null;
        byte[] byteArray34 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper37 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext33, byteArray34, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory24.createJsonParser(byteArray34, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter42 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString43 = defaultPrettyPrinter42._rootSeparator;
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int52 = serializableString43.appendQuotedUTF8(byteArray50, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory24.createJsonParser(byteArray50);
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory6.createJsonParser(byteArray50, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream59 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray50, 10, 2000);
        char[] charArray61 = iOContext3.allocNameCopyBuffer((-1081632712));
        java.lang.Object obj62 = iOContext3.getSourceReference();
        char[] charArray63 = iOContext3.allocConcatBuffer();
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + feature11 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature11.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(jsonGenerator14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature29.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNotNull(serializableString43);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (byte) -1 + "'", obj62, (byte) -1);
        org.junit.Assert.assertNotNull(charArray63);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test519");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        java.lang.Class<?> wildcardClass5 = version4.getClass();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test520");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = defaultPrettyPrinter1._rootSeparator;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int11 = serializableString2.appendQuotedUTF8(byteArray9, (int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext15 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler12, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream16 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory(objectCodec17);
        com.fasterxml.jackson.core.JsonFactory.Feature feature19 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean21 = feature19.enabledIn(3);
        boolean boolean22 = jsonFactory18.isEnabled(feature19);
        com.fasterxml.jackson.core.JsonParser.Feature feature23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory18.disable(feature23);
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = jsonFactory18.createGenerator(outputStream25);
        com.fasterxml.jackson.core.io.IOContext iOContext27 = null;
        byte[] byteArray28 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper31 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext27, byteArray28, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory18.createJsonParser(byteArray28, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory(objectCodec35);
        com.fasterxml.jackson.core.JsonFactory.Feature feature37 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean39 = feature37.enabledIn(3);
        boolean boolean40 = jsonFactory36.isEnabled(feature37);
        com.fasterxml.jackson.core.JsonParser.Feature feature41 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory36.disable(feature41);
        java.io.OutputStream outputStream43 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator44 = jsonFactory36.createGenerator(outputStream43);
        com.fasterxml.jackson.core.io.IOContext iOContext45 = null;
        byte[] byteArray46 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper49 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext45, byteArray46, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser52 = jsonFactory36.createJsonParser(byteArray46, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter54 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString55 = defaultPrettyPrinter54._rootSeparator;
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int64 = serializableString55.appendQuotedUTF8(byteArray62, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser65 = jsonFactory36.createJsonParser(byteArray62);
        com.fasterxml.jackson.core.JsonParser jsonParser68 = jsonFactory18.createJsonParser(byteArray62, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream71 = new com.fasterxml.jackson.core.io.MergedStream(iOContext15, inputStream16, byteArray62, 10, 2000);
        int int73 = serializableString2.appendQuotedUTF8(byteArray62, 1716428639);
        byte[] byteArray74 = serializableString2.asQuotedUTF8();
        org.junit.Assert.assertNotNull(serializableString2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonGenerator26);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + feature41 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature41.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory42);
        org.junit.Assert.assertNotNull(jsonGenerator44);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser52);
        org.junit.Assert.assertNotNull(serializableString55);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(jsonParser65);
        org.junit.Assert.assertNotNull(jsonParser68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[104, 105, 33]");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test521");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 60);
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext19 = readerBasedJsonParser14.getParsingContext();
        java.lang.Object obj20 = readerBasedJsonParser14.getEmbeddedObject();
        java.lang.Object obj21 = readerBasedJsonParser14.getInputSource();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-835964844) + "'", int13 == (-835964844));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNotNull(jsonReadContext19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test522");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonParser3.setFeatureMask((int) (byte) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        jsonParser6.setCodec(objectCodec7);
        boolean boolean9 = jsonParser6.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = null;
        boolean boolean11 = jsonParser6.canUseSchema(formatSchema10);
        int int12 = jsonParser6.getFeatureMask();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test523");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        byte[] byteArray11 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper14 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext10, byteArray11, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createJsonParser(byteArray11, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter19 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString20 = defaultPrettyPrinter19._rootSeparator;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int29 = serializableString20.appendQuotedUTF8(byteArray27, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory1.createJsonParser(byteArray27);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory1.setRootValueSeparator("JSON");
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory(objectCodec33);
        com.fasterxml.jackson.core.JsonFactory.Feature feature35 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean37 = feature35.enabledIn(3);
        boolean boolean38 = jsonFactory34.isEnabled(feature35);
        com.fasterxml.jackson.core.JsonParser.Feature feature39 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory34.disable(feature39);
        java.io.OutputStream outputStream41 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = jsonFactory34.createGenerator(outputStream41);
        java.lang.Object obj43 = jsonGenerator42.getOutputTarget();
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter44 = jsonGenerator42.getPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory(objectCodec45);
        com.fasterxml.jackson.core.JsonFactory.Feature feature47 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean49 = feature47.enabledIn(3);
        boolean boolean50 = jsonFactory46.isEnabled(feature47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = new com.fasterxml.jackson.core.JsonFactory(objectCodec51);
        com.fasterxml.jackson.core.JsonFactory.Feature feature53 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean55 = feature53.enabledIn(3);
        boolean boolean56 = jsonFactory52.isEnabled(feature53);
        com.fasterxml.jackson.core.JsonParser.Feature feature57 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = jsonFactory52.disable(feature57);
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = jsonFactory46.disable(feature57);
        java.io.OutputStream outputStream60 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator61 = jsonFactory46.createGenerator(outputStream60);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature62 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean63 = feature62.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator64 = jsonGenerator61.enable(feature62);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator65 = jsonGenerator42.disable(feature62);
        com.fasterxml.jackson.core.JsonFactory jsonFactory66 = jsonFactory1.disable(feature62);
        com.fasterxml.jackson.core.JsonFactory.Feature feature67 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean69 = feature67.enabledIn(3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory70 = jsonFactory1.disable(feature67);
        boolean boolean72 = feature67.enabledIn((-1702946933));
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(serializableString20);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature35.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(prettyPrinter44);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + feature53 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature53.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature57.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory58);
        org.junit.Assert.assertNotNull(jsonFactory59);
        org.junit.Assert.assertNotNull(jsonGenerator61);
        org.junit.Assert.assertTrue("'" + feature62 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature62.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(jsonGenerator64);
        org.junit.Assert.assertNotNull(jsonGenerator65);
        org.junit.Assert.assertNotNull(jsonFactory66);
        org.junit.Assert.assertTrue("'" + feature67 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature67.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(jsonFactory70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test524");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = jsonFactory1._getBufferRecycler();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter9 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter11 = lf2SpacesIndenter9.withLinefeed("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext15 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler12, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream16 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer17 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext15, outputStream16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext23 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler20, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer25 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext23, outputStream24);
        uTF8Writer25.flush();
        java.io.Writer writer28 = uTF8Writer25.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator29 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext15, (-1703009269), objectCodec19, (java.io.Writer) uTF8Writer25);
        com.fasterxml.jackson.core.io.SerializedString serializedString31 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str32 = serializedString31.toString();
        char[] charArray33 = new char[] {};
        int int35 = serializedString31.appendQuoted(charArray33, (int) (byte) 10);
        byte[] byteArray36 = serializedString31.asQuotedUTF8();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = writerBasedJsonGenerator29.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString31);
        lf2SpacesIndenter11.writeIndentation(jsonGenerator37, (-1703009269));
        jsonGenerator37.writeNumber((double) 0L);
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str44 = serializedString43.toString();
        int int45 = serializedString43.charLength();
        byte[] byteArray46 = serializedString43.asUnquotedUTF8();
        byte[] byteArray47 = serializedString43.asQuotedUTF8();
        jsonGenerator37.writeBinary(byteArray47);
        com.fasterxml.jackson.core.JsonLocation jsonLocation52 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) byteArray47, (long) (-99573726), (-1707956557), (-1077838140));
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory1.createJsonParser(byteArray47);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(bufferRecycler8);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter9);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter11);
        org.junit.Assert.assertNotNull(writer28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\n" + "'", str32, "\n");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[92, 110]");
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\n" + "'", str44, "\n");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[10]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[92, 110]");
        org.junit.Assert.assertNotNull(jsonParser53);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test525");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        textBuffer1.resetWithString("hi!");
        char[] charArray6 = textBuffer1.finishCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream11 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer12 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext10, outputStream11);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext18 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler15, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer20 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext18, outputStream19);
        uTF8Writer20.flush();
        java.io.Writer writer23 = uTF8Writer20.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator24 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext10, (-1703009269), objectCodec14, (java.io.Writer) uTF8Writer20);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature25 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean26 = writerBasedJsonGenerator24.isEnabled(feature25);
        java.math.BigInteger bigInteger27 = null;
        writerBasedJsonGenerator24.writeNumber(bigInteger27);
        com.fasterxml.jackson.core.io.SerializedString serializedString30 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str31 = serializedString30.toString();
        int int32 = serializedString30.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext36 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler33, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream37 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer38 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext36, outputStream37);
        byte[] byteArray39 = iOContext36.allocReadIOBuffer();
        int int41 = serializedString30.appendQuotedUTF8(byteArray39, 3);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = writerBasedJsonGenerator24.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString30);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler43 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer44 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler43);
        textBuffer44.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler47 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer48 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler47);
        textBuffer48.append(' ');
        textBuffer48.resetWithString("hi!");
        char[] charArray53 = textBuffer48.finishCurrentSegment();
        textBuffer44.append(charArray53, (int) (short) 1, 100);
        writerBasedJsonGenerator24.writeRawValue(charArray53, (int) '#', (int) (byte) 100);
        int int62 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray53, 0, 598508020);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray53, 1716428639, (-1504125096));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(writer23);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature25.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n" + "'", str31, "\n");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1038366032) + "'", int62 == (-1038366032));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test526");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonFactory1.version();
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory1.createGenerator(outputStream5);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory(objectCodec7);
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean11 = feature9.enabledIn(3);
        boolean boolean12 = jsonFactory8.isEnabled(feature9);
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory(objectCodec13);
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean17 = feature15.enabledIn(3);
        boolean boolean18 = jsonFactory14.isEnabled(feature15);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory(objectCodec19);
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean23 = feature21.enabledIn(3);
        boolean boolean24 = jsonFactory20.isEnabled(feature21);
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory20.disable(feature25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory14.disable(feature25);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = jsonFactory27._getBufferRecycler();
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = new com.fasterxml.jackson.core.JsonFactory(objectCodec29);
        com.fasterxml.jackson.core.JsonFactory.Feature feature31 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean33 = feature31.enabledIn(3);
        boolean boolean34 = jsonFactory30.isEnabled(feature31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory(objectCodec35);
        com.fasterxml.jackson.core.JsonFactory.Feature feature37 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean39 = feature37.enabledIn(3);
        boolean boolean40 = jsonFactory36.isEnabled(feature37);
        com.fasterxml.jackson.core.JsonParser.Feature feature41 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory36.disable(feature41);
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = jsonFactory30.disable(feature41);
        java.lang.String str44 = jsonFactory30.getFormatName();
        java.io.InputStream inputStream45 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser46 = jsonFactory30.createParser(inputStream45);
        long long47 = jsonParser46.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = new com.fasterxml.jackson.core.JsonFactory(objectCodec48);
        java.io.Reader reader50 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonFactory49.createParser(reader50);
        boolean boolean52 = jsonParser51.requiresCustomCodec();
        java.lang.String str53 = jsonParser51.getText();
        java.lang.Object obj54 = jsonParser51.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter56 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString57 = defaultPrettyPrinter56._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler58 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer59 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler58);
        char[] charArray60 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer59.resetWithShared(charArray60, 2000, 2000);
        int int65 = serializableString57.appendUnquoted(charArray60, 0);
        boolean boolean66 = jsonParser51.nextFieldName(serializableString57);
        com.fasterxml.jackson.core.Version version67 = jsonParser51.version();
        double double69 = jsonParser51.getValueAsDouble((double) (byte) -1);
        char[] charArray70 = jsonParser51.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec71 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory72 = new com.fasterxml.jackson.core.JsonFactory(objectCodec71);
        com.fasterxml.jackson.core.JsonFactory.Feature feature73 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean75 = feature73.enabledIn(3);
        boolean boolean76 = jsonFactory72.isEnabled(feature73);
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory78 = new com.fasterxml.jackson.core.JsonFactory(objectCodec77);
        com.fasterxml.jackson.core.JsonFactory.Feature feature79 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean81 = feature79.enabledIn(3);
        boolean boolean82 = jsonFactory78.isEnabled(feature79);
        com.fasterxml.jackson.core.JsonParser.Feature feature83 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory84 = jsonFactory78.disable(feature83);
        com.fasterxml.jackson.core.JsonFactory jsonFactory85 = jsonFactory72.disable(feature83);
        com.fasterxml.jackson.core.JsonParser jsonParser86 = jsonParser51.enable(feature83);
        com.fasterxml.jackson.core.JsonParser jsonParser88 = jsonParser46.configure(feature83, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory89 = jsonFactory27.enable(feature83);
        com.fasterxml.jackson.core.JsonFactory jsonFactory90 = jsonFactory8.disable(feature83);
        boolean boolean91 = feature83.enabledByDefault();
        boolean boolean92 = jsonFactory1.isEnabled(feature83);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertNotNull(bufferRecycler28);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature31.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + feature41 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature41.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory42);
        org.junit.Assert.assertNotNull(jsonFactory43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "JSON" + "'", str44, "JSON");
        org.junit.Assert.assertNotNull(jsonParser46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(serializableString57);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(version67);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertNull(charArray70);
        org.junit.Assert.assertTrue("'" + feature73 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature73.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + feature79 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature79.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + feature83 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature83.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory84);
        org.junit.Assert.assertNotNull(jsonFactory85);
        org.junit.Assert.assertNotNull(jsonParser86);
        org.junit.Assert.assertNotNull(jsonParser88);
        org.junit.Assert.assertNotNull(jsonFactory89);
        org.junit.Assert.assertNotNull(jsonFactory90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test527");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        java.lang.Object obj17 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler15, obj17, false);
        byte[] byteArray20 = iOContext19.allocWriteEncodingBuffer();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter22 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString23 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter24 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter22, serializableString23);
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory(objectCodec25);
        com.fasterxml.jackson.core.JsonFactory.Feature feature27 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean29 = feature27.enabledIn(3);
        boolean boolean30 = jsonFactory26.isEnabled(feature27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory(objectCodec31);
        com.fasterxml.jackson.core.JsonFactory.Feature feature33 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean35 = feature33.enabledIn(3);
        boolean boolean36 = jsonFactory32.isEnabled(feature33);
        com.fasterxml.jackson.core.JsonParser.Feature feature37 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory32.disable(feature37);
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = jsonFactory26.disable(feature37);
        java.io.OutputStream outputStream40 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator41 = jsonFactory26.createGenerator(outputStream40);
        defaultPrettyPrinter24.writeObjectEntrySeparator(jsonGenerator41);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter44 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString45 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter46 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter44, serializableString45);
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = new com.fasterxml.jackson.core.JsonFactory(objectCodec47);
        com.fasterxml.jackson.core.JsonFactory.Feature feature49 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean51 = feature49.enabledIn(3);
        boolean boolean52 = jsonFactory48.isEnabled(feature49);
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = new com.fasterxml.jackson.core.JsonFactory(objectCodec53);
        com.fasterxml.jackson.core.JsonFactory.Feature feature55 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean57 = feature55.enabledIn(3);
        boolean boolean58 = jsonFactory54.isEnabled(feature55);
        com.fasterxml.jackson.core.JsonParser.Feature feature59 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = jsonFactory54.disable(feature59);
        com.fasterxml.jackson.core.JsonFactory jsonFactory61 = jsonFactory48.disable(feature59);
        java.io.OutputStream outputStream62 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator63 = jsonFactory48.createGenerator(outputStream62);
        defaultPrettyPrinter46.writeStartArray(jsonGenerator63);
        defaultPrettyPrinter24.writeStartObject(jsonGenerator63);
        com.fasterxml.jackson.core.ObjectCodec objectCodec66 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory67 = new com.fasterxml.jackson.core.JsonFactory(objectCodec66);
        com.fasterxml.jackson.core.JsonFactory.Feature feature68 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean70 = feature68.enabledIn(3);
        boolean boolean71 = jsonFactory67.isEnabled(feature68);
        com.fasterxml.jackson.core.ObjectCodec objectCodec72 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory73 = new com.fasterxml.jackson.core.JsonFactory(objectCodec72);
        com.fasterxml.jackson.core.JsonFactory.Feature feature74 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean76 = feature74.enabledIn(3);
        boolean boolean77 = jsonFactory73.isEnabled(feature74);
        com.fasterxml.jackson.core.JsonParser.Feature feature78 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory79 = jsonFactory73.disable(feature78);
        com.fasterxml.jackson.core.JsonFactory jsonFactory80 = jsonFactory67.disable(feature78);
        java.io.OutputStream outputStream81 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator82 = jsonFactory67.createGenerator(outputStream81);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature83 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean84 = feature83.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator85 = jsonGenerator82.enable(feature83);
        defaultPrettyPrinter24.writeEndArray(jsonGenerator85, (int) (byte) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter89 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString90 = defaultPrettyPrinter89._rootSeparator;
        jsonGenerator85.writeString(serializableString90);
        char[] charArray92 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        int int94 = serializableString90.appendUnquoted(charArray92, (int) 'a');
        char[] charArray95 = serializableString90.asQuotedChars();
        byte[] byteArray96 = serializableString90.asUnquotedUTF8();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper99 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext19, byteArray96, (-1077838140), 1716277517);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature27.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertNotNull(jsonGenerator41);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature49.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature59.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory60);
        org.junit.Assert.assertNotNull(jsonFactory61);
        org.junit.Assert.assertNotNull(jsonGenerator63);
        org.junit.Assert.assertTrue("'" + feature68 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature68.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + feature74 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature74.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + feature78 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature78.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory79);
        org.junit.Assert.assertNotNull(jsonFactory80);
        org.junit.Assert.assertNotNull(jsonGenerator82);
        org.junit.Assert.assertTrue("'" + feature83 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature83.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(jsonGenerator85);
        org.junit.Assert.assertNotNull(serializableString90);
        org.junit.Assert.assertNotNull(charArray92);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray92), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray92), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray92), "[]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertNotNull(charArray95);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray95), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray95), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray95), "[h, i, !]");
        org.junit.Assert.assertNotNull(byteArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray96), "[104, 105, 33]");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test528");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        boolean boolean4 = defaultPrettyPrinter3._spacesInObjectEntries;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter5 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter7 = lf2SpacesIndenter5.withLinefeed("");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter9 = lf2SpacesIndenter7.withLinefeed("hi!");
        defaultPrettyPrinter3.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter7);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter11 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter3);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext15 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler12, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream16 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer17 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext15, outputStream16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext23 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler20, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer25 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext23, outputStream24);
        uTF8Writer25.flush();
        java.io.Writer writer28 = uTF8Writer25.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator29 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext15, (-1703009269), objectCodec19, (java.io.Writer) uTF8Writer25);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature30 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean31 = writerBasedJsonGenerator29.isEnabled(feature30);
        java.math.BigInteger bigInteger32 = null;
        writerBasedJsonGenerator29.writeNumber(bigInteger32);
        defaultPrettyPrinter3.writeObjectEntrySeparator((com.fasterxml.jackson.core.JsonGenerator) writerBasedJsonGenerator29);
        writerBasedJsonGenerator29.writeString("");
        writerBasedJsonGenerator29.writeNumber("[Source: INTERN_FIELD_NAMES; line: 10, column: -1]");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler39 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler39);
        textBuffer40.append(' ');
        textBuffer40.resetWithString("hi!");
        textBuffer40.setCurrentLength(100);
        textBuffer40.releaseBuffers();
        boolean boolean48 = textBuffer40.hasTextAsCharacters();
        char[] charArray49 = textBuffer40.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator29.writeRaw(charArray49, 466749574, 1034864602);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 466749574");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter5);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter7);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter9);
        org.junit.Assert.assertNotNull(writer28);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature30.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[]");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test529");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = jsonParser3.getTokenLocation();
        int int6 = jsonParser3.getValueAsInt();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonLocation5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test530");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType16 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER;
        char[] charArray18 = bufferRecycler15.allocCharBuffer(charBufferType16, (int) (byte) 0);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        textBuffer19.releaseBuffers();
        textBuffer19.releaseBuffers();
        int int22 = textBuffer19.size();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertTrue("'" + charBufferType16 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER + "'", charBufferType16.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test531");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        byte[] byteArray11 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper14 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext10, byteArray11, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createJsonParser(byteArray11, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter19 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString20 = defaultPrettyPrinter19._rootSeparator;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int29 = serializableString20.appendQuotedUTF8(byteArray27, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory1.createJsonParser(byteArray27);
        boolean boolean31 = jsonParser30.canReadObjectId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        jsonParser30.setCodec(objectCodec32);
        com.fasterxml.jackson.core.Base64Variant base64Variant34 = null;
        java.io.OutputStream outputStream35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = jsonParser30.readBinaryValue(base64Variant34, outputStream35);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@5e2a63e6; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(serializableString20);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test532");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory(objectCodec4);
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn(3);
        boolean boolean9 = jsonFactory5.isEnabled(feature6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory(objectCodec10);
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean14 = feature12.enabledIn(3);
        boolean boolean15 = jsonFactory11.isEnabled(feature12);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory11.disable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.disable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory5.createGenerator(outputStream19);
        defaultPrettyPrinter3.writeStartArray(jsonGenerator20);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter22 = defaultPrettyPrinter3._arrayIndenter;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext26 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler23, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream27 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer28 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext26, outputStream27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext34 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler31, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream35 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer36 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext34, outputStream35);
        uTF8Writer36.flush();
        java.io.Writer writer39 = uTF8Writer36.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator40 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext26, (-1703009269), objectCodec30, (java.io.Writer) uTF8Writer36);
        com.fasterxml.jackson.core.Version version41 = writerBasedJsonGenerator40.version();
        writerBasedJsonGenerator40.writeNumber((float) 10L);
        defaultPrettyPrinter3.writeObjectFieldValueSeparator((com.fasterxml.jackson.core.JsonGenerator) writerBasedJsonGenerator40);
        com.fasterxml.jackson.core.TreeNode treeNode45 = null;
        writerBasedJsonGenerator40.writeTree(treeNode45);
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = new com.fasterxml.jackson.core.JsonFactory(objectCodec47);
        com.fasterxml.jackson.core.JsonFactory.Feature feature49 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean51 = feature49.enabledIn(3);
        boolean boolean52 = jsonFactory48.isEnabled(feature49);
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = new com.fasterxml.jackson.core.JsonFactory(objectCodec53);
        com.fasterxml.jackson.core.JsonFactory.Feature feature55 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean57 = feature55.enabledIn(3);
        boolean boolean58 = jsonFactory54.isEnabled(feature55);
        com.fasterxml.jackson.core.JsonParser.Feature feature59 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = jsonFactory54.disable(feature59);
        com.fasterxml.jackson.core.JsonFactory jsonFactory61 = jsonFactory48.disable(feature59);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler62 = jsonFactory61._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer63 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler62);
        char[] charArray64 = textBuffer63.emptyAndGetCurrentSegment();
        writerBasedJsonGenerator40.writeString(charArray64, 785211908, (-1582459300));
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNotNull(indenter22);
        org.junit.Assert.assertNotNull(writer39);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature49.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature59.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory60);
        org.junit.Assert.assertNotNull(jsonFactory61);
        org.junit.Assert.assertNotNull(bufferRecycler62);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test533");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        int int16 = readerBasedJsonParser14.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = readerBasedJsonParser14.getCodec();
        int int19 = readerBasedJsonParser14.getValueAsInt(19);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-729885388) + "'", int13 == (-729885388));
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(objectCodec17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19 + "'", int19 == 19);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test534");
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer0 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int2 = charsToNameCanonicalizer0.calcHash("false");
        int int3 = charsToNameCanonicalizer0.size();
        int int5 = charsToNameCanonicalizer0._hashToIndex(1716428639);
        boolean boolean6 = charsToNameCanonicalizer0.maybeDirty();
        boolean boolean7 = charsToNameCanonicalizer0.maybeDirty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.append(' ');
        textBuffer9.resetWithString("hi!");
        char[] charArray14 = textBuffer9.finishCurrentSegment();
        int int17 = charsToNameCanonicalizer0.calcHash(charArray14, (int) (byte) 100, (-1738857180));
        int int18 = charsToNameCanonicalizer0.size();
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer0);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1080268624 + "'", int2 == 1080268624);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray14);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1702813339) + "'", int17 == (-1702813339));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test535");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        readerBasedJsonParser14.close();
        java.lang.String str17 = readerBasedJsonParser14.nextTextValue();
        com.fasterxml.jackson.core.JsonToken jsonToken18 = readerBasedJsonParser14.nextValue();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-973486994) + "'", int13 == (-973486994));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(jsonToken18);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test536");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createJsonParser(inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = jsonParser3.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test537");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream12 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer13 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext11, outputStream12);
        uTF8Writer13.flush();
        java.io.Writer writer16 = uTF8Writer13.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1703009269), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        writerBasedJsonGenerator17.writeRaw("com.fasterxml.jackson.core.JsonParseException: \n\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext21 = writerBasedJsonGenerator17.getOutputContext();
        writerBasedJsonGenerator17.writeStartObject();
        com.fasterxml.jackson.core.io.SerializedString serializedString24 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str25 = serializedString24.toString();
        int int26 = serializedString24.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext30 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream31 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer32 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext30, outputStream31);
        byte[] byteArray33 = iOContext30.allocReadIOBuffer();
        int int35 = serializedString24.appendQuotedUTF8(byteArray33, 3);
        writerBasedJsonGenerator17.writeFieldName((com.fasterxml.jackson.core.SerializableString) serializedString24);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter37 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter((com.fasterxml.jackson.core.SerializableString) serializedString24);
        char[] charArray38 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.SPACES;
        // The following exception was thrown during execution in test generation
        try {
            int int40 = serializedString24.appendUnquoted(charArray38, (-2105508258));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(jsonWriteContext21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "                                                                ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "                                                                ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test538");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        java.lang.Object obj6 = jsonParser3.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString9 = defaultPrettyPrinter8._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer11.resetWithShared(charArray12, 2000, 2000);
        int int17 = serializableString9.appendUnquoted(charArray12, 0);
        boolean boolean18 = jsonParser3.nextFieldName(serializableString9);
        com.fasterxml.jackson.core.Version version19 = jsonParser3.version();
        double double21 = jsonParser3.getValueAsDouble((double) (byte) -1);
        char[] charArray22 = jsonParser3.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory(objectCodec23);
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(3);
        boolean boolean28 = jsonFactory24.isEnabled(feature25);
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = new com.fasterxml.jackson.core.JsonFactory(objectCodec29);
        com.fasterxml.jackson.core.JsonFactory.Feature feature31 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean33 = feature31.enabledIn(3);
        boolean boolean34 = jsonFactory30.isEnabled(feature31);
        com.fasterxml.jackson.core.JsonParser.Feature feature35 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory30.disable(feature35);
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory24.disable(feature35);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonParser3.enable(feature35);
        double double39 = jsonParser38.getValueAsDouble();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext40 = jsonParser38.getParsingContext();
        boolean boolean41 = jsonStreamContext40.inObject();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(serializableString9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature31.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature35.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(jsonStreamContext40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test539");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = jsonFactory14.getCharacterEscapes();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator16 = jsonFactory14.getOutputDecorator();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes17 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory14.setCharacterEscapes(characterEscapes17);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory(objectCodec19);
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean23 = feature21.enabledIn(3);
        boolean boolean24 = jsonFactory20.isEnabled(feature21);
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory(objectCodec25);
        com.fasterxml.jackson.core.JsonFactory.Feature feature27 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean29 = feature27.enabledIn(3);
        boolean boolean30 = jsonFactory26.isEnabled(feature27);
        com.fasterxml.jackson.core.JsonParser.Feature feature31 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory26.disable(feature31);
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory20.disable(feature31);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = jsonFactory33._getBufferRecycler();
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory(objectCodec35);
        com.fasterxml.jackson.core.JsonFactory.Feature feature37 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean39 = feature37.enabledIn(3);
        boolean boolean40 = jsonFactory36.isEnabled(feature37);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory(objectCodec41);
        com.fasterxml.jackson.core.JsonFactory.Feature feature43 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean45 = feature43.enabledIn(3);
        boolean boolean46 = jsonFactory42.isEnabled(feature43);
        com.fasterxml.jackson.core.JsonParser.Feature feature47 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = jsonFactory42.disable(feature47);
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = jsonFactory36.disable(feature47);
        java.lang.String str50 = jsonFactory36.getFormatName();
        java.io.InputStream inputStream51 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser52 = jsonFactory36.createParser(inputStream51);
        long long53 = jsonParser52.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = new com.fasterxml.jackson.core.JsonFactory(objectCodec54);
        java.io.Reader reader56 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser57 = jsonFactory55.createParser(reader56);
        boolean boolean58 = jsonParser57.requiresCustomCodec();
        java.lang.String str59 = jsonParser57.getText();
        java.lang.Object obj60 = jsonParser57.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter62 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString63 = defaultPrettyPrinter62._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler64 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer65 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler64);
        char[] charArray66 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer65.resetWithShared(charArray66, 2000, 2000);
        int int71 = serializableString63.appendUnquoted(charArray66, 0);
        boolean boolean72 = jsonParser57.nextFieldName(serializableString63);
        com.fasterxml.jackson.core.Version version73 = jsonParser57.version();
        double double75 = jsonParser57.getValueAsDouble((double) (byte) -1);
        char[] charArray76 = jsonParser57.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory78 = new com.fasterxml.jackson.core.JsonFactory(objectCodec77);
        com.fasterxml.jackson.core.JsonFactory.Feature feature79 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean81 = feature79.enabledIn(3);
        boolean boolean82 = jsonFactory78.isEnabled(feature79);
        com.fasterxml.jackson.core.ObjectCodec objectCodec83 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory84 = new com.fasterxml.jackson.core.JsonFactory(objectCodec83);
        com.fasterxml.jackson.core.JsonFactory.Feature feature85 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean87 = feature85.enabledIn(3);
        boolean boolean88 = jsonFactory84.isEnabled(feature85);
        com.fasterxml.jackson.core.JsonParser.Feature feature89 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory90 = jsonFactory84.disable(feature89);
        com.fasterxml.jackson.core.JsonFactory jsonFactory91 = jsonFactory78.disable(feature89);
        com.fasterxml.jackson.core.JsonParser jsonParser92 = jsonParser57.enable(feature89);
        com.fasterxml.jackson.core.JsonParser jsonParser94 = jsonParser52.configure(feature89, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory95 = jsonFactory33.enable(feature89);
        com.fasterxml.jackson.core.JsonFactory jsonFactory96 = jsonFactory14.enable(feature89);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNull(characterEscapes15);
        org.junit.Assert.assertNull(outputDecorator16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature27.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature31.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertNotNull(bufferRecycler34);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature43.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertNotNull(jsonFactory49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "JSON" + "'", str50, "JSON");
        org.junit.Assert.assertNotNull(jsonParser52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(jsonParser57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(serializableString63);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(version73);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertNull(charArray76);
        org.junit.Assert.assertTrue("'" + feature79 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature79.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + feature85 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature85.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + feature89 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature89.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory90);
        org.junit.Assert.assertNotNull(jsonFactory91);
        org.junit.Assert.assertNotNull(jsonParser92);
        org.junit.Assert.assertNotNull(jsonParser94);
        org.junit.Assert.assertNotNull(jsonFactory95);
        org.junit.Assert.assertNotNull(jsonFactory96);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test540");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        byte[] byteArray6 = iOContext3.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(3);
        boolean boolean17 = jsonFactory13.isEnabled(feature14);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory13.disable(feature18);
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory13.createGenerator(outputStream20);
        com.fasterxml.jackson.core.io.IOContext iOContext22 = null;
        byte[] byteArray23 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext22, byteArray23, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory13.createJsonParser(byteArray23, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory(objectCodec30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean34 = feature32.enabledIn(3);
        boolean boolean35 = jsonFactory31.isEnabled(feature32);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory31.disable(feature36);
        java.io.OutputStream outputStream38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonFactory31.createGenerator(outputStream38);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        byte[] byteArray41 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper44 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext40, byteArray41, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory31.createJsonParser(byteArray41, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter49 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString50 = defaultPrettyPrinter49._rootSeparator;
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int59 = serializableString50.appendQuotedUTF8(byteArray57, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory31.createJsonParser(byteArray57);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory13.createJsonParser(byteArray57, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream66 = new com.fasterxml.jackson.core.io.MergedStream(iOContext10, inputStream11, byteArray57, 10, 2000);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int78 = serializableString69.appendQuotedUTF8(byteArray76, (int) (byte) 100);
        com.fasterxml.jackson.core.io.MergedStream mergedStream81 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream11, byteArray76, (-1038366032), (int) (short) -1);
        boolean boolean82 = mergedStream81.markSupported();
        int int83 = mergedStream81.available();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(serializableString50);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1038366031 + "'", int83 == 1038366031);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test541");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory(objectCodec15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean19 = feature17.enabledIn(3);
        boolean boolean20 = jsonFactory16.isEnabled(feature17);
        com.fasterxml.jackson.core.JsonParser.Feature feature21 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory16.disable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory14.configure(feature21, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator25 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory14.setInputDecorator(inputDecorator25);
        java.io.Reader reader27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory26.createParser(reader27);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = jsonFactory26._getBufferRecycler();
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory26.createParser("/");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext35 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler32, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream36 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer37 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext35, outputStream36);
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext43 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler40, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream44 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer45 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext43, outputStream44);
        uTF8Writer45.flush();
        java.io.Writer writer48 = uTF8Writer45.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator49 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext35, (-1703009269), objectCodec39, (java.io.Writer) uTF8Writer45);
        uTF8Writer45.flush();
        java.io.Writer writer52 = uTF8Writer45.append('a');
        uTF8Writer45.close();
        java.io.Writer writer55 = uTF8Writer45.append((java.lang.CharSequence) "2.2250738585072012e-308");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator56 = jsonFactory26.createGenerator(writer55);
        jsonGenerator56.writeNumber((float) 785211908);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(bufferRecycler29);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(writer48);
        org.junit.Assert.assertNotNull(writer52);
        org.junit.Assert.assertNotNull(writer55);
        org.junit.Assert.assertNotNull(jsonGenerator56);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test542");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble("ROOT");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ROOT\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test543");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory(objectCodec4);
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn(3);
        boolean boolean9 = jsonFactory5.isEnabled(feature6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory(objectCodec10);
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean14 = feature12.enabledIn(3);
        boolean boolean15 = jsonFactory11.isEnabled(feature12);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory11.disable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.disable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory5.createGenerator(outputStream19);
        defaultPrettyPrinter3.writeStartArray(jsonGenerator20);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter22 = defaultPrettyPrinter3._arrayIndenter;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext26 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler23, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream27 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer28 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext26, outputStream27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext34 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler31, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream35 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer36 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext34, outputStream35);
        uTF8Writer36.flush();
        java.io.Writer writer39 = uTF8Writer36.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator40 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext26, (-1703009269), objectCodec30, (java.io.Writer) uTF8Writer36);
        com.fasterxml.jackson.core.Version version41 = writerBasedJsonGenerator40.version();
        writerBasedJsonGenerator40.writeNumber((float) 10L);
        defaultPrettyPrinter3.writeObjectFieldValueSeparator((com.fasterxml.jackson.core.JsonGenerator) writerBasedJsonGenerator40);
        com.fasterxml.jackson.core.TreeNode treeNode45 = null;
        writerBasedJsonGenerator40.writeTree(treeNode45);
        boolean boolean47 = writerBasedJsonGenerator40.isClosed();
        java.math.BigDecimal bigDecimal49 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal("2.2250738585072012e-308");
        writerBasedJsonGenerator40.writeNumber(bigDecimal49);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer52 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler51);
        char[] charArray53 = textBuffer52.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator40.writeRaw(charArray53, 27574558, (-247165502));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNotNull(indenter22);
        org.junit.Assert.assertNotNull(writer39);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[]");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test544");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.Object obj15 = readerBasedJsonParser14.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = readerBasedJsonParser14.getLastClearedToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        readerBasedJsonParser14.setCodec(objectCodec17);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1596243224) + "'", int13 == (-1596243224));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(jsonToken16);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test545");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        java.lang.Object obj17 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler15, obj17, false);
        byte[] byteArray20 = null;
        iOContext19.releaseBase64Buffer(byteArray20);
        byte[] byteArray22 = iOContext19.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext26 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler23, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream27 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory(objectCodec28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean32 = feature30.enabledIn(3);
        boolean boolean33 = jsonFactory29.isEnabled(feature30);
        com.fasterxml.jackson.core.JsonParser.Feature feature34 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory29.disable(feature34);
        java.io.OutputStream outputStream36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonFactory29.createGenerator(outputStream36);
        com.fasterxml.jackson.core.io.IOContext iOContext38 = null;
        byte[] byteArray39 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper42 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext38, byteArray39, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser45 = jsonFactory29.createJsonParser(byteArray39, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = new com.fasterxml.jackson.core.JsonFactory(objectCodec46);
        com.fasterxml.jackson.core.JsonFactory.Feature feature48 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean50 = feature48.enabledIn(3);
        boolean boolean51 = jsonFactory47.isEnabled(feature48);
        com.fasterxml.jackson.core.JsonParser.Feature feature52 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = jsonFactory47.disable(feature52);
        java.io.OutputStream outputStream54 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator55 = jsonFactory47.createGenerator(outputStream54);
        com.fasterxml.jackson.core.io.IOContext iOContext56 = null;
        byte[] byteArray57 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper60 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext56, byteArray57, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory47.createJsonParser(byteArray57, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter65 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString66 = defaultPrettyPrinter65._rootSeparator;
        byte[] byteArray73 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int75 = serializableString66.appendQuotedUTF8(byteArray73, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser76 = jsonFactory47.createJsonParser(byteArray73);
        com.fasterxml.jackson.core.JsonParser jsonParser79 = jsonFactory29.createJsonParser(byteArray73, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream82 = new com.fasterxml.jackson.core.io.MergedStream(iOContext26, inputStream27, byteArray73, 10, 2000);
        char[] charArray83 = iOContext26.allocConcatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            iOContext19.releaseTokenBuffer(charArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser45);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature48.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + feature52 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature52.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory53);
        org.junit.Assert.assertNotNull(jsonGenerator55);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertNotNull(serializableString66);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(jsonParser76);
        org.junit.Assert.assertNotNull(jsonParser79);
        org.junit.Assert.assertNotNull(charArray83);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test546");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        java.lang.Object obj17 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler15, obj17, false);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = iOContext19.constructTextBuffer();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = iOContext19.constructTextBuffer();
        com.fasterxml.jackson.core.JsonToken jsonToken22 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
        char[] charArray23 = jsonToken22.asCharArray();
        // The following exception was thrown during execution in test generation
        try {
            iOContext19.releaseTokenBuffer(charArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertNotNull(textBuffer20);
        org.junit.Assert.assertNotNull(textBuffer21);
        org.junit.Assert.assertTrue("'" + jsonToken22 + "' != '" + com.fasterxml.jackson.core.JsonToken.END_ARRAY + "'", jsonToken22.equals(com.fasterxml.jackson.core.JsonToken.END_ARRAY));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]]");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test547");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream12 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer13 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext11, outputStream12);
        uTF8Writer13.flush();
        java.io.Writer writer16 = uTF8Writer13.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1703009269), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        writerBasedJsonGenerator17.writeRaw("com.fasterxml.jackson.core.JsonParseException: \n\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext21 = writerBasedJsonGenerator17.getOutputContext();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = writerBasedJsonGenerator17.useDefaultPrettyPrinter();
        boolean boolean23 = writerBasedJsonGenerator17.canWriteObjectId();
        int int24 = writerBasedJsonGenerator17.getHighestEscapedChar();
        int int25 = writerBasedJsonGenerator17.getHighestEscapedChar();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream30 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer31 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext29, outputStream30);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding32 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext29.setEncoding(jsonEncoding32);
        java.io.Reader reader35 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer37 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int39 = charsToNameCanonicalizer37.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser40 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext29, (-1697824632), reader35, objectCodec36, charsToNameCanonicalizer37);
        int int41 = readerBasedJsonParser40.getTextOffset();
        java.lang.String str42 = readerBasedJsonParser40.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation43 = readerBasedJsonParser40.getTokenLocation();
        int int44 = readerBasedJsonParser40.getTextOffset();
        com.fasterxml.jackson.core.JsonToken jsonToken45 = readerBasedJsonParser40.nextToken();
        readerBasedJsonParser40.overrideCurrentName("UTF-16BE");
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator17.copyCurrentEvent((com.fasterxml.jackson.core.JsonParser) readerBasedJsonParser40);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No current event to copy");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(jsonWriteContext21);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + jsonEncoding32 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding32.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer37);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2044879386) + "'", int39 == (-2044879386));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(jsonLocation43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(jsonToken45);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test548");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        boolean boolean17 = readerBasedJsonParser14.canUseSchema(formatSchema16);
        java.lang.String str19 = readerBasedJsonParser14.getValueAsString("2.2250738585072012e-308");
        int int21 = readerBasedJsonParser14.nextIntValue(234434554);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-714276024) + "'", int13 == (-714276024));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2.2250738585072012e-308" + "'", str19, "2.2250738585072012e-308");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 234434554 + "'", int21 == 234434554);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test549");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream12 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer13 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext11, outputStream12);
        uTF8Writer13.flush();
        java.io.Writer writer16 = uTF8Writer13.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1703009269), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        writerBasedJsonGenerator17.writeNull();
        int int20 = writerBasedJsonGenerator17.getHighestEscapedChar();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext24 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler21, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer26 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext24, outputStream25);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext32 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler29, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream33 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer34 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext32, outputStream33);
        uTF8Writer34.flush();
        java.io.Writer writer37 = uTF8Writer34.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator38 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext24, (-1703009269), objectCodec28, (java.io.Writer) uTF8Writer34);
        com.fasterxml.jackson.core.Version version39 = writerBasedJsonGenerator38.version();
        writerBasedJsonGenerator38.writeRaw("com.fasterxml.jackson.core.JsonParseException: \n\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        writerBasedJsonGenerator38.writeNull();
        writerBasedJsonGenerator38.writeNumber((float) (-1702993409));
        java.math.BigDecimal bigDecimal46 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal("2.2250738585072012e-308");
        writerBasedJsonGenerator38.writeNumber(bigDecimal46);
        writerBasedJsonGenerator17.writeNumber(bigDecimal46);
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(writer37);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertNotNull(bigDecimal46);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test550");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.finishCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test551");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = defaultPrettyPrinter1._rootSeparator;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter3 = defaultPrettyPrinter1._objectIndenter;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext7 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler4, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer9 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext7, outputStream8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext15 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler12, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream16 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer17 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext15, outputStream16);
        uTF8Writer17.flush();
        java.io.Writer writer20 = uTF8Writer17.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator21 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext7, (-1703009269), objectCodec11, (java.io.Writer) uTF8Writer17);
        defaultPrettyPrinter1.writeEndObject((com.fasterxml.jackson.core.JsonGenerator) writerBasedJsonGenerator21, 0);
        com.fasterxml.jackson.core.Version version24 = writerBasedJsonGenerator21.version();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext28 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler25, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream29 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer30 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext28, outputStream29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext36 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler33, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream37 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer38 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext36, outputStream37);
        uTF8Writer38.flush();
        java.io.Writer writer41 = uTF8Writer38.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator42 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext28, (-1703009269), objectCodec32, (java.io.Writer) uTF8Writer38);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature43 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean44 = writerBasedJsonGenerator42.isEnabled(feature43);
        java.math.BigInteger bigInteger45 = null;
        writerBasedJsonGenerator42.writeNumber(bigInteger45);
        com.fasterxml.jackson.core.io.SerializedString serializedString48 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str49 = serializedString48.toString();
        int int50 = serializedString48.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext54 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler51, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream55 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer56 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext54, outputStream55);
        byte[] byteArray57 = iOContext54.allocReadIOBuffer();
        int int59 = serializedString48.appendQuotedUTF8(byteArray57, 3);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator60 = writerBasedJsonGenerator42.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString48);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler61 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer62 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler61);
        textBuffer62.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler65 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer66 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler65);
        textBuffer66.append(' ');
        textBuffer66.resetWithString("hi!");
        char[] charArray71 = textBuffer66.finishCurrentSegment();
        textBuffer62.append(charArray71, (int) (short) 1, 100);
        writerBasedJsonGenerator42.writeRawValue(charArray71, (int) '#', (int) (byte) 100);
        int int80 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray71, 0, 598508020);
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator21.writeRawValue(charArray71, (-836894420), (-1697689867));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableString2);
        org.junit.Assert.assertNotNull(indenter3);
        org.junit.Assert.assertNotNull(writer20);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertNotNull(writer41);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature43.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\n" + "'", str49, "\n");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(jsonGenerator60);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1038366032) + "'", int80 == (-1038366032));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test552");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextLength();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder16 = readerBasedJsonParser14._getByteArrayBuilder();
        readerBasedJsonParser14.close();
        boolean boolean18 = readerBasedJsonParser14.hasCurrentToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1282197362 + "'", int13 == 1282197362);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArrayBuilder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test553");
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer0 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        charsToNameCanonicalizer0.release();
        int int2 = charsToNameCanonicalizer0.bucketCount();
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory(objectCodec3);
        com.fasterxml.jackson.core.JsonFactory.Feature feature5 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean7 = feature5.enabledIn(3);
        boolean boolean8 = jsonFactory4.isEnabled(feature5);
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = new com.fasterxml.jackson.core.JsonFactory(objectCodec9);
        com.fasterxml.jackson.core.JsonFactory.Feature feature11 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean13 = feature11.enabledIn(3);
        boolean boolean14 = jsonFactory10.isEnabled(feature11);
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory10.disable(feature15);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory4.disable(feature15);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = jsonFactory17._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        java.lang.String str20 = textBuffer19.contentsAsString();
        textBuffer19.setCurrentLength((int) (short) 1);
        char[] charArray23 = textBuffer19.contentsAsArray();
        java.lang.String str27 = charsToNameCanonicalizer0.findSymbol(charArray23, (-1614734440), (-791731220), 201855174);
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature5.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + feature11 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature11.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature15.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(bufferRecycler18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test554");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        boolean boolean15 = readerBasedJsonParser14.isClosed();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = readerBasedJsonParser14.getCurrentLocation();
        readerBasedJsonParser14.overrideCurrentName("2.2250738585072012e-308");
        char[] charArray19 = readerBasedJsonParser14.getTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation20 = readerBasedJsonParser14.getCurrentLocation();
        boolean boolean22 = jsonLocation20.equals((java.lang.Object) (-952435022));
        java.lang.Object obj23 = null;
        boolean boolean24 = jsonLocation20.equals(obj23);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-869680910) + "'", int13 == (-869680910));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonLocation16);
        org.junit.Assert.assertNull(charArray19);
        org.junit.Assert.assertNotNull(jsonLocation20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test555");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        textBuffer16.setCurrentLength(694805234);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test556");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        boolean boolean16 = readerBasedJsonParser14.hasTextCharacters();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = readerBasedJsonParser14.getCurrentToken();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext21 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler18, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer23 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext21, outputStream22);
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream30 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer31 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext29, outputStream30);
        uTF8Writer31.flush();
        java.io.Writer writer34 = uTF8Writer31.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator35 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext21, (-1703009269), objectCodec25, (java.io.Writer) uTF8Writer31);
        uTF8Writer31.flush();
        java.lang.CharSequence charSequence37 = null;
        java.io.Writer writer38 = uTF8Writer31.append(charSequence37);
        int int39 = readerBasedJsonParser14.releaseBuffered(writer38);
        // The following exception was thrown during execution in test generation
        try {
            float float40 = readerBasedJsonParser14.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-379067640) + "'", int13 == (-379067640));
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertNotNull(writer34);
        org.junit.Assert.assertNotNull(writer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test557");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        byte[] byteArray6 = iOContext3.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(3);
        boolean boolean17 = jsonFactory13.isEnabled(feature14);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory13.disable(feature18);
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory13.createGenerator(outputStream20);
        com.fasterxml.jackson.core.io.IOContext iOContext22 = null;
        byte[] byteArray23 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext22, byteArray23, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory13.createJsonParser(byteArray23, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory(objectCodec30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean34 = feature32.enabledIn(3);
        boolean boolean35 = jsonFactory31.isEnabled(feature32);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory31.disable(feature36);
        java.io.OutputStream outputStream38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonFactory31.createGenerator(outputStream38);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        byte[] byteArray41 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper44 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext40, byteArray41, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory31.createJsonParser(byteArray41, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter49 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString50 = defaultPrettyPrinter49._rootSeparator;
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int59 = serializableString50.appendQuotedUTF8(byteArray57, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory31.createJsonParser(byteArray57);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory13.createJsonParser(byteArray57, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream66 = new com.fasterxml.jackson.core.io.MergedStream(iOContext10, inputStream11, byteArray57, 10, 2000);
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory68 = new com.fasterxml.jackson.core.JsonFactory(objectCodec67);
        com.fasterxml.jackson.core.JsonFactory.Feature feature69 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean71 = feature69.enabledIn(3);
        boolean boolean72 = jsonFactory68.isEnabled(feature69);
        com.fasterxml.jackson.core.JsonParser.Feature feature73 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory74 = jsonFactory68.disable(feature73);
        java.io.OutputStream outputStream75 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator76 = jsonFactory68.createGenerator(outputStream75);
        com.fasterxml.jackson.core.io.IOContext iOContext77 = null;
        byte[] byteArray78 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper81 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext77, byteArray78, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser84 = jsonFactory68.createJsonParser(byteArray78, 1, (int) (short) 100);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader88 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, (java.io.InputStream) mergedStream66, byteArray78, (int) (short) -1, 1000, true);
        mergedStream66.mark(262144);
        // The following exception was thrown during execution in test generation
        try {
            mergedStream66.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(serializableString50);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertTrue("'" + feature69 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature69.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + feature73 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature73.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory74);
        org.junit.Assert.assertNotNull(jsonGenerator76);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser84);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test558");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        boolean boolean15 = readerBasedJsonParser14.isClosed();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = readerBasedJsonParser14.getCurrentLocation();
        readerBasedJsonParser14.overrideCurrentName("2.2250738585072012e-308");
        com.fasterxml.jackson.core.JsonLocation jsonLocation19 = readerBasedJsonParser14.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParser jsonParser20 = readerBasedJsonParser14.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = readerBasedJsonParser14.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-525683278) + "'", int13 == (-525683278));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonLocation16);
        org.junit.Assert.assertNotNull(jsonLocation19);
        org.junit.Assert.assertNotNull(jsonParser20);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test559");
        double double2 = com.fasterxml.jackson.core.io.NumberInput.parseAsDouble("\n", (double) (-790370568));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.90370568E8d) + "'", double2 == (-7.90370568E8d));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test560");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = jsonFactory14.getCharacterEscapes();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator16 = jsonFactory14.getOutputDecorator();
        java.io.Writer writer17 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = jsonFactory14.createGenerator(writer17);
        com.fasterxml.jackson.core.JsonParser.Feature feature19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory14.configure(feature19, false);
        java.io.InputStream inputStream22 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory21.createJsonParser(inputStream22);
        java.lang.Object obj24 = jsonParser23.getObjectId();
        boolean boolean25 = jsonParser23.requiresCustomCodec();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNull(characterEscapes15);
        org.junit.Assert.assertNull(outputDecorator16);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature19.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test561");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = readerBasedJsonParser14.skipChildren();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = jsonParser16.getCodec();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-515757344) + "'", int13 == (-515757344));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNull(objectCodec17);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test562");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory(objectCodec15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean19 = feature17.enabledIn(3);
        boolean boolean20 = jsonFactory16.isEnabled(feature17);
        com.fasterxml.jackson.core.JsonParser.Feature feature21 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory16.disable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory14.configure(feature21, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator25 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory14.setInputDecorator(inputDecorator25);
        java.io.Reader reader27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory26.createParser(reader27);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = jsonFactory26._getBufferRecycler();
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory26.createParser("/");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter33 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString34 = defaultPrettyPrinter33._rootSeparator;
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int43 = serializableString34.appendQuotedUTF8(byteArray41, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory26.createJsonParser(byteArray41);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(bufferRecycler29);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(serializableString34);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(jsonParser44);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test563");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        byte[] byteArray6 = iOContext3.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(3);
        boolean boolean17 = jsonFactory13.isEnabled(feature14);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory13.disable(feature18);
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory13.createGenerator(outputStream20);
        com.fasterxml.jackson.core.io.IOContext iOContext22 = null;
        byte[] byteArray23 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext22, byteArray23, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory13.createJsonParser(byteArray23, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory(objectCodec30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean34 = feature32.enabledIn(3);
        boolean boolean35 = jsonFactory31.isEnabled(feature32);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory31.disable(feature36);
        java.io.OutputStream outputStream38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonFactory31.createGenerator(outputStream38);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        byte[] byteArray41 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper44 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext40, byteArray41, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory31.createJsonParser(byteArray41, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter49 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString50 = defaultPrettyPrinter49._rootSeparator;
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int59 = serializableString50.appendQuotedUTF8(byteArray57, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory31.createJsonParser(byteArray57);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory13.createJsonParser(byteArray57, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream66 = new com.fasterxml.jackson.core.io.MergedStream(iOContext10, inputStream11, byteArray57, 10, 2000);
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory68 = new com.fasterxml.jackson.core.JsonFactory(objectCodec67);
        com.fasterxml.jackson.core.JsonFactory.Feature feature69 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean71 = feature69.enabledIn(3);
        boolean boolean72 = jsonFactory68.isEnabled(feature69);
        com.fasterxml.jackson.core.JsonParser.Feature feature73 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory74 = jsonFactory68.disable(feature73);
        java.io.OutputStream outputStream75 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator76 = jsonFactory68.createGenerator(outputStream75);
        com.fasterxml.jackson.core.io.IOContext iOContext77 = null;
        byte[] byteArray78 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper81 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext77, byteArray78, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser84 = jsonFactory68.createJsonParser(byteArray78, 1, (int) (short) 100);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader88 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, (java.io.InputStream) mergedStream66, byteArray78, (int) (short) -1, 1000, true);
        boolean boolean89 = uTF32Reader88.markSupported();
        boolean boolean90 = uTF32Reader88.ready();
        boolean boolean91 = uTF32Reader88.ready();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(serializableString50);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertTrue("'" + feature69 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature69.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + feature73 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature73.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory74);
        org.junit.Assert.assertNotNull(jsonGenerator76);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test564");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory(objectCodec16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean20 = feature18.enabledIn(3);
        boolean boolean21 = jsonFactory17.isEnabled(feature18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = new com.fasterxml.jackson.core.JsonFactory(objectCodec22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean26 = feature24.enabledIn(3);
        boolean boolean27 = jsonFactory23.isEnabled(feature24);
        com.fasterxml.jackson.core.JsonParser.Feature feature28 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory23.disable(feature28);
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory17.disable(feature28);
        java.lang.String str31 = jsonFactory17.getFormatName();
        java.io.InputStream inputStream32 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory17.createParser(inputStream32);
        long long34 = jsonParser33.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory(objectCodec35);
        java.io.Reader reader37 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory36.createParser(reader37);
        boolean boolean39 = jsonParser38.requiresCustomCodec();
        java.lang.String str40 = jsonParser38.getText();
        java.lang.Object obj41 = jsonParser38.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter43 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString44 = defaultPrettyPrinter43._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler45 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer46 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler45);
        char[] charArray47 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer46.resetWithShared(charArray47, 2000, 2000);
        int int52 = serializableString44.appendUnquoted(charArray47, 0);
        boolean boolean53 = jsonParser38.nextFieldName(serializableString44);
        com.fasterxml.jackson.core.Version version54 = jsonParser38.version();
        double double56 = jsonParser38.getValueAsDouble((double) (byte) -1);
        char[] charArray57 = jsonParser38.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = new com.fasterxml.jackson.core.JsonFactory(objectCodec58);
        com.fasterxml.jackson.core.JsonFactory.Feature feature60 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean62 = feature60.enabledIn(3);
        boolean boolean63 = jsonFactory59.isEnabled(feature60);
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory65 = new com.fasterxml.jackson.core.JsonFactory(objectCodec64);
        com.fasterxml.jackson.core.JsonFactory.Feature feature66 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean68 = feature66.enabledIn(3);
        boolean boolean69 = jsonFactory65.isEnabled(feature66);
        com.fasterxml.jackson.core.JsonParser.Feature feature70 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = jsonFactory65.disable(feature70);
        com.fasterxml.jackson.core.JsonFactory jsonFactory72 = jsonFactory59.disable(feature70);
        com.fasterxml.jackson.core.JsonParser jsonParser73 = jsonParser38.enable(feature70);
        com.fasterxml.jackson.core.JsonParser jsonParser75 = jsonParser33.configure(feature70, true);
        com.fasterxml.jackson.core.JsonParser jsonParser76 = readerBasedJsonParser14.enable(feature70);
        int int77 = readerBasedJsonParser14.getTextLength();
        boolean boolean79 = readerBasedJsonParser14.getValueAsBoolean(false);
        com.fasterxml.jackson.core.JsonToken jsonToken80 = readerBasedJsonParser14.getLastClearedToken();
        com.fasterxml.jackson.core.JsonParser jsonParser81 = readerBasedJsonParser14.skipChildren();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-671162230) + "'", int13 == (-671162230));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature28.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "JSON" + "'", str31, "JSON");
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(serializableString44);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(version54);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertNull(charArray57);
        org.junit.Assert.assertTrue("'" + feature60 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature60.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + feature66 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature66.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + feature70 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature70.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory71);
        org.junit.Assert.assertNotNull(jsonFactory72);
        org.junit.Assert.assertNotNull(jsonParser73);
        org.junit.Assert.assertNotNull(jsonParser75);
        org.junit.Assert.assertNotNull(jsonParser76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(jsonToken80);
        org.junit.Assert.assertNotNull(jsonParser81);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test565");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.JsonFactory.Feature feature10 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean12 = feature10.enabledIn(3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory1.disable(feature10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = jsonFactory13._getBufferRecycler();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator15 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory13.setInputDecorator(inputDecorator15);
        com.fasterxml.jackson.core.io.SerializedString serializedString18 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str19 = serializedString18.toString();
        int int20 = serializedString18.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext24 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler21, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer26 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext24, outputStream25);
        byte[] byteArray27 = iOContext24.allocReadIOBuffer();
        int int29 = serializedString18.appendQuotedUTF8(byteArray27, 3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory(objectCodec30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean34 = feature32.enabledIn(3);
        boolean boolean35 = jsonFactory31.isEnabled(feature32);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = new com.fasterxml.jackson.core.JsonFactory(objectCodec36);
        com.fasterxml.jackson.core.JsonFactory.Feature feature38 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean40 = feature38.enabledIn(3);
        boolean boolean41 = jsonFactory37.isEnabled(feature38);
        com.fasterxml.jackson.core.JsonParser.Feature feature42 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = jsonFactory37.disable(feature42);
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory31.disable(feature42);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory(objectCodec45);
        com.fasterxml.jackson.core.JsonFactory.Feature feature47 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean49 = feature47.enabledIn(3);
        boolean boolean50 = jsonFactory46.isEnabled(feature47);
        com.fasterxml.jackson.core.JsonParser.Feature feature51 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = jsonFactory46.disable(feature51);
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = jsonFactory44.configure(feature51, true);
        java.lang.String str55 = jsonFactory44.getRootValueSeparator();
        com.fasterxml.jackson.core.io.SerializedString serializedString57 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray58 = serializedString57.asQuotedUTF8();
        java.lang.String str59 = serializedString57.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler60 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext63 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler60, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream64 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer65 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext63, outputStream64);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding66 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext63.setEncoding(jsonEncoding66);
        java.io.Reader reader69 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec70 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer71 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int73 = charsToNameCanonicalizer71.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser74 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext63, (-1697824632), reader69, objectCodec70, charsToNameCanonicalizer71);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder75 = readerBasedJsonParser74._getByteArrayBuilder();
        int int76 = serializedString57.writeUnquotedUTF8((java.io.OutputStream) byteArrayBuilder75);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding77 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator78 = jsonFactory44.createGenerator((java.io.OutputStream) byteArrayBuilder75, jsonEncoding77);
        int int79 = serializedString18.writeUnquotedUTF8((java.io.OutputStream) byteArrayBuilder75);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator80 = jsonFactory13.createJsonGenerator((java.io.OutputStream) byteArrayBuilder75);
        java.io.Writer writer81 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator82 = jsonFactory13.createJsonGenerator(writer81);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature10.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(bufferRecycler14);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature38.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature42.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory43);
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory52);
        org.junit.Assert.assertNotNull(jsonFactory54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + " " + "'", str55, " ");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\n" + "'", str59, "\n");
        org.junit.Assert.assertTrue("'" + jsonEncoding66 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding66.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer71);
// flaky:         org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-2010554840) + "'", int73 == (-2010554840));
        org.junit.Assert.assertNotNull(byteArrayBuilder75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + jsonEncoding77 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_LE + "'", jsonEncoding77.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_LE));
        org.junit.Assert.assertNotNull(jsonGenerator78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator80);
        org.junit.Assert.assertNotNull(jsonGenerator82);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test566");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = jsonFactory1._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(bufferRecycler8);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test567");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        boolean boolean16 = readerBasedJsonParser14.hasTextCharacters();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = readerBasedJsonParser14.getCurrentToken();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext21 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler18, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer23 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext21, outputStream22);
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream30 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer31 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext29, outputStream30);
        uTF8Writer31.flush();
        java.io.Writer writer34 = uTF8Writer31.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator35 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext21, (-1703009269), objectCodec25, (java.io.Writer) uTF8Writer31);
        uTF8Writer31.flush();
        java.lang.CharSequence charSequence37 = null;
        java.io.Writer writer38 = uTF8Writer31.append(charSequence37);
        int int39 = readerBasedJsonParser14.releaseBuffered(writer38);
        readerBasedJsonParser14.close();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1001823870) + "'", int13 == (-1001823870));
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertNotNull(writer34);
        org.junit.Assert.assertNotNull(writer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test568");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream12 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer13 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext11, outputStream12);
        uTF8Writer13.flush();
        java.io.Writer writer16 = uTF8Writer13.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1703009269), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        writerBasedJsonGenerator17.writeRaw("com.fasterxml.jackson.core.JsonParseException: \n\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext21 = writerBasedJsonGenerator17.getOutputContext();
        writerBasedJsonGenerator17.writeStartObject();
        com.fasterxml.jackson.core.io.SerializedString serializedString24 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str25 = serializedString24.toString();
        int int26 = serializedString24.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext30 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream31 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer32 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext30, outputStream31);
        byte[] byteArray33 = iOContext30.allocReadIOBuffer();
        int int35 = serializedString24.appendQuotedUTF8(byteArray33, 3);
        writerBasedJsonGenerator17.writeFieldName((com.fasterxml.jackson.core.SerializableString) serializedString24);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter38 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString39 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter40 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter38, serializableString39);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory(objectCodec41);
        com.fasterxml.jackson.core.JsonFactory.Feature feature43 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean45 = feature43.enabledIn(3);
        boolean boolean46 = jsonFactory42.isEnabled(feature43);
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = new com.fasterxml.jackson.core.JsonFactory(objectCodec47);
        com.fasterxml.jackson.core.JsonFactory.Feature feature49 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean51 = feature49.enabledIn(3);
        boolean boolean52 = jsonFactory48.isEnabled(feature49);
        com.fasterxml.jackson.core.JsonParser.Feature feature53 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = jsonFactory48.disable(feature53);
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = jsonFactory42.disable(feature53);
        java.io.OutputStream outputStream56 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator57 = jsonFactory42.createGenerator(outputStream56);
        defaultPrettyPrinter40.writeStartArray(jsonGenerator57);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter59 = jsonGenerator57.getPrettyPrinter();
        com.fasterxml.jackson.core.io.SerializedString serializedString61 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str62 = serializedString61.toString();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator63 = jsonGenerator57.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString61);
        byte[] byteArray64 = serializedString61.asUnquotedUTF8();
        // The following exception was thrown during execution in test generation
        try {
            int int66 = serializedString24.appendQuotedUTF8(byteArray64, (-1240287108));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(jsonWriteContext21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature43.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature49.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + feature53 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature53.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory54);
        org.junit.Assert.assertNotNull(jsonFactory55);
        org.junit.Assert.assertNotNull(jsonGenerator57);
        org.junit.Assert.assertNull(prettyPrinter59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\n" + "'", str62, "\n");
        org.junit.Assert.assertNotNull(jsonGenerator63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[10]");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test569");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        readerBasedJsonParser14.close();
        java.lang.String str17 = readerBasedJsonParser14.nextTextValue();
        com.fasterxml.jackson.core.JsonToken jsonToken18 = readerBasedJsonParser14.getLastClearedToken();
        int int19 = readerBasedJsonParser14.getTextLength();
        double double21 = readerBasedJsonParser14.getValueAsDouble((double) (-1994782984));
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext22 = readerBasedJsonParser14.getParsingContext();
        int int23 = readerBasedJsonParser14.getTextOffset();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 554802602 + "'", int13 == 554802602);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(jsonToken18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.994782984E9d) + "'", double21 == (-1.994782984E9d));
        org.junit.Assert.assertNotNull(jsonStreamContext22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test570");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal3 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test571");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        com.fasterxml.jackson.core.JsonLocation jsonLocation9 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) jsonParser3, (long) 10, 0L, (int) ' ', (int) (short) 100);
        java.lang.String str10 = jsonParser3.getText();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test572");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        byte[] byteArray11 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper14 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext10, byteArray11, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createJsonParser(byteArray11, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter19 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString20 = defaultPrettyPrinter19._rootSeparator;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int29 = serializableString20.appendQuotedUTF8(byteArray27, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory1.createJsonParser(byteArray27);
        boolean boolean31 = jsonParser30.canReadObjectId();
        com.fasterxml.jackson.core.JsonToken jsonToken32 = jsonParser30.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = jsonParser30.nextTextValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'y???a?': was expecting ? at [Source: [B@a9e5867; line: 1, column: 7]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(serializableString20);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jsonToken32);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test573");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory(objectCodec15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean19 = feature17.enabledIn(3);
        boolean boolean20 = jsonFactory16.isEnabled(feature17);
        com.fasterxml.jackson.core.JsonParser.Feature feature21 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory16.disable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory14.configure(feature21, true);
        java.lang.String str25 = jsonFactory14.getRootValueSeparator();
        com.fasterxml.jackson.core.io.SerializedString serializedString27 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray28 = serializedString27.asQuotedUTF8();
        java.lang.String str29 = serializedString27.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext33 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler30, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream34 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer35 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext33, outputStream34);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding36 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext33.setEncoding(jsonEncoding36);
        java.io.Reader reader39 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer41 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int43 = charsToNameCanonicalizer41.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser44 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext33, (-1697824632), reader39, objectCodec40, charsToNameCanonicalizer41);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder45 = readerBasedJsonParser44._getByteArrayBuilder();
        int int46 = serializedString27.writeUnquotedUTF8((java.io.OutputStream) byteArrayBuilder45);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding47 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator48 = jsonFactory14.createGenerator((java.io.OutputStream) byteArrayBuilder45, jsonEncoding47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory(objectCodec49);
        com.fasterxml.jackson.core.JsonFactory.Feature feature51 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean53 = feature51.enabledIn(3);
        boolean boolean54 = jsonFactory50.isEnabled(feature51);
        com.fasterxml.jackson.core.JsonParser.Feature feature55 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory50.disable(feature55);
        int int57 = feature55.getMask();
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = jsonFactory14.disable(feature55);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " " + "'", str25, " ");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n" + "'", str29, "\n");
        org.junit.Assert.assertTrue("'" + jsonEncoding36 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding36.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer41);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-146224414) + "'", int43 == (-146224414));
        org.junit.Assert.assertNotNull(byteArrayBuilder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + jsonEncoding47 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_LE + "'", jsonEncoding47.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_LE));
        org.junit.Assert.assertNotNull(jsonGenerator48);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 4 + "'", int57 == 4);
        org.junit.Assert.assertNotNull(jsonFactory58);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test574");
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str2 = serializedString1.toString();
        int int3 = serializedString1.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext7 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler4, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer9 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext7, outputStream8);
        byte[] byteArray10 = iOContext7.allocReadIOBuffer();
        int int12 = serializedString1.appendQuotedUTF8(byteArray10, 3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory(objectCodec13);
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean17 = feature15.enabledIn(3);
        boolean boolean18 = jsonFactory14.isEnabled(feature15);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory(objectCodec19);
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean23 = feature21.enabledIn(3);
        boolean boolean24 = jsonFactory20.isEnabled(feature21);
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory20.disable(feature25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory14.disable(feature25);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory(objectCodec28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean32 = feature30.enabledIn(3);
        boolean boolean33 = jsonFactory29.isEnabled(feature30);
        com.fasterxml.jackson.core.JsonParser.Feature feature34 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory29.disable(feature34);
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory27.configure(feature34, true);
        java.lang.String str38 = jsonFactory27.getRootValueSeparator();
        com.fasterxml.jackson.core.io.SerializedString serializedString40 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray41 = serializedString40.asQuotedUTF8();
        java.lang.String str42 = serializedString40.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler43 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext46 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler43, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream47 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer48 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext46, outputStream47);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding49 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext46.setEncoding(jsonEncoding49);
        java.io.Reader reader52 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer54 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int56 = charsToNameCanonicalizer54.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser57 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext46, (-1697824632), reader52, objectCodec53, charsToNameCanonicalizer54);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder58 = readerBasedJsonParser57._getByteArrayBuilder();
        int int59 = serializedString40.writeUnquotedUTF8((java.io.OutputStream) byteArrayBuilder58);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding60 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator61 = jsonFactory27.createGenerator((java.io.OutputStream) byteArrayBuilder58, jsonEncoding60);
        int int62 = serializedString1.writeUnquotedUTF8((java.io.OutputStream) byteArrayBuilder58);
        byte[] byteArray63 = serializedString1.asUnquotedUTF8();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " " + "'", str38, " ");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\n" + "'", str42, "\n");
        org.junit.Assert.assertTrue("'" + jsonEncoding49 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding49.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer54);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1635288482 + "'", int56 == 1635288482);
        org.junit.Assert.assertNotNull(byteArrayBuilder58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + jsonEncoding60 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_LE + "'", jsonEncoding60.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_LE));
        org.junit.Assert.assertNotNull(jsonGenerator61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[10]");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test575");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory(objectCodec4);
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn(3);
        boolean boolean9 = jsonFactory5.isEnabled(feature6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory(objectCodec10);
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean14 = feature12.enabledIn(3);
        boolean boolean15 = jsonFactory11.isEnabled(feature12);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory11.disable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.disable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory5.createGenerator(outputStream19);
        defaultPrettyPrinter3.writeObjectEntrySeparator(jsonGenerator20);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter23 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString24 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter25 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter23, serializableString24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = new com.fasterxml.jackson.core.JsonFactory(objectCodec26);
        com.fasterxml.jackson.core.JsonFactory.Feature feature28 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean30 = feature28.enabledIn(3);
        boolean boolean31 = jsonFactory27.isEnabled(feature28);
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory(objectCodec32);
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean36 = feature34.enabledIn(3);
        boolean boolean37 = jsonFactory33.isEnabled(feature34);
        com.fasterxml.jackson.core.JsonParser.Feature feature38 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = jsonFactory33.disable(feature38);
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory27.disable(feature38);
        java.io.OutputStream outputStream41 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = jsonFactory27.createGenerator(outputStream41);
        defaultPrettyPrinter25.writeStartArray(jsonGenerator42);
        defaultPrettyPrinter3.writeStartObject(jsonGenerator42);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory(objectCodec45);
        com.fasterxml.jackson.core.JsonFactory.Feature feature47 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean49 = feature47.enabledIn(3);
        boolean boolean50 = jsonFactory46.isEnabled(feature47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = new com.fasterxml.jackson.core.JsonFactory(objectCodec51);
        com.fasterxml.jackson.core.JsonFactory.Feature feature53 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean55 = feature53.enabledIn(3);
        boolean boolean56 = jsonFactory52.isEnabled(feature53);
        com.fasterxml.jackson.core.JsonParser.Feature feature57 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = jsonFactory52.disable(feature57);
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = jsonFactory46.disable(feature57);
        java.io.OutputStream outputStream60 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator61 = jsonFactory46.createGenerator(outputStream60);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature62 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean63 = feature62.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator64 = jsonGenerator61.enable(feature62);
        defaultPrettyPrinter3.writeEndArray(jsonGenerator64, (int) (byte) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        jsonGenerator64.writeString(serializableString69);
        char[] charArray71 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        int int73 = serializableString69.appendUnquoted(charArray71, (int) 'a');
        boolean boolean77 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray71, (-1305830382), (-1697824632), true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature28.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature38.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + feature53 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature53.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature57.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory58);
        org.junit.Assert.assertNotNull(jsonFactory59);
        org.junit.Assert.assertNotNull(jsonGenerator61);
        org.junit.Assert.assertTrue("'" + feature62 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature62.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(jsonGenerator64);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test576");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        boolean boolean15 = readerBasedJsonParser14.isClosed();
        java.lang.Object obj16 = readerBasedJsonParser14.getInputSource();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = readerBasedJsonParser14.nextValue();
        com.fasterxml.jackson.core.Version version18 = readerBasedJsonParser14.version();
        com.fasterxml.jackson.core.JsonLocation jsonLocation19 = readerBasedJsonParser14.getTokenLocation();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext23 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler20, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer25 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext23, outputStream24);
        int int26 = readerBasedJsonParser14.releaseBuffered((java.io.Writer) uTF8Writer25);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 922062160 + "'", int13 == 922062160);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(jsonLocation19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test577");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(3);
        boolean boolean17 = jsonFactory13.isEnabled(feature14);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory13.disable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory7.disable(feature18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = jsonFactory20._getBufferRecycler();
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = new com.fasterxml.jackson.core.JsonFactory(objectCodec22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean26 = feature24.enabledIn(3);
        boolean boolean27 = jsonFactory23.isEnabled(feature24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory(objectCodec28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean32 = feature30.enabledIn(3);
        boolean boolean33 = jsonFactory29.isEnabled(feature30);
        com.fasterxml.jackson.core.JsonParser.Feature feature34 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory29.disable(feature34);
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory23.disable(feature34);
        java.lang.String str37 = jsonFactory23.getFormatName();
        java.io.InputStream inputStream38 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonFactory23.createParser(inputStream38);
        long long40 = jsonParser39.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory(objectCodec41);
        java.io.Reader reader43 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory42.createParser(reader43);
        boolean boolean45 = jsonParser44.requiresCustomCodec();
        java.lang.String str46 = jsonParser44.getText();
        java.lang.Object obj47 = jsonParser44.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter49 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString50 = defaultPrettyPrinter49._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer52 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler51);
        char[] charArray53 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer52.resetWithShared(charArray53, 2000, 2000);
        int int58 = serializableString50.appendUnquoted(charArray53, 0);
        boolean boolean59 = jsonParser44.nextFieldName(serializableString50);
        com.fasterxml.jackson.core.Version version60 = jsonParser44.version();
        double double62 = jsonParser44.getValueAsDouble((double) (byte) -1);
        char[] charArray63 = jsonParser44.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory65 = new com.fasterxml.jackson.core.JsonFactory(objectCodec64);
        com.fasterxml.jackson.core.JsonFactory.Feature feature66 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean68 = feature66.enabledIn(3);
        boolean boolean69 = jsonFactory65.isEnabled(feature66);
        com.fasterxml.jackson.core.ObjectCodec objectCodec70 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = new com.fasterxml.jackson.core.JsonFactory(objectCodec70);
        com.fasterxml.jackson.core.JsonFactory.Feature feature72 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean74 = feature72.enabledIn(3);
        boolean boolean75 = jsonFactory71.isEnabled(feature72);
        com.fasterxml.jackson.core.JsonParser.Feature feature76 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory77 = jsonFactory71.disable(feature76);
        com.fasterxml.jackson.core.JsonFactory jsonFactory78 = jsonFactory65.disable(feature76);
        com.fasterxml.jackson.core.JsonParser jsonParser79 = jsonParser44.enable(feature76);
        com.fasterxml.jackson.core.JsonParser jsonParser81 = jsonParser39.configure(feature76, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory82 = jsonFactory20.enable(feature76);
        com.fasterxml.jackson.core.JsonFactory jsonFactory83 = jsonFactory1.disable(feature76);
        boolean boolean84 = jsonFactory1.requiresCustomCodec();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(bufferRecycler21);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JSON" + "'", str37, "JSON");
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(serializableString50);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(version60);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1.0d) + "'", double62 == (-1.0d));
        org.junit.Assert.assertNull(charArray63);
        org.junit.Assert.assertTrue("'" + feature66 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature66.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + feature72 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature72.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + feature76 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature76.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory77);
        org.junit.Assert.assertNotNull(jsonFactory78);
        org.junit.Assert.assertNotNull(jsonParser79);
        org.junit.Assert.assertNotNull(jsonParser81);
        org.junit.Assert.assertNotNull(jsonFactory82);
        org.junit.Assert.assertNotNull(jsonFactory83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test578");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = readerBasedJsonParser14.nextToken();
        boolean boolean17 = readerBasedJsonParser14.getValueAsBoolean(false);
        com.fasterxml.jackson.core.JsonToken jsonToken18 = readerBasedJsonParser14.getCurrentToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-886955166) + "'", int13 == (-886955166));
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jsonToken18);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test579");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = readerBasedJsonParser14.nextToken();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler16, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer21 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext19, outputStream20);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding22 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext19.setEncoding(jsonEncoding22);
        java.io.Reader reader25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer27 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int29 = charsToNameCanonicalizer27.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser30 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext19, (-1697824632), reader25, objectCodec26, charsToNameCanonicalizer27);
        int int31 = readerBasedJsonParser30.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory(objectCodec32);
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean36 = feature34.enabledIn(3);
        boolean boolean37 = jsonFactory33.isEnabled(feature34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory(objectCodec38);
        com.fasterxml.jackson.core.JsonFactory.Feature feature40 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean42 = feature40.enabledIn(3);
        boolean boolean43 = jsonFactory39.isEnabled(feature40);
        com.fasterxml.jackson.core.JsonParser.Feature feature44 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory39.disable(feature44);
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory33.disable(feature44);
        java.lang.String str47 = jsonFactory33.getFormatName();
        java.io.InputStream inputStream48 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonFactory33.createParser(inputStream48);
        long long50 = jsonParser49.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = new com.fasterxml.jackson.core.JsonFactory(objectCodec51);
        java.io.Reader reader53 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonFactory52.createParser(reader53);
        boolean boolean55 = jsonParser54.requiresCustomCodec();
        java.lang.String str56 = jsonParser54.getText();
        java.lang.Object obj57 = jsonParser54.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter59 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString60 = defaultPrettyPrinter59._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler61 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer62 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler61);
        char[] charArray63 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer62.resetWithShared(charArray63, 2000, 2000);
        int int68 = serializableString60.appendUnquoted(charArray63, 0);
        boolean boolean69 = jsonParser54.nextFieldName(serializableString60);
        com.fasterxml.jackson.core.Version version70 = jsonParser54.version();
        double double72 = jsonParser54.getValueAsDouble((double) (byte) -1);
        char[] charArray73 = jsonParser54.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec74 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory75 = new com.fasterxml.jackson.core.JsonFactory(objectCodec74);
        com.fasterxml.jackson.core.JsonFactory.Feature feature76 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean78 = feature76.enabledIn(3);
        boolean boolean79 = jsonFactory75.isEnabled(feature76);
        com.fasterxml.jackson.core.ObjectCodec objectCodec80 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory81 = new com.fasterxml.jackson.core.JsonFactory(objectCodec80);
        com.fasterxml.jackson.core.JsonFactory.Feature feature82 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean84 = feature82.enabledIn(3);
        boolean boolean85 = jsonFactory81.isEnabled(feature82);
        com.fasterxml.jackson.core.JsonParser.Feature feature86 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory87 = jsonFactory81.disable(feature86);
        com.fasterxml.jackson.core.JsonFactory jsonFactory88 = jsonFactory75.disable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser89 = jsonParser54.enable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser91 = jsonParser49.configure(feature86, true);
        com.fasterxml.jackson.core.JsonParser jsonParser92 = readerBasedJsonParser30.enable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser93 = readerBasedJsonParser14.disable(feature86);
        int int94 = readerBasedJsonParser14.getTextOffset();
        long long96 = readerBasedJsonParser14.getValueAsLong(1856667718L);
        com.fasterxml.jackson.core.FormatSchema formatSchema97 = null;
        // The following exception was thrown during execution in test generation
        try {
            readerBasedJsonParser14.setSchema(formatSchema97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 130565052 + "'", int13 == 130565052);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + jsonEncoding22 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding22.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer27);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 208835838 + "'", int29 == 208835838);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature40.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature44.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "JSON" + "'", str47, "JSON");
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(serializableString60);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(version70);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertNull(charArray73);
        org.junit.Assert.assertTrue("'" + feature76 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature76.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + feature82 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature82.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + feature86 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature86.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory87);
        org.junit.Assert.assertNotNull(jsonFactory88);
        org.junit.Assert.assertNotNull(jsonParser89);
        org.junit.Assert.assertNotNull(jsonParser91);
        org.junit.Assert.assertNotNull(jsonParser92);
        org.junit.Assert.assertNotNull(jsonParser93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 1856667718L + "'", long96 == 1856667718L);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test580");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream12 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer13 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext11, outputStream12);
        uTF8Writer13.flush();
        java.io.Writer writer16 = uTF8Writer13.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1703009269), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean19 = writerBasedJsonGenerator17.isEnabled(feature18);
        java.math.BigInteger bigInteger20 = null;
        writerBasedJsonGenerator17.writeNumber(bigInteger20);
        com.fasterxml.jackson.core.SerializableString serializableString22 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = writerBasedJsonGenerator17.setRootValueSeparator(serializableString22);
        writerBasedJsonGenerator17.writeString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream30 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer31 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext29, outputStream30);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding32 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext29.setEncoding(jsonEncoding32);
        java.io.Reader reader35 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer37 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int39 = charsToNameCanonicalizer37.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser40 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext29, (-1697824632), reader35, objectCodec36, charsToNameCanonicalizer37);
        int int41 = readerBasedJsonParser40.getTextOffset();
        java.lang.String str42 = readerBasedJsonParser40.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation43 = readerBasedJsonParser40.getTokenLocation();
        int int45 = readerBasedJsonParser40.nextIntValue(262144);
        long long47 = readerBasedJsonParser40.getValueAsLong((long) (-1240287108));
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator17.copyCurrentStructure((com.fasterxml.jackson.core.JsonParser) readerBasedJsonParser40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature18.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertTrue("'" + jsonEncoding32 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding32.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer37);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1111841590) + "'", int39 == (-1111841590));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(jsonLocation43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 262144 + "'", int45 == 262144);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1240287108L) + "'", long47 == (-1240287108L));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test581");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream12 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer13 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext11, outputStream12);
        uTF8Writer13.flush();
        java.io.Writer writer16 = uTF8Writer13.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1703009269), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean19 = writerBasedJsonGenerator17.isEnabled(feature18);
        java.math.BigInteger bigInteger20 = null;
        writerBasedJsonGenerator17.writeNumber(bigInteger20);
        com.fasterxml.jackson.core.io.SerializedString serializedString23 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str24 = serializedString23.toString();
        int int25 = serializedString23.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream30 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer31 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext29, outputStream30);
        byte[] byteArray32 = iOContext29.allocReadIOBuffer();
        int int34 = serializedString23.appendQuotedUTF8(byteArray32, 3);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = writerBasedJsonGenerator17.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString23);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer37 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler36);
        textBuffer37.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        textBuffer41.append(' ');
        textBuffer41.resetWithString("hi!");
        char[] charArray46 = textBuffer41.finishCurrentSegment();
        textBuffer37.append(charArray46, (int) (short) 1, 100);
        writerBasedJsonGenerator17.writeRawValue(charArray46, (int) '#', (int) (byte) 100);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes53 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator54 = writerBasedJsonGenerator17.setCharacterEscapes(characterEscapes53);
        writerBasedJsonGenerator17.writeNull();
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature18.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(jsonGenerator54);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test582");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        byte[] byteArray11 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper14 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext10, byteArray11, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createJsonParser(byteArray11, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter19 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString20 = defaultPrettyPrinter19._rootSeparator;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int29 = serializableString20.appendQuotedUTF8(byteArray27, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory1.createJsonParser(byteArray27);
        java.lang.Object obj31 = jsonParser30.getInputSource();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(serializableString20);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test583");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonFactory1.version();
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory1.createGenerator(outputStream5);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = jsonGenerator6.useDefaultPrettyPrinter();
        jsonGenerator7.writeNull();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(jsonGenerator7);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test584");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        boolean boolean17 = readerBasedJsonParser14.getValueAsBoolean(true);
        java.lang.Object obj18 = readerBasedJsonParser14.getInputSource();
        com.fasterxml.jackson.core.Version version19 = readerBasedJsonParser14.version();
        com.fasterxml.jackson.core.JsonToken jsonToken20 = readerBasedJsonParser14.getCurrentToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 111849870 + "'", int13 == 111849870);
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertNull(jsonToken20);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test585");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        java.lang.Object obj17 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler15, obj17, false);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = iOContext19.constructTextBuffer();
        byte[] byteArray21 = iOContext19.allocBase64Buffer();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertNotNull(textBuffer20);
        org.junit.Assert.assertNotNull(byteArray21);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test586");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory(objectCodec16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean20 = feature18.enabledIn(3);
        boolean boolean21 = jsonFactory17.isEnabled(feature18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = new com.fasterxml.jackson.core.JsonFactory(objectCodec22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean26 = feature24.enabledIn(3);
        boolean boolean27 = jsonFactory23.isEnabled(feature24);
        com.fasterxml.jackson.core.JsonParser.Feature feature28 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory23.disable(feature28);
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory17.disable(feature28);
        java.lang.String str31 = jsonFactory17.getFormatName();
        java.io.InputStream inputStream32 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory17.createParser(inputStream32);
        long long34 = jsonParser33.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory(objectCodec35);
        java.io.Reader reader37 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory36.createParser(reader37);
        boolean boolean39 = jsonParser38.requiresCustomCodec();
        java.lang.String str40 = jsonParser38.getText();
        java.lang.Object obj41 = jsonParser38.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter43 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString44 = defaultPrettyPrinter43._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler45 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer46 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler45);
        char[] charArray47 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer46.resetWithShared(charArray47, 2000, 2000);
        int int52 = serializableString44.appendUnquoted(charArray47, 0);
        boolean boolean53 = jsonParser38.nextFieldName(serializableString44);
        com.fasterxml.jackson.core.Version version54 = jsonParser38.version();
        double double56 = jsonParser38.getValueAsDouble((double) (byte) -1);
        char[] charArray57 = jsonParser38.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = new com.fasterxml.jackson.core.JsonFactory(objectCodec58);
        com.fasterxml.jackson.core.JsonFactory.Feature feature60 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean62 = feature60.enabledIn(3);
        boolean boolean63 = jsonFactory59.isEnabled(feature60);
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory65 = new com.fasterxml.jackson.core.JsonFactory(objectCodec64);
        com.fasterxml.jackson.core.JsonFactory.Feature feature66 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean68 = feature66.enabledIn(3);
        boolean boolean69 = jsonFactory65.isEnabled(feature66);
        com.fasterxml.jackson.core.JsonParser.Feature feature70 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = jsonFactory65.disable(feature70);
        com.fasterxml.jackson.core.JsonFactory jsonFactory72 = jsonFactory59.disable(feature70);
        com.fasterxml.jackson.core.JsonParser jsonParser73 = jsonParser38.enable(feature70);
        com.fasterxml.jackson.core.JsonParser jsonParser75 = jsonParser33.configure(feature70, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory76 = jsonFactory14.enable(feature70);
        com.fasterxml.jackson.core.JsonParser jsonParser78 = jsonFactory76.createParser("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType79 = jsonParser78.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: java.io.StringReader@3c54fee1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature28.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "JSON" + "'", str31, "JSON");
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(serializableString44);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(version54);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertNull(charArray57);
        org.junit.Assert.assertTrue("'" + feature60 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature60.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + feature66 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature66.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + feature70 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature70.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory71);
        org.junit.Assert.assertNotNull(jsonFactory72);
        org.junit.Assert.assertNotNull(jsonParser73);
        org.junit.Assert.assertNotNull(jsonParser75);
        org.junit.Assert.assertNotNull(jsonFactory76);
        org.junit.Assert.assertNotNull(jsonParser78);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test587");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.fasterxml.jackson.core.io.NumberInput.parseLong("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test588");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        int int16 = readerBasedJsonParser14.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = readerBasedJsonParser14.getCodec();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 865916614 + "'", int13 == 865916614);
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(objectCodec17);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test589");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = jsonFactory14.getCharacterEscapes();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator16 = jsonFactory14.getOutputDecorator();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes17 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory14.setCharacterEscapes(characterEscapes17);
        com.fasterxml.jackson.core.JsonParser.Feature feature19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory14.enable(feature19);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory14.setCodec(objectCodec21);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory22.createJsonParser("/");
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNull(characterEscapes15);
        org.junit.Assert.assertNull(outputDecorator16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature19.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser24);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test590");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        boolean boolean17 = readerBasedJsonParser14.hasCurrentToken();
        readerBasedJsonParser14.close();
        readerBasedJsonParser14.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = readerBasedJsonParser14.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1608970736) + "'", int13 == (-1608970736));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test591");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = com.fasterxml.jackson.core.io.NumberInput.parseDouble("com.fasterxml.jackson.core.JsonParseException: \n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"com.fasterxml.jackson.core.JsonParseException: ? at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test592");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = jsonFactory14.getCharacterEscapes();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory(objectCodec16);
        java.io.Reader reader18 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory17.createParser(reader18);
        boolean boolean20 = jsonParser19.requiresCustomCodec();
        java.lang.String str21 = jsonParser19.getText();
        java.lang.Object obj22 = jsonParser19.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter24 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString25 = defaultPrettyPrinter24._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        char[] charArray28 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer27.resetWithShared(charArray28, 2000, 2000);
        int int33 = serializableString25.appendUnquoted(charArray28, 0);
        boolean boolean34 = jsonParser19.nextFieldName(serializableString25);
        com.fasterxml.jackson.core.Version version35 = jsonParser19.version();
        double double37 = jsonParser19.getValueAsDouble((double) (byte) -1);
        char[] charArray38 = jsonParser19.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = new com.fasterxml.jackson.core.JsonFactory(objectCodec39);
        com.fasterxml.jackson.core.JsonFactory.Feature feature41 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean43 = feature41.enabledIn(3);
        boolean boolean44 = jsonFactory40.isEnabled(feature41);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory(objectCodec45);
        com.fasterxml.jackson.core.JsonFactory.Feature feature47 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean49 = feature47.enabledIn(3);
        boolean boolean50 = jsonFactory46.isEnabled(feature47);
        com.fasterxml.jackson.core.JsonParser.Feature feature51 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = jsonFactory46.disable(feature51);
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = jsonFactory40.disable(feature51);
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonParser19.enable(feature51);
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = jsonFactory14.enable(feature51);
        com.fasterxml.jackson.core.format.InputAccessor inputAccessor56 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.format.MatchStrength matchStrength57 = jsonFactory55.hasFormat(inputAccessor56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNull(characterEscapes15);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(serializableString25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertNull(charArray38);
        org.junit.Assert.assertTrue("'" + feature41 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature41.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory52);
        org.junit.Assert.assertNotNull(jsonFactory53);
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertNotNull(jsonFactory55);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test593");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = readerBasedJsonParser14.getTokenLocation();
        java.lang.String str18 = readerBasedJsonParser14.getValueAsString();
        java.lang.String str19 = readerBasedJsonParser14.getCurrentName();
        java.lang.String str20 = readerBasedJsonParser14.getText();
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        readerBasedJsonParser14.setCodec(objectCodec21);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = readerBasedJsonParser14.skipChildren();
        com.fasterxml.jackson.core.JsonParser jsonParser24 = readerBasedJsonParser14.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = readerBasedJsonParser14.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not of boolean type? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 435995634 + "'", int13 == 435995634);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jsonLocation17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNotNull(jsonParser24);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test594");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        boolean boolean16 = readerBasedJsonParser14.hasTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = readerBasedJsonParser14.getCodec();
        readerBasedJsonParser14.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken19 = readerBasedJsonParser14.getLastClearedToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1531786638 + "'", int13 == 1531786638);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(objectCodec17);
        org.junit.Assert.assertNull(jsonToken19);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test595");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = readerBasedJsonParser14.nextToken();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler16, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer21 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext19, outputStream20);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding22 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext19.setEncoding(jsonEncoding22);
        java.io.Reader reader25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer27 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int29 = charsToNameCanonicalizer27.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser30 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext19, (-1697824632), reader25, objectCodec26, charsToNameCanonicalizer27);
        int int31 = readerBasedJsonParser30.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory(objectCodec32);
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean36 = feature34.enabledIn(3);
        boolean boolean37 = jsonFactory33.isEnabled(feature34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory(objectCodec38);
        com.fasterxml.jackson.core.JsonFactory.Feature feature40 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean42 = feature40.enabledIn(3);
        boolean boolean43 = jsonFactory39.isEnabled(feature40);
        com.fasterxml.jackson.core.JsonParser.Feature feature44 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory39.disable(feature44);
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory33.disable(feature44);
        java.lang.String str47 = jsonFactory33.getFormatName();
        java.io.InputStream inputStream48 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonFactory33.createParser(inputStream48);
        long long50 = jsonParser49.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = new com.fasterxml.jackson.core.JsonFactory(objectCodec51);
        java.io.Reader reader53 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonFactory52.createParser(reader53);
        boolean boolean55 = jsonParser54.requiresCustomCodec();
        java.lang.String str56 = jsonParser54.getText();
        java.lang.Object obj57 = jsonParser54.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter59 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString60 = defaultPrettyPrinter59._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler61 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer62 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler61);
        char[] charArray63 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer62.resetWithShared(charArray63, 2000, 2000);
        int int68 = serializableString60.appendUnquoted(charArray63, 0);
        boolean boolean69 = jsonParser54.nextFieldName(serializableString60);
        com.fasterxml.jackson.core.Version version70 = jsonParser54.version();
        double double72 = jsonParser54.getValueAsDouble((double) (byte) -1);
        char[] charArray73 = jsonParser54.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec74 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory75 = new com.fasterxml.jackson.core.JsonFactory(objectCodec74);
        com.fasterxml.jackson.core.JsonFactory.Feature feature76 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean78 = feature76.enabledIn(3);
        boolean boolean79 = jsonFactory75.isEnabled(feature76);
        com.fasterxml.jackson.core.ObjectCodec objectCodec80 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory81 = new com.fasterxml.jackson.core.JsonFactory(objectCodec80);
        com.fasterxml.jackson.core.JsonFactory.Feature feature82 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean84 = feature82.enabledIn(3);
        boolean boolean85 = jsonFactory81.isEnabled(feature82);
        com.fasterxml.jackson.core.JsonParser.Feature feature86 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory87 = jsonFactory81.disable(feature86);
        com.fasterxml.jackson.core.JsonFactory jsonFactory88 = jsonFactory75.disable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser89 = jsonParser54.enable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser91 = jsonParser49.configure(feature86, true);
        com.fasterxml.jackson.core.JsonParser jsonParser92 = readerBasedJsonParser30.enable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser93 = readerBasedJsonParser14.disable(feature86);
        com.fasterxml.jackson.core.JsonLocation jsonLocation94 = readerBasedJsonParser14.getTokenLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken95 = readerBasedJsonParser14.nextToken();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext96 = readerBasedJsonParser14.getParsingContext();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-962952580) + "'", int13 == (-962952580));
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + jsonEncoding22 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding22.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer27);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-962952580) + "'", int29 == (-962952580));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature40.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature44.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "JSON" + "'", str47, "JSON");
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(serializableString60);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(version70);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertNull(charArray73);
        org.junit.Assert.assertTrue("'" + feature76 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature76.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + feature82 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature82.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + feature86 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature86.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory87);
        org.junit.Assert.assertNotNull(jsonFactory88);
        org.junit.Assert.assertNotNull(jsonParser89);
        org.junit.Assert.assertNotNull(jsonParser91);
        org.junit.Assert.assertNotNull(jsonParser92);
        org.junit.Assert.assertNotNull(jsonParser93);
        org.junit.Assert.assertNotNull(jsonLocation94);
        org.junit.Assert.assertNull(jsonToken95);
        org.junit.Assert.assertNotNull(jsonReadContext96);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test596");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream12 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer13 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext11, outputStream12);
        uTF8Writer13.flush();
        java.io.Writer writer16 = uTF8Writer13.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1703009269), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        writerBasedJsonGenerator17.writeRaw("com.fasterxml.jackson.core.JsonParseException: \n\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext21 = writerBasedJsonGenerator17.getOutputContext();
        writerBasedJsonGenerator17.writeStartObject();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext23 = writerBasedJsonGenerator17.getOutputContext();
        com.fasterxml.jackson.core.JsonGenerator.Feature feature24 = com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII;
        boolean boolean25 = writerBasedJsonGenerator17.isEnabled(feature24);
        com.fasterxml.jackson.core.io.SerializedString serializedString27 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str28 = serializedString27.toString();
        writerBasedJsonGenerator17.writeFieldName((com.fasterxml.jackson.core.SerializableString) serializedString27);
        writerBasedJsonGenerator17.writeBoolean(true);
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(jsonWriteContext21);
        org.junit.Assert.assertNotNull(jsonWriteContext23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII + "'", feature24.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n" + "'", str28, "\n");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test597");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 60);
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext19 = readerBasedJsonParser14.getParsingContext();
        java.lang.Object obj20 = readerBasedJsonParser14.getObjectId();
        boolean boolean21 = readerBasedJsonParser14.canReadTypeId();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1426011422 + "'", int13 == 1426011422);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNotNull(jsonReadContext19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test598");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory(objectCodec4);
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn(3);
        boolean boolean9 = jsonFactory5.isEnabled(feature6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory(objectCodec10);
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean14 = feature12.enabledIn(3);
        boolean boolean15 = jsonFactory11.isEnabled(feature12);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory11.disable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.disable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory5.createGenerator(outputStream19);
        defaultPrettyPrinter3.writeStartArray(jsonGenerator20);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter22 = jsonGenerator20.getPrettyPrinter();
        com.fasterxml.jackson.core.io.SerializedString serializedString24 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str25 = serializedString24.toString();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = jsonGenerator20.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString24);
        byte[] byteArray27 = serializedString24.asUnquotedUTF8();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext31 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler28, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream32 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory(objectCodec33);
        com.fasterxml.jackson.core.JsonFactory.Feature feature35 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean37 = feature35.enabledIn(3);
        boolean boolean38 = jsonFactory34.isEnabled(feature35);
        com.fasterxml.jackson.core.JsonParser.Feature feature39 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory34.disable(feature39);
        java.io.OutputStream outputStream41 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = jsonFactory34.createGenerator(outputStream41);
        com.fasterxml.jackson.core.io.IOContext iOContext43 = null;
        byte[] byteArray44 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper47 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext43, byteArray44, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory34.createJsonParser(byteArray44, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = new com.fasterxml.jackson.core.JsonFactory(objectCodec51);
        com.fasterxml.jackson.core.JsonFactory.Feature feature53 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean55 = feature53.enabledIn(3);
        boolean boolean56 = jsonFactory52.isEnabled(feature53);
        com.fasterxml.jackson.core.JsonParser.Feature feature57 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = jsonFactory52.disable(feature57);
        java.io.OutputStream outputStream59 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator60 = jsonFactory52.createGenerator(outputStream59);
        com.fasterxml.jackson.core.io.IOContext iOContext61 = null;
        byte[] byteArray62 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper65 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext61, byteArray62, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser68 = jsonFactory52.createJsonParser(byteArray62, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter70 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString71 = defaultPrettyPrinter70._rootSeparator;
        byte[] byteArray78 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int80 = serializableString71.appendQuotedUTF8(byteArray78, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser81 = jsonFactory52.createJsonParser(byteArray78);
        com.fasterxml.jackson.core.JsonParser jsonParser84 = jsonFactory34.createJsonParser(byteArray78, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream87 = new com.fasterxml.jackson.core.io.MergedStream(iOContext31, inputStream32, byteArray78, 10, 2000);
        char[] charArray89 = iOContext31.allocNameCopyBuffer((-1081632712));
        int int91 = serializedString24.appendUnquoted(charArray89, 1282197362);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNull(prettyPrinter22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertNotNull(jsonGenerator26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10]");
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature35.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertTrue("'" + feature53 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature53.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature57.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory58);
        org.junit.Assert.assertNotNull(jsonGenerator60);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser68);
        org.junit.Assert.assertNotNull(serializableString71);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(jsonParser81);
        org.junit.Assert.assertNotNull(jsonParser84);
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray89), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray89), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray89), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test599");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = jsonFactory14.getCharacterEscapes();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator16 = jsonFactory14.getOutputDecorator();
        java.io.Writer writer17 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = jsonFactory14.createGenerator(writer17);
        com.fasterxml.jackson.core.JsonParser.Feature feature19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory14.configure(feature19, false);
        java.io.InputStream inputStream22 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory21.createJsonParser(inputStream22);
        java.lang.Object obj24 = jsonParser23.getObjectId();
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonParser23.skipChildren();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNull(characterEscapes15);
        org.junit.Assert.assertNull(outputDecorator16);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature19.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(jsonParser25);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test600");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        byte[] byteArray6 = iOContext3.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(3);
        boolean boolean17 = jsonFactory13.isEnabled(feature14);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory13.disable(feature18);
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory13.createGenerator(outputStream20);
        com.fasterxml.jackson.core.io.IOContext iOContext22 = null;
        byte[] byteArray23 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext22, byteArray23, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory13.createJsonParser(byteArray23, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory(objectCodec30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean34 = feature32.enabledIn(3);
        boolean boolean35 = jsonFactory31.isEnabled(feature32);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory31.disable(feature36);
        java.io.OutputStream outputStream38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonFactory31.createGenerator(outputStream38);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        byte[] byteArray41 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper44 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext40, byteArray41, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory31.createJsonParser(byteArray41, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter49 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString50 = defaultPrettyPrinter49._rootSeparator;
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int59 = serializableString50.appendQuotedUTF8(byteArray57, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory31.createJsonParser(byteArray57);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory13.createJsonParser(byteArray57, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream66 = new com.fasterxml.jackson.core.io.MergedStream(iOContext10, inputStream11, byteArray57, 10, 2000);
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory68 = new com.fasterxml.jackson.core.JsonFactory(objectCodec67);
        com.fasterxml.jackson.core.JsonFactory.Feature feature69 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean71 = feature69.enabledIn(3);
        boolean boolean72 = jsonFactory68.isEnabled(feature69);
        com.fasterxml.jackson.core.JsonParser.Feature feature73 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory74 = jsonFactory68.disable(feature73);
        java.io.OutputStream outputStream75 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator76 = jsonFactory68.createGenerator(outputStream75);
        com.fasterxml.jackson.core.io.IOContext iOContext77 = null;
        byte[] byteArray78 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper81 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext77, byteArray78, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser84 = jsonFactory68.createJsonParser(byteArray78, 1, (int) (short) 100);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader88 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, (java.io.InputStream) mergedStream66, byteArray78, (int) (short) -1, 1000, true);
        boolean boolean89 = uTF32Reader88.markSupported();
        boolean boolean90 = uTF32Reader88.ready();
        com.fasterxml.jackson.core.JsonLocation jsonLocation95 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) uTF32Reader88, 60L, (long) 4, 518492068, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long97 = uTF32Reader88.skip((long) 1716277517);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(serializableString50);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertTrue("'" + feature69 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature69.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + feature73 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature73.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory74);
        org.junit.Assert.assertNotNull(jsonGenerator76);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test601");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = readerBasedJsonParser14.nextToken();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler16, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer21 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext19, outputStream20);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding22 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext19.setEncoding(jsonEncoding22);
        java.io.Reader reader25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer27 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int29 = charsToNameCanonicalizer27.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser30 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext19, (-1697824632), reader25, objectCodec26, charsToNameCanonicalizer27);
        int int31 = readerBasedJsonParser30.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory(objectCodec32);
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean36 = feature34.enabledIn(3);
        boolean boolean37 = jsonFactory33.isEnabled(feature34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory(objectCodec38);
        com.fasterxml.jackson.core.JsonFactory.Feature feature40 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean42 = feature40.enabledIn(3);
        boolean boolean43 = jsonFactory39.isEnabled(feature40);
        com.fasterxml.jackson.core.JsonParser.Feature feature44 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory39.disable(feature44);
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory33.disable(feature44);
        java.lang.String str47 = jsonFactory33.getFormatName();
        java.io.InputStream inputStream48 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonFactory33.createParser(inputStream48);
        long long50 = jsonParser49.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = new com.fasterxml.jackson.core.JsonFactory(objectCodec51);
        java.io.Reader reader53 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonFactory52.createParser(reader53);
        boolean boolean55 = jsonParser54.requiresCustomCodec();
        java.lang.String str56 = jsonParser54.getText();
        java.lang.Object obj57 = jsonParser54.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter59 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString60 = defaultPrettyPrinter59._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler61 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer62 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler61);
        char[] charArray63 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer62.resetWithShared(charArray63, 2000, 2000);
        int int68 = serializableString60.appendUnquoted(charArray63, 0);
        boolean boolean69 = jsonParser54.nextFieldName(serializableString60);
        com.fasterxml.jackson.core.Version version70 = jsonParser54.version();
        double double72 = jsonParser54.getValueAsDouble((double) (byte) -1);
        char[] charArray73 = jsonParser54.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec74 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory75 = new com.fasterxml.jackson.core.JsonFactory(objectCodec74);
        com.fasterxml.jackson.core.JsonFactory.Feature feature76 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean78 = feature76.enabledIn(3);
        boolean boolean79 = jsonFactory75.isEnabled(feature76);
        com.fasterxml.jackson.core.ObjectCodec objectCodec80 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory81 = new com.fasterxml.jackson.core.JsonFactory(objectCodec80);
        com.fasterxml.jackson.core.JsonFactory.Feature feature82 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean84 = feature82.enabledIn(3);
        boolean boolean85 = jsonFactory81.isEnabled(feature82);
        com.fasterxml.jackson.core.JsonParser.Feature feature86 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory87 = jsonFactory81.disable(feature86);
        com.fasterxml.jackson.core.JsonFactory jsonFactory88 = jsonFactory75.disable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser89 = jsonParser54.enable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser91 = jsonParser49.configure(feature86, true);
        com.fasterxml.jackson.core.JsonParser jsonParser92 = readerBasedJsonParser30.enable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser93 = readerBasedJsonParser14.disable(feature86);
        int int95 = readerBasedJsonParser14.getValueAsInt((-1));
        java.lang.String str96 = readerBasedJsonParser14.getCurrentName();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1164577078) + "'", int13 == (-1164577078));
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + jsonEncoding22 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding22.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer27);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-147056860) + "'", int29 == (-147056860));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature40.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature44.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "JSON" + "'", str47, "JSON");
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(serializableString60);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(version70);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertNull(charArray73);
        org.junit.Assert.assertTrue("'" + feature76 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature76.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + feature82 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature82.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + feature86 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature86.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory87);
        org.junit.Assert.assertNotNull(jsonFactory88);
        org.junit.Assert.assertNotNull(jsonParser89);
        org.junit.Assert.assertNotNull(jsonParser91);
        org.junit.Assert.assertNotNull(jsonParser92);
        org.junit.Assert.assertNotNull(jsonParser93);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertNull(str96);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test602");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = jsonFactory14.getCharacterEscapes();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator16 = jsonFactory14.getOutputDecorator();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes17 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory14.setCharacterEscapes(characterEscapes17);
        com.fasterxml.jackson.core.JsonParser.Feature feature19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory14.enable(feature19);
        com.fasterxml.jackson.core.Version version21 = jsonFactory20.version();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext25 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler22, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer27 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext25, outputStream26);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding28 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext25.setEncoding(jsonEncoding28);
        java.io.Reader reader31 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer33 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int35 = charsToNameCanonicalizer33.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser36 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext25, (-1697824632), reader31, objectCodec32, charsToNameCanonicalizer33);
        int int37 = readerBasedJsonParser36.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory(objectCodec38);
        com.fasterxml.jackson.core.JsonFactory.Feature feature40 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean42 = feature40.enabledIn(3);
        boolean boolean43 = jsonFactory39.isEnabled(feature40);
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = new com.fasterxml.jackson.core.JsonFactory(objectCodec44);
        com.fasterxml.jackson.core.JsonFactory.Feature feature46 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean48 = feature46.enabledIn(3);
        boolean boolean49 = jsonFactory45.isEnabled(feature46);
        com.fasterxml.jackson.core.JsonParser.Feature feature50 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = jsonFactory45.disable(feature50);
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = jsonFactory39.disable(feature50);
        java.lang.String str53 = jsonFactory39.getFormatName();
        java.io.InputStream inputStream54 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser55 = jsonFactory39.createParser(inputStream54);
        long long56 = jsonParser55.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = new com.fasterxml.jackson.core.JsonFactory(objectCodec57);
        java.io.Reader reader59 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory58.createParser(reader59);
        boolean boolean61 = jsonParser60.requiresCustomCodec();
        java.lang.String str62 = jsonParser60.getText();
        java.lang.Object obj63 = jsonParser60.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter65 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString66 = defaultPrettyPrinter65._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler67 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer68 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler67);
        char[] charArray69 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer68.resetWithShared(charArray69, 2000, 2000);
        int int74 = serializableString66.appendUnquoted(charArray69, 0);
        boolean boolean75 = jsonParser60.nextFieldName(serializableString66);
        com.fasterxml.jackson.core.Version version76 = jsonParser60.version();
        double double78 = jsonParser60.getValueAsDouble((double) (byte) -1);
        char[] charArray79 = jsonParser60.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec80 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory81 = new com.fasterxml.jackson.core.JsonFactory(objectCodec80);
        com.fasterxml.jackson.core.JsonFactory.Feature feature82 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean84 = feature82.enabledIn(3);
        boolean boolean85 = jsonFactory81.isEnabled(feature82);
        com.fasterxml.jackson.core.ObjectCodec objectCodec86 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory87 = new com.fasterxml.jackson.core.JsonFactory(objectCodec86);
        com.fasterxml.jackson.core.JsonFactory.Feature feature88 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean90 = feature88.enabledIn(3);
        boolean boolean91 = jsonFactory87.isEnabled(feature88);
        com.fasterxml.jackson.core.JsonParser.Feature feature92 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory93 = jsonFactory87.disable(feature92);
        com.fasterxml.jackson.core.JsonFactory jsonFactory94 = jsonFactory81.disable(feature92);
        com.fasterxml.jackson.core.JsonParser jsonParser95 = jsonParser60.enable(feature92);
        com.fasterxml.jackson.core.JsonParser jsonParser97 = jsonParser55.configure(feature92, true);
        com.fasterxml.jackson.core.JsonParser jsonParser98 = readerBasedJsonParser36.enable(feature92);
        com.fasterxml.jackson.core.JsonFactory jsonFactory99 = jsonFactory20.disable(feature92);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNull(characterEscapes15);
        org.junit.Assert.assertNull(outputDecorator16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature19.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(version21);
        org.junit.Assert.assertTrue("'" + jsonEncoding28 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding28.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer33);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-185623910) + "'", int35 == (-185623910));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature40.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + feature46 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature46.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + feature50 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature50.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory51);
        org.junit.Assert.assertNotNull(jsonFactory52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "JSON" + "'", str53, "JSON");
        org.junit.Assert.assertNotNull(jsonParser55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(serializableString66);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(version76);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertNull(charArray79);
        org.junit.Assert.assertTrue("'" + feature82 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature82.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + feature88 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature88.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + feature92 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature92.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory93);
        org.junit.Assert.assertNotNull(jsonFactory94);
        org.junit.Assert.assertNotNull(jsonParser95);
        org.junit.Assert.assertNotNull(jsonParser97);
        org.junit.Assert.assertNotNull(jsonParser98);
        org.junit.Assert.assertNotNull(jsonFactory99);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test603");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory(objectCodec15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean19 = feature17.enabledIn(3);
        boolean boolean20 = jsonFactory16.isEnabled(feature17);
        com.fasterxml.jackson.core.JsonParser.Feature feature21 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory16.disable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory14.configure(feature21, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator25 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory14.setInputDecorator(inputDecorator25);
        com.fasterxml.jackson.core.JsonFactory.Feature feature27 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean29 = feature27.enabledIn((int) (short) 100);
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory26.disable(feature27);
        java.io.InputStream inputStream31 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser32 = jsonFactory30.createParser(inputStream31);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator33 = jsonFactory30.getInputDecorator();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature27.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertNull(inputDecorator33);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test604");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = readerBasedJsonParser14.nextToken();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler16, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer21 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext19, outputStream20);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding22 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext19.setEncoding(jsonEncoding22);
        java.io.Reader reader25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer27 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int29 = charsToNameCanonicalizer27.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser30 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext19, (-1697824632), reader25, objectCodec26, charsToNameCanonicalizer27);
        int int31 = readerBasedJsonParser30.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory(objectCodec32);
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean36 = feature34.enabledIn(3);
        boolean boolean37 = jsonFactory33.isEnabled(feature34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory(objectCodec38);
        com.fasterxml.jackson.core.JsonFactory.Feature feature40 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean42 = feature40.enabledIn(3);
        boolean boolean43 = jsonFactory39.isEnabled(feature40);
        com.fasterxml.jackson.core.JsonParser.Feature feature44 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory39.disable(feature44);
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory33.disable(feature44);
        java.lang.String str47 = jsonFactory33.getFormatName();
        java.io.InputStream inputStream48 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonFactory33.createParser(inputStream48);
        long long50 = jsonParser49.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = new com.fasterxml.jackson.core.JsonFactory(objectCodec51);
        java.io.Reader reader53 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonFactory52.createParser(reader53);
        boolean boolean55 = jsonParser54.requiresCustomCodec();
        java.lang.String str56 = jsonParser54.getText();
        java.lang.Object obj57 = jsonParser54.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter59 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString60 = defaultPrettyPrinter59._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler61 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer62 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler61);
        char[] charArray63 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer62.resetWithShared(charArray63, 2000, 2000);
        int int68 = serializableString60.appendUnquoted(charArray63, 0);
        boolean boolean69 = jsonParser54.nextFieldName(serializableString60);
        com.fasterxml.jackson.core.Version version70 = jsonParser54.version();
        double double72 = jsonParser54.getValueAsDouble((double) (byte) -1);
        char[] charArray73 = jsonParser54.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec74 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory75 = new com.fasterxml.jackson.core.JsonFactory(objectCodec74);
        com.fasterxml.jackson.core.JsonFactory.Feature feature76 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean78 = feature76.enabledIn(3);
        boolean boolean79 = jsonFactory75.isEnabled(feature76);
        com.fasterxml.jackson.core.ObjectCodec objectCodec80 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory81 = new com.fasterxml.jackson.core.JsonFactory(objectCodec80);
        com.fasterxml.jackson.core.JsonFactory.Feature feature82 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean84 = feature82.enabledIn(3);
        boolean boolean85 = jsonFactory81.isEnabled(feature82);
        com.fasterxml.jackson.core.JsonParser.Feature feature86 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory87 = jsonFactory81.disable(feature86);
        com.fasterxml.jackson.core.JsonFactory jsonFactory88 = jsonFactory75.disable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser89 = jsonParser54.enable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser91 = jsonParser49.configure(feature86, true);
        com.fasterxml.jackson.core.JsonParser jsonParser92 = readerBasedJsonParser30.enable(feature86);
        com.fasterxml.jackson.core.JsonParser jsonParser93 = readerBasedJsonParser14.disable(feature86);
        com.fasterxml.jackson.core.JsonLocation jsonLocation94 = readerBasedJsonParser14.getTokenLocation();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext95 = readerBasedJsonParser14.getParsingContext();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1916370450) + "'", int13 == (-1916370450));
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + jsonEncoding22 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding22.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer27);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1838099664) + "'", int29 == (-1838099664));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature40.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature44.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "JSON" + "'", str47, "JSON");
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(serializableString60);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(version70);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertNull(charArray73);
        org.junit.Assert.assertTrue("'" + feature76 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature76.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + feature82 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature82.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + feature86 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature86.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory87);
        org.junit.Assert.assertNotNull(jsonFactory88);
        org.junit.Assert.assertNotNull(jsonParser89);
        org.junit.Assert.assertNotNull(jsonParser91);
        org.junit.Assert.assertNotNull(jsonParser92);
        org.junit.Assert.assertNotNull(jsonParser93);
        org.junit.Assert.assertNotNull(jsonLocation94);
        org.junit.Assert.assertNotNull(jsonStreamContext95);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test605");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext18 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler15, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer20 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext18, outputStream19);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext26 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler23, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream27 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer28 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext26, outputStream27);
        uTF8Writer28.flush();
        java.io.Writer writer31 = uTF8Writer28.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator32 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext18, (-1703009269), objectCodec22, (java.io.Writer) uTF8Writer28);
        uTF8Writer28.flush();
        int int34 = readerBasedJsonParser14.releaseBuffered((java.io.Writer) uTF8Writer28);
        com.fasterxml.jackson.core.JsonLocation jsonLocation35 = readerBasedJsonParser14.getTokenLocation();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 970859384 + "'", int13 == 970859384);
        org.junit.Assert.assertNotNull(writer31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(jsonLocation35);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test606");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = readerBasedJsonParser14.nextToken();
        boolean boolean16 = readerBasedJsonParser14.isClosed();
        int int18 = readerBasedJsonParser14.nextIntValue(0);
        long long20 = readerBasedJsonParser14.getValueAsLong((long) (-1702999719));
        java.lang.String str22 = readerBasedJsonParser14.getValueAsString("ROOT");
        java.lang.String str23 = readerBasedJsonParser14.getCurrentName();
        int int25 = readerBasedJsonParser14.getValueAsInt(4);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 169436342 + "'", int13 == 169436342);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1702999719L) + "'", long20 == (-1702999719L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ROOT" + "'", str22, "ROOT");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test607");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 60);
        double double20 = readerBasedJsonParser14.getValueAsDouble((double) (-415458448));
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1542595016) + "'", int13 == (-1542595016));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-4.15458448E8d) + "'", double20 == (-4.15458448E8d));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test608");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonFactory1.version();
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory1.createGenerator(outputStream5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) feature7, 0L, (long) (byte) 1, 10, (int) (short) -1);
        boolean boolean13 = feature7.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory1.configure(feature7, false);
        java.lang.String str16 = jsonFactory15.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
        int int18 = feature17.getMask();
        boolean boolean19 = jsonFactory15.isEnabled(feature17);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = jsonFactory15.getCodec();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext24 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler21, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer26 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext24, outputStream25);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding27 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext24.setEncoding(jsonEncoding27);
        java.io.Reader reader30 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer32 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int34 = charsToNameCanonicalizer32.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser35 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext24, (-1697824632), reader30, objectCodec31, charsToNameCanonicalizer32);
        int int36 = readerBasedJsonParser35.getTextOffset();
        java.lang.String str37 = readerBasedJsonParser35.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation38 = readerBasedJsonParser35.getTokenLocation();
        java.lang.String str39 = readerBasedJsonParser35.getValueAsString();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder40 = readerBasedJsonParser35._getByteArrayBuilder();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator41 = jsonFactory15.createGenerator((java.io.OutputStream) byteArrayBuilder40);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS + "'", feature17.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(objectCodec20);
        org.junit.Assert.assertTrue("'" + jsonEncoding27 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding27.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer32);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-446804012) + "'", int34 == (-446804012));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(jsonLocation38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(byteArrayBuilder40);
        org.junit.Assert.assertNotNull(jsonGenerator41);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test609");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = new com.fasterxml.jackson.core.JsonFactory(objectCodec8);
        com.fasterxml.jackson.core.JsonFactory.Feature feature10 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean12 = feature10.enabledIn(3);
        boolean boolean13 = jsonFactory9.isEnabled(feature10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory(objectCodec14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean18 = feature16.enabledIn(3);
        boolean boolean19 = jsonFactory15.isEnabled(feature16);
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory15.disable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory9.disable(feature20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory(objectCodec23);
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(3);
        boolean boolean28 = jsonFactory24.isEnabled(feature25);
        com.fasterxml.jackson.core.JsonParser.Feature feature29 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory24.disable(feature29);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory22.configure(feature29, true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory(objectCodec33);
        java.io.Reader reader35 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser36 = jsonFactory34.createParser(reader35);
        com.fasterxml.jackson.core.Version version37 = jsonFactory34.version();
        java.io.OutputStream outputStream38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonFactory34.createGenerator(outputStream38);
        com.fasterxml.jackson.core.JsonFactory.Feature feature40 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonLocation jsonLocation45 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) feature40, 0L, (long) (byte) 1, 10, (int) (short) -1);
        boolean boolean46 = feature40.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = jsonFactory34.configure(feature40, false);
        boolean boolean49 = jsonFactory32.isEnabled(feature40);
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = jsonFactory7.disable(feature40);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature10.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature29.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertNotNull(version37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature40.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(jsonFactory50);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test610");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = readerBasedJsonParser14.getTokenLocation();
        java.lang.String str18 = readerBasedJsonParser14.getValueAsString();
        java.lang.String str19 = readerBasedJsonParser14.getCurrentName();
        java.lang.String str20 = readerBasedJsonParser14.getText();
        int int21 = readerBasedJsonParser14.getTokenColumnNr();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1551384264) + "'", int13 == (-1551384264));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jsonLocation17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test611");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = readerBasedJsonParser14.getTokenLocation();
        java.lang.String str18 = readerBasedJsonParser14.getValueAsString();
        java.lang.String str19 = readerBasedJsonParser14.getCurrentName();
        java.lang.String str20 = readerBasedJsonParser14.getText();
        boolean boolean21 = readerBasedJsonParser14.isClosed();
        int int22 = readerBasedJsonParser14.getTextOffset();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 92302242 + "'", int13 == 92302242);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jsonLocation17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test612");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextLength();
        long long17 = readerBasedJsonParser14.getValueAsLong((long) 1716277517);
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = readerBasedJsonParser14.getTokenLocation();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1579447176 + "'", int13 == 1579447176);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1716277517L + "'", long17 == 1716277517L);
        org.junit.Assert.assertNotNull(jsonLocation18);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test613");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory(objectCodec4);
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn(3);
        boolean boolean9 = jsonFactory5.isEnabled(feature6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory(objectCodec10);
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean14 = feature12.enabledIn(3);
        boolean boolean15 = jsonFactory11.isEnabled(feature12);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory11.disable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.disable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory5.createGenerator(outputStream19);
        defaultPrettyPrinter3.writeStartArray(jsonGenerator20);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter22 = defaultPrettyPrinter3._arrayIndenter;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter23 = defaultPrettyPrinter3._objectIndenter;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = new com.fasterxml.jackson.core.JsonFactory(objectCodec24);
        java.io.Reader reader26 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory25.createParser(reader26);
        com.fasterxml.jackson.core.Version version28 = jsonFactory25.version();
        java.io.OutputStream outputStream29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonFactory25.createGenerator(outputStream29);
        defaultPrettyPrinter3.writeEndArray(jsonGenerator30, (-1703009269));
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator30.writeFieldName("null");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Can not write a field name, expecting a value");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNotNull(indenter22);
        org.junit.Assert.assertNotNull(indenter23);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertNotNull(jsonGenerator30);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test614");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        java.lang.Object obj6 = jsonParser3.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString9 = defaultPrettyPrinter8._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer11.resetWithShared(charArray12, 2000, 2000);
        int int17 = serializableString9.appendUnquoted(charArray12, 0);
        boolean boolean18 = jsonParser3.nextFieldName(serializableString9);
        com.fasterxml.jackson.core.Version version19 = jsonParser3.version();
        double double21 = jsonParser3.getValueAsDouble((double) (byte) -1);
        char[] charArray22 = jsonParser3.getTextCharacters();
        jsonParser3.clearCurrentToken();
        com.fasterxml.jackson.core.Version version24 = jsonParser3.version();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(serializableString9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertNotNull(version24);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test615");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 60);
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext19 = readerBasedJsonParser14.getParsingContext();
        java.lang.Object obj20 = readerBasedJsonParser14.getEmbeddedObject();
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = readerBasedJsonParser14.getCodec();
        java.lang.String str22 = readerBasedJsonParser14.nextTextValue();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1120326598) + "'", int13 == (-1120326598));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNotNull(jsonReadContext19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(objectCodec21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test616");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        boolean boolean4 = defaultPrettyPrinter3._spacesInObjectEntries;
        defaultPrettyPrinter3.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString9 = defaultPrettyPrinter8._rootSeparator;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter10 = defaultPrettyPrinter8._objectIndenter;
        defaultPrettyPrinter3.indentArraysWith(indenter10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(3);
        boolean boolean17 = jsonFactory13.isEnabled(feature14);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory(objectCodec18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean22 = feature20.enabledIn(3);
        boolean boolean23 = jsonFactory19.isEnabled(feature20);
        com.fasterxml.jackson.core.JsonParser.Feature feature24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory19.disable(feature24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory13.disable(feature24);
        java.io.OutputStream outputStream27 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = jsonFactory13.createGenerator(outputStream27);
        indenter10.writeIndentation(jsonGenerator28, (int) ' ');
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonGenerator28.setCodec(objectCodec31);
        int int33 = jsonGenerator28.getFeatureMask();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = jsonGenerator28.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.Base64Variant base64Variant35 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler36, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream40 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory(objectCodec41);
        com.fasterxml.jackson.core.JsonFactory.Feature feature43 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean45 = feature43.enabledIn(3);
        boolean boolean46 = jsonFactory42.isEnabled(feature43);
        com.fasterxml.jackson.core.JsonParser.Feature feature47 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = jsonFactory42.disable(feature47);
        java.io.OutputStream outputStream49 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator50 = jsonFactory42.createGenerator(outputStream49);
        com.fasterxml.jackson.core.io.IOContext iOContext51 = null;
        byte[] byteArray52 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper55 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext51, byteArray52, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser58 = jsonFactory42.createJsonParser(byteArray52, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = new com.fasterxml.jackson.core.JsonFactory(objectCodec59);
        com.fasterxml.jackson.core.JsonFactory.Feature feature61 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean63 = feature61.enabledIn(3);
        boolean boolean64 = jsonFactory60.isEnabled(feature61);
        com.fasterxml.jackson.core.JsonParser.Feature feature65 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory66 = jsonFactory60.disable(feature65);
        java.io.OutputStream outputStream67 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator68 = jsonFactory60.createGenerator(outputStream67);
        com.fasterxml.jackson.core.io.IOContext iOContext69 = null;
        byte[] byteArray70 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper73 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext69, byteArray70, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser76 = jsonFactory60.createJsonParser(byteArray70, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter78 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString79 = defaultPrettyPrinter78._rootSeparator;
        byte[] byteArray86 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int88 = serializableString79.appendQuotedUTF8(byteArray86, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser89 = jsonFactory60.createJsonParser(byteArray86);
        com.fasterxml.jackson.core.JsonParser jsonParser92 = jsonFactory42.createJsonParser(byteArray86, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream95 = new com.fasterxml.jackson.core.io.MergedStream(iOContext39, inputStream40, byteArray86, 10, 2000);
        // The following exception was thrown during execution in test generation
        try {
            int int97 = jsonGenerator28.writeBinary(base64Variant35, inputStream40, 1369160266);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableString9);
        org.junit.Assert.assertNotNull(indenter10);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 79 + "'", int33 == 79);
        org.junit.Assert.assertNotNull(jsonGenerator34);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature43.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertNotNull(jsonGenerator50);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser58);
        org.junit.Assert.assertTrue("'" + feature61 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature61.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + feature65 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature65.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory66);
        org.junit.Assert.assertNotNull(jsonGenerator68);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser76);
        org.junit.Assert.assertNotNull(serializableString79);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(jsonParser89);
        org.junit.Assert.assertNotNull(jsonParser92);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test617");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 60);
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext19 = readerBasedJsonParser14.getParsingContext();
        boolean boolean20 = jsonReadContext19.inObject();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 318325352 + "'", int13 == 318325352);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNotNull(jsonReadContext19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test618");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        boolean boolean15 = readerBasedJsonParser14.isClosed();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = readerBasedJsonParser14.getCurrentLocation();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = readerBasedJsonParser14.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2019872294) + "'", int13 == (-2019872294));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonLocation16);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test619");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        boolean boolean17 = readerBasedJsonParser14.getValueAsBoolean(true);
        boolean boolean18 = readerBasedJsonParser14.requiresCustomCodec();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-454456574) + "'", int13 == (-454456574));
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test620");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = readerBasedJsonParser14.getTokenLocation();
        int int18 = jsonLocation17.getLineNr();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1032688360 + "'", int13 == 1032688360);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jsonLocation17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test621");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory(objectCodec16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean20 = feature18.enabledIn(3);
        boolean boolean21 = jsonFactory17.isEnabled(feature18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = new com.fasterxml.jackson.core.JsonFactory(objectCodec22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean26 = feature24.enabledIn(3);
        boolean boolean27 = jsonFactory23.isEnabled(feature24);
        com.fasterxml.jackson.core.JsonParser.Feature feature28 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory23.disable(feature28);
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory17.disable(feature28);
        java.lang.String str31 = jsonFactory17.getFormatName();
        java.io.InputStream inputStream32 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory17.createParser(inputStream32);
        long long34 = jsonParser33.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory(objectCodec35);
        java.io.Reader reader37 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory36.createParser(reader37);
        boolean boolean39 = jsonParser38.requiresCustomCodec();
        java.lang.String str40 = jsonParser38.getText();
        java.lang.Object obj41 = jsonParser38.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter43 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString44 = defaultPrettyPrinter43._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler45 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer46 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler45);
        char[] charArray47 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer46.resetWithShared(charArray47, 2000, 2000);
        int int52 = serializableString44.appendUnquoted(charArray47, 0);
        boolean boolean53 = jsonParser38.nextFieldName(serializableString44);
        com.fasterxml.jackson.core.Version version54 = jsonParser38.version();
        double double56 = jsonParser38.getValueAsDouble((double) (byte) -1);
        char[] charArray57 = jsonParser38.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = new com.fasterxml.jackson.core.JsonFactory(objectCodec58);
        com.fasterxml.jackson.core.JsonFactory.Feature feature60 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean62 = feature60.enabledIn(3);
        boolean boolean63 = jsonFactory59.isEnabled(feature60);
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory65 = new com.fasterxml.jackson.core.JsonFactory(objectCodec64);
        com.fasterxml.jackson.core.JsonFactory.Feature feature66 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean68 = feature66.enabledIn(3);
        boolean boolean69 = jsonFactory65.isEnabled(feature66);
        com.fasterxml.jackson.core.JsonParser.Feature feature70 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = jsonFactory65.disable(feature70);
        com.fasterxml.jackson.core.JsonFactory jsonFactory72 = jsonFactory59.disable(feature70);
        com.fasterxml.jackson.core.JsonParser jsonParser73 = jsonParser38.enable(feature70);
        com.fasterxml.jackson.core.JsonParser jsonParser75 = jsonParser33.configure(feature70, true);
        com.fasterxml.jackson.core.JsonParser jsonParser76 = readerBasedJsonParser14.enable(feature70);
        int int77 = readerBasedJsonParser14.getTextLength();
        boolean boolean79 = readerBasedJsonParser14.getValueAsBoolean(false);
        readerBasedJsonParser14.overrideCurrentName("");
        com.fasterxml.jackson.core.Base64Variant base64Variant82 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray83 = readerBasedJsonParser14.getBinaryValue(base64Variant82);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1042614294 + "'", int13 == 1042614294);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature28.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "JSON" + "'", str31, "JSON");
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(serializableString44);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(version54);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertNull(charArray57);
        org.junit.Assert.assertTrue("'" + feature60 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature60.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + feature66 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature66.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + feature70 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature70.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory71);
        org.junit.Assert.assertNotNull(jsonFactory72);
        org.junit.Assert.assertNotNull(jsonParser73);
        org.junit.Assert.assertNotNull(jsonParser75);
        org.junit.Assert.assertNotNull(jsonParser76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test622");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        textBuffer1.resetWithString("hi!");
        char[] charArray6 = textBuffer1.expandCurrentSegment();
        char[] charArray7 = textBuffer1.finishCurrentSegment();
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (-1702908467), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1702908467");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test623");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        boolean boolean17 = readerBasedJsonParser14.canUseSchema(formatSchema16);
        readerBasedJsonParser14.close();
        boolean boolean20 = readerBasedJsonParser14.getValueAsBoolean(true);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1334150402) + "'", int13 == (-1334150402));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test624");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = jsonFactory14.getCharacterEscapes();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator16 = jsonFactory14.getOutputDecorator();
        java.io.Writer writer17 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = jsonFactory14.createGenerator(writer17);
        com.fasterxml.jackson.core.JsonParser.Feature feature19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory14.configure(feature19, false);
        boolean boolean22 = jsonFactory14.requiresCustomCodec();
        boolean boolean23 = jsonFactory14.requiresCustomCodec();
        java.io.File file24 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory(objectCodec25);
        com.fasterxml.jackson.core.JsonFactory.Feature feature27 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean29 = feature27.enabledIn(3);
        boolean boolean30 = jsonFactory26.isEnabled(feature27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory(objectCodec31);
        com.fasterxml.jackson.core.JsonFactory.Feature feature33 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean35 = feature33.enabledIn(3);
        boolean boolean36 = jsonFactory32.isEnabled(feature33);
        com.fasterxml.jackson.core.JsonParser.Feature feature37 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory32.disable(feature37);
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = jsonFactory26.disable(feature37);
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = new com.fasterxml.jackson.core.JsonFactory(objectCodec40);
        com.fasterxml.jackson.core.JsonFactory.Feature feature42 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean44 = feature42.enabledIn(3);
        boolean boolean45 = jsonFactory41.isEnabled(feature42);
        com.fasterxml.jackson.core.JsonParser.Feature feature46 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = jsonFactory41.disable(feature46);
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = jsonFactory39.configure(feature46, true);
        java.lang.String str50 = jsonFactory39.getRootValueSeparator();
        com.fasterxml.jackson.core.io.SerializedString serializedString52 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray53 = serializedString52.asQuotedUTF8();
        java.lang.String str54 = serializedString52.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler55 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext58 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler55, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream59 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer60 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext58, outputStream59);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding61 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext58.setEncoding(jsonEncoding61);
        java.io.Reader reader64 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer66 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int68 = charsToNameCanonicalizer66.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser69 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext58, (-1697824632), reader64, objectCodec65, charsToNameCanonicalizer66);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder70 = readerBasedJsonParser69._getByteArrayBuilder();
        int int71 = serializedString52.writeUnquotedUTF8((java.io.OutputStream) byteArrayBuilder70);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding72 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator73 = jsonFactory39.createGenerator((java.io.OutputStream) byteArrayBuilder70, jsonEncoding72);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator74 = jsonFactory14.createGenerator(file24, jsonEncoding72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNull(characterEscapes15);
        org.junit.Assert.assertNull(outputDecorator16);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature19.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature27.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature42.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + feature46 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature46.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory47);
        org.junit.Assert.assertNotNull(jsonFactory49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + " " + "'", str50, " ");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\n" + "'", str54, "\n");
        org.junit.Assert.assertTrue("'" + jsonEncoding61 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding61.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer66);
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-81817826) + "'", int68 == (-81817826));
        org.junit.Assert.assertNotNull(byteArrayBuilder70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + jsonEncoding72 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_LE + "'", jsonEncoding72.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_LE));
        org.junit.Assert.assertNotNull(jsonGenerator73);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test625");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        java.lang.Object obj17 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler15, obj17, false);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = iOContext19.constructTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer20.append("", 1534427668, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1534427768");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertNotNull(textBuffer20);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test626");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = jsonFactory14.getCharacterEscapes();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory(objectCodec16);
        java.io.Reader reader18 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory17.createParser(reader18);
        boolean boolean20 = jsonParser19.requiresCustomCodec();
        java.lang.String str21 = jsonParser19.getText();
        java.lang.Object obj22 = jsonParser19.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter24 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString25 = defaultPrettyPrinter24._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        char[] charArray28 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer27.resetWithShared(charArray28, 2000, 2000);
        int int33 = serializableString25.appendUnquoted(charArray28, 0);
        boolean boolean34 = jsonParser19.nextFieldName(serializableString25);
        com.fasterxml.jackson.core.Version version35 = jsonParser19.version();
        double double37 = jsonParser19.getValueAsDouble((double) (byte) -1);
        char[] charArray38 = jsonParser19.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = new com.fasterxml.jackson.core.JsonFactory(objectCodec39);
        com.fasterxml.jackson.core.JsonFactory.Feature feature41 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean43 = feature41.enabledIn(3);
        boolean boolean44 = jsonFactory40.isEnabled(feature41);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory(objectCodec45);
        com.fasterxml.jackson.core.JsonFactory.Feature feature47 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean49 = feature47.enabledIn(3);
        boolean boolean50 = jsonFactory46.isEnabled(feature47);
        com.fasterxml.jackson.core.JsonParser.Feature feature51 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = jsonFactory46.disable(feature51);
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = jsonFactory40.disable(feature51);
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonParser19.enable(feature51);
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = jsonFactory14.enable(feature51);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler56 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = new com.fasterxml.jackson.core.JsonFactory(objectCodec57);
        com.fasterxml.jackson.core.JsonFactory.Feature feature59 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean61 = feature59.enabledIn(3);
        boolean boolean62 = jsonFactory58.isEnabled(feature59);
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory64 = new com.fasterxml.jackson.core.JsonFactory(objectCodec63);
        com.fasterxml.jackson.core.JsonFactory.Feature feature65 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean67 = feature65.enabledIn(3);
        boolean boolean68 = jsonFactory64.isEnabled(feature65);
        com.fasterxml.jackson.core.JsonParser.Feature feature69 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory70 = jsonFactory64.disable(feature69);
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = jsonFactory58.disable(feature69);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler72 = jsonFactory71._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer73 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler72);
        java.lang.Object obj74 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext76 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler72, obj74, false);
        byte[][] byteArray77 = bufferRecycler72._byteBuffers;
        com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType byteBufferType78 = com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER;
        byte[] byteArray79 = null;
        bufferRecycler72.releaseByteBuffer(byteBufferType78, byteArray79);
        byte[] byteArray81 = bufferRecycler56.allocByteBuffer(byteBufferType78);
        com.fasterxml.jackson.core.JsonParser jsonParser82 = jsonFactory14.createParser(byteArray81);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNull(characterEscapes15);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(serializableString25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertNull(charArray38);
        org.junit.Assert.assertTrue("'" + feature41 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature41.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory52);
        org.junit.Assert.assertNotNull(jsonFactory53);
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertNotNull(jsonFactory55);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature59.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + feature65 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature65.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + feature69 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature69.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory70);
        org.junit.Assert.assertNotNull(jsonFactory71);
        org.junit.Assert.assertNotNull(bufferRecycler72);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertTrue("'" + byteBufferType78 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER + "'", byteBufferType78.equals(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER));
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertNotNull(jsonParser82);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test627");
        boolean boolean2 = com.fasterxml.jackson.core.io.NumberInput.inLongRange("com.fasterxml.jackson.core.JsonParseException: \n at [Source: UNKNOWN; line: 1, column: 1]", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test628");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createJsonParser(inputStream2);
        java.lang.Object obj4 = jsonParser3.getEmbeddedObject();
        java.lang.String str5 = jsonParser3.nextTextValue();
        boolean boolean7 = jsonParser3.getValueAsBoolean(true);
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = null;
        boolean boolean9 = jsonParser3.canUseSchema(formatSchema8);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test629");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        java.lang.Object obj6 = jsonParser3.getObjectId();
        boolean boolean7 = jsonParser3.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonParser3.skipChildren();
        java.lang.String str9 = jsonParser3.getValueAsString();
        jsonParser3.close();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory(objectCodec11);
        com.fasterxml.jackson.core.JsonFactory.Feature feature13 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean15 = feature13.enabledIn(3);
        boolean boolean16 = jsonFactory12.isEnabled(feature13);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory(objectCodec17);
        com.fasterxml.jackson.core.JsonFactory.Feature feature19 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean21 = feature19.enabledIn(3);
        boolean boolean22 = jsonFactory18.isEnabled(feature19);
        com.fasterxml.jackson.core.JsonParser.Feature feature23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory18.disable(feature23);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory12.disable(feature23);
        int int26 = feature23.getMask();
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonParser3.configure(feature23, false);
        int int29 = jsonParser3.getFeatureMask();
        java.lang.Object obj30 = jsonParser3.getEmbeddedObject();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature13.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test630");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec2 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext6 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler3, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream7 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer8 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext6, outputStream7);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext14 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler11, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream15 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer16 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext14, outputStream15);
        uTF8Writer16.flush();
        java.io.Writer writer19 = uTF8Writer16.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator20 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext6, (-1703009269), objectCodec10, (java.io.Writer) uTF8Writer16);
        uTF8Writer16.flush();
        java.io.Writer writer23 = uTF8Writer16.append('a');
        uTF8Writer16.close();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        textBuffer26.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer30 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler29);
        textBuffer30.append(' ');
        textBuffer30.resetWithString("hi!");
        char[] charArray35 = textBuffer30.finishCurrentSegment();
        textBuffer26.append(charArray35, (int) (short) 1, 100);
        uTF8Writer16.write(charArray35, (-836894420), 0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator42 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext0, (-805819384), objectCodec2, (java.io.Writer) uTF8Writer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer19);
        org.junit.Assert.assertNotNull(writer23);
        org.junit.Assert.assertNotNull(charArray35);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test631");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        int int16 = readerBasedJsonParser14.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = readerBasedJsonParser14.getCodec();
        com.fasterxml.jackson.core.Version version18 = readerBasedJsonParser14.version();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 937975764 + "'", int13 == 937975764);
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(objectCodec17);
        org.junit.Assert.assertNotNull(version18);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test632");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter2 = lf2SpacesIndenter0.withLinefeed("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext6 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler3, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream7 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer8 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext6, outputStream7);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext14 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler11, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream15 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer16 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext14, outputStream15);
        uTF8Writer16.flush();
        java.io.Writer writer19 = uTF8Writer16.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator20 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext6, (-1703009269), objectCodec10, (java.io.Writer) uTF8Writer16);
        com.fasterxml.jackson.core.io.SerializedString serializedString22 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str23 = serializedString22.toString();
        char[] charArray24 = new char[] {};
        int int26 = serializedString22.appendQuoted(charArray24, (int) (byte) 10);
        byte[] byteArray27 = serializedString22.asQuotedUTF8();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = writerBasedJsonGenerator20.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString22);
        lf2SpacesIndenter2.writeIndentation(jsonGenerator28, (-1703009269));
        jsonGenerator28.close();
        jsonGenerator28.flush();
        org.junit.Assert.assertNotNull(lf2SpacesIndenter0);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter2);
        org.junit.Assert.assertNotNull(writer19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[92, 110]");
        org.junit.Assert.assertNotNull(jsonGenerator28);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test633");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory14._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        java.lang.Object obj17 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler15, obj17, false);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = iOContext19.constructTextBuffer();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = iOContext19.constructTextBuffer();
        java.io.InputStream inputStream22 = null;
        byte[] byteArray23 = null;
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader27 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext19, inputStream22, byteArray23, (-123811790), 582370450, false);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertNotNull(textBuffer20);
        org.junit.Assert.assertNotNull(textBuffer21);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test634");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler1 = jsonFactory0._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer2 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler1);
        org.junit.Assert.assertNotNull(bufferRecycler1);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test635");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonLocation jsonLocation20 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) feature15, 0L, (long) (byte) 1, 10, (int) (short) -1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory14.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory22.enable(feature23);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes25 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory22.setCharacterEscapes(characterEscapes25);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator27 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory26.setOutputDecorator(outputDecorator27);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter30 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter32 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString33 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter34 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter32, serializableString33);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory(objectCodec35);
        com.fasterxml.jackson.core.JsonFactory.Feature feature37 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean39 = feature37.enabledIn(3);
        boolean boolean40 = jsonFactory36.isEnabled(feature37);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory(objectCodec41);
        com.fasterxml.jackson.core.JsonFactory.Feature feature43 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean45 = feature43.enabledIn(3);
        boolean boolean46 = jsonFactory42.isEnabled(feature43);
        com.fasterxml.jackson.core.JsonParser.Feature feature47 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = jsonFactory42.disable(feature47);
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = jsonFactory36.disable(feature47);
        java.io.OutputStream outputStream50 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator51 = jsonFactory36.createGenerator(outputStream50);
        defaultPrettyPrinter34.writeStartArray(jsonGenerator51);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter53 = jsonGenerator51.getPrettyPrinter();
        defaultPrettyPrinter30.writeEndArray(jsonGenerator51, (int) (byte) -1);
        com.fasterxml.jackson.core.io.IOContext iOContext56 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = new com.fasterxml.jackson.core.JsonFactory(objectCodec57);
        com.fasterxml.jackson.core.JsonFactory.Feature feature59 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean61 = feature59.enabledIn(3);
        boolean boolean62 = jsonFactory58.isEnabled(feature59);
        com.fasterxml.jackson.core.JsonParser.Feature feature63 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory64 = jsonFactory58.disable(feature63);
        java.io.OutputStream outputStream65 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator66 = jsonFactory58.createGenerator(outputStream65);
        com.fasterxml.jackson.core.io.IOContext iOContext67 = null;
        byte[] byteArray68 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper71 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext67, byteArray68, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser74 = jsonFactory58.createJsonParser(byteArray68, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter76 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString77 = defaultPrettyPrinter76._rootSeparator;
        byte[] byteArray84 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int86 = serializableString77.appendQuotedUTF8(byteArray84, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser87 = jsonFactory58.createJsonParser(byteArray84);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper90 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext56, byteArray84, (int) ' ', 64);
        jsonGenerator51.writeBinary(byteArray84);
        com.fasterxml.jackson.core.JsonParser jsonParser94 = jsonFactory28.createJsonParser(byteArray84, 466749574, (-1455327872));
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature43.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertNotNull(jsonFactory49);
        org.junit.Assert.assertNotNull(jsonGenerator51);
        org.junit.Assert.assertNull(prettyPrinter53);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature59.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + feature63 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature63.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory64);
        org.junit.Assert.assertNotNull(jsonGenerator66);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser74);
        org.junit.Assert.assertNotNull(serializableString77);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(jsonParser87);
        org.junit.Assert.assertNotNull(jsonParser94);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test636");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        int int4 = textBuffer1.size();
        char[] charArray5 = textBuffer1.finishCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray5, (-1149880434), 422418820);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Bad offset or len arguments for char[] input.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test637");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        java.lang.Object obj6 = jsonParser3.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString9 = defaultPrettyPrinter8._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer11.resetWithShared(charArray12, 2000, 2000);
        int int17 = serializableString9.appendUnquoted(charArray12, 0);
        boolean boolean18 = jsonParser3.nextFieldName(serializableString9);
        com.fasterxml.jackson.core.Version version19 = jsonParser3.version();
        double double21 = jsonParser3.getValueAsDouble((double) (byte) -1);
        char[] charArray22 = jsonParser3.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory(objectCodec23);
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(3);
        boolean boolean28 = jsonFactory24.isEnabled(feature25);
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = new com.fasterxml.jackson.core.JsonFactory(objectCodec29);
        com.fasterxml.jackson.core.JsonFactory.Feature feature31 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean33 = feature31.enabledIn(3);
        boolean boolean34 = jsonFactory30.isEnabled(feature31);
        com.fasterxml.jackson.core.JsonParser.Feature feature35 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory30.disable(feature35);
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory24.disable(feature35);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonParser3.enable(feature35);
        double double39 = jsonParser38.getValueAsDouble();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext40 = jsonParser38.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            long long41 = jsonParser38.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(serializableString9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(version19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature31.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature35.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(jsonStreamContext40);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test638");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonLocation jsonLocation20 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) feature15, 0L, (long) (byte) 1, 10, (int) (short) -1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory14.configure(feature15, true);
        java.lang.String str23 = jsonFactory22.getRootValueSeparator();
        com.fasterxml.jackson.core.io.SerializedString serializedString25 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str26 = serializedString25.toString();
        char[] charArray27 = new char[] {};
        int int29 = serializedString25.appendQuoted(charArray27, (int) (byte) 10);
        byte[] byteArray30 = serializedString25.asQuotedUTF8();
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory22.createParser(byteArray30, 1777036280, (-1702999849));
        com.fasterxml.jackson.core.Version version34 = jsonFactory22.version();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " " + "'", str23, " ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n" + "'", str26, "\n");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[92, 110]");
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(version34);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test639");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory1.createParser("\n");
        int int13 = jsonParser11.getValueAsInt(1000);
        com.fasterxml.jackson.core.JsonParser.Feature feature14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser11.disable(feature14);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonParser15.disable(feature16);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature14.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonParser17);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test640");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(3);
        boolean boolean17 = jsonFactory13.isEnabled(feature14);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory13.disable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory7.disable(feature18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = jsonFactory20._getBufferRecycler();
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = new com.fasterxml.jackson.core.JsonFactory(objectCodec22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean26 = feature24.enabledIn(3);
        boolean boolean27 = jsonFactory23.isEnabled(feature24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory(objectCodec28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean32 = feature30.enabledIn(3);
        boolean boolean33 = jsonFactory29.isEnabled(feature30);
        com.fasterxml.jackson.core.JsonParser.Feature feature34 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory29.disable(feature34);
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory23.disable(feature34);
        java.lang.String str37 = jsonFactory23.getFormatName();
        java.io.InputStream inputStream38 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonFactory23.createParser(inputStream38);
        long long40 = jsonParser39.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory(objectCodec41);
        java.io.Reader reader43 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory42.createParser(reader43);
        boolean boolean45 = jsonParser44.requiresCustomCodec();
        java.lang.String str46 = jsonParser44.getText();
        java.lang.Object obj47 = jsonParser44.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter49 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString50 = defaultPrettyPrinter49._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer52 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler51);
        char[] charArray53 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer52.resetWithShared(charArray53, 2000, 2000);
        int int58 = serializableString50.appendUnquoted(charArray53, 0);
        boolean boolean59 = jsonParser44.nextFieldName(serializableString50);
        com.fasterxml.jackson.core.Version version60 = jsonParser44.version();
        double double62 = jsonParser44.getValueAsDouble((double) (byte) -1);
        char[] charArray63 = jsonParser44.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory65 = new com.fasterxml.jackson.core.JsonFactory(objectCodec64);
        com.fasterxml.jackson.core.JsonFactory.Feature feature66 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean68 = feature66.enabledIn(3);
        boolean boolean69 = jsonFactory65.isEnabled(feature66);
        com.fasterxml.jackson.core.ObjectCodec objectCodec70 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = new com.fasterxml.jackson.core.JsonFactory(objectCodec70);
        com.fasterxml.jackson.core.JsonFactory.Feature feature72 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean74 = feature72.enabledIn(3);
        boolean boolean75 = jsonFactory71.isEnabled(feature72);
        com.fasterxml.jackson.core.JsonParser.Feature feature76 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory77 = jsonFactory71.disable(feature76);
        com.fasterxml.jackson.core.JsonFactory jsonFactory78 = jsonFactory65.disable(feature76);
        com.fasterxml.jackson.core.JsonParser jsonParser79 = jsonParser44.enable(feature76);
        com.fasterxml.jackson.core.JsonParser jsonParser81 = jsonParser39.configure(feature76, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory82 = jsonFactory20.enable(feature76);
        com.fasterxml.jackson.core.JsonFactory jsonFactory83 = jsonFactory1.disable(feature76);
        com.fasterxml.jackson.core.JsonParser.Feature feature84 = com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE;
        com.fasterxml.jackson.core.JsonFactory jsonFactory85 = jsonFactory1.disable(feature84);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(bufferRecycler21);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "JSON" + "'", str37, "JSON");
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(serializableString50);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(version60);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1.0d) + "'", double62 == (-1.0d));
        org.junit.Assert.assertNull(charArray63);
        org.junit.Assert.assertTrue("'" + feature66 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature66.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + feature72 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature72.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + feature76 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature76.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory77);
        org.junit.Assert.assertNotNull(jsonFactory78);
        org.junit.Assert.assertNotNull(jsonParser79);
        org.junit.Assert.assertNotNull(jsonParser81);
        org.junit.Assert.assertNotNull(jsonFactory82);
        org.junit.Assert.assertNotNull(jsonFactory83);
        org.junit.Assert.assertTrue("'" + feature84 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE + "'", feature84.equals(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE));
        org.junit.Assert.assertNotNull(jsonFactory85);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test641");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        boolean boolean15 = readerBasedJsonParser14.isClosed();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = readerBasedJsonParser14.getCurrentLocation();
        readerBasedJsonParser14.overrideCurrentName("2.2250738585072012e-308");
        com.fasterxml.jackson.core.JsonLocation jsonLocation19 = readerBasedJsonParser14.getCurrentLocation();
        readerBasedJsonParser14.clearCurrentToken();
        readerBasedJsonParser14.overrideCurrentName("");
        long long24 = readerBasedJsonParser14.nextLongValue((long) 33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = readerBasedJsonParser14.getNumberValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1307478418) + "'", int13 == (-1307478418));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonLocation16);
        org.junit.Assert.assertNotNull(jsonLocation19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 33L + "'", long24 == 33L);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test642");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createJsonParser(inputStream2);
        java.lang.Object obj4 = jsonParser3.getEmbeddedObject();
        int int5 = jsonParser3.getTextLength();
        char[] charArray6 = jsonParser3.getTextCharacters();
        boolean boolean8 = jsonParser3.getValueAsBoolean(false);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test643");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory1.disable(feature6);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory1.createGenerator(outputStream8);
        com.fasterxml.jackson.core.io.IOContext iOContext10 = null;
        byte[] byteArray11 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper14 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext10, byteArray11, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory1.createJsonParser(byteArray11, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter19 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString20 = defaultPrettyPrinter19._rootSeparator;
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int29 = serializableString20.appendQuotedUTF8(byteArray27, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory1.createJsonParser(byteArray27);
        com.fasterxml.jackson.core.JsonLocation jsonLocation31 = jsonParser30.getTokenLocation();
        long long32 = jsonLocation31.getByteOffset();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(serializableString20);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonLocation31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test644");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream4 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory(objectCodec5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean9 = feature7.enabledIn(3);
        boolean boolean10 = jsonFactory6.isEnabled(feature7);
        com.fasterxml.jackson.core.JsonParser.Feature feature11 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory6.disable(feature11);
        java.io.OutputStream outputStream13 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = jsonFactory6.createGenerator(outputStream13);
        com.fasterxml.jackson.core.io.IOContext iOContext15 = null;
        byte[] byteArray16 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper19 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext15, byteArray16, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory6.createJsonParser(byteArray16, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory(objectCodec23);
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(3);
        boolean boolean28 = jsonFactory24.isEnabled(feature25);
        com.fasterxml.jackson.core.JsonParser.Feature feature29 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory24.disable(feature29);
        java.io.OutputStream outputStream31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory24.createGenerator(outputStream31);
        com.fasterxml.jackson.core.io.IOContext iOContext33 = null;
        byte[] byteArray34 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper37 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext33, byteArray34, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory24.createJsonParser(byteArray34, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter42 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString43 = defaultPrettyPrinter42._rootSeparator;
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int52 = serializableString43.appendQuotedUTF8(byteArray50, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory24.createJsonParser(byteArray50);
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory6.createJsonParser(byteArray50, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream59 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray50, 10, 2000);
        char[] charArray60 = iOContext3.allocConcatBuffer();
        java.io.InputStream inputStream61 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken62 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        byte[] byteArray63 = jsonToken62.asByteArray();
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader67 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, inputStream61, byteArray63, (-1725440914), (-247165502), false);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + feature11 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature11.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(jsonGenerator14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature29.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNotNull(serializableString43);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertTrue("'" + jsonToken62 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken62.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[110, 117, 108, 108]");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test645");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream12 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer13 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext11, outputStream12);
        uTF8Writer13.flush();
        java.io.Writer writer16 = uTF8Writer13.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1703009269), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        writerBasedJsonGenerator17.writeRaw("com.fasterxml.jackson.core.JsonParseException: \n\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext21 = writerBasedJsonGenerator17.getOutputContext();
        writerBasedJsonGenerator17.writeStartObject();
        com.fasterxml.jackson.core.io.SerializedString serializedString24 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str25 = serializedString24.toString();
        int int26 = serializedString24.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext30 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream31 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer32 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext30, outputStream31);
        byte[] byteArray33 = iOContext30.allocReadIOBuffer();
        int int35 = serializedString24.appendQuotedUTF8(byteArray33, 3);
        writerBasedJsonGenerator17.writeFieldName((com.fasterxml.jackson.core.SerializableString) serializedString24);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter37 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter((com.fasterxml.jackson.core.SerializableString) serializedString24);
        defaultPrettyPrinter37.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter40 = null;
        defaultPrettyPrinter37._arrayIndenter = indenter40;
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = new com.fasterxml.jackson.core.JsonFactory(objectCodec42);
        com.fasterxml.jackson.core.JsonFactory.Feature feature44 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean46 = feature44.enabledIn(3);
        boolean boolean47 = jsonFactory43.isEnabled(feature44);
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = new com.fasterxml.jackson.core.JsonFactory(objectCodec48);
        com.fasterxml.jackson.core.JsonFactory.Feature feature50 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean52 = feature50.enabledIn(3);
        boolean boolean53 = jsonFactory49.isEnabled(feature50);
        com.fasterxml.jackson.core.JsonParser.Feature feature54 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = jsonFactory49.disable(feature54);
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory43.disable(feature54);
        java.io.OutputStream outputStream57 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator58 = jsonFactory43.createGenerator(outputStream57);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature59 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean60 = feature59.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator61 = jsonGenerator58.enable(feature59);
        // The following exception was thrown during execution in test generation
        try {
            defaultPrettyPrinter37.writeStartArray(jsonGenerator58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(jsonWriteContext21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature44.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + feature50 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature50.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + feature54 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature54.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory55);
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(jsonGenerator58);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature59.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jsonGenerator61);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test646");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        byte[] byteArray6 = iOContext3.allocReadIOBuffer();
        char[] charArray7 = iOContext3.allocTokenBuffer();
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding8 = null;
        iOContext3.setEncoding(jsonEncoding8);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext13 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler10, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream14 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer15 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext13, outputStream14);
        byte[] byteArray16 = iOContext13.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext20 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler17, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream21 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = new com.fasterxml.jackson.core.JsonFactory(objectCodec22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean26 = feature24.enabledIn(3);
        boolean boolean27 = jsonFactory23.isEnabled(feature24);
        com.fasterxml.jackson.core.JsonParser.Feature feature28 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory23.disable(feature28);
        java.io.OutputStream outputStream30 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = jsonFactory23.createGenerator(outputStream30);
        com.fasterxml.jackson.core.io.IOContext iOContext32 = null;
        byte[] byteArray33 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper36 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext32, byteArray33, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonFactory23.createJsonParser(byteArray33, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = new com.fasterxml.jackson.core.JsonFactory(objectCodec40);
        com.fasterxml.jackson.core.JsonFactory.Feature feature42 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean44 = feature42.enabledIn(3);
        boolean boolean45 = jsonFactory41.isEnabled(feature42);
        com.fasterxml.jackson.core.JsonParser.Feature feature46 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = jsonFactory41.disable(feature46);
        java.io.OutputStream outputStream48 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator49 = jsonFactory41.createGenerator(outputStream48);
        com.fasterxml.jackson.core.io.IOContext iOContext50 = null;
        byte[] byteArray51 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper54 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext50, byteArray51, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser57 = jsonFactory41.createJsonParser(byteArray51, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter59 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString60 = defaultPrettyPrinter59._rootSeparator;
        byte[] byteArray67 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int69 = serializableString60.appendQuotedUTF8(byteArray67, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser70 = jsonFactory41.createJsonParser(byteArray67);
        com.fasterxml.jackson.core.JsonParser jsonParser73 = jsonFactory23.createJsonParser(byteArray67, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream76 = new com.fasterxml.jackson.core.io.MergedStream(iOContext20, inputStream21, byteArray67, 10, 2000);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter78 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString79 = defaultPrettyPrinter78._rootSeparator;
        byte[] byteArray86 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int88 = serializableString79.appendQuotedUTF8(byteArray86, (int) (byte) 100);
        com.fasterxml.jackson.core.io.MergedStream mergedStream91 = new com.fasterxml.jackson.core.io.MergedStream(iOContext13, inputStream21, byteArray86, (-1038366032), (int) (short) -1);
        boolean boolean92 = mergedStream91.markSupported();
        byte[] byteArray93 = null;
        com.fasterxml.jackson.core.io.MergedStream mergedStream96 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, (java.io.InputStream) mergedStream91, byteArray93, (int) (byte) 1, 4);
        boolean boolean97 = mergedStream91.markSupported();
        mergedStream91.reset();
        // The following exception was thrown during execution in test generation
        try {
            mergedStream91.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature28.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature42.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + feature46 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature46.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory47);
        org.junit.Assert.assertNotNull(jsonGenerator49);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser57);
        org.junit.Assert.assertNotNull(serializableString60);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(jsonParser70);
        org.junit.Assert.assertNotNull(jsonParser73);
        org.junit.Assert.assertNotNull(serializableString79);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test647");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        java.lang.Object obj6 = jsonParser3.getObjectId();
        boolean boolean7 = jsonParser3.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonParser3.skipChildren();
        java.lang.String str9 = jsonParser8.nextTextValue();
        com.fasterxml.jackson.core.JsonLocation jsonLocation10 = jsonParser8.getCurrentLocation();
        long long11 = jsonLocation10.getByteOffset();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(jsonLocation10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test648");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream4 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory(objectCodec5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean9 = feature7.enabledIn(3);
        boolean boolean10 = jsonFactory6.isEnabled(feature7);
        com.fasterxml.jackson.core.JsonParser.Feature feature11 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory6.disable(feature11);
        java.io.OutputStream outputStream13 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = jsonFactory6.createGenerator(outputStream13);
        com.fasterxml.jackson.core.io.IOContext iOContext15 = null;
        byte[] byteArray16 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper19 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext15, byteArray16, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory6.createJsonParser(byteArray16, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory(objectCodec23);
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(3);
        boolean boolean28 = jsonFactory24.isEnabled(feature25);
        com.fasterxml.jackson.core.JsonParser.Feature feature29 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory24.disable(feature29);
        java.io.OutputStream outputStream31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory24.createGenerator(outputStream31);
        com.fasterxml.jackson.core.io.IOContext iOContext33 = null;
        byte[] byteArray34 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper37 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext33, byteArray34, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory24.createJsonParser(byteArray34, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter42 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString43 = defaultPrettyPrinter42._rootSeparator;
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int52 = serializableString43.appendQuotedUTF8(byteArray50, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory24.createJsonParser(byteArray50);
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory6.createJsonParser(byteArray50, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream59 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray50, 10, 2000);
        char[] charArray60 = iOContext3.allocConcatBuffer();
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler63 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext66 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler63, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream67 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer68 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext66, outputStream67);
        com.fasterxml.jackson.core.ObjectCodec objectCodec70 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler71 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext74 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler71, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream75 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer76 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext74, outputStream75);
        uTF8Writer76.flush();
        java.io.Writer writer79 = uTF8Writer76.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator80 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext66, (-1703009269), objectCodec70, (java.io.Writer) uTF8Writer76);
        uTF8Writer76.flush();
        java.lang.CharSequence charSequence82 = null;
        java.io.Writer writer83 = uTF8Writer76.append(charSequence82);
        uTF8Writer76.write(33);
        java.io.Writer writer87 = uTF8Writer76.append((java.lang.CharSequence) "null");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator88 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, 0, objectCodec62, (java.io.Writer) uTF8Writer76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Trying to call same allocXxx() method second time");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + feature11 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature11.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(jsonGenerator14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature29.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNotNull(serializableString43);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertNotNull(writer79);
        org.junit.Assert.assertNotNull(writer83);
        org.junit.Assert.assertNotNull(writer87);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test649");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        byte[] byteArray6 = iOContext3.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(3);
        boolean boolean17 = jsonFactory13.isEnabled(feature14);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory13.disable(feature18);
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory13.createGenerator(outputStream20);
        com.fasterxml.jackson.core.io.IOContext iOContext22 = null;
        byte[] byteArray23 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper26 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext22, byteArray23, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory13.createJsonParser(byteArray23, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory(objectCodec30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean34 = feature32.enabledIn(3);
        boolean boolean35 = jsonFactory31.isEnabled(feature32);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory31.disable(feature36);
        java.io.OutputStream outputStream38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonFactory31.createGenerator(outputStream38);
        com.fasterxml.jackson.core.io.IOContext iOContext40 = null;
        byte[] byteArray41 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper44 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext40, byteArray41, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory31.createJsonParser(byteArray41, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter49 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString50 = defaultPrettyPrinter49._rootSeparator;
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int59 = serializableString50.appendQuotedUTF8(byteArray57, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory31.createJsonParser(byteArray57);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory13.createJsonParser(byteArray57, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream66 = new com.fasterxml.jackson.core.io.MergedStream(iOContext10, inputStream11, byteArray57, 10, 2000);
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory68 = new com.fasterxml.jackson.core.JsonFactory(objectCodec67);
        com.fasterxml.jackson.core.JsonFactory.Feature feature69 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean71 = feature69.enabledIn(3);
        boolean boolean72 = jsonFactory68.isEnabled(feature69);
        com.fasterxml.jackson.core.JsonParser.Feature feature73 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory74 = jsonFactory68.disable(feature73);
        java.io.OutputStream outputStream75 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator76 = jsonFactory68.createGenerator(outputStream75);
        com.fasterxml.jackson.core.io.IOContext iOContext77 = null;
        byte[] byteArray78 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper81 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext77, byteArray78, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser84 = jsonFactory68.createJsonParser(byteArray78, 1, (int) (short) 100);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader88 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, (java.io.InputStream) mergedStream66, byteArray78, (int) (short) -1, 1000, true);
        boolean boolean89 = uTF32Reader88.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int90 = uTF32Reader88.read();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(serializableString50);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertTrue("'" + feature69 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature69.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + feature73 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature73.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory74);
        org.junit.Assert.assertNotNull(jsonGenerator76);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test650");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        boolean boolean16 = readerBasedJsonParser14.hasTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = readerBasedJsonParser14.getCodec();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext21 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler18, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer23 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext21, outputStream22);
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream30 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer31 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext29, outputStream30);
        uTF8Writer31.flush();
        java.io.Writer writer34 = uTF8Writer31.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator35 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext21, (-1703009269), objectCodec25, (java.io.Writer) uTF8Writer31);
        uTF8Writer31.flush();
        java.io.Writer writer38 = uTF8Writer31.append('a');
        uTF8Writer31.close();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        textBuffer41.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler44 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer45 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler44);
        textBuffer45.append(' ');
        textBuffer45.resetWithString("hi!");
        char[] charArray50 = textBuffer45.finishCurrentSegment();
        textBuffer41.append(charArray50, (int) (short) 1, 100);
        uTF8Writer31.write(charArray50, (-836894420), 0);
        int int57 = readerBasedJsonParser14.releaseBuffered((java.io.Writer) uTF8Writer31);
        uTF8Writer31.write((-1757572362));
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1972242032 + "'", int13 == 1972242032);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(objectCodec17);
        org.junit.Assert.assertNotNull(writer34);
        org.junit.Assert.assertNotNull(writer38);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test651");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler1 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext4 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler1, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer6 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext4, outputStream5);
        byte[] byteArray7 = iOContext4.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream12 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory(objectCodec13);
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean17 = feature15.enabledIn(3);
        boolean boolean18 = jsonFactory14.isEnabled(feature15);
        com.fasterxml.jackson.core.JsonParser.Feature feature19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory14.disable(feature19);
        java.io.OutputStream outputStream21 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = jsonFactory14.createGenerator(outputStream21);
        com.fasterxml.jackson.core.io.IOContext iOContext23 = null;
        byte[] byteArray24 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper27 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext23, byteArray24, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory14.createJsonParser(byteArray24, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory(objectCodec31);
        com.fasterxml.jackson.core.JsonFactory.Feature feature33 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean35 = feature33.enabledIn(3);
        boolean boolean36 = jsonFactory32.isEnabled(feature33);
        com.fasterxml.jackson.core.JsonParser.Feature feature37 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory32.disable(feature37);
        java.io.OutputStream outputStream39 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator40 = jsonFactory32.createGenerator(outputStream39);
        com.fasterxml.jackson.core.io.IOContext iOContext41 = null;
        byte[] byteArray42 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper45 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext41, byteArray42, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonFactory32.createJsonParser(byteArray42, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter50 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString51 = defaultPrettyPrinter50._rootSeparator;
        byte[] byteArray58 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int60 = serializableString51.appendQuotedUTF8(byteArray58, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser61 = jsonFactory32.createJsonParser(byteArray58);
        com.fasterxml.jackson.core.JsonParser jsonParser64 = jsonFactory14.createJsonParser(byteArray58, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream67 = new com.fasterxml.jackson.core.io.MergedStream(iOContext11, inputStream12, byteArray58, 10, 2000);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter69 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString70 = defaultPrettyPrinter69._rootSeparator;
        byte[] byteArray77 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int79 = serializableString70.appendQuotedUTF8(byteArray77, (int) (byte) 100);
        com.fasterxml.jackson.core.io.MergedStream mergedStream82 = new com.fasterxml.jackson.core.io.MergedStream(iOContext4, inputStream12, byteArray77, (-1038366032), (int) (short) -1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler83 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext86 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler83, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream87 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer88 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext86, outputStream87);
        byte[] byteArray89 = iOContext86.allocReadIOBuffer();
        com.fasterxml.jackson.core.io.MergedStream mergedStream92 = new com.fasterxml.jackson.core.io.MergedStream(iOContext0, inputStream12, byteArray89, (int) 'a', (-1038366032));
        mergedStream92.reset();
        int int94 = mergedStream92.available();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonGenerator40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertNotNull(serializableString51);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(jsonParser61);
        org.junit.Assert.assertNotNull(jsonParser64);
        org.junit.Assert.assertNotNull(serializableString70);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1038366129) + "'", int94 == (-1038366129));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test652");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean4 = feature2.enabledIn(3);
        boolean boolean5 = jsonFactory1.isEnabled(feature2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory(objectCodec6);
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean10 = feature8.enabledIn(3);
        boolean boolean11 = jsonFactory7.isEnabled(feature8);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory7.disable(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory1.disable(feature12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory(objectCodec15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean19 = feature17.enabledIn(3);
        boolean boolean20 = jsonFactory16.isEnabled(feature17);
        com.fasterxml.jackson.core.JsonParser.Feature feature21 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory16.disable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory14.configure(feature21, true);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext28 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler25, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream29 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer30 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext28, outputStream29);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding31 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext28.setEncoding(jsonEncoding31);
        java.io.Reader reader34 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer36 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int38 = charsToNameCanonicalizer36.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser39 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext28, (-1697824632), reader34, objectCodec35, charsToNameCanonicalizer36);
        int int40 = readerBasedJsonParser39.getTextLength();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder41 = readerBasedJsonParser39._getByteArrayBuilder();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = jsonFactory14.createJsonGenerator((java.io.OutputStream) byteArrayBuilder41);
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory14.createParser("[Source: INTERN_FIELD_NAMES; line: 10, column: -1]");
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertTrue("'" + jsonEncoding31 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding31.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer36);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 545789388 + "'", int38 == 545789388);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArrayBuilder41);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertNotNull(jsonParser44);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test653");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter0 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString3 = defaultPrettyPrinter2._rootSeparator;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter4 = defaultPrettyPrinter2._objectIndenter;
        defaultPrettyPrinter0._objectIndenter = indenter4;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter6 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter8 = lf2SpacesIndenter6.withLinefeed("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler9, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream13 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer14 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext12, outputStream13);
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext20 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler17, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream21 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer22 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext20, outputStream21);
        uTF8Writer22.flush();
        java.io.Writer writer25 = uTF8Writer22.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator26 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext12, (-1703009269), objectCodec16, (java.io.Writer) uTF8Writer22);
        com.fasterxml.jackson.core.io.SerializedString serializedString28 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str29 = serializedString28.toString();
        char[] charArray30 = new char[] {};
        int int32 = serializedString28.appendQuoted(charArray30, (int) (byte) 10);
        byte[] byteArray33 = serializedString28.asQuotedUTF8();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = writerBasedJsonGenerator26.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString28);
        lf2SpacesIndenter8.writeIndentation(jsonGenerator34, (-1703009269));
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter37 = defaultPrettyPrinter0.withObjectIndenter((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter8);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter39 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString40 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter41 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter39, serializableString40);
        com.fasterxml.jackson.core.SerializableString serializableString42 = defaultPrettyPrinter39._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler43 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext46 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler43, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream47 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer48 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext46, outputStream47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec50 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext54 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler51, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream55 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer56 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext54, outputStream55);
        uTF8Writer56.flush();
        java.io.Writer writer59 = uTF8Writer56.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator60 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext46, (-1703009269), objectCodec50, (java.io.Writer) uTF8Writer56);
        writerBasedJsonGenerator60.writeRaw("com.fasterxml.jackson.core.JsonParseException: \n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        defaultPrettyPrinter39.writeEndObject((com.fasterxml.jackson.core.JsonGenerator) writerBasedJsonGenerator60, (-1910784150));
        writerBasedJsonGenerator60.writeStartObject();
        writerBasedJsonGenerator60.writeStringField("/", "UTF-16BE");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator70 = writerBasedJsonGenerator60.setHighestNonEscapedChar((-1062004810));
        defaultPrettyPrinter0.writeEndObject((com.fasterxml.jackson.core.JsonGenerator) writerBasedJsonGenerator60, (-683298118));
        org.junit.Assert.assertNotNull(serializableString3);
        org.junit.Assert.assertNotNull(indenter4);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter6);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter8);
        org.junit.Assert.assertNotNull(writer25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n" + "'", str29, "\n");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[92, 110]");
        org.junit.Assert.assertNotNull(jsonGenerator34);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter37);
        org.junit.Assert.assertNotNull(serializableString42);
        org.junit.Assert.assertNotNull(writer59);
        org.junit.Assert.assertNotNull(jsonGenerator70);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test654");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        boolean boolean15 = readerBasedJsonParser14.isClosed();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = readerBasedJsonParser14.getCurrentLocation();
        readerBasedJsonParser14.overrideCurrentName("2.2250738585072012e-308");
        com.fasterxml.jackson.core.JsonLocation jsonLocation19 = readerBasedJsonParser14.getCurrentLocation();
        readerBasedJsonParser14.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = readerBasedJsonParser14.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2026418446 + "'", int13 == 2026418446);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonLocation16);
        org.junit.Assert.assertNotNull(jsonLocation19);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test655");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test656");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        boolean boolean4 = defaultPrettyPrinter3._spacesInObjectEntries;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString7 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter6, serializableString7);
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = new com.fasterxml.jackson.core.JsonFactory(objectCodec9);
        com.fasterxml.jackson.core.JsonFactory.Feature feature11 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean13 = feature11.enabledIn(3);
        boolean boolean14 = jsonFactory10.isEnabled(feature11);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory(objectCodec15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean19 = feature17.enabledIn(3);
        boolean boolean20 = jsonFactory16.isEnabled(feature17);
        com.fasterxml.jackson.core.JsonParser.Feature feature21 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory16.disable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory10.disable(feature21);
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = jsonFactory10.createGenerator(outputStream24);
        defaultPrettyPrinter8.writeStartArray(jsonGenerator25);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter27 = jsonGenerator25.getPrettyPrinter();
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str30 = serializedString29.toString();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = jsonGenerator25.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString29);
        defaultPrettyPrinter3.beforeObjectEntries(jsonGenerator25);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter34 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString35 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter36 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter34, serializableString35);
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = new com.fasterxml.jackson.core.JsonFactory(objectCodec37);
        com.fasterxml.jackson.core.JsonFactory.Feature feature39 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean41 = feature39.enabledIn(3);
        boolean boolean42 = jsonFactory38.isEnabled(feature39);
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = new com.fasterxml.jackson.core.JsonFactory(objectCodec43);
        com.fasterxml.jackson.core.JsonFactory.Feature feature45 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean47 = feature45.enabledIn(3);
        boolean boolean48 = jsonFactory44.isEnabled(feature45);
        com.fasterxml.jackson.core.JsonParser.Feature feature49 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = jsonFactory44.disable(feature49);
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = jsonFactory38.disable(feature49);
        java.io.OutputStream outputStream52 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator53 = jsonFactory38.createGenerator(outputStream52);
        defaultPrettyPrinter36.writeStartArray(jsonGenerator53);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter55 = jsonGenerator53.getPrettyPrinter();
        jsonGenerator53.writeNumber("");
        boolean boolean58 = jsonGenerator53.isClosed();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler59 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext62 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler59, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream63 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer64 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext62, outputStream63);
        com.fasterxml.jackson.core.ObjectCodec objectCodec66 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler67 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext70 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler67, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream71 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer72 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext70, outputStream71);
        uTF8Writer72.flush();
        java.io.Writer writer75 = uTF8Writer72.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator76 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext62, (-1703009269), objectCodec66, (java.io.Writer) uTF8Writer72);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature77 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean78 = writerBasedJsonGenerator76.isEnabled(feature77);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes79 = writerBasedJsonGenerator76.getCharacterEscapes();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter81 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString82 = defaultPrettyPrinter81._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler83 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer84 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler83);
        char[] charArray85 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer84.resetWithShared(charArray85, 2000, 2000);
        int int90 = serializableString82.appendUnquoted(charArray85, 0);
        writerBasedJsonGenerator76.writeRaw(serializableString82);
        jsonGenerator53.writeRaw(serializableString82);
        defaultPrettyPrinter3.writeRootValueSeparator(jsonGenerator53);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + feature11 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature11.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonGenerator25);
        org.junit.Assert.assertNull(prettyPrinter27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n" + "'", str30, "\n");
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + feature45 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature45.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature49.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory50);
        org.junit.Assert.assertNotNull(jsonFactory51);
        org.junit.Assert.assertNotNull(jsonGenerator53);
        org.junit.Assert.assertNull(prettyPrinter55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(writer75);
        org.junit.Assert.assertTrue("'" + feature77 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature77.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(characterEscapes79);
        org.junit.Assert.assertNotNull(serializableString82);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test657");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter2 = lf2SpacesIndenter0.withLinefeed("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext6 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler3, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream7 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer8 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext6, outputStream7);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext14 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler11, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream15 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer16 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext14, outputStream15);
        uTF8Writer16.flush();
        java.io.Writer writer19 = uTF8Writer16.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator20 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext6, (-1703009269), objectCodec10, (java.io.Writer) uTF8Writer16);
        com.fasterxml.jackson.core.io.SerializedString serializedString22 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str23 = serializedString22.toString();
        char[] charArray24 = new char[] {};
        int int26 = serializedString22.appendQuoted(charArray24, (int) (byte) 10);
        byte[] byteArray27 = serializedString22.asQuotedUTF8();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = writerBasedJsonGenerator20.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString22);
        lf2SpacesIndenter2.writeIndentation(jsonGenerator28, (-1703009269));
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory(objectCodec31);
        com.fasterxml.jackson.core.JsonFactory.Feature feature33 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean35 = feature33.enabledIn(3);
        boolean boolean36 = jsonFactory32.isEnabled(feature33);
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = new com.fasterxml.jackson.core.JsonFactory(objectCodec37);
        com.fasterxml.jackson.core.JsonFactory.Feature feature39 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean41 = feature39.enabledIn(3);
        boolean boolean42 = jsonFactory38.isEnabled(feature39);
        com.fasterxml.jackson.core.JsonParser.Feature feature43 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory38.disable(feature43);
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory32.disable(feature43);
        java.io.OutputStream outputStream46 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator47 = jsonFactory32.createGenerator(outputStream46);
        jsonGenerator47.writeNumber((short) (byte) 10);
        lf2SpacesIndenter2.writeIndentation(jsonGenerator47, (int) (short) 1);
        boolean boolean52 = lf2SpacesIndenter2.isInline();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter54 = lf2SpacesIndenter2.withLinefeed("");
        org.junit.Assert.assertNotNull(lf2SpacesIndenter0);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter2);
        org.junit.Assert.assertNotNull(writer19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[92, 110]");
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature43.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonGenerator47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter54);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test658");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextLength();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder16 = readerBasedJsonParser14._getByteArrayBuilder();
        readerBasedJsonParser14.close();
        java.lang.String str18 = readerBasedJsonParser14.getText();
        java.lang.String str20 = readerBasedJsonParser14.getValueAsString("[Source: N/A; line: -1, column: -1]");
        java.lang.Object obj21 = readerBasedJsonParser14.getEmbeddedObject();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-182742058) + "'", int13 == (-182742058));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArrayBuilder16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[Source: N/A; line: -1, column: -1]" + "'", str20, "[Source: N/A; line: -1, column: -1]");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test659");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream12 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer13 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext11, outputStream12);
        uTF8Writer13.flush();
        java.io.Writer writer16 = uTF8Writer13.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1703009269), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = writerBasedJsonGenerator17.getCodec();
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer19 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        charsToNameCanonicalizer19.release();
        int int21 = charsToNameCanonicalizer19.bucketCount();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext25 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler22, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer27 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext25, outputStream26);
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext33 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler30, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream34 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer35 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext33, outputStream34);
        uTF8Writer35.flush();
        java.io.Writer writer38 = uTF8Writer35.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator39 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext25, (-1703009269), objectCodec29, (java.io.Writer) uTF8Writer35);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature40 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean41 = writerBasedJsonGenerator39.isEnabled(feature40);
        java.math.BigInteger bigInteger42 = null;
        writerBasedJsonGenerator39.writeNumber(bigInteger42);
        com.fasterxml.jackson.core.io.SerializedString serializedString45 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str46 = serializedString45.toString();
        int int47 = serializedString45.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext51 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler48, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream52 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer53 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext51, outputStream52);
        byte[] byteArray54 = iOContext51.allocReadIOBuffer();
        int int56 = serializedString45.appendQuotedUTF8(byteArray54, 3);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator57 = writerBasedJsonGenerator39.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString45);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler58 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer59 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler58);
        textBuffer59.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler62 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer63 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler62);
        textBuffer63.append(' ');
        textBuffer63.resetWithString("hi!");
        char[] charArray68 = textBuffer63.finishCurrentSegment();
        textBuffer59.append(charArray68, (int) (short) 1, 100);
        writerBasedJsonGenerator39.writeRawValue(charArray68, (int) '#', (int) (byte) 100);
        int int77 = charsToNameCanonicalizer19.calcHash(charArray68, (int) (byte) 1, (int) (short) 0);
        writerBasedJsonGenerator17.writeString(charArray68, (int) (byte) 1, (-48));
        writerBasedJsonGenerator17.writeRaw('a');
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNull(objectCodec18);
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(writer38);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature40.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\n" + "'", str46, "\n");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(jsonGenerator57);
        org.junit.Assert.assertNotNull(charArray68);
// flaky:         org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1702776217) + "'", int77 == (-1702776217));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test660");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        byte[] byteArray6 = iOContext3.allocReadIOBuffer();
        char[] charArray7 = iOContext3.allocTokenBuffer();
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding8 = null;
        iOContext3.setEncoding(jsonEncoding8);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext13 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler10, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream14 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer15 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext13, outputStream14);
        byte[] byteArray16 = iOContext13.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext20 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler17, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream21 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = new com.fasterxml.jackson.core.JsonFactory(objectCodec22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean26 = feature24.enabledIn(3);
        boolean boolean27 = jsonFactory23.isEnabled(feature24);
        com.fasterxml.jackson.core.JsonParser.Feature feature28 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory23.disable(feature28);
        java.io.OutputStream outputStream30 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = jsonFactory23.createGenerator(outputStream30);
        com.fasterxml.jackson.core.io.IOContext iOContext32 = null;
        byte[] byteArray33 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper36 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext32, byteArray33, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonFactory23.createJsonParser(byteArray33, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = new com.fasterxml.jackson.core.JsonFactory(objectCodec40);
        com.fasterxml.jackson.core.JsonFactory.Feature feature42 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean44 = feature42.enabledIn(3);
        boolean boolean45 = jsonFactory41.isEnabled(feature42);
        com.fasterxml.jackson.core.JsonParser.Feature feature46 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = jsonFactory41.disable(feature46);
        java.io.OutputStream outputStream48 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator49 = jsonFactory41.createGenerator(outputStream48);
        com.fasterxml.jackson.core.io.IOContext iOContext50 = null;
        byte[] byteArray51 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper54 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext50, byteArray51, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser57 = jsonFactory41.createJsonParser(byteArray51, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter59 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString60 = defaultPrettyPrinter59._rootSeparator;
        byte[] byteArray67 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int69 = serializableString60.appendQuotedUTF8(byteArray67, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser70 = jsonFactory41.createJsonParser(byteArray67);
        com.fasterxml.jackson.core.JsonParser jsonParser73 = jsonFactory23.createJsonParser(byteArray67, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream76 = new com.fasterxml.jackson.core.io.MergedStream(iOContext20, inputStream21, byteArray67, 10, 2000);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter78 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString79 = defaultPrettyPrinter78._rootSeparator;
        byte[] byteArray86 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int88 = serializableString79.appendQuotedUTF8(byteArray86, (int) (byte) 100);
        com.fasterxml.jackson.core.io.MergedStream mergedStream91 = new com.fasterxml.jackson.core.io.MergedStream(iOContext13, inputStream21, byteArray86, (-1038366032), (int) (short) -1);
        boolean boolean92 = mergedStream91.markSupported();
        byte[] byteArray93 = null;
        com.fasterxml.jackson.core.io.MergedStream mergedStream96 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, (java.io.InputStream) mergedStream91, byteArray93, (int) (byte) 1, 4);
        boolean boolean97 = mergedStream91.markSupported();
        mergedStream91.reset();
        boolean boolean99 = mergedStream91.markSupported();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature28.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature42.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + feature46 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature46.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory47);
        org.junit.Assert.assertNotNull(jsonGenerator49);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser57);
        org.junit.Assert.assertNotNull(serializableString60);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(jsonParser70);
        org.junit.Assert.assertNotNull(jsonParser73);
        org.junit.Assert.assertNotNull(serializableString79);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test661");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        boolean boolean6 = jsonParser3.getValueAsBoolean(false);
        boolean boolean7 = jsonParser3.canReadTypeId();
        int int8 = jsonParser3.getValueAsInt();
        double double10 = jsonParser3.getValueAsDouble((double) 0.0f);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test662");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream4 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory(objectCodec5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean9 = feature7.enabledIn(3);
        boolean boolean10 = jsonFactory6.isEnabled(feature7);
        com.fasterxml.jackson.core.JsonParser.Feature feature11 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory6.disable(feature11);
        java.io.OutputStream outputStream13 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = jsonFactory6.createGenerator(outputStream13);
        com.fasterxml.jackson.core.io.IOContext iOContext15 = null;
        byte[] byteArray16 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper19 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext15, byteArray16, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory6.createJsonParser(byteArray16, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory(objectCodec23);
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(3);
        boolean boolean28 = jsonFactory24.isEnabled(feature25);
        com.fasterxml.jackson.core.JsonParser.Feature feature29 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory24.disable(feature29);
        java.io.OutputStream outputStream31 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonFactory24.createGenerator(outputStream31);
        com.fasterxml.jackson.core.io.IOContext iOContext33 = null;
        byte[] byteArray34 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper37 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext33, byteArray34, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory24.createJsonParser(byteArray34, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter42 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString43 = defaultPrettyPrinter42._rootSeparator;
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int52 = serializableString43.appendQuotedUTF8(byteArray50, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory24.createJsonParser(byteArray50);
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory6.createJsonParser(byteArray50, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream59 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream4, byteArray50, 10, 2000);
        char[] charArray61 = iOContext3.allocNameCopyBuffer((-1081632712));
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler62 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext65 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler62, (java.lang.Object) (byte) -1, true);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler66 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext69 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler66, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream70 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer71 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext69, outputStream70);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding72 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext69.setEncoding(jsonEncoding72);
        java.io.Reader reader75 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec76 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer77 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int79 = charsToNameCanonicalizer77.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser80 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext69, (-1697824632), reader75, objectCodec76, charsToNameCanonicalizer77);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder81 = readerBasedJsonParser80._getByteArrayBuilder();
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer82 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext65, (java.io.OutputStream) byteArrayBuilder81);
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer83 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, (java.io.OutputStream) byteArrayBuilder81);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + feature11 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature11.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(jsonGenerator14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature29.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNotNull(serializableString43);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + jsonEncoding72 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding72.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer77);
// flaky:         org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-826486842) + "'", int79 == (-826486842));
        org.junit.Assert.assertNotNull(byteArrayBuilder81);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test663");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 60);
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext19 = readerBasedJsonParser14.getParsingContext();
        java.lang.Object obj20 = readerBasedJsonParser14.getEmbeddedObject();
        int int21 = readerBasedJsonParser14.getTextLength();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType22 = readerBasedJsonParser14.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-882632388) + "'", int13 == (-882632388));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNotNull(jsonReadContext19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test664");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        boolean boolean6 = jsonParser3.getValueAsBoolean(false);
        java.lang.String str7 = jsonParser3.getCurrentName();
        boolean boolean8 = jsonParser3.requiresCustomCodec();
        int int9 = jsonParser3.getFeatureMask();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test665");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext7 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler4, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream8 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer9 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext7, outputStream8);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding10 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext7.setEncoding(jsonEncoding10);
        java.io.Reader reader13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer15 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int17 = charsToNameCanonicalizer15.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser18 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext7, (-1697824632), reader13, objectCodec14, charsToNameCanonicalizer15);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder19 = readerBasedJsonParser18._getByteArrayBuilder();
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer20 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, (java.io.OutputStream) byteArrayBuilder19);
        uTF8Writer20.flush();
        org.junit.Assert.assertTrue("'" + jsonEncoding10 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding10.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer15);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 429255792 + "'", int17 == 429255792);
        org.junit.Assert.assertNotNull(byteArrayBuilder19);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test666");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream12 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer13 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext11, outputStream12);
        uTF8Writer13.flush();
        java.io.Writer writer16 = uTF8Writer13.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1703009269), objectCodec7, (java.io.Writer) uTF8Writer13);
        writerBasedJsonGenerator17.writeRaw("com.fasterxml.jackson.core.JsonParseException: \n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        java.lang.Object obj20 = writerBasedJsonGenerator17.getOutputTarget();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext24 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler21, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer26 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext24, outputStream25);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding27 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext24.setEncoding(jsonEncoding27);
        java.io.Reader reader30 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer32 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int34 = charsToNameCanonicalizer32.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser35 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext24, (-1697824632), reader30, objectCodec31, charsToNameCanonicalizer32);
        int int36 = readerBasedJsonParser35.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = new com.fasterxml.jackson.core.JsonFactory(objectCodec37);
        com.fasterxml.jackson.core.JsonFactory.Feature feature39 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean41 = feature39.enabledIn(3);
        boolean boolean42 = jsonFactory38.isEnabled(feature39);
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = new com.fasterxml.jackson.core.JsonFactory(objectCodec43);
        com.fasterxml.jackson.core.JsonFactory.Feature feature45 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean47 = feature45.enabledIn(3);
        boolean boolean48 = jsonFactory44.isEnabled(feature45);
        com.fasterxml.jackson.core.JsonParser.Feature feature49 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = jsonFactory44.disable(feature49);
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = jsonFactory38.disable(feature49);
        java.lang.String str52 = jsonFactory38.getFormatName();
        java.io.InputStream inputStream53 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonFactory38.createParser(inputStream53);
        long long55 = jsonParser54.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = new com.fasterxml.jackson.core.JsonFactory(objectCodec56);
        java.io.Reader reader58 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser59 = jsonFactory57.createParser(reader58);
        boolean boolean60 = jsonParser59.requiresCustomCodec();
        java.lang.String str61 = jsonParser59.getText();
        java.lang.Object obj62 = jsonParser59.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter64 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString65 = defaultPrettyPrinter64._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler66 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer67 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler66);
        char[] charArray68 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer67.resetWithShared(charArray68, 2000, 2000);
        int int73 = serializableString65.appendUnquoted(charArray68, 0);
        boolean boolean74 = jsonParser59.nextFieldName(serializableString65);
        com.fasterxml.jackson.core.Version version75 = jsonParser59.version();
        double double77 = jsonParser59.getValueAsDouble((double) (byte) -1);
        char[] charArray78 = jsonParser59.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory80 = new com.fasterxml.jackson.core.JsonFactory(objectCodec79);
        com.fasterxml.jackson.core.JsonFactory.Feature feature81 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean83 = feature81.enabledIn(3);
        boolean boolean84 = jsonFactory80.isEnabled(feature81);
        com.fasterxml.jackson.core.ObjectCodec objectCodec85 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory86 = new com.fasterxml.jackson.core.JsonFactory(objectCodec85);
        com.fasterxml.jackson.core.JsonFactory.Feature feature87 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean89 = feature87.enabledIn(3);
        boolean boolean90 = jsonFactory86.isEnabled(feature87);
        com.fasterxml.jackson.core.JsonParser.Feature feature91 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory92 = jsonFactory86.disable(feature91);
        com.fasterxml.jackson.core.JsonFactory jsonFactory93 = jsonFactory80.disable(feature91);
        com.fasterxml.jackson.core.JsonParser jsonParser94 = jsonParser59.enable(feature91);
        com.fasterxml.jackson.core.JsonParser jsonParser96 = jsonParser54.configure(feature91, true);
        com.fasterxml.jackson.core.JsonParser jsonParser97 = readerBasedJsonParser35.enable(feature91);
        boolean boolean98 = readerBasedJsonParser35.canReadTypeId();
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator17.copyCurrentEvent((com.fasterxml.jackson.core.JsonParser) readerBasedJsonParser35);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No current event to copy");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + jsonEncoding27 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding27.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer32);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 204369368 + "'", int34 == 204369368);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + feature45 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature45.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature49.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory50);
        org.junit.Assert.assertNotNull(jsonFactory51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "JSON" + "'", str52, "JSON");
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(jsonParser59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(serializableString65);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(version75);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.0d) + "'", double77 == (-1.0d));
        org.junit.Assert.assertNull(charArray78);
        org.junit.Assert.assertTrue("'" + feature81 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature81.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + feature87 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature87.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + feature91 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature91.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory92);
        org.junit.Assert.assertNotNull(jsonFactory93);
        org.junit.Assert.assertNotNull(jsonParser94);
        org.junit.Assert.assertNotNull(jsonParser96);
        org.junit.Assert.assertNotNull(jsonParser97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test667");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = readerBasedJsonParser14.getTokenLocation();
        int int19 = readerBasedJsonParser14.nextIntValue(262144);
        int int20 = readerBasedJsonParser14.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken21 = readerBasedJsonParser14.nextToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1613243516 + "'", int13 == 1613243516);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jsonLocation17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 262144 + "'", int19 == 262144);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(jsonToken21);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test668");
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer0 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int2 = charsToNameCanonicalizer0._hashToIndex((-1707934521));
        int int3 = charsToNameCanonicalizer0.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext7 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler4, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream8 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = new com.fasterxml.jackson.core.JsonFactory(objectCodec9);
        com.fasterxml.jackson.core.JsonFactory.Feature feature11 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean13 = feature11.enabledIn(3);
        boolean boolean14 = jsonFactory10.isEnabled(feature11);
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory10.disable(feature15);
        java.io.OutputStream outputStream17 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = jsonFactory10.createGenerator(outputStream17);
        com.fasterxml.jackson.core.io.IOContext iOContext19 = null;
        byte[] byteArray20 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper23 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext19, byteArray20, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser26 = jsonFactory10.createJsonParser(byteArray20, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = new com.fasterxml.jackson.core.JsonFactory(objectCodec27);
        com.fasterxml.jackson.core.JsonFactory.Feature feature29 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean31 = feature29.enabledIn(3);
        boolean boolean32 = jsonFactory28.isEnabled(feature29);
        com.fasterxml.jackson.core.JsonParser.Feature feature33 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory28.disable(feature33);
        java.io.OutputStream outputStream35 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonFactory28.createGenerator(outputStream35);
        com.fasterxml.jackson.core.io.IOContext iOContext37 = null;
        byte[] byteArray38 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper41 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext37, byteArray38, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory28.createJsonParser(byteArray38, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter46 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString47 = defaultPrettyPrinter46._rootSeparator;
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int56 = serializableString47.appendQuotedUTF8(byteArray54, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser57 = jsonFactory28.createJsonParser(byteArray54);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory10.createJsonParser(byteArray54, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream63 = new com.fasterxml.jackson.core.io.MergedStream(iOContext7, inputStream8, byteArray54, 10, 2000);
        char[] charArray65 = iOContext7.allocNameCopyBuffer((-1081632712));
        int int68 = charsToNameCanonicalizer0.calcHash(charArray65, (-1478957456), (-1164577078));
        // The following exception was thrown during execution in test generation
        try {
            long long71 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray65, (-1702813339), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1702813339");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + feature11 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature11.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature15.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser26);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature29.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNotNull(serializableString47);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(jsonParser57);
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1702771907) + "'", int68 == (-1702771907));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test669");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext3.setEncoding(jsonEncoding6);
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer11 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int13 = charsToNameCanonicalizer11.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1697824632), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory(objectCodec16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean20 = feature18.enabledIn(3);
        boolean boolean21 = jsonFactory17.isEnabled(feature18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = new com.fasterxml.jackson.core.JsonFactory(objectCodec22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean26 = feature24.enabledIn(3);
        boolean boolean27 = jsonFactory23.isEnabled(feature24);
        com.fasterxml.jackson.core.JsonParser.Feature feature28 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory23.disable(feature28);
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory17.disable(feature28);
        java.lang.String str31 = jsonFactory17.getFormatName();
        java.io.InputStream inputStream32 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory17.createParser(inputStream32);
        long long34 = jsonParser33.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory(objectCodec35);
        java.io.Reader reader37 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory36.createParser(reader37);
        boolean boolean39 = jsonParser38.requiresCustomCodec();
        java.lang.String str40 = jsonParser38.getText();
        java.lang.Object obj41 = jsonParser38.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter43 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString44 = defaultPrettyPrinter43._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler45 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer46 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler45);
        char[] charArray47 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer46.resetWithShared(charArray47, 2000, 2000);
        int int52 = serializableString44.appendUnquoted(charArray47, 0);
        boolean boolean53 = jsonParser38.nextFieldName(serializableString44);
        com.fasterxml.jackson.core.Version version54 = jsonParser38.version();
        double double56 = jsonParser38.getValueAsDouble((double) (byte) -1);
        char[] charArray57 = jsonParser38.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = new com.fasterxml.jackson.core.JsonFactory(objectCodec58);
        com.fasterxml.jackson.core.JsonFactory.Feature feature60 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean62 = feature60.enabledIn(3);
        boolean boolean63 = jsonFactory59.isEnabled(feature60);
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory65 = new com.fasterxml.jackson.core.JsonFactory(objectCodec64);
        com.fasterxml.jackson.core.JsonFactory.Feature feature66 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean68 = feature66.enabledIn(3);
        boolean boolean69 = jsonFactory65.isEnabled(feature66);
        com.fasterxml.jackson.core.JsonParser.Feature feature70 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = jsonFactory65.disable(feature70);
        com.fasterxml.jackson.core.JsonFactory jsonFactory72 = jsonFactory59.disable(feature70);
        com.fasterxml.jackson.core.JsonParser jsonParser73 = jsonParser38.enable(feature70);
        com.fasterxml.jackson.core.JsonParser jsonParser75 = jsonParser33.configure(feature70, true);
        com.fasterxml.jackson.core.JsonParser jsonParser76 = readerBasedJsonParser14.enable(feature70);
        boolean boolean77 = readerBasedJsonParser14.getValueAsBoolean();
        boolean boolean78 = readerBasedJsonParser14.requiresCustomCodec();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 370836874 + "'", int13 == 370836874);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature28.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "JSON" + "'", str31, "JSON");
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(serializableString44);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(version54);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertNull(charArray57);
        org.junit.Assert.assertTrue("'" + feature60 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature60.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + feature66 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature66.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + feature70 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature70.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory71);
        org.junit.Assert.assertNotNull(jsonFactory72);
        org.junit.Assert.assertNotNull(jsonParser73);
        org.junit.Assert.assertNotNull(jsonParser75);
        org.junit.Assert.assertNotNull(jsonParser76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }
}
