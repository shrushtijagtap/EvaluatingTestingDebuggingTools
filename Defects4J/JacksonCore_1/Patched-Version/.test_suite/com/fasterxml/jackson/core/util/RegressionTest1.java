package com.fasterxml.jackson.core.util;

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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator20 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext6, (-1257689239), objectCodec10, (java.io.Writer) uTF8Writer16);
        com.fasterxml.jackson.core.io.SerializedString serializedString22 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str23 = serializedString22.toString();
        char[] charArray24 = new char[] {};
        int int26 = serializedString22.appendQuoted(charArray24, (int) (byte) 10);
        byte[] byteArray27 = serializedString22.asQuotedUTF8();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = writerBasedJsonGenerator20.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString22);
        lf2SpacesIndenter2.writeIndentation(jsonGenerator28, (-1257689239));
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
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 39);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = readerBasedJsonParser14.getParsingContext();
        com.fasterxml.jackson.core.Version version20 = readerBasedJsonParser14.version();
        boolean boolean21 = readerBasedJsonParser14.hasTextCharacters();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1961238026 + "'", int13 == 1961238026);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 39L + "'", long18 == 39L);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str2 = serializedString1.toString();
        char[] charArray3 = new char[] {};
        int int5 = serializedString1.appendQuoted(charArray3, (int) (byte) 10);
        int int6 = serializedString1.charLength();
        java.lang.String str7 = serializedString1.getValue();
        int int8 = serializedString1.charLength();
        java.nio.ByteBuffer byteBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = serializedString1.putQuotedUTF8(byteBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        java.lang.Object obj6 = jsonParser3.getObjectId();
        boolean boolean7 = jsonParser3.isExpectedStartArrayToken();
        boolean boolean8 = jsonParser3.hasCurrentToken();
        int int10 = jsonParser3.getValueAsInt(33);
        boolean boolean11 = jsonParser3.requiresCustomCodec();
        double double13 = jsonParser3.getValueAsDouble(0.0d);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1257689239), objectCodec7, (java.io.Writer) uTF8Writer13);
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
        writerBasedJsonGenerator17.writeNumber((double) (-1934515668));
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(jsonWriteContext21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        long long32 = jsonParser30.getValueAsLong((long) 64);
        com.fasterxml.jackson.core.JsonToken jsonToken33 = jsonParser30.getLastClearedToken();
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 64L + "'", long32 == 64L);
        org.junit.Assert.assertNull(jsonToken33);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
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
        defaultPrettyPrinter3.writeEndArray(jsonGenerator30, (-1257689239));
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter33 = defaultPrettyPrinter3.withoutSpacesInObjectEntries();
        com.fasterxml.jackson.core.SerializableString serializableString34 = defaultPrettyPrinter33._rootSeparator;
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
        org.junit.Assert.assertNotNull(defaultPrettyPrinter33);
        org.junit.Assert.assertNull(serializableString34);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        com.fasterxml.jackson.core.JsonLocation jsonLocation9 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) jsonParser3, (long) 10, 0L, (int) ' ', (int) (short) 100);
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonParser3.disable(feature10);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature10.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonParser11);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.String str15 = readerBasedJsonParser14.nextTextValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType16 = readerBasedJsonParser14.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2068002424) + "'", int13 == (-2068002424));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1257689239), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = iOContext3.constructTextBuffer();
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(textBuffer18);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str2 = serializedString1.toString();
        char[] charArray3 = new char[] {};
        int int5 = serializedString1.appendQuoted(charArray3, (int) (byte) 10);
        int int6 = serializedString1.charLength();
        int int7 = serializedString1.charLength();
        char[] charArray8 = serializedString1.asQuotedChars();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\\, n]");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("com.fasterxml.jackson.core.JsonParseException: \n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]", 1696326770);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1696326770 + "'", int2 == 1696326770);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        int int16 = readerBasedJsonParser14.getTextLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean17 = readerBasedJsonParser14.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1552305600 + "'", int13 == 1552305600);
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str2 = serializedString1.toString();
        char[] charArray3 = new char[] {};
        int int5 = serializedString1.appendQuoted(charArray3, (int) (byte) 10);
        int int6 = serializedString1.charLength();
        com.fasterxml.jackson.core.io.IOContext iOContext7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper11 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext7, byteArray8, 0, 0);
        int int13 = serializedString1.appendQuotedUTF8(byteArray8, 1139113814);
        byte[] byteArray14 = serializedString1.asUnquotedUTF8();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        int int18 = serializedString1.appendUnquotedUTF8(byteArray16, 225095440);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator20 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext6, (-1257689239), objectCodec10, (java.io.Writer) uTF8Writer16);
        com.fasterxml.jackson.core.io.SerializedString serializedString22 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str23 = serializedString22.toString();
        char[] charArray24 = new char[] {};
        int int26 = serializedString22.appendQuoted(charArray24, (int) (byte) 10);
        byte[] byteArray27 = serializedString22.asQuotedUTF8();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = writerBasedJsonGenerator20.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString22);
        lf2SpacesIndenter2.writeIndentation(jsonGenerator28, (-1257689239));
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
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 39);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = readerBasedJsonParser14.getParsingContext();
        readerBasedJsonParser14.overrideCurrentName("");
        int int23 = readerBasedJsonParser14.getValueAsInt((-1252946131));
        java.lang.Object obj24 = readerBasedJsonParser14.getEmbeddedObject();
        readerBasedJsonParser14.close();
        // The following exception was thrown during execution in test generation
        try {
            double double26 = readerBasedJsonParser14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1534727104 + "'", int13 == 1534727104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 39L + "'", long18 == 39L);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1252946131) + "'", int23 == (-1252946131));
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 39);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = readerBasedJsonParser14.getParsingContext();
        readerBasedJsonParser14.overrideCurrentName("");
        int int22 = readerBasedJsonParser14.getTextOffset();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1664449188) + "'", int13 == (-1664449188));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 39L + "'", long18 == 39L);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = jsonFactory13._getBufferRecycler();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory13.createJsonParser("hi!");
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
        org.junit.Assert.assertNotNull(bufferRecycler15);
        org.junit.Assert.assertNotNull(jsonParser17);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = readerBasedJsonParser14.nextToken();
        boolean boolean16 = readerBasedJsonParser14.isClosed();
        double double18 = readerBasedJsonParser14.getValueAsDouble((double) 1267411379);
        readerBasedJsonParser14.close();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1809243198 + "'", int13 == 1809243198);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.267411379E9d + "'", double18 == 1.267411379E9d);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.Object obj15 = readerBasedJsonParser14.getEmbeddedObject();
        java.lang.String str16 = readerBasedJsonParser14.getCurrentName();
        java.lang.Object obj17 = readerBasedJsonParser14.getEmbeddedObject();
        boolean boolean18 = readerBasedJsonParser14.hasCurrentToken();
        com.fasterxml.jackson.core.Base64Variant base64Variant19 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = readerBasedJsonParser14.getBinaryValue(base64Variant19);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1233391522) + "'", int13 == (-1233391522));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        boolean boolean16 = readerBasedJsonParser14.hasTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = readerBasedJsonParser14.getCodec();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext18 = readerBasedJsonParser14.getParsingContext();
        com.fasterxml.jackson.core.JsonLocation jsonLocation19 = readerBasedJsonParser14.getCurrentLocation();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1076165008 + "'", int13 == 1076165008);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(objectCodec17);
        org.junit.Assert.assertNotNull(jsonReadContext18);
        org.junit.Assert.assertNotNull(jsonLocation19);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        int int4 = textBuffer1.getTextOffset();
        int int5 = textBuffer1.size();
        char[] charArray6 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1257689239), objectCodec7, (java.io.Writer) uTF8Writer13);
        uTF8Writer13.flush();
        java.io.Writer writer20 = uTF8Writer13.append('a');
        uTF8Writer13.close();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        textBuffer23.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        textBuffer27.append(' ');
        textBuffer27.resetWithString("hi!");
        char[] charArray32 = textBuffer27.finishCurrentSegment();
        textBuffer23.append(charArray32, (int) (short) 1, 100);
        uTF8Writer13.write(charArray32, 929756480, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Writer writer42 = uTF8Writer13.append((java.lang.CharSequence) "false", 300260408, 1997675396);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1997675396");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(writer20);
        org.junit.Assert.assertNotNull(charArray32);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        java.lang.String str17 = readerBasedJsonParser14.getText();
        int int18 = readerBasedJsonParser14.getTokenColumnNr();
        boolean boolean19 = readerBasedJsonParser14.hasCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken20 = readerBasedJsonParser14.getCurrentToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1331965920 + "'", int13 == 1331965920);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jsonToken20);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        boolean boolean6 = jsonParser3.getValueAsBoolean(false);
        java.lang.String str7 = jsonParser3.getCurrentName();
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
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonParser3.disable(feature29);
        com.fasterxml.jackson.core.JsonToken jsonToken34 = jsonParser33.getLastClearedToken();
        int int35 = jsonParser33.getValueAsInt();
        boolean boolean36 = jsonParser33.canReadTypeId();
        jsonParser33.close();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
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
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNull(jsonToken34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 39);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = readerBasedJsonParser14.getParsingContext();
        readerBasedJsonParser14.overrideCurrentName("");
        int int23 = readerBasedJsonParser14.getValueAsInt((-1252946131));
        java.lang.Object obj24 = readerBasedJsonParser14.getEmbeddedObject();
        java.lang.Object obj25 = readerBasedJsonParser14.getObjectId();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1734382470 + "'", int13 == 1734382470);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 39L + "'", long18 == 39L);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1252946131) + "'", int23 == (-1252946131));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator35 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext21, (-1257689239), objectCodec25, (java.io.Writer) uTF8Writer31);
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
        uTF8Writer31.write(charArray50, 929756480, 0);
        int int57 = readerBasedJsonParser14.releaseBuffered((java.io.Writer) uTF8Writer31);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder58 = readerBasedJsonParser14._getByteArrayBuilder();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 570246614 + "'", int13 == 570246614);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(objectCodec17);
        org.junit.Assert.assertNotNull(writer34);
        org.junit.Assert.assertNotNull(writer38);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(byteArrayBuilder58);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        java.io.OutputStream outputStream15 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = jsonFactory1.createGenerator(outputStream15);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator17 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory1.setInputDecorator(inputDecorator17);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = jsonFactory18.getCodec();
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory18.copy();
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser35 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext24, (-1252931262), reader30, objectCodec31, charsToNameCanonicalizer32);
        com.fasterxml.jackson.core.Version version36 = readerBasedJsonParser35.version();
        boolean boolean37 = readerBasedJsonParser35.hasTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = readerBasedJsonParser35.getCodec();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler39 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext42 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler39, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream43 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer44 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext42, outputStream43);
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler47 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext50 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler47, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream51 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer52 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext50, outputStream51);
        uTF8Writer52.flush();
        java.io.Writer writer55 = uTF8Writer52.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator56 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext42, (-1257689239), objectCodec46, (java.io.Writer) uTF8Writer52);
        uTF8Writer52.flush();
        java.io.Writer writer59 = uTF8Writer52.append('a');
        uTF8Writer52.close();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler61 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer62 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler61);
        textBuffer62.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler65 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer66 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler65);
        textBuffer66.append(' ');
        textBuffer66.resetWithString("hi!");
        char[] charArray71 = textBuffer66.finishCurrentSegment();
        textBuffer62.append(charArray71, (int) (short) 1, 100);
        uTF8Writer52.write(charArray71, 929756480, 0);
        int int78 = readerBasedJsonParser35.releaseBuffered((java.io.Writer) uTF8Writer52);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator79 = jsonFactory20.createGenerator((java.io.Writer) uTF8Writer52);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(jsonGenerator16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNull(objectCodec19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertTrue("'" + jsonEncoding27 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding27.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer32);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1735519156 + "'", int34 == 1735519156);
        org.junit.Assert.assertNotNull(version36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(objectCodec38);
        org.junit.Assert.assertNotNull(writer55);
        org.junit.Assert.assertNotNull(writer59);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(jsonGenerator79);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1257689239), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        writerBasedJsonGenerator17.writeRaw("com.fasterxml.jackson.core.JsonParseException: \n\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        writerBasedJsonGenerator17.writeNull();
        writerBasedJsonGenerator17.writeNumber((long) (short) -1);
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator42 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext28, (-1257689239), objectCodec32, (java.io.Writer) uTF8Writer38);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature43 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean44 = writerBasedJsonGenerator42.isEnabled(feature43);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes45 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator46 = writerBasedJsonGenerator42.setCharacterEscapes(characterEscapes45);
        boolean boolean47 = writerBasedJsonGenerator42.isClosed();
        java.math.BigDecimal bigDecimal49 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal("2.2250738585072012e-308");
        writerBasedJsonGenerator42.writeNumber(bigDecimal49);
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator17.writeNumberField(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", bigDecimal49);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Can not write a field name, expecting a value");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(writer41);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature43.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jsonGenerator46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(bigDecimal49);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        boolean boolean22 = iOContext19.isResourceManaged();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream30 = null;
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory(objectCodec49);
        com.fasterxml.jackson.core.JsonFactory.Feature feature51 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean53 = feature51.enabledIn(3);
        boolean boolean54 = jsonFactory50.isEnabled(feature51);
        com.fasterxml.jackson.core.JsonParser.Feature feature55 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory50.disable(feature55);
        java.io.OutputStream outputStream57 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator58 = jsonFactory50.createGenerator(outputStream57);
        com.fasterxml.jackson.core.io.IOContext iOContext59 = null;
        byte[] byteArray60 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper63 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext59, byteArray60, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory50.createJsonParser(byteArray60, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int78 = serializableString69.appendQuotedUTF8(byteArray76, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser79 = jsonFactory50.createJsonParser(byteArray76);
        com.fasterxml.jackson.core.JsonParser jsonParser82 = jsonFactory32.createJsonParser(byteArray76, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream85 = new com.fasterxml.jackson.core.io.MergedStream(iOContext29, inputStream30, byteArray76, 10, 2000);
        com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator88 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext19, (-1038366129), objectCodec24, outputStream25, byteArray76, (int) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            uTF8JsonGenerator88.writeRaw("[Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonGenerator40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(jsonGenerator58);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[91, 83, 111, 117, 114, 99]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(jsonParser79);
        org.junit.Assert.assertNotNull(jsonParser82);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        int int17 = readerBasedJsonParser14.getTokenLineNr();
        int int19 = readerBasedJsonParser14.getValueAsInt((-2108314640));
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 748913426 + "'", int13 == 748913426);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2108314640) + "'", int19 == (-2108314640));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1257689239), objectCodec7, (java.io.Writer) uTF8Writer13);
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = new com.fasterxml.jackson.core.JsonFactory(objectCodec37);
        com.fasterxml.jackson.core.JsonFactory.Feature feature39 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean41 = feature39.enabledIn(3);
        boolean boolean42 = jsonFactory38.isEnabled(feature39);
        com.fasterxml.jackson.core.JsonParser.Feature feature43 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory38.disable(feature43);
        java.io.OutputStream outputStream45 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator46 = jsonFactory38.createGenerator(outputStream45);
        com.fasterxml.jackson.core.JsonFactory.Feature feature47 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean49 = feature47.enabledIn(3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = jsonFactory38.disable(feature47);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = jsonFactory50._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler52 = jsonFactory50._getBufferRecycler();
        java.lang.Object obj53 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext55 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler52, obj53, true);
        com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType byteBufferType56 = com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.BASE64_CODEC_BUFFER;
        byte[] byteArray57 = bufferRecycler52.allocByteBuffer(byteBufferType56);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer58 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler52);
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = new com.fasterxml.jackson.core.JsonFactory(objectCodec59);
        com.fasterxml.jackson.core.JsonFactory.Feature feature61 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean63 = feature61.enabledIn(3);
        boolean boolean64 = jsonFactory60.isEnabled(feature61);
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory66 = new com.fasterxml.jackson.core.JsonFactory(objectCodec65);
        com.fasterxml.jackson.core.JsonFactory.Feature feature67 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean69 = feature67.enabledIn(3);
        boolean boolean70 = jsonFactory66.isEnabled(feature67);
        com.fasterxml.jackson.core.JsonParser.Feature feature71 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory72 = jsonFactory66.disable(feature71);
        com.fasterxml.jackson.core.JsonFactory jsonFactory73 = jsonFactory60.disable(feature71);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler74 = jsonFactory73._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer75 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler74);
        java.lang.Object obj76 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext78 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler74, obj76, false);
        byte[][] byteArray79 = bufferRecycler74._byteBuffers;
        com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType byteBufferType80 = com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER;
        byte[] byteArray81 = null;
        bufferRecycler74.releaseByteBuffer(byteBufferType80, byteArray81);
        com.fasterxml.jackson.core.io.SerializedString serializedString84 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str85 = serializedString84.toString();
        int int86 = serializedString84.charLength();
        byte[] byteArray87 = serializedString84.asUnquotedUTF8();
        bufferRecycler52.releaseByteBuffer(byteBufferType80, byteArray87);
        int int90 = serializedString24.appendQuotedUTF8(byteArray87, 1793616978);
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(jsonWriteContext21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature43.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertNotNull(jsonGenerator46);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(jsonFactory50);
        org.junit.Assert.assertNotNull(bufferRecycler51);
        org.junit.Assert.assertNotNull(bufferRecycler52);
        org.junit.Assert.assertTrue("'" + byteBufferType56 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.BASE64_CODEC_BUFFER + "'", byteBufferType56.equals(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.BASE64_CODEC_BUFFER));
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertTrue("'" + feature61 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature61.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + feature67 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature67.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + feature71 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature71.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory72);
        org.junit.Assert.assertNotNull(jsonFactory73);
        org.junit.Assert.assertNotNull(bufferRecycler74);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertTrue("'" + byteBufferType80 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER + "'", byteBufferType80.equals(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER));
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "\n" + "'", str85, "\n");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[10]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        boolean boolean15 = readerBasedJsonParser14.isClosed();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = readerBasedJsonParser14.getCurrentLocation();
        long long18 = readerBasedJsonParser14.nextLongValue((long) (-1253025339));
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-511071712) + "'", int13 == (-511071712));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonLocation16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1253025339L) + "'", long18 == (-1253025339L));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
        long long25 = jsonParser3.nextLongValue((long) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
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
        int int33 = jsonParser31.getValueAsInt((-1253025339));
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext34 = jsonParser31.getParsingContext();
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec50 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = new com.fasterxml.jackson.core.JsonFactory(objectCodec50);
        com.fasterxml.jackson.core.JsonFactory.Feature feature52 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean54 = feature52.enabledIn(3);
        boolean boolean55 = jsonFactory51.isEnabled(feature52);
        com.fasterxml.jackson.core.JsonParser.Feature feature56 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = jsonFactory51.disable(feature56);
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = jsonFactory49.configure(feature56, true);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonParser31.enable(feature56);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1253025339) + "'", int33 == (-1253025339));
        org.junit.Assert.assertNotNull(jsonStreamContext34);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature43.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertNotNull(jsonFactory49);
        org.junit.Assert.assertTrue("'" + feature52 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature52.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + feature56 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature56.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory57);
        org.junit.Assert.assertNotNull(jsonFactory59);
        org.junit.Assert.assertNotNull(jsonParser60);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        boolean boolean15 = readerBasedJsonParser14.isClosed();
        java.lang.Object obj16 = readerBasedJsonParser14.getInputSource();
        java.lang.Object obj17 = readerBasedJsonParser14.getInputSource();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1143677414 + "'", int13 == 1143677414);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        java.lang.String str15 = readerBasedJsonParser14.nextTextValue();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = readerBasedJsonParser14.getTokenLocation();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-137296278) + "'", int13 == (-137296278));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(jsonLocation16);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
        mergedStream59.mark(1963959330);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = mergedStream59.read();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
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
        java.lang.Object obj12 = jsonParser11.getEmbeddedObject();
        java.lang.Object obj13 = jsonParser11.getInputSource();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger14 = jsonParser11.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: java.io.StringReader@16e0875a; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
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
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonGenerator20.setFeatureMask((int) (short) 0);
        jsonGenerator23.writeNumber((short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream30 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer31 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext29, outputStream30);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext37 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler34, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream38 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer39 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext37, outputStream38);
        uTF8Writer39.flush();
        java.io.Writer writer42 = uTF8Writer39.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator43 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext29, (-1257689239), objectCodec33, (java.io.Writer) uTF8Writer39);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature44 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean45 = writerBasedJsonGenerator43.isEnabled(feature44);
        com.fasterxml.jackson.core.io.SerializedString serializedString47 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str48 = serializedString47.toString();
        char[] charArray49 = new char[] {};
        int int51 = serializedString47.appendQuoted(charArray49, (int) (byte) 10);
        int int52 = serializedString47.charLength();
        java.lang.String str53 = serializedString47.getValue();
        writerBasedJsonGenerator43.writeRaw((com.fasterxml.jackson.core.SerializableString) serializedString47);
        char[] charArray55 = serializedString47.asQuotedChars();
        jsonGenerator23.writeString(charArray55, 1432057706, (-635194452));
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
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(writer42);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature44.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\n" + "'", str48, "\n");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\n" + "'", str53, "\n");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "\\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "\\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[\\, n]");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
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
        java.lang.String str17 = textBuffer16.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray18 = textBuffer16.expandCurrentSegment();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
        java.lang.String str31 = jsonParser30.getValueAsString();
        boolean boolean32 = jsonParser30.canReadTypeId();
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = readerBasedJsonParser14.nextToken();
        boolean boolean16 = readerBasedJsonParser14.isClosed();
        int int17 = readerBasedJsonParser14.getTextLength();
        java.lang.String str18 = readerBasedJsonParser14.getText();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 151692494 + "'", int13 == 151692494);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
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
        // The following exception was thrown during execution in test generation
        try {
            int int89 = uTF32Reader88.read();
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
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
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
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory1.setOutputDecorator(outputDecorator33);
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
        org.junit.Assert.assertNotNull(jsonFactory34);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
        java.io.OutputStream outputStream15 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = jsonFactory1.createGenerator(outputStream15);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator17 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory1.setInputDecorator(inputDecorator17);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = jsonFactory18.getCodec();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext23 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler20, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer25 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext23, outputStream24);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding26 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext23.setEncoding(jsonEncoding26);
        java.io.Reader reader29 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer31 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int33 = charsToNameCanonicalizer31.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser34 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext23, (-1252931262), reader29, objectCodec30, charsToNameCanonicalizer31);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder35 = readerBasedJsonParser34._getByteArrayBuilder();
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding36 = com.fasterxml.jackson.core.JsonEncoding.UTF8;
        java.lang.String str37 = jsonEncoding36.getJavaName();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = jsonFactory18.createGenerator((java.io.OutputStream) byteArrayBuilder35, jsonEncoding36);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(jsonGenerator16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNull(objectCodec19);
        org.junit.Assert.assertTrue("'" + jsonEncoding26 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding26.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer31);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1198990514 + "'", int33 == 1198990514);
        org.junit.Assert.assertNotNull(byteArrayBuilder35);
        org.junit.Assert.assertTrue("'" + jsonEncoding36 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF8 + "'", jsonEncoding36.equals(com.fasterxml.jackson.core.JsonEncoding.UTF8));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTF-8" + "'", str37, "UTF-8");
        org.junit.Assert.assertNotNull(jsonGenerator38);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        textBuffer3.append(' ');
        textBuffer3.resetWithString("hi!");
        char[] charArray8 = textBuffer3.finishCurrentSegment();
        int int10 = serializedString1.appendUnquoted(charArray8, 0);
        char[] charArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = serializedString1.appendQuoted(charArray11, 1020835052);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1257689239), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        writerBasedJsonGenerator17.writeRaw("com.fasterxml.jackson.core.JsonParseException: \n\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        writerBasedJsonGenerator17.writeNull();
        java.lang.Object obj22 = writerBasedJsonGenerator17.getOutputTarget();
        com.fasterxml.jackson.core.Version version23 = writerBasedJsonGenerator17.version();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext27 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler24, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream28 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer29 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext27, outputStream28);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding30 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext27.setEncoding(jsonEncoding30);
        java.io.Reader reader33 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer35 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int37 = charsToNameCanonicalizer35.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser38 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext27, (-1252931262), reader33, objectCodec34, charsToNameCanonicalizer35);
        int int39 = readerBasedJsonParser38.getTextOffset();
        int int40 = readerBasedJsonParser38.getTextLength();
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator17.copyCurrentEvent((com.fasterxml.jackson.core.JsonParser) readerBasedJsonParser38);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No current event to copy");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(version23);
        org.junit.Assert.assertTrue("'" + jsonEncoding30 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding30.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer35);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 211248098 + "'", int37 == 211248098);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
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
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory26.createJsonParser("2.2250738585072012e-308");
        boolean boolean29 = jsonFactory26.requiresPropertyOrdering();
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
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        int int16 = readerBasedJsonParser14.getTextLength();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType17 = readerBasedJsonParser14.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1943131324 + "'", int13 == 1943131324);
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
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
        com.fasterxml.jackson.core.JsonLocation jsonLocation32 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) feature27, 0L, (long) (byte) 1, 10, (int) (short) -1);
        boolean boolean33 = feature27.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory14.configure(feature27, true);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator36 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory35.setOutputDecorator(outputDecorator36);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory(objectCodec38);
        java.io.Reader reader40 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonFactory39.createParser(reader40);
        com.fasterxml.jackson.core.Version version42 = jsonParser41.version();
        boolean boolean44 = jsonParser41.getValueAsBoolean(false);
        java.lang.String str45 = jsonParser41.getCurrentName();
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = new com.fasterxml.jackson.core.JsonFactory(objectCodec46);
        com.fasterxml.jackson.core.JsonFactory.Feature feature48 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean50 = feature48.enabledIn(3);
        boolean boolean51 = jsonFactory47.isEnabled(feature48);
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = new com.fasterxml.jackson.core.JsonFactory(objectCodec52);
        com.fasterxml.jackson.core.JsonFactory.Feature feature54 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean56 = feature54.enabledIn(3);
        boolean boolean57 = jsonFactory53.isEnabled(feature54);
        com.fasterxml.jackson.core.JsonParser.Feature feature58 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = jsonFactory53.disable(feature58);
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = jsonFactory47.disable(feature58);
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory62 = new com.fasterxml.jackson.core.JsonFactory(objectCodec61);
        com.fasterxml.jackson.core.JsonFactory.Feature feature63 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean65 = feature63.enabledIn(3);
        boolean boolean66 = jsonFactory62.isEnabled(feature63);
        com.fasterxml.jackson.core.JsonParser.Feature feature67 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory68 = jsonFactory62.disable(feature67);
        com.fasterxml.jackson.core.JsonFactory jsonFactory70 = jsonFactory60.configure(feature67, true);
        com.fasterxml.jackson.core.JsonParser jsonParser71 = jsonParser41.disable(feature67);
        boolean boolean72 = jsonFactory35.isEnabled(feature67);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertNotNull(version42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature48.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + feature54 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature54.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + feature58 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature58.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory59);
        org.junit.Assert.assertNotNull(jsonFactory60);
        org.junit.Assert.assertTrue("'" + feature63 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature63.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + feature67 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature67.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory68);
        org.junit.Assert.assertNotNull(jsonFactory70);
        org.junit.Assert.assertNotNull(jsonParser71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory1.createParser("UTF-16BE");
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature10.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonParser15);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1257689239), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        writerBasedJsonGenerator17.writeRaw("com.fasterxml.jackson.core.JsonParseException: \n\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        writerBasedJsonGenerator17.writeNull();
        writerBasedJsonGenerator17.writeRaw(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext27 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler24, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream28 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer29 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext27, outputStream28);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext35 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler32, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream36 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer37 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext35, outputStream36);
        uTF8Writer37.flush();
        java.io.Writer writer40 = uTF8Writer37.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator41 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext27, (-1257689239), objectCodec31, (java.io.Writer) uTF8Writer37);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature42 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean43 = writerBasedJsonGenerator41.isEnabled(feature42);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes44 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator45 = writerBasedJsonGenerator41.setCharacterEscapes(characterEscapes44);
        com.fasterxml.jackson.core.Version version46 = writerBasedJsonGenerator41.version();
        com.fasterxml.jackson.core.io.SerializedString serializedString48 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str49 = serializedString48.toString();
        int int50 = serializedString48.charLength();
        byte[] byteArray51 = serializedString48.asUnquotedUTF8();
        byte[] byteArray52 = serializedString48.asQuotedUTF8();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator53 = writerBasedJsonGenerator41.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString48);
        byte[] byteArray54 = serializedString48.asQuotedUTF8();
        com.fasterxml.jackson.core.sym.Name name55 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.getEmptyName();
        boolean boolean58 = name55.equals((int) (short) 1, (int) (short) -1);
        java.lang.String str59 = name55.toString();
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser74 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext63, (-1252931262), reader69, objectCodec70, charsToNameCanonicalizer71);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder75 = readerBasedJsonParser74._getByteArrayBuilder();
        boolean boolean76 = name55.equals((java.lang.Object) byteArrayBuilder75);
        int int77 = serializedString48.writeUnquotedUTF8((java.io.OutputStream) byteArrayBuilder75);
        byte[] byteArray78 = serializedString48.asQuotedUTF8();
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator17.writeRawUTF8String(byteArray78, (-1257623471), (-1257510887));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Operation not supported by generator of type com.fasterxml.jackson.core.json.WriterBasedJsonGenerator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(writer40);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature42.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jsonGenerator45);
        org.junit.Assert.assertNotNull(version46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\n" + "'", str49, "\n");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[10]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[92, 110]");
        org.junit.Assert.assertNotNull(jsonGenerator53);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[92, 110]");
        org.junit.Assert.assertNotNull(name55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + jsonEncoding66 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding66.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer71);
// flaky:         org.junit.Assert.assertTrue("'" + int73 + "' != '" + 495690126 + "'", int73 == 495690126);
        org.junit.Assert.assertNotNull(byteArrayBuilder75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[92, 110]");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str2 = serializedString1.toString();
        char[] charArray3 = new char[] {};
        int int5 = serializedString1.appendQuoted(charArray3, (int) (byte) 10);
        int int6 = serializedString1.charLength();
        java.lang.String str7 = serializedString1.getValue();
        java.lang.String str8 = serializedString1.getValue();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
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
        java.lang.String str17 = textBuffer16.contentsAsString();
        textBuffer16.setCurrentLength((int) (short) 1);
        int int20 = textBuffer16.size();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = readerBasedJsonParser14._getByteArrayBuilder();
        long long16 = readerBasedJsonParser14.getTokenCharacterOffset();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1398645880 + "'", int13 == 1398645880);
        org.junit.Assert.assertNotNull(byteArrayBuilder15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = readerBasedJsonParser14.getTokenLocation();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext21 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler18, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer23 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext21, outputStream22);
        uTF8Writer23.flush();
        uTF8Writer23.write("false", 1267367954, (-1253025339));
        java.io.Writer writer30 = uTF8Writer23.append('4');
        int int31 = readerBasedJsonParser14.releaseBuffered((java.io.Writer) uTF8Writer23);
        int int32 = readerBasedJsonParser14.getTextOffset();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1487447268) + "'", int13 == (-1487447268));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jsonLocation17);
        org.junit.Assert.assertNotNull(writer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
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
        jsonParser30.overrideCurrentName("/");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = jsonParser30.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not of boolean type? at [Source: [B@45f290aa; line: 1, column: 1]");
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
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
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
        defaultPrettyPrinter34.writeObjectEntrySeparator(jsonGenerator51);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator53 = jsonGenerator28.setPrettyPrinter((com.fasterxml.jackson.core.PrettyPrinter) defaultPrettyPrinter34);
        defaultPrettyPrinter34._nesting = 10;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler56 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext59 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler56, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream60 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer61 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext59, outputStream60);
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler64 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext67 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler64, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream68 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer69 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext67, outputStream68);
        uTF8Writer69.flush();
        java.io.Writer writer72 = uTF8Writer69.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator73 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext59, (-1257689239), objectCodec63, (java.io.Writer) uTF8Writer69);
        com.fasterxml.jackson.core.io.SerializedString serializedString75 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str76 = serializedString75.toString();
        char[] charArray77 = new char[] {};
        int int79 = serializedString75.appendQuoted(charArray77, (int) (byte) 10);
        byte[] byteArray80 = serializedString75.asQuotedUTF8();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator81 = writerBasedJsonGenerator73.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString75);
        defaultPrettyPrinter34.writeStartArray((com.fasterxml.jackson.core.JsonGenerator) writerBasedJsonGenerator73);
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
        org.junit.Assert.assertNotNull(jsonGenerator53);
        org.junit.Assert.assertNotNull(writer72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\n" + "'", str76, "\n");
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[92, 110]");
        org.junit.Assert.assertNotNull(jsonGenerator81);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.sym.Name name6 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.getEmptyName();
        int[] intArray13 = new int[] { (-1257691311), (short) 1, 0, (short) -1, 10, '4' };
        boolean boolean15 = name6.equals(intArray13, (-1));
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding16 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        boolean boolean17 = name6.equals((java.lang.Object) jsonEncoding16);
        iOContext3.setEncoding(jsonEncoding16);
        byte[] byteArray19 = iOContext3.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = iOContext3.constructTextBuffer();
        char[] charArray21 = iOContext3.allocTokenBuffer();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = iOContext3.allocReadIOBuffer();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Trying to call same allocXxx() method second time");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1257691311, 1, 0, -1, 10, 52]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonEncoding16 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding16.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(textBuffer20);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
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
        boolean boolean22 = iOContext19.isResourceManaged();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream30 = null;
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory(objectCodec49);
        com.fasterxml.jackson.core.JsonFactory.Feature feature51 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean53 = feature51.enabledIn(3);
        boolean boolean54 = jsonFactory50.isEnabled(feature51);
        com.fasterxml.jackson.core.JsonParser.Feature feature55 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory50.disable(feature55);
        java.io.OutputStream outputStream57 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator58 = jsonFactory50.createGenerator(outputStream57);
        com.fasterxml.jackson.core.io.IOContext iOContext59 = null;
        byte[] byteArray60 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper63 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext59, byteArray60, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory50.createJsonParser(byteArray60, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int78 = serializableString69.appendQuotedUTF8(byteArray76, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser79 = jsonFactory50.createJsonParser(byteArray76);
        com.fasterxml.jackson.core.JsonParser jsonParser82 = jsonFactory32.createJsonParser(byteArray76, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream85 = new com.fasterxml.jackson.core.io.MergedStream(iOContext29, inputStream30, byteArray76, 10, 2000);
        com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator88 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext19, (-1038366129), objectCodec24, outputStream25, byteArray76, (int) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            uTF8JsonGenerator88.writeFieldName("com.fasterxml.jackson.core.JsonParseException: \n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Can not write a field name, expecting a value");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonGenerator40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(jsonGenerator58);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(jsonParser79);
        org.junit.Assert.assertNotNull(jsonParser82);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        readerBasedJsonParser14.close();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = readerBasedJsonParser14.getLastClearedToken();
        int int19 = readerBasedJsonParser14.nextIntValue(1139113814);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1916231562) + "'", int13 == (-1916231562));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1139113814 + "'", int19 == 1139113814);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        boolean boolean15 = readerBasedJsonParser14.isClosed();
        java.lang.Object obj16 = readerBasedJsonParser14.getInputSource();
        java.lang.String str17 = readerBasedJsonParser14.getValueAsString();
        com.fasterxml.jackson.core.JsonToken jsonToken18 = readerBasedJsonParser14.getCurrentToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1984576414) + "'", int13 == (-1984576414));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(jsonToken18);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.sym.Name name6 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.getEmptyName();
        int[] intArray13 = new int[] { (-1257691311), (short) 1, 0, (short) -1, 10, '4' };
        boolean boolean15 = name6.equals(intArray13, (-1));
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding16 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        boolean boolean17 = name6.equals((java.lang.Object) jsonEncoding16);
        iOContext3.setEncoding(jsonEncoding16);
        boolean boolean19 = iOContext3.isResourceManaged();
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory(objectCodec20);
        com.fasterxml.jackson.core.JsonFactory.Feature feature22 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean24 = feature22.enabledIn(3);
        boolean boolean25 = jsonFactory21.isEnabled(feature22);
        com.fasterxml.jackson.core.JsonParser.Feature feature26 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory21.disable(feature26);
        java.io.OutputStream outputStream28 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = jsonFactory21.createGenerator(outputStream28);
        com.fasterxml.jackson.core.io.IOContext iOContext30 = null;
        byte[] byteArray31 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper34 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext30, byteArray31, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory21.createJsonParser(byteArray31, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory(objectCodec38);
        com.fasterxml.jackson.core.JsonFactory.Feature feature40 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean42 = feature40.enabledIn(3);
        boolean boolean43 = jsonFactory39.isEnabled(feature40);
        com.fasterxml.jackson.core.JsonParser.Feature feature44 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory39.disable(feature44);
        java.io.OutputStream outputStream46 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator47 = jsonFactory39.createGenerator(outputStream46);
        com.fasterxml.jackson.core.io.IOContext iOContext48 = null;
        byte[] byteArray49 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper52 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext48, byteArray49, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser55 = jsonFactory39.createJsonParser(byteArray49, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter57 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString58 = defaultPrettyPrinter57._rootSeparator;
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int67 = serializableString58.appendQuotedUTF8(byteArray65, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser68 = jsonFactory39.createJsonParser(byteArray65);
        com.fasterxml.jackson.core.JsonParser jsonParser71 = jsonFactory21.createJsonParser(byteArray65, 64, 1);
        // The following exception was thrown during execution in test generation
        try {
            iOContext3.releaseReadIOBuffer(byteArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1257691311, 1, 0, -1, 10, 52]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonEncoding16 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding16.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature22.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature26.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature40.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature44.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonGenerator47);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser55);
        org.junit.Assert.assertNotNull(serializableString58);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(jsonParser68);
        org.junit.Assert.assertNotNull(jsonParser71);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = defaultPrettyPrinter1._rootSeparator;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString5 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter4, serializableString5);
        boolean boolean7 = defaultPrettyPrinter6._spacesInObjectEntries;
        defaultPrettyPrinter6.spacesInObjectEntries(false);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter11 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString12 = defaultPrettyPrinter11._rootSeparator;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter13 = defaultPrettyPrinter11._objectIndenter;
        defaultPrettyPrinter6.indentArraysWith(indenter13);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory(objectCodec15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean19 = feature17.enabledIn(3);
        boolean boolean20 = jsonFactory16.isEnabled(feature17);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = new com.fasterxml.jackson.core.JsonFactory(objectCodec21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean25 = feature23.enabledIn(3);
        boolean boolean26 = jsonFactory22.isEnabled(feature23);
        com.fasterxml.jackson.core.JsonParser.Feature feature27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory22.disable(feature27);
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory16.disable(feature27);
        java.io.OutputStream outputStream30 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = jsonFactory16.createGenerator(outputStream30);
        indenter13.writeIndentation(jsonGenerator31, (int) ' ');
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = jsonGenerator31.setCodec(objectCodec34);
        int int36 = jsonGenerator31.getFeatureMask();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonGenerator31.useDefaultPrettyPrinter();
        java.lang.Object obj38 = jsonGenerator37.getOutputTarget();
        defaultPrettyPrinter1.beforeObjectEntries(jsonGenerator37);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter41 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString42 = defaultPrettyPrinter41._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler43 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer44 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler43);
        char[] charArray45 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer44.resetWithShared(charArray45, 2000, 2000);
        int int50 = serializableString42.appendUnquoted(charArray45, 0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator51 = jsonGenerator37.setRootValueSeparator(serializableString42);
        com.fasterxml.jackson.core.Base64Variant base64Variant52 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator37.writeBinary(base64Variant52, byteArray64, (-1252589661), (-1257555743));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableString2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(serializableString12);
        org.junit.Assert.assertNotNull(indenter13);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature27.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 79 + "'", int36 == 79);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(serializableString42);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(jsonGenerator51);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature59.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory60);
        org.junit.Assert.assertNotNull(jsonGenerator62);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser70);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
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
        java.lang.Class<?> wildcardClass98 = mergedStream91.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
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
        char[] charArray17 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.SPACES;
        textBuffer16.append(charArray17, (int) (byte) 0, (int) (short) 1);
        boolean boolean24 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(charArray17, (-1252963027), 1139113814, false);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal27 = com.fasterxml.jackson.core.io.NumberInput.parseBigDecimal(charArray17, 1695735146, (-1834102786));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1834102786");
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
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "                                                                ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "                                                                ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature67 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory68 = jsonFactory66.enable(feature67);
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
        org.junit.Assert.assertTrue("'" + feature67 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature67.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory68);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        java.lang.String str17 = readerBasedJsonParser14.getText();
        long long18 = readerBasedJsonParser14.getTokenCharacterOffset();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1882743274 + "'", int13 == 1882743274);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        java.lang.String str17 = readerBasedJsonParser14.getText();
        int int18 = readerBasedJsonParser14.getTokenColumnNr();
        boolean boolean19 = readerBasedJsonParser14.isClosed();
        java.lang.String str20 = readerBasedJsonParser14.getValueAsString();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-532588472) + "'", int13 == (-532588472));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator40 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext26, (-1257689239), objectCodec30, (java.io.Writer) uTF8Writer36);
        com.fasterxml.jackson.core.Version version41 = writerBasedJsonGenerator40.version();
        writerBasedJsonGenerator40.writeNumber((float) 10L);
        defaultPrettyPrinter3.writeObjectFieldValueSeparator((com.fasterxml.jackson.core.JsonGenerator) writerBasedJsonGenerator40);
        writerBasedJsonGenerator40.flush();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler46 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext49 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler46, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream50 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer51 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext49, outputStream50);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding52 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext49.setEncoding(jsonEncoding52);
        java.io.Reader reader55 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer57 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int59 = charsToNameCanonicalizer57.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser60 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext49, (-1252931262), reader55, objectCodec56, charsToNameCanonicalizer57);
        java.lang.Object obj61 = readerBasedJsonParser60.getEmbeddedObject();
        java.lang.String str62 = readerBasedJsonParser60.getCurrentName();
        int int63 = readerBasedJsonParser60.getValueAsInt();
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator40.copyCurrentStructure((com.fasterxml.jackson.core.JsonParser) readerBasedJsonParser60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + jsonEncoding52 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding52.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer57);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-168738972) + "'", int59 == (-168738972));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler1 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext4 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler1, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer6 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext4, outputStream5);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding7 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext4.setEncoding(jsonEncoding7);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer12 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int14 = charsToNameCanonicalizer12.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext4, (-1252931262), reader10, objectCodec11, charsToNameCanonicalizer12);
        boolean boolean16 = readerBasedJsonParser15.isClosed();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder17 = readerBasedJsonParser15._getByteArrayBuilder();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer18 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext0, (java.io.OutputStream) byteArrayBuilder17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding7 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding7.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer12);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1254604042) + "'", int14 == (-1254604042));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArrayBuilder17);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
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
        int int33 = jsonParser31.getValueAsInt((-1253025339));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = jsonParser31.nextTextValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unexpected character ('/' (code 47)): maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)? at [Source: java.io.StringReader@40608aa6; line: 1, column: 2]");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1253025339) + "'", int33 == (-1253025339));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator20 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext6, (-1257689239), objectCodec10, (java.io.Writer) uTF8Writer16);
        com.fasterxml.jackson.core.io.SerializedString serializedString22 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str23 = serializedString22.toString();
        char[] charArray24 = new char[] {};
        int int26 = serializedString22.appendQuoted(charArray24, (int) (byte) 10);
        byte[] byteArray27 = serializedString22.asQuotedUTF8();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = writerBasedJsonGenerator20.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString22);
        lf2SpacesIndenter2.writeIndentation(jsonGenerator28, (-1257689239));
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = new com.fasterxml.jackson.core.JsonFactory(objectCodec52);
        com.fasterxml.jackson.core.JsonFactory.Feature feature54 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean56 = feature54.enabledIn(3);
        boolean boolean57 = jsonFactory53.isEnabled(feature54);
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = new com.fasterxml.jackson.core.JsonFactory(objectCodec58);
        com.fasterxml.jackson.core.JsonFactory.Feature feature60 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean62 = feature60.enabledIn(3);
        boolean boolean63 = jsonFactory59.isEnabled(feature60);
        com.fasterxml.jackson.core.JsonParser.Feature feature64 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory65 = jsonFactory59.disable(feature64);
        com.fasterxml.jackson.core.JsonFactory jsonFactory66 = jsonFactory53.disable(feature64);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler67 = jsonFactory66._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer68 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler67);
        java.lang.String str69 = textBuffer68.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator47.writeObjectId((java.lang.Object) str69);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No native support for writing Object Ids");
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
        org.junit.Assert.assertTrue("'" + feature54 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature54.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + feature60 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature60.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + feature64 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature64.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory65);
        org.junit.Assert.assertNotNull(jsonFactory66);
        org.junit.Assert.assertNotNull(bufferRecycler67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler1 = jsonFactory0._getBufferRecycler();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createJsonParser("[Source: INTERN_FIELD_NAMES; line: 10, column: -1]");
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory0.createParser("UTF-16BE");
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory0.copy();
        org.junit.Assert.assertNotNull(bufferRecycler1);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonFactory6);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1257689239), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean19 = writerBasedJsonGenerator17.isEnabled(feature18);
        com.fasterxml.jackson.core.io.SerializedString serializedString21 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str22 = serializedString21.toString();
        char[] charArray23 = new char[] {};
        int int25 = serializedString21.appendQuoted(charArray23, (int) (byte) 10);
        int int26 = serializedString21.charLength();
        java.lang.String str27 = serializedString21.getValue();
        writerBasedJsonGenerator17.writeRaw((com.fasterxml.jackson.core.SerializableString) serializedString21);
        byte[] byteArray29 = serializedString21.asQuotedUTF8();
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature18.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n" + "'", str27, "\n");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[92, 110]");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1257689239), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        writerBasedJsonGenerator17.writeNumber((float) 10L);
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator38 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext24, (-1257689239), objectCodec28, (java.io.Writer) uTF8Writer34);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature39 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean40 = writerBasedJsonGenerator38.isEnabled(feature39);
        com.fasterxml.jackson.core.io.SerializedString serializedString42 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str43 = serializedString42.toString();
        char[] charArray44 = new char[] {};
        int int46 = serializedString42.appendQuoted(charArray44, (int) (byte) 10);
        int int47 = serializedString42.charLength();
        java.lang.String str48 = serializedString42.getValue();
        writerBasedJsonGenerator38.writeRaw((com.fasterxml.jackson.core.SerializableString) serializedString42);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter51 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString52 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter53 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter51, serializableString52);
        boolean boolean54 = defaultPrettyPrinter53._spacesInObjectEntries;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter55 = null;
        defaultPrettyPrinter53._arrayIndenter = indenter55;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter fixedSpaceIndenter57 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        defaultPrettyPrinter53._objectIndenter = fixedSpaceIndenter57;
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator76 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext62, (-1257689239), objectCodec66, (java.io.Writer) uTF8Writer72);
        defaultPrettyPrinter53.beforeObjectEntries((com.fasterxml.jackson.core.JsonGenerator) writerBasedJsonGenerator76);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter79 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString80 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter81 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter79, serializableString80);
        com.fasterxml.jackson.core.SerializableString serializableString82 = defaultPrettyPrinter79._rootSeparator;
        writerBasedJsonGenerator76.writeString(serializableString82);
        writerBasedJsonGenerator38._writeFieldName(serializableString82, true);
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator17.writeFieldName(serializableString82);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Can not write a field name, expecting a value");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(writer37);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature39.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\n" + "'", str43, "\n");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\n" + "'", str48, "\n");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(fixedSpaceIndenter57);
        org.junit.Assert.assertNotNull(writer75);
        org.junit.Assert.assertNotNull(serializableString82);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
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
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder77 = readerBasedJsonParser14._getByteArrayBuilder();
        com.fasterxml.jackson.core.JsonLocation jsonLocation78 = readerBasedJsonParser14.getCurrentLocation();
        char[] charArray79 = readerBasedJsonParser14.getTextCharacters();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1283245158) + "'", int13 == (-1283245158));
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
        org.junit.Assert.assertNotNull(byteArrayBuilder77);
        org.junit.Assert.assertNotNull(jsonLocation78);
        org.junit.Assert.assertNull(charArray79);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
        java.net.URL uRL31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser32 = jsonFactory1.createJsonParser(uRL31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.fasterxml.jackson.core.io.NumberInput numberInput0 = new com.fasterxml.jackson.core.io.NumberInput();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
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
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory24.copy();
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory25.createJsonParser("2.2250738585072012e-308");
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createParser("com.fasterxml.jackson.core.JsonParseException: \n\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.Version version30 = jsonFactory25.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory(objectCodec31);
        java.io.Reader reader33 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory32.createParser(reader33);
        boolean boolean35 = jsonParser34.requiresCustomCodec();
        java.lang.String str36 = jsonParser34.getText();
        java.lang.Object obj37 = jsonParser34.getObjectId();
        boolean boolean38 = jsonParser34.isExpectedStartArrayToken();
        boolean boolean39 = jsonParser34.hasCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = new com.fasterxml.jackson.core.JsonFactory(objectCodec40);
        com.fasterxml.jackson.core.JsonFactory.Feature feature42 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean44 = feature42.enabledIn(3);
        boolean boolean45 = jsonFactory41.isEnabled(feature42);
        com.fasterxml.jackson.core.JsonParser.Feature feature46 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = jsonFactory41.disable(feature46);
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonParser34.enable(feature46);
        boolean boolean49 = jsonFactory25.isEnabled(feature46);
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
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(version30);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature42.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + feature46 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature46.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory47);
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
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
        boolean boolean20 = jsonFactory15.requiresCustomCodec();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        java.lang.String str16 = readerBasedJsonParser14.getText();
        int int17 = readerBasedJsonParser14.getTokenLineNr();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext21 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler18, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer23 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext21, outputStream22);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding24 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext21.setEncoding(jsonEncoding24);
        java.io.Reader reader27 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer29 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int31 = charsToNameCanonicalizer29.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser32 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext21, (-1252931262), reader27, objectCodec28, charsToNameCanonicalizer29);
        int int33 = readerBasedJsonParser32.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = new com.fasterxml.jackson.core.JsonFactory(objectCodec34);
        com.fasterxml.jackson.core.JsonFactory.Feature feature36 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean38 = feature36.enabledIn(3);
        boolean boolean39 = jsonFactory35.isEnabled(feature36);
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = new com.fasterxml.jackson.core.JsonFactory(objectCodec40);
        com.fasterxml.jackson.core.JsonFactory.Feature feature42 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean44 = feature42.enabledIn(3);
        boolean boolean45 = jsonFactory41.isEnabled(feature42);
        com.fasterxml.jackson.core.JsonParser.Feature feature46 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = jsonFactory41.disable(feature46);
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = jsonFactory35.disable(feature46);
        java.lang.String str49 = jsonFactory35.getFormatName();
        java.io.InputStream inputStream50 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonFactory35.createParser(inputStream50);
        long long52 = jsonParser51.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = new com.fasterxml.jackson.core.JsonFactory(objectCodec53);
        java.io.Reader reader55 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory54.createParser(reader55);
        boolean boolean57 = jsonParser56.requiresCustomCodec();
        java.lang.String str58 = jsonParser56.getText();
        java.lang.Object obj59 = jsonParser56.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter61 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString62 = defaultPrettyPrinter61._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler63 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer64 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler63);
        char[] charArray65 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer64.resetWithShared(charArray65, 2000, 2000);
        int int70 = serializableString62.appendUnquoted(charArray65, 0);
        boolean boolean71 = jsonParser56.nextFieldName(serializableString62);
        com.fasterxml.jackson.core.Version version72 = jsonParser56.version();
        double double74 = jsonParser56.getValueAsDouble((double) (byte) -1);
        char[] charArray75 = jsonParser56.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec76 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory77 = new com.fasterxml.jackson.core.JsonFactory(objectCodec76);
        com.fasterxml.jackson.core.JsonFactory.Feature feature78 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean80 = feature78.enabledIn(3);
        boolean boolean81 = jsonFactory77.isEnabled(feature78);
        com.fasterxml.jackson.core.ObjectCodec objectCodec82 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory83 = new com.fasterxml.jackson.core.JsonFactory(objectCodec82);
        com.fasterxml.jackson.core.JsonFactory.Feature feature84 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean86 = feature84.enabledIn(3);
        boolean boolean87 = jsonFactory83.isEnabled(feature84);
        com.fasterxml.jackson.core.JsonParser.Feature feature88 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory89 = jsonFactory83.disable(feature88);
        com.fasterxml.jackson.core.JsonFactory jsonFactory90 = jsonFactory77.disable(feature88);
        com.fasterxml.jackson.core.JsonParser jsonParser91 = jsonParser56.enable(feature88);
        com.fasterxml.jackson.core.JsonParser jsonParser93 = jsonParser51.configure(feature88, true);
        com.fasterxml.jackson.core.JsonParser jsonParser94 = readerBasedJsonParser32.enable(feature88);
        com.fasterxml.jackson.core.JsonParser jsonParser96 = readerBasedJsonParser14.configure(feature88, true);
        int int98 = readerBasedJsonParser14.getValueAsInt(305111392);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1448575978) + "'", int13 == (-1448575978));
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + jsonEncoding24 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding24.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer29);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1370305192) + "'", int31 == (-1370305192));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature36.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature42.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + feature46 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature46.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory47);
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "JSON" + "'", str49, "JSON");
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(serializableString62);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(version72);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertNull(charArray75);
        org.junit.Assert.assertTrue("'" + feature78 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature78.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + feature84 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature84.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + feature88 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature88.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory89);
        org.junit.Assert.assertNotNull(jsonFactory90);
        org.junit.Assert.assertNotNull(jsonParser91);
        org.junit.Assert.assertNotNull(jsonParser93);
        org.junit.Assert.assertNotNull(jsonParser94);
        org.junit.Assert.assertNotNull(jsonParser96);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 305111392 + "'", int98 == 305111392);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1257689239), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        writerBasedJsonGenerator17.writeRaw("com.fasterxml.jackson.core.JsonParseException: \n\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext21 = writerBasedJsonGenerator17.getOutputContext();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = writerBasedJsonGenerator17.useDefaultPrettyPrinter();
        boolean boolean23 = writerBasedJsonGenerator17.canWriteObjectId();
        int int24 = writerBasedJsonGenerator17.getFeatureMask();
        boolean boolean25 = writerBasedJsonGenerator17.canWriteTypeId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter27 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString28 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter29 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter27, serializableString28);
        boolean boolean30 = defaultPrettyPrinter29._spacesInObjectEntries;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter31 = null;
        defaultPrettyPrinter29._arrayIndenter = indenter31;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter fixedSpaceIndenter33 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        defaultPrettyPrinter29._objectIndenter = fixedSpaceIndenter33;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext38 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler35, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream39 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer40 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext38, outputStream39);
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler43 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext46 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler43, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream47 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer48 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext46, outputStream47);
        uTF8Writer48.flush();
        java.io.Writer writer51 = uTF8Writer48.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator52 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext38, (-1257689239), objectCodec42, (java.io.Writer) uTF8Writer48);
        defaultPrettyPrinter29.beforeObjectEntries((com.fasterxml.jackson.core.JsonGenerator) writerBasedJsonGenerator52);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter55 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString56 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter57 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter55, serializableString56);
        com.fasterxml.jackson.core.SerializableString serializableString58 = defaultPrettyPrinter55._rootSeparator;
        writerBasedJsonGenerator52.writeString(serializableString58);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator60 = writerBasedJsonGenerator17.setRootValueSeparator(serializableString58);
        writerBasedJsonGenerator17.writeNull();
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator17.writeEndObject();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Current context not an object but ROOT");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(jsonWriteContext21);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1257689239) + "'", int24 == (-1257689239));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fixedSpaceIndenter33);
        org.junit.Assert.assertNotNull(writer51);
        org.junit.Assert.assertNotNull(serializableString58);
        org.junit.Assert.assertNotNull(jsonGenerator60);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.fasterxml.jackson.core.sym.Name name0 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.getEmptyName();
        boolean boolean3 = name0.equals((int) (short) 1, (int) (short) -1);
        java.lang.String str4 = name0.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext8 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler5, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream9 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer10 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext8, outputStream9);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding11 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext8.setEncoding(jsonEncoding11);
        java.io.Reader reader14 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer16 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int18 = charsToNameCanonicalizer16.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser19 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext8, (-1252931262), reader14, objectCodec15, charsToNameCanonicalizer16);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder20 = readerBasedJsonParser19._getByteArrayBuilder();
        boolean boolean21 = name0.equals((java.lang.Object) byteArrayBuilder20);
        int[] intArray22 = com.fasterxml.jackson.core.io.CharTypes.getInputCodeUtf8JsNames();
        boolean boolean24 = name0.equals(intArray22, 1119726734);
        org.junit.Assert.assertNotNull(name0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + jsonEncoding11 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding11.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer16);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1337425384 + "'", int18 == 1337425384);
        org.junit.Assert.assertNotNull(byteArrayBuilder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 0, -1, -1, -1, -1, -1, 0, 0, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, -1, -1, -1, -1, 0, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        java.lang.Object obj6 = jsonParser3.getObjectId();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = jsonParser3.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
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
            uTF32Reader88.mark((-1257617019));
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark() not supported");
        } catch (java.io.IOException e) {
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
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
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
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder77 = readerBasedJsonParser14._getByteArrayBuilder();
        int int78 = readerBasedJsonParser14.getValueAsInt();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1382200258) + "'", int13 == (-1382200258));
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
        org.junit.Assert.assertNotNull(byteArrayBuilder77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        java.lang.Object obj6 = jsonParser3.getObjectId();
        boolean boolean7 = jsonParser3.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonParser3.skipChildren();
        com.fasterxml.jackson.core.Base64Variant base64Variant9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory(objectCodec10);
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean14 = feature12.enabledIn(3);
        boolean boolean15 = jsonFactory11.isEnabled(feature12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory(objectCodec16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean20 = feature18.enabledIn(3);
        boolean boolean21 = jsonFactory17.isEnabled(feature18);
        com.fasterxml.jackson.core.JsonParser.Feature feature22 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory17.disable(feature22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory11.disable(feature22);
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = jsonFactory11.createGenerator(outputStream25);
        com.fasterxml.jackson.core.JsonParser.Feature feature27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory11.configure(feature27, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext33 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler30, (java.lang.Object) (byte) -1, true);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext37 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler34, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream38 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer39 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext37, outputStream38);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding40 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext37.setEncoding(jsonEncoding40);
        java.io.Reader reader43 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer45 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int47 = charsToNameCanonicalizer45.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser48 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext37, (-1252931262), reader43, objectCodec44, charsToNameCanonicalizer45);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder49 = readerBasedJsonParser48._getByteArrayBuilder();
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer50 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext33, (java.io.OutputStream) byteArrayBuilder49);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator51 = jsonFactory11.createGenerator((java.io.OutputStream) byteArrayBuilder49);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = jsonParser8.readBinaryValue(base64Variant9, (java.io.OutputStream) byteArrayBuilder49);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature22.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonGenerator26);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature27.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertTrue("'" + jsonEncoding40 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding40.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer45);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1282940918) + "'", int47 == (-1282940918));
        org.junit.Assert.assertNotNull(byteArrayBuilder49);
        org.junit.Assert.assertNotNull(jsonGenerator51);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createJsonParser(inputStream2);
        java.lang.Object obj4 = jsonParser3.getEmbeddedObject();
        java.lang.String str5 = jsonParser3.getValueAsString();
        int int7 = jsonParser3.getValueAsInt(1876979570);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1876979570 + "'", int7 == 1876979570);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
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
        boolean boolean89 = uTF32Reader88.ready();
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
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        uTF8Writer5.flush();
        uTF8Writer5.write("false", 1267367954, (-1253025339));
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = jsonFactory25._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType28 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TOKEN_BUFFER;
        char[] charArray29 = bufferRecycler26.allocCharBuffer(charBufferType28);
        uTF8Writer5.write(charArray29);
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature13.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(bufferRecycler26);
        org.junit.Assert.assertTrue("'" + charBufferType28 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TOKEN_BUFFER + "'", charBufferType28.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TOKEN_BUFFER));
        org.junit.Assert.assertNotNull(charArray29);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
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
        boolean boolean22 = iOContext19.isResourceManaged();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream30 = null;
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory(objectCodec49);
        com.fasterxml.jackson.core.JsonFactory.Feature feature51 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean53 = feature51.enabledIn(3);
        boolean boolean54 = jsonFactory50.isEnabled(feature51);
        com.fasterxml.jackson.core.JsonParser.Feature feature55 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory50.disable(feature55);
        java.io.OutputStream outputStream57 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator58 = jsonFactory50.createGenerator(outputStream57);
        com.fasterxml.jackson.core.io.IOContext iOContext59 = null;
        byte[] byteArray60 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper63 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext59, byteArray60, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory50.createJsonParser(byteArray60, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int78 = serializableString69.appendQuotedUTF8(byteArray76, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser79 = jsonFactory50.createJsonParser(byteArray76);
        com.fasterxml.jackson.core.JsonParser jsonParser82 = jsonFactory32.createJsonParser(byteArray76, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream85 = new com.fasterxml.jackson.core.io.MergedStream(iOContext29, inputStream30, byteArray76, 10, 2000);
        com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator88 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext19, (-1038366129), objectCodec24, outputStream25, byteArray76, (int) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            uTF8JsonGenerator88.writeFieldName("false");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Can not write a field name, expecting a value");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonGenerator40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(jsonGenerator58);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(jsonParser79);
        org.junit.Assert.assertNotNull(jsonParser82);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        double double16 = readerBasedJsonParser14.getValueAsDouble(100.0d);
        long long18 = readerBasedJsonParser14.nextLongValue((long) 195013398);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 723458402 + "'", int13 == 723458402);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 195013398L + "'", long18 == 195013398L);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
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
        boolean boolean22 = iOContext19.isResourceManaged();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream30 = null;
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory(objectCodec49);
        com.fasterxml.jackson.core.JsonFactory.Feature feature51 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean53 = feature51.enabledIn(3);
        boolean boolean54 = jsonFactory50.isEnabled(feature51);
        com.fasterxml.jackson.core.JsonParser.Feature feature55 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory50.disable(feature55);
        java.io.OutputStream outputStream57 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator58 = jsonFactory50.createGenerator(outputStream57);
        com.fasterxml.jackson.core.io.IOContext iOContext59 = null;
        byte[] byteArray60 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper63 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext59, byteArray60, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory50.createJsonParser(byteArray60, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int78 = serializableString69.appendQuotedUTF8(byteArray76, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser79 = jsonFactory50.createJsonParser(byteArray76);
        com.fasterxml.jackson.core.JsonParser jsonParser82 = jsonFactory32.createJsonParser(byteArray76, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream85 = new com.fasterxml.jackson.core.io.MergedStream(iOContext29, inputStream30, byteArray76, 10, 2000);
        com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator88 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext19, (-1038366129), objectCodec24, outputStream25, byteArray76, (int) (short) 0, false);
        java.math.BigInteger bigInteger89 = null;
        uTF8JsonGenerator88.writeNumber(bigInteger89);
        // The following exception was thrown during execution in test generation
        try {
            uTF8JsonGenerator88.writeString("");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonGenerator40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(jsonGenerator58);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[110, 117, 108, 108, 32, 34]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(jsonParser79);
        org.junit.Assert.assertNotNull(jsonParser82);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        boolean boolean17 = readerBasedJsonParser14.hasTextCharacters();
        com.fasterxml.jackson.core.JsonToken jsonToken18 = readerBasedJsonParser14.getLastClearedToken();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 733384336 + "'", int13 == 733384336);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jsonToken18);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = readerBasedJsonParser14.skipChildren();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory(objectCodec17);
        com.fasterxml.jackson.core.JsonFactory.Feature feature19 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean21 = feature19.enabledIn(3);
        boolean boolean22 = jsonFactory18.isEnabled(feature19);
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory(objectCodec23);
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(3);
        boolean boolean28 = jsonFactory24.isEnabled(feature25);
        com.fasterxml.jackson.core.JsonParser.Feature feature29 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory24.disable(feature29);
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory18.disable(feature29);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes32 = jsonFactory31.getCharacterEscapes();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator33 = jsonFactory31.getOutputDecorator();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes34 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory31.setCharacterEscapes(characterEscapes34);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory31.enable(feature36);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonParser16.disable(feature36);
        boolean boolean39 = jsonParser38.canReadTypeId();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-743834664) + "'", int13 == (-743834664));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature29.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNull(characterEscapes32);
        org.junit.Assert.assertNull(outputDecorator33);
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = readerBasedJsonParser14.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = readerBasedJsonParser14.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-107742442) + "'", int13 == (-107742442));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(jsonParser16);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str2 = serializedString1.toString();
        char[] charArray3 = new char[] {};
        int int5 = serializedString1.appendQuoted(charArray3, (int) (byte) 10);
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
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType22 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER;
        char[] charArray24 = bufferRecycler21.allocCharBuffer(charBufferType22, (int) (byte) 0);
        int int27 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray24, (int) (byte) 10, 100);
        int int29 = serializedString1.appendUnquoted(charArray24, 4);
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer30 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int32 = charsToNameCanonicalizer30.calcHash("com.fasterxml.jackson.core.JsonParseException: \n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.JsonToken jsonToken33 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
        char[] charArray34 = jsonToken33.asCharArray();
        int int37 = charsToNameCanonicalizer30.calcHash(charArray34, 467784326, (-1257621891));
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        char[] charArray40 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer39.resetWithShared(charArray40, 2000, 2000);
        java.lang.String str47 = charsToNameCanonicalizer30.findSymbol(charArray40, (-48), (-1257604717), 1970475206);
        int int49 = serializedString1.appendQuoted(charArray40, 609325014);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
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
        org.junit.Assert.assertTrue("'" + charBufferType22 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER + "'", charBufferType22.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "\000\000\000\000\n\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "\000\000\000\000\n\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[\000, \000, \000, \000, \n, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1038366032) + "'", int27 == (-1038366032));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer30);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2080961783) + "'", int32 == (-2080961783));
        org.junit.Assert.assertTrue("'" + jsonToken33 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken33.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "{");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "{");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[{]");
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1257466431) + "'", int37 == (-1257466431));
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1257689239), objectCodec7, (java.io.Writer) uTF8Writer13);
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
        writerBasedJsonGenerator17.writeRaw(" \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator40 = writerBasedJsonGenerator17.setHighestNonEscapedChar(225095440);
        com.fasterxml.jackson.core.FormatSchema formatSchema41 = writerBasedJsonGenerator17.getSchema();
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(jsonWriteContext21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(jsonGenerator40);
        org.junit.Assert.assertNull(formatSchema41);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
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
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.fasterxml.jackson.core.io.NumberInput.parseInt("com.fasterxml.jackson.core.JsonParseException: hi!\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"com.fasterxml.jackson.core.JsonParseException: hi!? at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
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
        boolean boolean22 = iOContext19.isResourceManaged();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream30 = null;
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory(objectCodec49);
        com.fasterxml.jackson.core.JsonFactory.Feature feature51 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean53 = feature51.enabledIn(3);
        boolean boolean54 = jsonFactory50.isEnabled(feature51);
        com.fasterxml.jackson.core.JsonParser.Feature feature55 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory50.disable(feature55);
        java.io.OutputStream outputStream57 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator58 = jsonFactory50.createGenerator(outputStream57);
        com.fasterxml.jackson.core.io.IOContext iOContext59 = null;
        byte[] byteArray60 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper63 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext59, byteArray60, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory50.createJsonParser(byteArray60, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int78 = serializableString69.appendQuotedUTF8(byteArray76, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser79 = jsonFactory50.createJsonParser(byteArray76);
        com.fasterxml.jackson.core.JsonParser jsonParser82 = jsonFactory32.createJsonParser(byteArray76, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream85 = new com.fasterxml.jackson.core.io.MergedStream(iOContext29, inputStream30, byteArray76, 10, 2000);
        com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator88 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext19, (-1038366129), objectCodec24, outputStream25, byteArray76, (int) (short) 0, false);
        com.fasterxml.jackson.core.io.SerializedString serializedString90 = new com.fasterxml.jackson.core.io.SerializedString("ROOT");
        uTF8JsonGenerator88.writeRaw((com.fasterxml.jackson.core.SerializableString) serializedString90);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonGenerator40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(jsonGenerator58);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[82, 79, 79, 84, 1, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(jsonParser79);
        org.junit.Assert.assertNotNull(jsonParser82);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory(objectCodec25);
        com.fasterxml.jackson.core.JsonFactory.Feature feature27 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean29 = feature27.enabledIn(3);
        boolean boolean30 = jsonFactory26.isEnabled(feature27);
        com.fasterxml.jackson.core.JsonParser.Feature feature31 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory26.disable(feature31);
        java.io.OutputStream outputStream33 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = jsonFactory26.createGenerator(outputStream33);
        com.fasterxml.jackson.core.io.IOContext iOContext35 = null;
        byte[] byteArray36 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper39 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext35, byteArray36, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonFactory26.createJsonParser(byteArray36, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter44 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString45 = defaultPrettyPrinter44._rootSeparator;
        byte[] byteArray52 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int54 = serializableString45.appendQuotedUTF8(byteArray52, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser55 = jsonFactory26.createJsonParser(byteArray52);
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory14.createJsonParser(byteArray52);
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
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature27.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature31.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(jsonGenerator34);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertNotNull(serializableString45);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(jsonParser55);
        org.junit.Assert.assertNotNull(jsonParser56);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        long long17 = readerBasedJsonParser14.getValueAsLong((long) 929756480);
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1921918804 + "'", int13 == 1921918804);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 929756480L + "'", long17 == 929756480L);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
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
        java.lang.String str31 = jsonParser30.getValueAsString();
        int int32 = jsonParser30.getFeatureMask();
        java.lang.String str33 = jsonParser30.getValueAsString();
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        byte[] byteArray6 = iOContext3.allocReadIOBuffer();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler9, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream13 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer14 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext12, outputStream13);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding15 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext12.setEncoding(jsonEncoding15);
        java.io.Reader reader18 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer20 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int22 = charsToNameCanonicalizer20.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser23 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext12, (-1252931262), reader18, objectCodec19, charsToNameCanonicalizer20);
        boolean boolean24 = readerBasedJsonParser23.isClosed();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder25 = readerBasedJsonParser23._getByteArrayBuilder();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator26 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext3, 1882743274, objectCodec8, (java.io.OutputStream) byteArrayBuilder25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Trying to call same allocXxx() method second time");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertTrue("'" + jsonEncoding15 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding15.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer20);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 249591182 + "'", int22 == 249591182);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArrayBuilder25);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
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
        byte[] byteArray21 = iOContext19.allocWriteEncodingBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext25 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler22, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer27 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext25, outputStream26);
        com.fasterxml.jackson.core.sym.Name name28 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.getEmptyName();
        int[] intArray35 = new int[] { (-1257691311), (short) 1, 0, (short) -1, 10, '4' };
        boolean boolean37 = name28.equals(intArray35, (-1));
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding38 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        boolean boolean39 = name28.equals((java.lang.Object) jsonEncoding38);
        iOContext25.setEncoding(jsonEncoding38);
        byte[] byteArray41 = iOContext25.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer42 = iOContext25.constructTextBuffer();
        char[] charArray43 = iOContext25.allocTokenBuffer();
        // The following exception was thrown during execution in test generation
        try {
            iOContext19.releaseTokenBuffer(charArray43);
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
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1257691311, 1, 0, -1, 10, 52]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + jsonEncoding38 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding38.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertNotNull(textBuffer42);
        org.junit.Assert.assertNotNull(charArray43);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonFactory1.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory(objectCodec5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean9 = feature7.enabledIn(3);
        boolean boolean10 = jsonFactory6.isEnabled(feature7);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory(objectCodec11);
        com.fasterxml.jackson.core.JsonFactory.Feature feature13 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean15 = feature13.enabledIn(3);
        boolean boolean16 = jsonFactory12.isEnabled(feature13);
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory12.disable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory6.disable(feature17);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory(objectCodec20);
        com.fasterxml.jackson.core.JsonFactory.Feature feature22 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean24 = feature22.enabledIn(3);
        boolean boolean25 = jsonFactory21.isEnabled(feature22);
        com.fasterxml.jackson.core.JsonParser.Feature feature26 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory21.disable(feature26);
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory19.configure(feature26, true);
        boolean boolean30 = jsonFactory1.isEnabled(feature26);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature13.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature22.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature26.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        boolean boolean15 = readerBasedJsonParser14.isClosed();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = readerBasedJsonParser14.getCurrentLocation();
        com.fasterxml.jackson.core.SerializableString serializableString17 = null;
        boolean boolean18 = readerBasedJsonParser14.nextFieldName(serializableString17);
        com.fasterxml.jackson.core.Version version19 = readerBasedJsonParser14.version();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-591535596) + "'", int13 == (-591535596));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonLocation16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(version19);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
        com.fasterxml.jackson.core.sym.Name name6 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.getEmptyName();
        int[] intArray13 = new int[] { (-1257691311), (short) 1, 0, (short) -1, 10, '4' };
        boolean boolean15 = name6.equals(intArray13, (-1));
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding16 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        boolean boolean17 = name6.equals((java.lang.Object) jsonEncoding16);
        iOContext3.setEncoding(jsonEncoding16);
        byte[] byteArray19 = iOContext3.allocReadIOBuffer();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = iOContext3.constructTextBuffer();
        char[] charArray21 = iOContext3.allocTokenBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        textBuffer23.append(' ');
        textBuffer23.resetWithString("hi!");
        textBuffer23.append(' ');
        java.lang.String str30 = textBuffer23.contentsAsString();
        int int31 = textBuffer23.size();
        char[] charArray32 = textBuffer23.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            iOContext3.releaseTokenBuffer(charArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1257691311, 1, 0, -1, 10, 52]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonEncoding16 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding16.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(textBuffer20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " " + "'", str30, " ");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[ ]");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("", (-1253023904));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1253023904) + "'", int2 == (-1253023904));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
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
        int int17 = jsonParser15.nextIntValue((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
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
        boolean boolean22 = iOContext19.isResourceManaged();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream30 = null;
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory(objectCodec49);
        com.fasterxml.jackson.core.JsonFactory.Feature feature51 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean53 = feature51.enabledIn(3);
        boolean boolean54 = jsonFactory50.isEnabled(feature51);
        com.fasterxml.jackson.core.JsonParser.Feature feature55 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory50.disable(feature55);
        java.io.OutputStream outputStream57 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator58 = jsonFactory50.createGenerator(outputStream57);
        com.fasterxml.jackson.core.io.IOContext iOContext59 = null;
        byte[] byteArray60 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper63 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext59, byteArray60, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory50.createJsonParser(byteArray60, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int78 = serializableString69.appendQuotedUTF8(byteArray76, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser79 = jsonFactory50.createJsonParser(byteArray76);
        com.fasterxml.jackson.core.JsonParser jsonParser82 = jsonFactory32.createJsonParser(byteArray76, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream85 = new com.fasterxml.jackson.core.io.MergedStream(iOContext29, inputStream30, byteArray76, 10, 2000);
        com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator88 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext19, (-1038366129), objectCodec24, outputStream25, byteArray76, (int) (short) 0, false);
        uTF8JsonGenerator88.writeRaw('a');
        // The following exception was thrown during execution in test generation
        try {
            uTF8JsonGenerator88.writeNumber((float) (-1448575978));
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonGenerator40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(jsonGenerator58);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[97, 45, 49, 46, 52, 52]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(jsonParser79);
        org.junit.Assert.assertNotNull(jsonParser82);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
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
        java.lang.String str17 = textBuffer16.contentsAsString();
        textBuffer16.setCurrentLength((int) (short) 1);
        char[] charArray20 = textBuffer16.contentsAsArray();
        textBuffer16.releaseBuffers();
        textBuffer16.ensureNotShared();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[]");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1257689239), objectCodec7, (java.io.Writer) uTF8Writer13);
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
        byte[] byteArray64 = serializedString61.asQuotedUTF8();
        int int66 = serializedString24.appendUnquotedUTF8(byteArray64, (int) (byte) 1);
        com.fasterxml.jackson.core.io.SerializedString serializedString68 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray69 = serializedString68.asQuotedUTF8();
        java.lang.String str70 = serializedString68.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler71 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext74 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler71, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream75 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer76 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext74, outputStream75);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding77 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext74.setEncoding(jsonEncoding77);
        java.io.Reader reader80 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec81 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer82 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int84 = charsToNameCanonicalizer82.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser85 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext74, (-1252931262), reader80, objectCodec81, charsToNameCanonicalizer82);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder86 = readerBasedJsonParser85._getByteArrayBuilder();
        int int87 = serializedString68.writeUnquotedUTF8((java.io.OutputStream) byteArrayBuilder86);
        int int88 = serializedString24.writeQuotedUTF8((java.io.OutputStream) byteArrayBuilder86);
        byte[] byteArray89 = serializedString24.asUnquotedUTF8();
        java.lang.String str90 = serializedString24.getValue();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[92, 10]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\n" + "'", str70, "\n");
        org.junit.Assert.assertTrue("'" + jsonEncoding77 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding77.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer82);
// flaky:         org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1949643388) + "'", int84 == (-1949643388));
        org.junit.Assert.assertNotNull(byteArrayBuilder86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2 + "'", int88 == 2);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[10]");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\n" + "'", str90, "\n");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
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
        boolean boolean22 = iOContext19.isResourceManaged();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream30 = null;
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory(objectCodec49);
        com.fasterxml.jackson.core.JsonFactory.Feature feature51 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean53 = feature51.enabledIn(3);
        boolean boolean54 = jsonFactory50.isEnabled(feature51);
        com.fasterxml.jackson.core.JsonParser.Feature feature55 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory50.disable(feature55);
        java.io.OutputStream outputStream57 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator58 = jsonFactory50.createGenerator(outputStream57);
        com.fasterxml.jackson.core.io.IOContext iOContext59 = null;
        byte[] byteArray60 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper63 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext59, byteArray60, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory50.createJsonParser(byteArray60, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int78 = serializableString69.appendQuotedUTF8(byteArray76, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser79 = jsonFactory50.createJsonParser(byteArray76);
        com.fasterxml.jackson.core.JsonParser jsonParser82 = jsonFactory32.createJsonParser(byteArray76, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream85 = new com.fasterxml.jackson.core.io.MergedStream(iOContext29, inputStream30, byteArray76, 10, 2000);
        com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator88 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext19, (-1038366129), objectCodec24, outputStream25, byteArray76, (int) (short) 0, false);
        com.fasterxml.jackson.core.io.SerializedString serializedString90 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str91 = serializedString90.toString();
        char[] charArray92 = new char[] {};
        int int94 = serializedString90.appendQuoted(charArray92, (int) (byte) 10);
        uTF8JsonGenerator88.writeRaw((com.fasterxml.jackson.core.SerializableString) serializedString90);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonGenerator40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(jsonGenerator58);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[10, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(jsonParser79);
        org.junit.Assert.assertNotNull(jsonParser82);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "\n" + "'", str91, "\n");
        org.junit.Assert.assertNotNull(charArray92);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray92), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray92), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray92), "[]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1257689239), objectCodec7, (java.io.Writer) uTF8Writer13);
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
        byte[] byteArray64 = serializedString61.asQuotedUTF8();
        int int66 = serializedString24.appendUnquotedUTF8(byteArray64, (int) (byte) 1);
        com.fasterxml.jackson.core.JsonToken jsonToken67 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
        char[] charArray68 = jsonToken67.asCharArray();
        char[] charArray69 = jsonToken67.asCharArray();
        int int71 = serializedString24.appendUnquoted(charArray69, 1065246080);
        byte[] byteArray72 = serializedString24.asUnquotedUTF8();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[92, 10]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + jsonToken67 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken67.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "{");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "{");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[{]");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "{");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "{");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[{]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[10]");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
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
        boolean boolean82 = iOContext3.isResourceManaged();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer83 = iOContext3.constructTextBuffer();
        java.lang.Object obj84 = iOContext3.getSourceReference();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray85 = iOContext3.allocWriteEncodingBuffer();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Trying to call same allocXxx() method second time");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(textBuffer83);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + (byte) -1 + "'", obj84, (byte) -1);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        textBuffer1.resetWithString("hi!");
        textBuffer1.setCurrentLength(100);
        textBuffer1.releaseBuffers();
        char[] charArray9 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
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
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder77 = readerBasedJsonParser14._getByteArrayBuilder();
        com.fasterxml.jackson.core.JsonLocation jsonLocation78 = readerBasedJsonParser14.getCurrentLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation79 = readerBasedJsonParser14.getTokenLocation();
        readerBasedJsonParser14.close();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2036787508 + "'", int13 == 2036787508);
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
        org.junit.Assert.assertNotNull(byteArrayBuilder77);
        org.junit.Assert.assertNotNull(jsonLocation78);
        org.junit.Assert.assertNotNull(jsonLocation79);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1257689239), objectCodec7, (java.io.Writer) uTF8Writer13);
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
        java.lang.String str37 = serializedString24.getValue();
        com.fasterxml.jackson.core.io.IOContext iOContext38 = null;
        byte[] byteArray39 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper42 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext38, byteArray39, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = serializedString24.appendUnquotedUTF8(byteArray39, (-1949643388));
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\n" + "'", str37, "\n");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.io.SerializedString serializedString5 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str6 = serializedString5.toString();
        char[] charArray7 = new char[] {};
        int int9 = serializedString5.appendQuoted(charArray7, (int) (byte) 10);
        int int10 = serializedString5.charLength();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = null;
        byte[] byteArray12 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper15 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext11, byteArray12, 0, 0);
        int int17 = serializedString5.appendQuotedUTF8(byteArray12, 1139113814);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext21 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler18, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer23 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext21, outputStream22);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding24 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext21.setEncoding(jsonEncoding24);
        java.io.Reader reader27 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer29 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int31 = charsToNameCanonicalizer29.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser32 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext21, (-1252931262), reader27, objectCodec28, charsToNameCanonicalizer29);
        int int33 = readerBasedJsonParser32.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = new com.fasterxml.jackson.core.JsonFactory(objectCodec34);
        com.fasterxml.jackson.core.JsonFactory.Feature feature36 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean38 = feature36.enabledIn(3);
        boolean boolean39 = jsonFactory35.isEnabled(feature36);
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = new com.fasterxml.jackson.core.JsonFactory(objectCodec40);
        com.fasterxml.jackson.core.JsonFactory.Feature feature42 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean44 = feature42.enabledIn(3);
        boolean boolean45 = jsonFactory41.isEnabled(feature42);
        com.fasterxml.jackson.core.JsonParser.Feature feature46 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = jsonFactory41.disable(feature46);
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = jsonFactory35.disable(feature46);
        java.lang.String str49 = jsonFactory35.getFormatName();
        java.io.InputStream inputStream50 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonFactory35.createParser(inputStream50);
        long long52 = jsonParser51.getValueAsLong();
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = new com.fasterxml.jackson.core.JsonFactory(objectCodec53);
        java.io.Reader reader55 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory54.createParser(reader55);
        boolean boolean57 = jsonParser56.requiresCustomCodec();
        java.lang.String str58 = jsonParser56.getText();
        java.lang.Object obj59 = jsonParser56.getObjectId();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter61 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString62 = defaultPrettyPrinter61._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler63 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer64 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler63);
        char[] charArray65 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer64.resetWithShared(charArray65, 2000, 2000);
        int int70 = serializableString62.appendUnquoted(charArray65, 0);
        boolean boolean71 = jsonParser56.nextFieldName(serializableString62);
        com.fasterxml.jackson.core.Version version72 = jsonParser56.version();
        double double74 = jsonParser56.getValueAsDouble((double) (byte) -1);
        char[] charArray75 = jsonParser56.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec76 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory77 = new com.fasterxml.jackson.core.JsonFactory(objectCodec76);
        com.fasterxml.jackson.core.JsonFactory.Feature feature78 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean80 = feature78.enabledIn(3);
        boolean boolean81 = jsonFactory77.isEnabled(feature78);
        com.fasterxml.jackson.core.ObjectCodec objectCodec82 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory83 = new com.fasterxml.jackson.core.JsonFactory(objectCodec82);
        com.fasterxml.jackson.core.JsonFactory.Feature feature84 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean86 = feature84.enabledIn(3);
        boolean boolean87 = jsonFactory83.isEnabled(feature84);
        com.fasterxml.jackson.core.JsonParser.Feature feature88 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory89 = jsonFactory83.disable(feature88);
        com.fasterxml.jackson.core.JsonFactory jsonFactory90 = jsonFactory77.disable(feature88);
        com.fasterxml.jackson.core.JsonParser jsonParser91 = jsonParser56.enable(feature88);
        com.fasterxml.jackson.core.JsonParser jsonParser93 = jsonParser51.configure(feature88, true);
        com.fasterxml.jackson.core.JsonParser jsonParser94 = readerBasedJsonParser32.enable(feature88);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder95 = readerBasedJsonParser32._getByteArrayBuilder();
        int int96 = serializedString5.writeUnquotedUTF8((java.io.OutputStream) byteArrayBuilder95);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator97 = jsonFactory1.createGenerator((java.io.OutputStream) byteArrayBuilder95);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + jsonEncoding24 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding24.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer29);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1200955834) + "'", int31 == (-1200955834));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature36.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature42.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + feature46 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature46.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory47);
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "JSON" + "'", str49, "JSON");
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(serializableString62);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(version72);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertNull(charArray75);
        org.junit.Assert.assertTrue("'" + feature78 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature78.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + feature84 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature84.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + feature88 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature88.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory89);
        org.junit.Assert.assertNotNull(jsonFactory90);
        org.junit.Assert.assertNotNull(jsonParser91);
        org.junit.Assert.assertNotNull(jsonParser93);
        org.junit.Assert.assertNotNull(jsonParser94);
        org.junit.Assert.assertNotNull(byteArrayBuilder95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator97);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
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
        com.fasterxml.jackson.core.io.IOContext iOContext31 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory(objectCodec32);
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean36 = feature34.enabledIn(3);
        boolean boolean37 = jsonFactory33.isEnabled(feature34);
        com.fasterxml.jackson.core.JsonParser.Feature feature38 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = jsonFactory33.disable(feature38);
        java.io.OutputStream outputStream40 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator41 = jsonFactory33.createGenerator(outputStream40);
        com.fasterxml.jackson.core.io.IOContext iOContext42 = null;
        byte[] byteArray43 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper46 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext42, byteArray43, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonFactory33.createJsonParser(byteArray43, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter51 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString52 = defaultPrettyPrinter51._rootSeparator;
        byte[] byteArray59 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int61 = serializableString52.appendQuotedUTF8(byteArray59, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser62 = jsonFactory33.createJsonParser(byteArray59);
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper65 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext31, byteArray59, (int) ' ', 64);
        com.fasterxml.jackson.core.JsonParser jsonParser68 = jsonFactory1.createJsonParser(byteArray59, (-1253025339), (int) (byte) -1);
        com.fasterxml.jackson.core.Base64Variant base64Variant69 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler70 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext73 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler70, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream74 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer75 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext73, outputStream74);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding76 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext73.setEncoding(jsonEncoding76);
        java.io.Reader reader79 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec80 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer81 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int83 = charsToNameCanonicalizer81.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser84 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext73, (-1252931262), reader79, objectCodec80, charsToNameCanonicalizer81);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder85 = readerBasedJsonParser84._getByteArrayBuilder();
        // The following exception was thrown during execution in test generation
        try {
            int int86 = jsonParser68.readBinaryValue(base64Variant69, (java.io.OutputStream) byteArrayBuilder85);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@3144f5a9; line: 1, column: -1253025338]");
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
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature38.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertNotNull(jsonGenerator41);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertNotNull(serializableString52);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(jsonParser62);
        org.junit.Assert.assertNotNull(jsonParser68);
        org.junit.Assert.assertTrue("'" + jsonEncoding76 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding76.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer81);
// flaky:         org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1872593374 + "'", int83 == 1872593374);
        org.junit.Assert.assertNotNull(byteArrayBuilder85);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = jsonParser3.getSchema();
        java.lang.String str6 = jsonParser3.nextTextValue();
        long long7 = jsonParser3.getValueAsLong();
        java.io.Writer writer8 = null;
        int int9 = jsonParser3.releaseBuffered(writer8);
        java.lang.String str10 = jsonParser3.getValueAsString();
        // The following exception was thrown during execution in test generation
        try {
            float float11 = jsonParser3.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
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
        mergedStream59.mark(1963959330);
        int int62 = mergedStream59.available();
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
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1990 + "'", int62 == 1990);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        boolean boolean15 = readerBasedJsonParser14.isClosed();
        java.lang.Object obj16 = readerBasedJsonParser14.getInputSource();
        readerBasedJsonParser14.close();
        int int18 = readerBasedJsonParser14.getTextLength();
        int int19 = readerBasedJsonParser14.getTokenColumnNr();
        com.fasterxml.jackson.core.JsonToken jsonToken20 = readerBasedJsonParser14.getLastClearedToken();
        boolean boolean21 = readerBasedJsonParser14.hasTextCharacters();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = readerBasedJsonParser14.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2011168124) + "'", int13 == (-2011168124));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        int int2 = com.fasterxml.jackson.core.io.NumberInput.parseAsInt("OBJECT", 1099329804);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1099329804 + "'", int2 == 1099329804);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.Version version15 = readerBasedJsonParser14.version();
        boolean boolean16 = readerBasedJsonParser14.hasTextCharacters();
        com.fasterxml.jackson.core.JsonParser jsonParser18 = readerBasedJsonParser14.setFeatureMask(1265573344);
        boolean boolean19 = readerBasedJsonParser14.requiresCustomCodec();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1766429832) + "'", int13 == (-1766429832));
        org.junit.Assert.assertNotNull(version15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.fasterxml.jackson.core.sym.Name name0 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.getEmptyName();
        java.lang.String str1 = name0.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext5 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler2, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream6 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer7 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext5, outputStream6);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding8 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE;
        iOContext5.setEncoding(jsonEncoding8);
        java.io.Reader reader11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer13 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int15 = charsToNameCanonicalizer13.calcHash("false");
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser16 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext5, (-1252931262), reader11, objectCodec12, charsToNameCanonicalizer13);
        int int17 = readerBasedJsonParser16.getTextOffset();
        int int18 = readerBasedJsonParser16.getTextLength();
        long long20 = readerBasedJsonParser16.nextLongValue((long) 39);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext21 = readerBasedJsonParser16.getParsingContext();
        readerBasedJsonParser16.overrideCurrentName("");
        int int25 = readerBasedJsonParser16.getValueAsInt((-1252946131));
        java.lang.Object obj26 = readerBasedJsonParser16.getEmbeddedObject();
        boolean boolean27 = name0.equals((java.lang.Object) readerBasedJsonParser16);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray28 = readerBasedJsonParser16.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(name0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + jsonEncoding8 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding8.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer13);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 112069032 + "'", int15 == 112069032);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 39L + "'", long20 == 39L);
        org.junit.Assert.assertNotNull(jsonStreamContext21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1252946131) + "'", int25 == (-1252946131));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = new com.fasterxml.jackson.core.JsonFactory(objectCodec27);
        com.fasterxml.jackson.core.JsonFactory.Feature feature29 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean31 = feature29.enabledIn(3);
        boolean boolean32 = jsonFactory28.isEnabled(feature29);
        com.fasterxml.jackson.core.JsonParser.Feature feature33 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory28.disable(feature33);
        java.io.OutputStream outputStream35 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonFactory28.createGenerator(outputStream35);
        com.fasterxml.jackson.core.JsonFactory.Feature feature37 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean39 = feature37.enabledIn(3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory28.disable(feature37);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory(objectCodec41);
        com.fasterxml.jackson.core.JsonFactory.Feature feature43 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean45 = feature43.enabledIn(3);
        boolean boolean46 = jsonFactory42.isEnabled(feature43);
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = jsonFactory28.disable(feature43);
        boolean boolean48 = jsonFactory14.isEnabled(feature43);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler49 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext52 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler49, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream53 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer54 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext52, outputStream53);
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler57 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext60 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler57, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream61 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer62 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext60, outputStream61);
        uTF8Writer62.flush();
        java.io.Writer writer65 = uTF8Writer62.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator66 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext52, (-1257689239), objectCodec56, (java.io.Writer) uTF8Writer62);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature67 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean68 = writerBasedJsonGenerator66.isEnabled(feature67);
        java.math.BigInteger bigInteger69 = null;
        writerBasedJsonGenerator66.writeNumber(bigInteger69);
        com.fasterxml.jackson.core.io.SerializedString serializedString72 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str73 = serializedString72.toString();
        int int74 = serializedString72.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler75 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext78 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler75, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream79 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer80 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext78, outputStream79);
        byte[] byteArray81 = iOContext78.allocReadIOBuffer();
        int int83 = serializedString72.appendQuotedUTF8(byteArray81, 3);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator84 = writerBasedJsonGenerator66.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString72);
        com.fasterxml.jackson.core.io.SerializedString serializedString86 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray87 = serializedString86.asUnquotedUTF8();
        int int89 = serializedString72.appendUnquotedUTF8(byteArray87, (int) (short) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser90 = jsonFactory14.createJsonParser(byteArray87);
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
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature29.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature43.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jsonFactory47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(writer65);
        org.junit.Assert.assertTrue("'" + feature67 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature67.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\n" + "'", str73, "\n");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
        org.junit.Assert.assertNotNull(jsonGenerator84);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[10]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(jsonParser90);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 39);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = readerBasedJsonParser14.getParsingContext();
        java.lang.String str21 = readerBasedJsonParser14.getValueAsString("/");
        boolean boolean22 = readerBasedJsonParser14.isClosed();
        long long24 = readerBasedJsonParser14.getValueAsLong((long) (-78061770));
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1620202520 + "'", int13 == 1620202520);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 39L + "'", long18 == 39L);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/" + "'", str21, "/");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-78061770L) + "'", long24 == (-78061770L));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
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
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
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
        com.fasterxml.jackson.core.JsonGenerator.Feature feature22 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonGenerator20.enable(feature22);
        com.fasterxml.jackson.core.Version version24 = jsonGenerator23.version();
        com.fasterxml.jackson.core.Base64Variant base64Variant25 = null;
        com.fasterxml.jackson.core.io.SerializedString serializedString27 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str28 = serializedString27.toString();
        char[] charArray29 = new char[] {};
        int int31 = serializedString27.appendQuoted(charArray29, (int) (byte) 10);
        byte[] byteArray32 = serializedString27.asQuotedUTF8();
        com.fasterxml.jackson.core.io.SerializedString serializedString34 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str35 = serializedString34.toString();
        int int36 = serializedString34.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler37 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext40 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler37, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream41 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer42 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext40, outputStream41);
        byte[] byteArray43 = iOContext40.allocReadIOBuffer();
        int int45 = serializedString34.appendQuotedUTF8(byteArray43, 3);
        int int47 = serializedString27.appendQuotedUTF8(byteArray43, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator23.writeBinary(base64Variant25, byteArray43, (-2080961783), 1398645880);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature22.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n" + "'", str28, "\n");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\n" + "'", str35, "\n");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        boolean boolean6 = jsonParser3.getValueAsBoolean(false);
        boolean boolean7 = jsonParser3.canReadTypeId();
        int int8 = jsonParser3.getValueAsInt();
        boolean boolean9 = jsonParser3.hasCurrentToken();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = readerBasedJsonParser14.nextToken();
        boolean boolean16 = readerBasedJsonParser14.isClosed();
        int int18 = readerBasedJsonParser14.nextIntValue(0);
        readerBasedJsonParser14.close();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType20 = readerBasedJsonParser14.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1680894810 + "'", int13 == 1680894810);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory(objectCodec30);
        java.io.Reader reader32 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory31.createParser(reader32);
        boolean boolean34 = jsonParser33.requiresCustomCodec();
        com.fasterxml.jackson.core.FormatSchema formatSchema35 = jsonParser33.getSchema();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext39 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler36, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream40 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer41 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext39, outputStream40);
        uTF8Writer41.flush();
        java.io.Writer writer44 = uTF8Writer41.append('a');
        int int45 = jsonParser33.releaseBuffered(writer44);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator46 = jsonFactory26.createGenerator(writer44);
        jsonGenerator46.writeNumber((long) 889685086);
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
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(formatSchema35);
        org.junit.Assert.assertNotNull(writer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(jsonGenerator46);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
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
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = jsonParser3.getParsingContext();
        com.fasterxml.jackson.core.JsonToken jsonToken20 = jsonParser3.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean21 = jsonParser3.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(jsonStreamContext19);
        org.junit.Assert.assertNull(jsonToken20);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 39);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = readerBasedJsonParser14.getParsingContext();
        com.fasterxml.jackson.core.Version version20 = readerBasedJsonParser14.version();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = readerBasedJsonParser14.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1231121962 + "'", int13 == 1231121962);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 39L + "'", long18 == 39L);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
        org.junit.Assert.assertNotNull(version20);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
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
        boolean boolean22 = iOContext19.isResourceManaged();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext29 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler26, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream30 = null;
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory(objectCodec49);
        com.fasterxml.jackson.core.JsonFactory.Feature feature51 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean53 = feature51.enabledIn(3);
        boolean boolean54 = jsonFactory50.isEnabled(feature51);
        com.fasterxml.jackson.core.JsonParser.Feature feature55 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory50.disable(feature55);
        java.io.OutputStream outputStream57 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator58 = jsonFactory50.createGenerator(outputStream57);
        com.fasterxml.jackson.core.io.IOContext iOContext59 = null;
        byte[] byteArray60 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper63 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext59, byteArray60, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory50.createJsonParser(byteArray60, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter68 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString69 = defaultPrettyPrinter68._rootSeparator;
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int78 = serializableString69.appendQuotedUTF8(byteArray76, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser79 = jsonFactory50.createJsonParser(byteArray76);
        com.fasterxml.jackson.core.JsonParser jsonParser82 = jsonFactory32.createJsonParser(byteArray76, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream85 = new com.fasterxml.jackson.core.io.MergedStream(iOContext29, inputStream30, byteArray76, 10, 2000);
        com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator88 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext19, (-1038366129), objectCodec24, outputStream25, byteArray76, (int) (short) 0, false);
        java.math.BigInteger bigInteger89 = null;
        uTF8JsonGenerator88.writeNumber(bigInteger89);
        // The following exception was thrown during execution in test generation
        try {
            uTF8JsonGenerator88.writeNumber((short) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonGenerator40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(jsonGenerator58);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertNotNull(serializableString69);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[110, 117, 108, 108, 32, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(jsonParser79);
        org.junit.Assert.assertNotNull(jsonParser82);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str2 = serializedString1.toString();
        char[] charArray3 = new char[] {};
        int int5 = serializedString1.appendQuoted(charArray3, (int) (byte) 10);
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
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType22 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER;
        char[] charArray24 = bufferRecycler21.allocCharBuffer(charBufferType22, (int) (byte) 0);
        int int27 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray24, (int) (byte) 10, 100);
        int int29 = serializedString1.appendUnquoted(charArray24, 4);
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler45 = jsonFactory44._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer46 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler45);
        char[] charArray47 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.SPACES;
        textBuffer46.append(charArray47, (int) (byte) 0, (int) (short) 1);
        int int52 = serializedString1.appendUnquoted(charArray47, 1038366031);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
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
        org.junit.Assert.assertTrue("'" + charBufferType22 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER + "'", charBufferType22.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "\000\000\000\000\n\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "\000\000\000\000\n\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[\000, \000, \000, \000, \n, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1038366032) + "'", int27 == (-1038366032));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature38.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature42.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory43);
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertNotNull(bufferRecycler45);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "                                                                ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "                                                                ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
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
        com.fasterxml.jackson.core.JsonGenerator.Feature feature27 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean28 = jsonFactory26.isEnabled(feature27);
        boolean boolean29 = jsonFactory26.requiresPropertyOrdering();
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory26.createJsonParser("/");
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory26.setCodec(objectCodec32);
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
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature27.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(jsonFactory33);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        textBuffer1.resetWithString("hi!");
        char[] charArray6 = textBuffer1.expandCurrentSegment();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature32 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean33 = jsonFactory26.isEnabled(feature32);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext37 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler34, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream38 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer39 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext37, outputStream38);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler42 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext45 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler42, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream46 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer47 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext45, outputStream46);
        uTF8Writer47.flush();
        java.io.Writer writer50 = uTF8Writer47.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator51 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext37, (-1257689239), objectCodec41, (java.io.Writer) uTF8Writer47);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature52 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean53 = writerBasedJsonGenerator51.isEnabled(feature52);
        java.math.BigInteger bigInteger54 = null;
        writerBasedJsonGenerator51.writeNumber(bigInteger54);
        com.fasterxml.jackson.core.io.SerializedString serializedString57 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str58 = serializedString57.toString();
        int int59 = serializedString57.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler60 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext63 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler60, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream64 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer65 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext63, outputStream64);
        byte[] byteArray66 = iOContext63.allocReadIOBuffer();
        int int68 = serializedString57.appendQuotedUTF8(byteArray66, 3);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator69 = writerBasedJsonGenerator51.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString57);
        writerBasedJsonGenerator51.flush();
        com.fasterxml.jackson.core.JsonGenerator.Feature feature71 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean72 = feature71.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator73 = writerBasedJsonGenerator51.enable(feature71);
        com.fasterxml.jackson.core.JsonFactory jsonFactory74 = jsonFactory26.disable(feature71);
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
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(writer50);
        org.junit.Assert.assertTrue("'" + feature52 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature52.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\n" + "'", str58, "\n");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertNotNull(jsonGenerator69);
        org.junit.Assert.assertTrue("'" + feature71 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature71.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(jsonGenerator73);
        org.junit.Assert.assertNotNull(jsonFactory74);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
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
        com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext3, (-1252931262), reader9, objectCodec10, charsToNameCanonicalizer11);
        int int15 = readerBasedJsonParser14.getTextOffset();
        int int16 = readerBasedJsonParser14.getTextLength();
        long long18 = readerBasedJsonParser14.nextLongValue((long) 39);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = readerBasedJsonParser14.getParsingContext();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter21 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString22 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter23 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter21, serializableString22);
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = new com.fasterxml.jackson.core.JsonFactory(objectCodec24);
        com.fasterxml.jackson.core.JsonFactory.Feature feature26 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean28 = feature26.enabledIn(3);
        boolean boolean29 = jsonFactory25.isEnabled(feature26);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory(objectCodec30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean34 = feature32.enabledIn(3);
        boolean boolean35 = jsonFactory31.isEnabled(feature32);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory31.disable(feature36);
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory25.disable(feature36);
        java.io.OutputStream outputStream39 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator40 = jsonFactory25.createGenerator(outputStream39);
        defaultPrettyPrinter23.writeObjectEntrySeparator(jsonGenerator40);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter43 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString44 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter45 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter43, serializableString44);
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = new com.fasterxml.jackson.core.JsonFactory(objectCodec46);
        com.fasterxml.jackson.core.JsonFactory.Feature feature48 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean50 = feature48.enabledIn(3);
        boolean boolean51 = jsonFactory47.isEnabled(feature48);
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = new com.fasterxml.jackson.core.JsonFactory(objectCodec52);
        com.fasterxml.jackson.core.JsonFactory.Feature feature54 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean56 = feature54.enabledIn(3);
        boolean boolean57 = jsonFactory53.isEnabled(feature54);
        com.fasterxml.jackson.core.JsonParser.Feature feature58 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = jsonFactory53.disable(feature58);
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = jsonFactory47.disable(feature58);
        java.io.OutputStream outputStream61 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator62 = jsonFactory47.createGenerator(outputStream61);
        defaultPrettyPrinter45.writeStartArray(jsonGenerator62);
        defaultPrettyPrinter23.writeStartObject(jsonGenerator62);
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory66 = new com.fasterxml.jackson.core.JsonFactory(objectCodec65);
        com.fasterxml.jackson.core.JsonFactory.Feature feature67 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean69 = feature67.enabledIn(3);
        boolean boolean70 = jsonFactory66.isEnabled(feature67);
        com.fasterxml.jackson.core.ObjectCodec objectCodec71 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory72 = new com.fasterxml.jackson.core.JsonFactory(objectCodec71);
        com.fasterxml.jackson.core.JsonFactory.Feature feature73 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean75 = feature73.enabledIn(3);
        boolean boolean76 = jsonFactory72.isEnabled(feature73);
        com.fasterxml.jackson.core.JsonParser.Feature feature77 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory78 = jsonFactory72.disable(feature77);
        com.fasterxml.jackson.core.JsonFactory jsonFactory79 = jsonFactory66.disable(feature77);
        java.io.OutputStream outputStream80 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator81 = jsonFactory66.createGenerator(outputStream80);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature82 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean83 = feature82.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator84 = jsonGenerator81.enable(feature82);
        defaultPrettyPrinter23.writeEndArray(jsonGenerator84, (int) (byte) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter88 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString89 = defaultPrettyPrinter88._rootSeparator;
        jsonGenerator84.writeString(serializableString89);
        char[] charArray91 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        int int93 = serializableString89.appendUnquoted(charArray91, (int) 'a');
        char[] charArray94 = serializableString89.asQuotedChars();
        boolean boolean95 = readerBasedJsonParser14.nextFieldName(serializableString89);
        java.lang.String str96 = readerBasedJsonParser14.getValueAsString();
        java.lang.String str97 = readerBasedJsonParser14.getValueAsString();
        org.junit.Assert.assertTrue("'" + jsonEncoding6 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF16_BE + "'", jsonEncoding6.equals(com.fasterxml.jackson.core.JsonEncoding.UTF16_BE));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1291121686) + "'", int13 == (-1291121686));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 39L + "'", long18 == 39L);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature26.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonGenerator40);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature48.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + feature54 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature54.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + feature58 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature58.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory59);
        org.junit.Assert.assertNotNull(jsonFactory60);
        org.junit.Assert.assertNotNull(jsonGenerator62);
        org.junit.Assert.assertTrue("'" + feature67 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature67.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + feature73 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature73.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + feature77 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature77.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory78);
        org.junit.Assert.assertNotNull(jsonFactory79);
        org.junit.Assert.assertNotNull(jsonGenerator81);
        org.junit.Assert.assertTrue("'" + feature82 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature82.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(jsonGenerator84);
        org.junit.Assert.assertNotNull(serializableString89);
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray91), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray91), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray91), "[]");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(charArray94);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray94), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray94), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray94), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNull(str96);
        org.junit.Assert.assertNull(str97);
    }
}
