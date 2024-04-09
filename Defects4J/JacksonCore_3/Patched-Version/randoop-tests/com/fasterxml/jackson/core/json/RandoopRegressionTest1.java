package com.fasterxml.jackson.core.json;

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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        int int16 = uTF8StreamJsonParser12._decodeCharForError((int) '#');
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = null;
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12.setSchema(formatSchema17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test502");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray5 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory3.createParser(byteArray5);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory3.setCodec(objectCodec7);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory8.createParser(byteArray11, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray17 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory15.createParser(byteArray17);
        com.fasterxml.jackson.core.JsonFactory.Feature feature19 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory15.enable(feature19);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory8.enable(feature19);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = jsonFactory21._getBufferRecycler();
        java.io.OutputStream outputStream23 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = jsonFactory21.createJsonGenerator(outputStream23);
        jsonGenerator24.flush();
        defaultPrettyPrinter2.beforeObjectEntries(jsonGenerator24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = jsonGenerator24.getCodec();
        com.fasterxml.jackson.core.Version version28 = jsonGenerator24.version();
        int int29 = jsonGenerator24.getHighestEscapedChar();
        jsonGenerator24.writeOmittedField(" ");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature32 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean33 = jsonGenerator24.isEnabled(feature32);
        int int34 = jsonGenerator24.getFeatureMask();
        java.math.BigInteger bigInteger35 = null;
        jsonGenerator24.writeNumber(bigInteger35);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100]");
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(bufferRecycler22);
        org.junit.Assert.assertNotNull(jsonGenerator24);
        org.junit.Assert.assertNull(objectCodec27);
        org.junit.Assert.assertNotNull(version28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature32.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 79 + "'", int34 == 79);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test503");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding20 = com.fasterxml.jackson.core.JsonEncoding.UTF8;
        boolean boolean21 = jsonEncoding20.isBigEndian();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = jsonFactory5.createJsonGenerator(outputStream19, jsonEncoding20);
        boolean boolean23 = jsonEncoding20.isBigEndian();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + jsonEncoding20 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF8 + "'", jsonEncoding20.equals(com.fasterxml.jackson.core.JsonEncoding.UTF8));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test504");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        java.io.OutputStream outputStream19 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding20 = com.fasterxml.jackson.core.JsonEncoding.UTF8;
        boolean boolean21 = jsonEncoding20.isBigEndian();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = jsonFactory5.createJsonGenerator(outputStream19, jsonEncoding20);
        com.fasterxml.jackson.core.io.SerializedString serializedString23 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray26 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory24.createParser(byteArray26);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory24.setCodec(objectCodec28);
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory29.createParser(byteArray32, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray38 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonFactory36.createParser(byteArray38);
        com.fasterxml.jackson.core.JsonFactory.Feature feature40 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory36.enable(feature40);
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory29.enable(feature40);
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray45 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser46 = jsonFactory43.createParser(byteArray45);
        com.fasterxml.jackson.core.JsonFactory.Feature feature47 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = jsonFactory43.enable(feature47);
        byte[] byteArray49 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser52 = jsonFactory48.createJsonParser(byteArray49, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory29.createParser(byteArray49);
        int int55 = serializedString23.appendUnquotedUTF8(byteArray49, 56319);
        byte[] byteArray56 = serializedString23.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray59 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory57.createParser(byteArray59);
        int int62 = serializedString23.appendQuotedUTF8(byteArray59, (int) (byte) 0);
        char[] charArray63 = com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.HEX_CHARS;
        int int65 = serializedString23.appendQuoted(charArray63, 5);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator66 = jsonGenerator22.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString23);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + jsonEncoding20 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF8 + "'", jsonEncoding20.equals(com.fasterxml.jackson.core.JsonEncoding.UTF8));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertNotNull(serializedString23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100]");
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100]");
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature40.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertNotNull(jsonFactory42);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[100]");
        org.junit.Assert.assertNotNull(jsonParser46);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertNotNull(byteArray49);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser52);
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[32]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[32]");
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "01234 6789ABCDEF");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "01234 6789ABCDEF");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[0, 1, 2, 3, 4,  , 6, 7, 8, 9, A, B, C, D, E, F]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(jsonGenerator66);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test505");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        boolean boolean13 = uTF8StreamJsonParser12.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = uTF8StreamJsonParser12.getTokenLocation();
        java.io.InputStream inputStream15 = uTF8StreamJsonParser12._inputStream;
        com.fasterxml.jackson.core.JsonToken jsonToken17 = uTF8StreamJsonParser12._parseNumber((-1));
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken18 = uTF8StreamJsonParser12.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonLocation14);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test506");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        java.io.Writer writer19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory18.createJsonGenerator(writer19);
        com.fasterxml.jackson.core.io.SerializedString serializedString21 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray24 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory22.createParser(byteArray24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory22.setCodec(objectCodec26);
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory27.createParser(byteArray30, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        com.fasterxml.jackson.core.JsonFactory.Feature feature38 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = jsonFactory34.enable(feature38);
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory27.enable(feature38);
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray43 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory41.createParser(byteArray43);
        com.fasterxml.jackson.core.JsonFactory.Feature feature45 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory41.enable(feature45);
        byte[] byteArray47 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory46.createJsonParser(byteArray47, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonFactory27.createParser(byteArray47);
        int int53 = serializedString21.appendUnquotedUTF8(byteArray47, 56319);
        byte[] byteArray54 = serializedString21.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray57 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser58 = jsonFactory55.createParser(byteArray57);
        int int59 = jsonParser58.getTextOffset();
        long long60 = jsonParser58.getValueAsLong();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler61 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext64 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler61, (java.lang.Object) '4', true);
        java.io.InputStream inputStream66 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer68 = null;
        byte[] byteArray69 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser73 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext64, 0, inputStream66, objectCodec67, bytesToNameCanonicalizer68, byteArray69, 33, 33, false);
        long long75 = uTF8StreamJsonParser73.getValueAsLong(100L);
        uTF8StreamJsonParser73.clearCurrentToken();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder77 = uTF8StreamJsonParser73._getByteArrayBuilder();
        int int78 = jsonParser58.releaseBuffered((java.io.OutputStream) byteArrayBuilder77);
        int int79 = serializedString21.writeQuotedUTF8((java.io.OutputStream) byteArrayBuilder77);
        byte[] byteArray80 = serializedString21.asQuotedUTF8();
        byte[] byteArray81 = serializedString21.asUnquotedUTF8();
        jsonGenerator20.writeFieldName((com.fasterxml.jackson.core.SerializableString) serializedString21);
        char[] charArray83 = serializedString21.asQuotedChars();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNotNull(serializedString21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100]");
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature38.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100]");
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertTrue("'" + feature45 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature45.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertNotNull(byteArray47);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[32]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[100]");
        org.junit.Assert.assertNotNull(jsonParser58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 100L + "'", long75 == 100L);
        org.junit.Assert.assertNotNull(byteArrayBuilder77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[32]");
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[32]");
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray83), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray83), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray83), "[ ]");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test507");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str17 = uTF8StreamJsonParser12._getText2(jsonToken16);
        java.lang.String str18 = jsonToken16.asString();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test508");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.enable(feature23);
        byte[] byteArray25 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory24.createJsonParser(byteArray25, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory5.createParser(byteArray25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory5.setRootValueSeparator(" ");
        java.io.Writer writer32 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = jsonFactory31.createJsonGenerator(writer32);
        java.lang.Object obj35 = null;
        jsonGenerator33.writeObjectField(" ", obj35);
        com.fasterxml.jackson.core.SerializableString serializableString37 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator33.writeFieldName(serializableString37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(byteArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(jsonGenerator33);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test509");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory1.createParser(byteArray3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory1.setCodec(objectCodec5);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory6.createParser(byteArray9, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray15 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory13.createParser(byteArray15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory13.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory6.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        byte[] byteArray26 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createJsonParser(byteArray26, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory6.createParser(byteArray26);
        int int32 = serializedString0.appendUnquotedUTF8(byteArray26, 56319);
        byte[] byteArray33 = serializedString0.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        int int38 = jsonParser37.getTextOffset();
        long long39 = jsonParser37.getValueAsLong();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext43 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler40, (java.lang.Object) '4', true);
        java.io.InputStream inputStream45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer47 = null;
        byte[] byteArray48 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser52 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext43, 0, inputStream45, objectCodec46, bytesToNameCanonicalizer47, byteArray48, 33, 33, false);
        long long54 = uTF8StreamJsonParser52.getValueAsLong(100L);
        uTF8StreamJsonParser52.clearCurrentToken();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder56 = uTF8StreamJsonParser52._getByteArrayBuilder();
        int int57 = jsonParser37.releaseBuffered((java.io.OutputStream) byteArrayBuilder56);
        int int58 = serializedString0.writeQuotedUTF8((java.io.OutputStream) byteArrayBuilder56);
        java.lang.String str59 = serializedString0.toString();
        char[] charArray60 = serializedString0.asQuotedChars();
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[32]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 100L + "'", long54 == 100L);
        org.junit.Assert.assertNotNull(byteArrayBuilder56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + " " + "'", str59, " ");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[ ]");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test510");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        java.lang.String str17 = uTF8StreamJsonParser12.getText();
        boolean boolean18 = uTF8StreamJsonParser12.hasCurrentToken();
        java.lang.String str20 = uTF8StreamJsonParser12.getValueAsString("false");
        boolean boolean21 = uTF8StreamJsonParser12.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12._skipString();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unexpected end-of-input in null? at [Source: 4; line: 1, column: 67]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "false" + "'", str20, "false");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test511");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream14 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer16 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = bytesToNameCanonicalizer16.makeChild(false, false);
        byte[] byteArray20 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser24 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) 'a', inputStream14, objectCodec15, bytesToNameCanonicalizer19, byteArray20, (int) (byte) 10, 33, false);
        java.lang.Object obj25 = iOContext3.getSourceReference();
        com.fasterxml.jackson.core.SerializableString serializableString26 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter27 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString26);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray30 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory28.createParser(byteArray30);
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory28.setCodec(objectCodec32);
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonFactory33.createParser(byteArray36, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray42 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser43 = jsonFactory40.createParser(byteArray42);
        com.fasterxml.jackson.core.JsonFactory.Feature feature44 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory40.enable(feature44);
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory33.enable(feature44);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler47 = jsonFactory46._getBufferRecycler();
        java.io.OutputStream outputStream48 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator49 = jsonFactory46.createJsonGenerator(outputStream48);
        defaultPrettyPrinter27.writeObjectEntrySeparator(jsonGenerator49);
        char[] charArray55 = new char[] { 'a', ' ', '#', ' ' };
        jsonGenerator49.writeRaw(charArray55, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            iOContext3.releaseConcatBuffer(charArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer16);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '4' + "'", obj25, '4');
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100]");
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100]");
        org.junit.Assert.assertNotNull(jsonParser43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature44.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertNotNull(bufferRecycler47);
        org.junit.Assert.assertNotNull(jsonGenerator49);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "a # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "a # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[a,  , #,  ]");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test512");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        java.io.InputStream inputStream12 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory5.createParser(inputStream12);
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = jsonParser13.getCurrentLocation();
        com.fasterxml.jackson.core.Version version15 = jsonParser13.version();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(jsonLocation14);
        org.junit.Assert.assertNotNull(version15);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test513");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory5.createJsonParser("hi!");
        java.lang.Object obj8 = jsonParser7.getEmbeddedObject();
        jsonParser7.clearCurrentToken();
        int int10 = jsonParser7.getTextLength();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test514");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.JsonFactory.Feature feature4 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.enable(feature4);
        byte[] byteArray6 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory5.createJsonParser(byteArray6, 2, 10);
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonParser9.enable(feature10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        jsonParser11.setCodec(objectCodec12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.setCodec(objectCodec18);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory19.createParser(byteArray22, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray28 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory26.createParser(byteArray28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory26.enable(feature30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory19.enable(feature30);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = jsonFactory32._getBufferRecycler();
        java.lang.String str34 = jsonFactory32.getRootValueSeparator();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory32.setCharacterEscapes(characterEscapes35);
        com.fasterxml.jackson.core.io.IOContext iOContext37 = null;
        java.io.InputStream inputStream38 = null;
        byte[] byteArray39 = null;
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader43 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext37, inputStream38, byteArray39, (-1), (int) 'a', false);
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory36.createParser((java.io.Reader) uTF32Reader43);
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version46 = jsonFactory45.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature47 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = jsonFactory45.configure(feature47, false);
        boolean boolean50 = jsonFactory36.isEnabled(feature47);
        boolean boolean51 = jsonParser11.isEnabled(feature47);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + feature4 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature4.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature10.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(bufferRecycler33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + " " + "'", str34, " ");
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNotNull(version46);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature47.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test515");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        long long14 = uTF8StreamJsonParser12.getValueAsLong(100L);
        uTF8StreamJsonParser12.clearCurrentToken();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray18 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory16.createParser(byteArray18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory16.setCodec(objectCodec20);
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory21.createParser(byteArray24, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray30 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory28.createParser(byteArray30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory28.enable(feature32);
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory21.enable(feature32);
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray37 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory35.createParser(byteArray37);
        com.fasterxml.jackson.core.JsonFactory.Feature feature39 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory35.enable(feature39);
        byte[] byteArray41 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory40.createJsonParser(byteArray41, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser45 = jsonFactory21.createParser(byteArray41);
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = jsonFactory21.setRootValueSeparator(" ");
        java.io.Writer writer48 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator49 = jsonFactory47.createJsonGenerator(writer48);
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray52 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory50.createParser(byteArray52);
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = jsonFactory50.setCodec(objectCodec54);
        com.fasterxml.jackson.core.JsonParser jsonParser57 = jsonFactory55.createJsonParser("hi!");
        java.lang.Object obj58 = jsonParser57.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonParser.Feature feature59 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonParser57.disable(feature59);
        com.fasterxml.jackson.core.JsonFactory jsonFactory61 = jsonFactory47.enable(feature59);
        com.fasterxml.jackson.core.JsonParser jsonParser62 = uTF8StreamJsonParser12.enable(feature59);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100]");
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100]");
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(byteArray41);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNotNull(jsonParser45);
        org.junit.Assert.assertNotNull(jsonFactory47);
        org.junit.Assert.assertNotNull(jsonGenerator49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100]");
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNotNull(jsonFactory55);
        org.junit.Assert.assertNotNull(jsonParser57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES + "'", feature59.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES));
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertNotNull(jsonFactory61);
        org.junit.Assert.assertNotNull(jsonParser62);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test516");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream13 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.setCodec(objectCodec18);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory19.createParser(byteArray22, (-1), 0);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader29 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, inputStream13, byteArray22, (int) (byte) -1, 2, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version31 = jsonFactory30.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature32 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory30.configure(feature32, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray37 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory35.createParser(byteArray37);
        com.fasterxml.jackson.core.JsonFactory.Feature feature39 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory35.enable(feature39);
        byte[] byteArray41 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory40.createJsonParser(byteArray41, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory30.createParser(byteArray41, (int) (short) 10, 2);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes48 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = jsonFactory30.setCharacterEscapes(characterEscapes48);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler50 = jsonFactory49._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext54 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler51, (java.lang.Object) '4', true);
        java.io.InputStream inputStream56 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer58 = null;
        byte[] byteArray59 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser63 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext54, 0, inputStream56, objectCodec57, bytesToNameCanonicalizer58, byteArray59, 33, 33, false);
        long long65 = uTF8StreamJsonParser63.getValueAsLong(100L);
        uTF8StreamJsonParser63.clearCurrentToken();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder67 = uTF8StreamJsonParser63._getByteArrayBuilder();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator68 = jsonFactory49.createGenerator((java.io.OutputStream) byteArrayBuilder67);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer69 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, (java.io.OutputStream) byteArrayBuilder67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertNotNull(version31);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature32.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100]");
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(byteArray41);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(jsonFactory49);
        org.junit.Assert.assertNotNull(bufferRecycler50);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 100L + "'", long65 == 100L);
        org.junit.Assert.assertNotNull(byteArrayBuilder67);
        org.junit.Assert.assertNotNull(jsonGenerator68);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test517");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature6 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory0.enable(feature6);
        boolean boolean9 = feature6.enabledIn(2);
        int int10 = feature6.getMask();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature6.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test518");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        java.lang.String str17 = uTF8StreamJsonParser12.getText();
        boolean boolean18 = uTF8StreamJsonParser12.hasCurrentToken();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = uTF8StreamJsonParser12._symbols;
        double double20 = uTF8StreamJsonParser12.getValueAsDouble();
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = uTF8StreamJsonParser12._objectCodec;
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12._releaseBuffers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(bytesToNameCanonicalizer19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(objectCodec21);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test519");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str17 = uTF8StreamJsonParser12._getText2(jsonToken16);
        uTF8StreamJsonParser12.overrideCurrentName("ROOT");
        java.lang.String str20 = uTF8StreamJsonParser12.getText();
        int int22 = uTF8StreamJsonParser12.getValueAsInt(0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken25 = uTF8StreamJsonParser12._handleInvalidNumberStart(56320, false);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unexpected character ('?' (code 56320 / 0xdc00)) in numeric value: expected digit (0-9) to follow minus sign, for valid numeric value? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test520");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.Version version13 = uTF8StreamJsonParser12.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = uTF8StreamJsonParser12.getCodec();
        double double15 = uTF8StreamJsonParser12.getValueAsDouble();
        int int17 = uTF8StreamJsonParser12.getValueAsInt(35);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNull(objectCodec14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test521");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        boolean boolean18 = jsonToken17.isScalarValue();
        java.lang.String str19 = uTF8StreamJsonParser12._getText2(jsonToken17);
        java.lang.Class<?> wildcardClass20 = uTF8StreamJsonParser12.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test522");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.SerializableString serializableString3 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString3);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray8 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser(byteArray8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory6.setCodec(objectCodec10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory11.createParser(byteArray14, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray20 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory18.createParser(byteArray20);
        com.fasterxml.jackson.core.JsonFactory.Feature feature22 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory18.enable(feature22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory11.enable(feature22);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = jsonFactory24._getBufferRecycler();
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory24.createJsonGenerator(outputStream26);
        jsonGenerator27.flush();
        defaultPrettyPrinter5.beforeObjectEntries(jsonGenerator27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = jsonGenerator27.getCodec();
        com.fasterxml.jackson.core.Version version31 = jsonGenerator27.version();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = jsonGenerator27.setHighestNonEscapedChar((int) (short) 0);
        defaultPrettyPrinter1.writeEndObject(jsonGenerator33, 1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray38 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonFactory36.createParser(byteArray38);
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory36.setCodec(objectCodec40);
        byte[] byteArray44 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory41.createParser(byteArray44, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray50 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonFactory48.createParser(byteArray50);
        com.fasterxml.jackson.core.JsonFactory.Feature feature52 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = jsonFactory48.enable(feature52);
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = jsonFactory41.enable(feature52);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler55 = jsonFactory54._getBufferRecycler();
        java.io.OutputStream outputStream56 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator57 = jsonFactory54.createJsonGenerator(outputStream56);
        defaultPrettyPrinter1.writeObjectFieldValueSeparator(jsonGenerator57);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator60 = jsonGenerator57.setHighestNonEscapedChar(1277014910);
        jsonGenerator57.writeStartArray();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature22.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(bufferRecycler25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertNull(objectCodec30);
        org.junit.Assert.assertNotNull(version31);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100]");
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[100]");
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertTrue("'" + feature52 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature52.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory53);
        org.junit.Assert.assertNotNull(jsonFactory54);
        org.junit.Assert.assertNotNull(bufferRecycler55);
        org.junit.Assert.assertNotNull(jsonGenerator57);
        org.junit.Assert.assertNotNull(jsonGenerator60);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test523");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.createInstance();
        com.fasterxml.jackson.core.SerializableString serializableString4 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray8 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser(byteArray8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory6.setCodec(objectCodec10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory11.createParser(byteArray14, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray20 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory18.createParser(byteArray20);
        com.fasterxml.jackson.core.JsonFactory.Feature feature22 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory18.enable(feature22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory11.enable(feature22);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = jsonFactory24._getBufferRecycler();
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory24.createJsonGenerator(outputStream26);
        defaultPrettyPrinter5.writeObjectEntrySeparator(jsonGenerator27);
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray31 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser32 = jsonFactory29.createParser(byteArray31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory29.setCodec(objectCodec33);
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory34.createParser(byteArray37, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray43 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory41.createParser(byteArray43);
        com.fasterxml.jackson.core.JsonFactory.Feature feature45 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory41.enable(feature45);
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = jsonFactory34.enable(feature45);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = jsonFactory47._getBufferRecycler();
        java.io.OutputStream outputStream49 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator50 = jsonFactory47.createJsonGenerator(outputStream49);
        jsonGenerator50.flush();
        defaultPrettyPrinter5.writeObjectFieldValueSeparator(jsonGenerator50);
        jsonGenerator50.writeRaw("ROOT");
        defaultPrettyPrinter3.writeArrayValueSeparator(jsonGenerator50);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter56 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature22.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(bufferRecycler25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[100]");
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100]");
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertTrue("'" + feature45 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature45.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertNotNull(jsonFactory47);
        org.junit.Assert.assertNotNull(bufferRecycler48);
        org.junit.Assert.assertNotNull(jsonGenerator50);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test524");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray6 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory5.createJsonParser(byteArray6);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = jsonFactory5._getBufferRecycler();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory5.setRootValueSeparator("[Source: hi!; line: 100, column: 35]");
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory10.createJsonParser(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(bufferRecycler8);
        org.junit.Assert.assertNotNull(jsonFactory10);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test525");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        java.lang.String str17 = uTF8StreamJsonParser12.getText();
        int int19 = uTF8StreamJsonParser12._decodeCharForError((int) (byte) 1);
        boolean boolean20 = uTF8StreamJsonParser12.hasCurrentToken();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test526");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.Version version13 = uTF8StreamJsonParser12.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = uTF8StreamJsonParser12.getCodec();
        boolean boolean15 = uTF8StreamJsonParser12.canReadTypeId();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        char[] charArray17 = uTF8StreamJsonParser12.getTextCharacters();
        java.lang.String str19 = uTF8StreamJsonParser12.getValueAsString("N/A");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNull(objectCodec14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "N/A" + "'", str19, "N/A");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test527");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.withoutSpacesInObjectEntries();
        com.fasterxml.jackson.core.SerializableString serializableString4 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString4);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter5);
        com.fasterxml.jackson.core.SerializableString serializableString7 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString7);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter9 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter8);
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray12 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory10.createParser(byteArray12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory10.setCodec(objectCodec14);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory15.createParser(byteArray18, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray24 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory22.createParser(byteArray24);
        com.fasterxml.jackson.core.JsonFactory.Feature feature26 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory22.enable(feature26);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory15.enable(feature26);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = jsonFactory28._getBufferRecycler();
        java.io.OutputStream outputStream30 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = jsonFactory28.createJsonGenerator(outputStream30);
        jsonGenerator31.flush();
        defaultPrettyPrinter9.beforeObjectEntries(jsonGenerator31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = jsonGenerator31.getCodec();
        com.fasterxml.jackson.core.Version version35 = jsonGenerator31.version();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonGenerator31.setHighestNonEscapedChar((int) (short) 0);
        defaultPrettyPrinter5.writeEndObject(jsonGenerator37, 1);
        jsonGenerator37.writeNumber((double) 1L);
        defaultPrettyPrinter3.beforeObjectEntries(jsonGenerator37);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter44 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter("");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter45 = defaultPrettyPrinter3.withArrayIndenter((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter44);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100]");
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature26.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(bufferRecycler29);
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertNull(objectCodec34);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter45);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test528");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext9 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler6, (java.lang.Object) '4', true);
        java.io.InputStream inputStream11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer13 = null;
        byte[] byteArray14 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser18 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext9, 0, inputStream11, objectCodec12, bytesToNameCanonicalizer13, byteArray14, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken19 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str20 = uTF8StreamJsonParser18._getText2(jsonToken19);
        boolean boolean21 = uTF8StreamJsonParser18.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken22 = uTF8StreamJsonParser18.getLastClearedToken();
        int int23 = uTF8StreamJsonParser18.getTokenColumnNr();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder24 = uTF8StreamJsonParser18._getByteArrayBuilder();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator25 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext3, (int) (short) 0, objectCodec5, (java.io.OutputStream) byteArrayBuilder24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken19 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken19.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(jsonToken22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(byteArrayBuilder24);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test529");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory2.setCodec(objectCodec6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createParser(byteArray10, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.enable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory7.enable(feature18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = jsonFactory20._getBufferRecycler();
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonFactory20.createJsonGenerator(outputStream22);
        defaultPrettyPrinter1.writeObjectEntrySeparator(jsonGenerator23);
        com.fasterxml.jackson.core.SerializableString serializableString25 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter26 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString25);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter27 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter26);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray30 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory28.createParser(byteArray30);
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory28.setCodec(objectCodec32);
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonFactory33.createParser(byteArray36, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray42 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser43 = jsonFactory40.createParser(byteArray42);
        com.fasterxml.jackson.core.JsonFactory.Feature feature44 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory40.enable(feature44);
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory33.enable(feature44);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler47 = jsonFactory46._getBufferRecycler();
        java.io.OutputStream outputStream48 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator49 = jsonFactory46.createJsonGenerator(outputStream48);
        jsonGenerator49.flush();
        defaultPrettyPrinter27.beforeObjectEntries(jsonGenerator49);
        defaultPrettyPrinter1.writeArrayValueSeparator(jsonGenerator49);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(bufferRecycler21);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100]");
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100]");
        org.junit.Assert.assertNotNull(jsonParser43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature44.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertNotNull(bufferRecycler47);
        org.junit.Assert.assertNotNull(jsonGenerator49);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test530");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType byteBufferType20 = com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version22 = jsonFactory21.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory21.configure(feature23, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray28 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory26.createParser(byteArray28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory26.enable(feature30);
        byte[] byteArray32 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory31.createJsonParser(byteArray32, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory21.createParser(byteArray32, (int) (short) 10, 2);
        bufferRecycler19.releaseByteBuffer(byteBufferType20, byteArray32);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        java.lang.String str41 = textBuffer40.toString();
        boolean boolean42 = textBuffer40.hasTextAsCharacters();
        boolean boolean43 = textBuffer40.hasTextAsCharacters();
        textBuffer40.resetWithEmpty();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertTrue("'" + byteBufferType20 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER + "'", byteBufferType20.equals(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER));
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature23.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(byteArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test531");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.createInstance();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray6 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory4.createParser(byteArray6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory4.setCodec(objectCodec8);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory9.createParser(byteArray12, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray18 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory16.createParser(byteArray18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory16.enable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory9.enable(feature20);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = jsonFactory22._getBufferRecycler();
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = jsonFactory22.createJsonGenerator(outputStream24);
        jsonGenerator25.flush();
        defaultPrettyPrinter2.beforeObjectEntries(jsonGenerator25);
        java.lang.Object obj28 = jsonGenerator25.getOutputTarget();
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray31 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser32 = jsonFactory29.createParser(byteArray31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory29.setCodec(objectCodec33);
        com.fasterxml.jackson.core.JsonFactory.Feature feature35 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean37 = feature35.enabledIn((int) '#');
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory34.enable(feature35);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature39 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean40 = jsonFactory34.isEnabled(feature39);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator41 = jsonGenerator25.enable(feature39);
        com.fasterxml.jackson.core.SerializableString serializableString42 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter43 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString42);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter44 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter43);
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray47 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonFactory45.createParser(byteArray47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = jsonFactory45.setCodec(objectCodec49);
        byte[] byteArray53 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory50.createParser(byteArray53, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray59 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory57.createParser(byteArray59);
        com.fasterxml.jackson.core.JsonFactory.Feature feature61 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory62 = jsonFactory57.enable(feature61);
        com.fasterxml.jackson.core.JsonFactory jsonFactory63 = jsonFactory50.enable(feature61);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler64 = jsonFactory63._getBufferRecycler();
        java.io.OutputStream outputStream65 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator66 = jsonFactory63.createJsonGenerator(outputStream65);
        jsonGenerator66.flush();
        defaultPrettyPrinter44.beforeObjectEntries(jsonGenerator66);
        boolean boolean69 = jsonGenerator66.isClosed();
        jsonGenerator66.writeRaw(' ');
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator72 = jsonGenerator66.useDefaultPrettyPrinter();
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator25.writeObjectRef((java.lang.Object) jsonGenerator66);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No native support for writing Object Ids");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(bufferRecycler23);
        org.junit.Assert.assertNotNull(jsonGenerator25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[100]");
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature35.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature39.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jsonGenerator41);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100]");
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertNotNull(jsonFactory50);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[100]");
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertTrue("'" + feature61 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature61.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory62);
        org.junit.Assert.assertNotNull(jsonFactory63);
        org.junit.Assert.assertNotNull(bufferRecycler64);
        org.junit.Assert.assertNotNull(jsonGenerator66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(jsonGenerator72);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test532");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        java.lang.String str20 = jsonFactory18.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray23 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory21.createParser(byteArray23);
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory18.createParser(byteArray23);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature26 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory18.disable(feature26);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes28 = jsonFactory18.getCharacterEscapes();
        com.fasterxml.jackson.core.JsonParser.Feature feature29 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory18.disable(feature29);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET + "'", feature26.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET));
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertNull(characterEscapes28);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS + "'", feature29.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS));
        org.junit.Assert.assertNotNull(jsonFactory30);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test533");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding13 = null;
        iOContext3.setEncoding(jsonEncoding13);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler16, (java.lang.Object) '4', true);
        java.io.InputStream inputStream21 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer23 = null;
        byte[] byteArray24 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser28 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext19, 0, inputStream21, objectCodec22, bytesToNameCanonicalizer23, byteArray24, 33, 33, false);
        java.io.InputStream inputStream30 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer32 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer35 = bytesToNameCanonicalizer32.makeChild(false, false);
        byte[] byteArray36 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser40 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext19, (int) 'a', inputStream30, objectCodec31, bytesToNameCanonicalizer35, byteArray36, (int) (byte) 10, 33, false);
        java.io.InputStream inputStream41 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken42 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray43 = jsonToken42.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream46 = new com.fasterxml.jackson.core.io.MergedStream(iOContext19, inputStream41, byteArray43, 56319, (int) (short) 100);
        boolean boolean47 = mergedStream46.markSupported();
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer49 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int51 = bytesToNameCanonicalizer49.calcHash((int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler52 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext55 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler52, (java.lang.Object) '4', true);
        java.io.InputStream inputStream57 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer59 = null;
        byte[] byteArray60 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser64 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext55, 0, inputStream57, objectCodec58, bytesToNameCanonicalizer59, byteArray60, 33, 33, false);
        java.io.InputStream inputStream65 = null;
        byte[] byteArray66 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader70 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext55, inputStream65, byteArray66, (int) ' ', 100, true);
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser74 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (-1272745925), (java.io.InputStream) mergedStream46, objectCodec48, bytesToNameCanonicalizer49, byteArray66, 3, 0, false);
        uTF8StreamJsonParser74.clearCurrentToken();
        com.fasterxml.jackson.core.Base64Variant base64Variant76 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray77 = uTF8StreamJsonParser74._decodeBase64(base64Variant76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer32);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertTrue("'" + jsonToken42 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken42.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer49);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1272566145) + "'", int51 == (-1272566145));
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray66);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test534");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.enable(feature23);
        byte[] byteArray25 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory24.createJsonParser(byteArray25, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory5.createParser(byteArray25);
        byte[] byteArray30 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory5.createJsonParser(byteArray30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray34 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory32.createParser(byteArray34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory32.setCodec(objectCodec36);
        com.fasterxml.jackson.core.JsonFactory.Feature feature38 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean40 = feature38.enabledIn((int) '#');
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory37.enable(feature38);
        boolean boolean42 = jsonFactory5.isEnabled(feature38);
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = jsonFactory5.getCodec();
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory5.setRootValueSeparator("[Source: hi!; line: 100, column: 35]");
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory45.createParser(" ");
        // The following exception was thrown during execution in test generation
        try {
            int int48 = jsonParser47.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: java.io.StringReader@57e3d8d8; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(byteArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature38.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(objectCodec43);
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonParser47);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test535");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        uTF8StreamJsonParser12._tokenIncomplete = false;
        int int15 = uTF8StreamJsonParser12.getTextOffset();
        double double17 = uTF8StreamJsonParser12.getValueAsDouble((double) 'a');
        boolean boolean18 = uTF8StreamJsonParser12.hasCurrentToken();
        long long19 = uTF8StreamJsonParser12.getTokenCharacterOffset();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test536");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream14 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer16 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = bytesToNameCanonicalizer16.makeChild(false, false);
        byte[] byteArray20 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser24 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) 'a', inputStream14, objectCodec15, bytesToNameCanonicalizer19, byteArray20, (int) (byte) 10, 33, false);
        java.io.InputStream inputStream25 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken26 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray27 = jsonToken26.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream30 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream25, byteArray27, 56319, (int) (short) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext34 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler31, (java.lang.Object) '4', true);
        java.io.InputStream inputStream36 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer38 = null;
        byte[] byteArray39 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser43 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext34, 0, inputStream36, objectCodec37, bytesToNameCanonicalizer38, byteArray39, 33, 33, false);
        java.io.InputStream inputStream45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer47 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer50 = bytesToNameCanonicalizer47.makeChild(false, false);
        byte[] byteArray51 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser55 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext34, (int) 'a', inputStream45, objectCodec46, bytesToNameCanonicalizer50, byteArray51, (int) (byte) 10, 33, false);
        java.io.InputStream inputStream56 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken57 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray58 = jsonToken57.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream61 = new com.fasterxml.jackson.core.io.MergedStream(iOContext34, inputStream56, byteArray58, 56319, (int) (short) 100);
        mergedStream61.mark(32);
        com.fasterxml.jackson.core.JsonToken jsonToken64 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray65 = jsonToken64.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream68 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, (java.io.InputStream) mergedStream61, byteArray65, (int) (byte) 100, 1269648022);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray69 = iOContext3.allocBase64Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer16);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + jsonToken26 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken26.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer47);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertTrue("'" + jsonToken57 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken57.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertTrue("'" + jsonToken64 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken64.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[102, 97, 108, 115, 101]");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test537");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.isClosed();
        java.lang.String str17 = uTF8StreamJsonParser12.getValueAsString("[Source: N/A; line: 10, column: 0]");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken18 = uTF8StreamJsonParser12.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[Source: N/A; line: 10, column: 0]" + "'", str17, "[Source: N/A; line: 10, column: 0]");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test538");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType byteBufferType20 = com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version22 = jsonFactory21.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory21.configure(feature23, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray28 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory26.createParser(byteArray28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory26.enable(feature30);
        byte[] byteArray32 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory31.createJsonParser(byteArray32, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory21.createParser(byteArray32, (int) (short) 10, 2);
        bufferRecycler19.releaseByteBuffer(byteBufferType20, byteArray32);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType41 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER;
        char[] charArray42 = bufferRecycler19.allocCharBuffer(charBufferType41);
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType43 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER;
        char[] charArray44 = bufferRecycler19.allocCharBuffer(charBufferType43);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertTrue("'" + byteBufferType20 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER + "'", byteBufferType20.equals(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER));
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature23.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(byteArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + charBufferType41 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER + "'", charBufferType41.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER));
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + charBufferType43 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER + "'", charBufferType43.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER));
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test539");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory18.createJsonGenerator(outputStream20);
// flaky:         jsonGenerator21.writeFieldName("[Source: N/A; line: 10, column: 0]");
        com.fasterxml.jackson.core.FormatSchema formatSchema24 = null;
        boolean boolean25 = jsonGenerator21.canUseSchema(formatSchema24);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext26 = jsonGenerator21.getOutputContext();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext26);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test540");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray6 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory4.createParser(byteArray6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory4.setCodec(objectCodec8);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature10 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean11 = feature10.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory9.configure(feature10, false);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory9.setOutputDecorator(outputDecorator14);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator16 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory9.setOutputDecorator(outputDecorator16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray20 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory18.createParser(byteArray20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory18.setCodec(objectCodec22);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature24 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean25 = feature24.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory23.configure(feature24, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory9.disable(feature24);
        com.fasterxml.jackson.core.SerializableString serializableString29 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter30 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString29);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter31 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray34 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory32.createParser(byteArray34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory32.setCodec(objectCodec36);
        byte[] byteArray40 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser43 = jsonFactory37.createParser(byteArray40, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray46 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory44.createParser(byteArray46);
        com.fasterxml.jackson.core.JsonFactory.Feature feature48 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = jsonFactory44.enable(feature48);
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = jsonFactory37.enable(feature48);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = jsonFactory50._getBufferRecycler();
        java.io.OutputStream outputStream52 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator53 = jsonFactory50.createJsonGenerator(outputStream52);
        jsonGenerator53.flush();
        defaultPrettyPrinter31.beforeObjectEntries(jsonGenerator53);
        boolean boolean56 = jsonGenerator53.isClosed();
        jsonGenerator53.writeNumberField("false", 0.0f);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler61 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext64 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler61, (java.lang.Object) '4', true);
        java.io.InputStream inputStream66 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer68 = null;
        byte[] byteArray69 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser73 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext64, 0, inputStream66, objectCodec67, bytesToNameCanonicalizer68, byteArray69, 33, 33, false);
        java.io.InputStream inputStream74 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory75 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray77 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser78 = jsonFactory75.createParser(byteArray77);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory80 = jsonFactory75.setCodec(objectCodec79);
        byte[] byteArray83 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser86 = jsonFactory80.createParser(byteArray83, (-1), 0);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader90 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext64, inputStream74, byteArray83, (int) (byte) -1, 2, true);
        jsonGenerator53.writeBinaryField("", byteArray83);
        com.fasterxml.jackson.core.JsonParser jsonParser94 = jsonFactory9.createJsonParser(byteArray83, 1269006668, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            iOContext3.releaseReadIOBuffer(byteArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature10.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature24.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[100]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature48.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory49);
        org.junit.Assert.assertNotNull(jsonFactory50);
        org.junit.Assert.assertNotNull(bufferRecycler51);
        org.junit.Assert.assertNotNull(jsonGenerator53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[100]");
        org.junit.Assert.assertNotNull(jsonParser78);
        org.junit.Assert.assertNotNull(jsonFactory80);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser86);
        org.junit.Assert.assertNotNull(jsonParser94);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test541");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory5.createJsonParser("hi!");
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = jsonParser7.getTokenLocation();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser7.skipChildren();
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = null;
        boolean boolean11 = jsonParser7.canUseSchema(formatSchema10);
        com.fasterxml.jackson.core.Version version12 = jsonParser7.version();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonLocation8);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(version12);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test542");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        int int4 = jsonParser3.getTextOffset();
        java.lang.String str5 = jsonParser3.getText();
        double double6 = jsonParser3.getValueAsDouble();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test543");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        java.lang.String str20 = jsonFactory18.getRootValueSeparator();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes21 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.setCharacterEscapes(characterEscapes21);
        com.fasterxml.jackson.core.io.IOContext iOContext23 = null;
        java.io.InputStream inputStream24 = null;
        byte[] byteArray25 = null;
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader29 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext23, inputStream24, byteArray25, (-1), (int) 'a', false);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory22.createParser((java.io.Reader) uTF32Reader29);
        char[] charArray31 = jsonParser30.getTextCharacters();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNull(charArray31);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test544");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding13 = null;
        iOContext3.setEncoding(jsonEncoding13);
        com.fasterxml.jackson.core.SerializableString serializableString15 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter16 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString15);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter17 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray20 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory18.createParser(byteArray20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory18.setCodec(objectCodec22);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory23.createParser(byteArray26, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray32 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory30.createParser(byteArray32);
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory30.enable(feature34);
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory23.enable(feature34);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler37 = jsonFactory36._getBufferRecycler();
        java.io.OutputStream outputStream38 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonFactory36.createJsonGenerator(outputStream38);
        jsonGenerator39.flush();
        defaultPrettyPrinter17.beforeObjectEntries(jsonGenerator39);
        boolean boolean42 = jsonGenerator39.isClosed();
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray45 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser46 = jsonFactory43.createParser(byteArray45);
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = jsonFactory43.setCodec(objectCodec47);
        byte[] byteArray49 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory48.createJsonParser(byteArray49);
        jsonGenerator39.writeBinary(byteArray49);
        // The following exception was thrown during execution in test generation
        try {
            iOContext3.releaseBase64Buffer(byteArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100]");
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(bufferRecycler37);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[100]");
        org.junit.Assert.assertNotNull(jsonParser46);
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertNotNull(byteArray49);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser50);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test545");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str17 = uTF8StreamJsonParser12._getText2(jsonToken16);
        com.fasterxml.jackson.core.JsonToken jsonToken18 = uTF8StreamJsonParser12.getLastClearedToken();
        double double20 = uTF8StreamJsonParser12.getValueAsDouble((double) 5);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = uTF8StreamJsonParser12.getCodec();
        char[] charArray22 = uTF8StreamJsonParser12.getTextCharacters();
        boolean boolean23 = uTF8StreamJsonParser12.isClosed();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(jsonToken18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.0d + "'", double20 == 5.0d);
        org.junit.Assert.assertNull(objectCodec21);
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test546");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        com.fasterxml.jackson.core.Version version17 = uTF8StreamJsonParser12.version();
        boolean boolean19 = uTF8StreamJsonParser12.getValueAsBoolean(true);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType20 = uTF8StreamJsonParser12.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test547");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature6 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean7 = feature6.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature6, false);
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory5.configure(feature10, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator13 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory5.setInputDecorator(inputDecorator13);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature6.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature10.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(jsonFactory14);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test548");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        java.lang.String str8 = jsonParser3.getValueAsString("N/A");
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) "N/A", 0L, (int) (byte) 10, 0);
        java.lang.String str13 = jsonLocation12.toString();
        long long14 = jsonLocation12.getByteOffset();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "N/A" + "'", str8, "N/A");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[Source: N/A; line: 10, column: 0]" + "'", str13, "[Source: N/A; line: 10, column: 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test549");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.enable(feature23);
        byte[] byteArray25 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory24.createJsonParser(byteArray25, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory5.createParser(byteArray25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory5.setRootValueSeparator(" ");
        java.io.Writer writer32 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = jsonFactory31.createJsonGenerator(writer32);
        java.lang.Object obj35 = null;
        jsonGenerator33.writeObjectField(" ", obj35);
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = jsonGenerator33.getCodec();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(byteArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNull(objectCodec37);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test550");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        uTF8StreamJsonParser12._tokenIncomplete = false;
        int int15 = uTF8StreamJsonParser12.getTextOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = uTF8StreamJsonParser12.getTokenLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = uTF8StreamJsonParser12.getCurrentToken();
        int int18 = uTF8StreamJsonParser12.getTokenLineNr();
        int int19 = uTF8StreamJsonParser12.getTextLength();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(jsonLocation16);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test551");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        java.lang.String str17 = uTF8StreamJsonParser12.getText();
        boolean boolean18 = uTF8StreamJsonParser12.hasCurrentToken();
        java.lang.String str20 = uTF8StreamJsonParser12.getValueAsString("false");
        java.lang.String str21 = uTF8StreamJsonParser12.getCurrentName();
        long long23 = uTF8StreamJsonParser12.getValueAsLong((long) 8);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = uTF8StreamJsonParser12.skipChildren();
        int int25 = uTF8StreamJsonParser12.getTextOffset();
        boolean boolean26 = uTF8StreamJsonParser12.canReadTypeId();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "false" + "'", str20, "false");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 8L + "'", long23 == 8L);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test552");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        uTF8StreamJsonParser12._tokenIncomplete = false;
        int int15 = uTF8StreamJsonParser12.getTextOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = uTF8StreamJsonParser12.getTokenLocation();
        char[] charArray17 = uTF8StreamJsonParser12.getTextCharacters();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(jsonLocation16);
        org.junit.Assert.assertNull(charArray17);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test553");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.createInstance();
        com.fasterxml.jackson.core.SerializableString serializableString4 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString4);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter6 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        com.fasterxml.jackson.core.SerializableString serializableString7 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString7);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter9 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter8);
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray12 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory10.createParser(byteArray12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory10.setCodec(objectCodec14);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory15.createParser(byteArray18, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray24 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory22.createParser(byteArray24);
        com.fasterxml.jackson.core.JsonFactory.Feature feature26 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory22.enable(feature26);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory15.enable(feature26);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = jsonFactory28._getBufferRecycler();
        java.io.OutputStream outputStream30 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = jsonFactory28.createJsonGenerator(outputStream30);
        jsonGenerator31.flush();
        defaultPrettyPrinter9.beforeObjectEntries(jsonGenerator31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = jsonGenerator31.getCodec();
        com.fasterxml.jackson.core.Version version35 = jsonGenerator31.version();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonGenerator31.setHighestNonEscapedChar((int) (short) 0);
        lf2SpacesIndenter6.writeIndentation(jsonGenerator31, 79);
        jsonGenerator31.writeNumberField(" ", (long) (byte) 10);
        defaultPrettyPrinter5.writeEndObject(jsonGenerator31, (int) (byte) 100);
        defaultPrettyPrinter2.writeRootValueSeparator(jsonGenerator31);
        com.fasterxml.jackson.core.SerializableString serializableString46 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter47 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString46);
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray50 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonFactory48.createParser(byteArray50);
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = jsonFactory48.setCodec(objectCodec52);
        byte[] byteArray56 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser59 = jsonFactory53.createParser(byteArray56, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray62 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory60.createParser(byteArray62);
        com.fasterxml.jackson.core.JsonFactory.Feature feature64 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory65 = jsonFactory60.enable(feature64);
        com.fasterxml.jackson.core.JsonFactory jsonFactory66 = jsonFactory53.enable(feature64);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler67 = jsonFactory66._getBufferRecycler();
        java.io.OutputStream outputStream68 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator69 = jsonFactory66.createJsonGenerator(outputStream68);
        defaultPrettyPrinter47.writeObjectEntrySeparator(jsonGenerator69);
        char[] charArray75 = new char[] { 'a', ' ', '#', ' ' };
        jsonGenerator69.writeRaw(charArray75, 1, (int) (short) 0);
        int int79 = jsonGenerator69.getHighestEscapedChar();
        java.math.BigDecimal bigDecimal80 = null;
        jsonGenerator69.writeNumber(bigDecimal80);
        defaultPrettyPrinter2.writeObjectFieldValueSeparator(jsonGenerator69);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100]");
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature26.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(bufferRecycler29);
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertNull(objectCodec34);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[100]");
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertNotNull(jsonFactory53);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[100]");
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertTrue("'" + feature64 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature64.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory65);
        org.junit.Assert.assertNotNull(jsonFactory66);
        org.junit.Assert.assertNotNull(bufferRecycler67);
        org.junit.Assert.assertNotNull(jsonGenerator69);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "a # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "a # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[a,  , #,  ]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test554");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.createInstance();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter2);
        com.fasterxml.jackson.core.SerializableString serializableString5 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString5);
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray9 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory7.createParser(byteArray9);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory7.setCodec(objectCodec11);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory12.createParser(byteArray15, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.enable(feature23);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory12.enable(feature23);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = jsonFactory25._getBufferRecycler();
        java.io.OutputStream outputStream27 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = jsonFactory25.createJsonGenerator(outputStream27);
        defaultPrettyPrinter6.writeObjectEntrySeparator(jsonGenerator28);
        com.fasterxml.jackson.core.SerializableString serializableString30 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter31 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString30);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter32 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter31);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter33 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        defaultPrettyPrinter31.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter33);
        defaultPrettyPrinter6.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter33);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter36 = defaultPrettyPrinter6.createInstance();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter37 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        com.fasterxml.jackson.core.SerializableString serializableString38 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter39 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString38);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter40 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter39);
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray43 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory41.createParser(byteArray43);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory41.setCodec(objectCodec45);
        byte[] byteArray49 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser52 = jsonFactory46.createParser(byteArray49, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray55 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory53.createParser(byteArray55);
        com.fasterxml.jackson.core.JsonFactory.Feature feature57 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = jsonFactory53.enable(feature57);
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = jsonFactory46.enable(feature57);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler60 = jsonFactory59._getBufferRecycler();
        java.io.OutputStream outputStream61 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator62 = jsonFactory59.createJsonGenerator(outputStream61);
        jsonGenerator62.flush();
        defaultPrettyPrinter40.beforeObjectEntries(jsonGenerator62);
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = jsonGenerator62.getCodec();
        com.fasterxml.jackson.core.Version version66 = jsonGenerator62.version();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator68 = jsonGenerator62.setHighestNonEscapedChar((int) (short) 0);
        lf2SpacesIndenter37.writeIndentation(jsonGenerator62, 79);
        jsonGenerator62.writeNumberField(" ", (long) (byte) 10);
        defaultPrettyPrinter6.beforeArrayValues(jsonGenerator62);
        com.fasterxml.jackson.core.FormatSchema formatSchema75 = null;
        boolean boolean76 = jsonGenerator62.canUseSchema(formatSchema75);
        defaultPrettyPrinter2.writeRootValueSeparator(jsonGenerator62);
        jsonGenerator62.writeStartArray();
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(bufferRecycler26);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter33);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter36);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter37);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100]");
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser52);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100]");
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature57.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory58);
        org.junit.Assert.assertNotNull(jsonFactory59);
        org.junit.Assert.assertNotNull(bufferRecycler60);
        org.junit.Assert.assertNotNull(jsonGenerator62);
        org.junit.Assert.assertNull(objectCodec65);
        org.junit.Assert.assertNotNull(version66);
        org.junit.Assert.assertNotNull(jsonGenerator68);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test555");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str17 = uTF8StreamJsonParser12._getText2(jsonToken16);
        com.fasterxml.jackson.core.JsonToken jsonToken18 = uTF8StreamJsonParser12.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.sym.Name name20 = uTF8StreamJsonParser12.parseLongName(33);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unexpected end-of-input in field name? at [Source: 4; line: 1, column: 67]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(jsonToken18);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test556");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream14 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer16 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = bytesToNameCanonicalizer16.makeChild(false, false);
        byte[] byteArray20 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser24 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) 'a', inputStream14, objectCodec15, bytesToNameCanonicalizer19, byteArray20, (int) (byte) 10, 33, false);
        java.lang.Object obj25 = iOContext3.getSourceReference();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray26 = iOContext3.allocBase64Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer16);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '4' + "'", obj25, '4');
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test557");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        boolean boolean13 = uTF8StreamJsonParser12.hasTextCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = uTF8StreamJsonParser12.getNumberValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test558");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory2.setCodec(objectCodec6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createParser(byteArray10, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.enable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory7.enable(feature18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = jsonFactory20._getBufferRecycler();
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonFactory20.createJsonGenerator(outputStream22);
        defaultPrettyPrinter1.writeObjectEntrySeparator(jsonGenerator23);
        com.fasterxml.jackson.core.SerializableString serializableString25 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter26 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString25);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter27 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter26);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter28 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        defaultPrettyPrinter26.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter28);
        defaultPrettyPrinter1.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter28);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter31 = defaultPrettyPrinter1.createInstance();
        com.fasterxml.jackson.core.SerializableString serializableString32 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter33 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString32);
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = jsonFactory34.setCodec(objectCodec38);
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser45 = jsonFactory39.createParser(byteArray42, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray48 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonFactory46.createParser(byteArray48);
        com.fasterxml.jackson.core.JsonFactory.Feature feature50 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = jsonFactory46.enable(feature50);
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = jsonFactory39.enable(feature50);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler53 = jsonFactory52._getBufferRecycler();
        java.io.OutputStream outputStream54 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator55 = jsonFactory52.createJsonGenerator(outputStream54);
        defaultPrettyPrinter33.writeObjectEntrySeparator(jsonGenerator55);
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray59 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory57.createParser(byteArray59);
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory62 = jsonFactory57.setCodec(objectCodec61);
        byte[] byteArray65 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser68 = jsonFactory62.createParser(byteArray65, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory69 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray71 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser72 = jsonFactory69.createParser(byteArray71);
        com.fasterxml.jackson.core.JsonFactory.Feature feature73 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory74 = jsonFactory69.enable(feature73);
        com.fasterxml.jackson.core.JsonFactory jsonFactory75 = jsonFactory62.enable(feature73);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler76 = jsonFactory75._getBufferRecycler();
        java.io.OutputStream outputStream77 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator78 = jsonFactory75.createJsonGenerator(outputStream77);
        jsonGenerator78.flush();
        defaultPrettyPrinter33.writeObjectFieldValueSeparator(jsonGenerator78);
        defaultPrettyPrinter1.beforeArrayValues(jsonGenerator78);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(bufferRecycler21);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter28);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter31);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser45);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100]");
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertTrue("'" + feature50 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature50.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory51);
        org.junit.Assert.assertNotNull(jsonFactory52);
        org.junit.Assert.assertNotNull(bufferRecycler53);
        org.junit.Assert.assertNotNull(jsonGenerator55);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[100]");
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertNotNull(jsonFactory62);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser68);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[100]");
        org.junit.Assert.assertNotNull(jsonParser72);
        org.junit.Assert.assertTrue("'" + feature73 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature73.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory74);
        org.junit.Assert.assertNotNull(jsonFactory75);
        org.junit.Assert.assertNotNull(bufferRecycler76);
        org.junit.Assert.assertNotNull(jsonGenerator78);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test559");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        java.lang.String str16 = uTF8StreamJsonParser12.getText();
        boolean boolean17 = uTF8StreamJsonParser12.loadMore();
        long long18 = uTF8StreamJsonParser12.getTokenCharacterOffset();
        boolean boolean19 = uTF8StreamJsonParser12.hasTextCharacters();
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12._reportInvalidInitial((int) (byte) -65);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Invalid UTF-8 start byte 0xffffffbf? at [Source: 4; line: 1, column: 67]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test560");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        long long14 = uTF8StreamJsonParser12.getValueAsLong(100L);
        uTF8StreamJsonParser12.clearCurrentToken();
        uTF8StreamJsonParser12._closeInput();
        int int17 = uTF8StreamJsonParser12.getTextOffset();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test561");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream1 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        java.io.InputStream inputStream3 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray6 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory4.createParser(byteArray6);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader11 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream3, byteArray6, (int) (short) 10, (int) (short) 10, false);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader15 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext0, inputStream1, byteArray6, (int) (byte) 100, 0, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version17 = jsonFactory16.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory16.configure(feature18, false);
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean23 = feature21.enabledIn((int) '#');
        boolean boolean24 = jsonFactory16.isEnabled(feature21);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = jsonFactory16._getBufferRecycler();
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version27 = jsonFactory26.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature28 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory26.configure(feature28, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray33 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory31.createParser(byteArray33);
        com.fasterxml.jackson.core.JsonFactory.Feature feature35 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory31.enable(feature35);
        byte[] byteArray37 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory36.createJsonParser(byteArray37, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = jsonFactory26.createParser(byteArray37, (int) (short) 10, 2);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes44 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory26.setCharacterEscapes(characterEscapes44);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler46 = jsonFactory45._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType47 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER;
        char[] charArray49 = new char[] { '#' };
        bufferRecycler46.releaseCharBuffer(charBufferType47, charArray49);
        char[] charArray51 = com.fasterxml.jackson.core.io.CharTypes.copyHexChars();
        bufferRecycler25.releaseCharBuffer(charBufferType47, charArray51);
        int int53 = uTF32Reader15.read(charArray51);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(bufferRecycler25);
        org.junit.Assert.assertNotNull(version27);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature28.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100]");
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature35.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(byteArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNotNull(jsonParser43);
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(bufferRecycler46);
        org.junit.Assert.assertTrue("'" + charBufferType47 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER + "'", charBufferType47.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER));
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#]");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "0123456789ABCDEF");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "0123456789ABCDEF");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test562");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        long long14 = uTF8StreamJsonParser12.getValueAsLong(100L);
        uTF8StreamJsonParser12.clearCurrentToken();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler16, (java.lang.Object) '4', true);
        java.io.InputStream inputStream21 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer23 = null;
        byte[] byteArray24 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser28 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext19, 0, inputStream21, objectCodec22, bytesToNameCanonicalizer23, byteArray24, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken29 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str30 = uTF8StreamJsonParser28._getText2(jsonToken29);
        boolean boolean31 = uTF8StreamJsonParser28.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken32 = uTF8StreamJsonParser28.getLastClearedToken();
        java.lang.String str33 = uTF8StreamJsonParser28.getText();
        int int35 = uTF8StreamJsonParser28._decodeCharForError((int) (byte) 1);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder36 = uTF8StreamJsonParser28._getByteArrayBuilder();
        int int37 = uTF8StreamJsonParser12.releaseBuffered((java.io.OutputStream) byteArrayBuilder36);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken29 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken29.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jsonToken32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(byteArrayBuilder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test563");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.SerializableString serializableString3 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString3);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray8 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser(byteArray8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory6.setCodec(objectCodec10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory11.createParser(byteArray14, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray20 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory18.createParser(byteArray20);
        com.fasterxml.jackson.core.JsonFactory.Feature feature22 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory18.enable(feature22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory11.enable(feature22);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = jsonFactory24._getBufferRecycler();
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory24.createJsonGenerator(outputStream26);
        jsonGenerator27.flush();
        defaultPrettyPrinter5.beforeObjectEntries(jsonGenerator27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = jsonGenerator27.getCodec();
        com.fasterxml.jackson.core.Version version31 = jsonGenerator27.version();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = jsonGenerator27.setHighestNonEscapedChar((int) (short) 0);
        defaultPrettyPrinter1.writeEndObject(jsonGenerator33, 1);
        com.fasterxml.jackson.core.SerializableString serializableString36 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter37 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString36);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter38 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter37);
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray41 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonFactory39.createParser(byteArray41);
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory39.setCodec(objectCodec43);
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory44.createParser(byteArray47, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray53 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonFactory51.createParser(byteArray53);
        com.fasterxml.jackson.core.JsonFactory.Feature feature55 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory51.enable(feature55);
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = jsonFactory44.enable(feature55);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler58 = jsonFactory57._getBufferRecycler();
        java.io.OutputStream outputStream59 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator60 = jsonFactory57.createJsonGenerator(outputStream59);
        jsonGenerator60.flush();
        defaultPrettyPrinter38.beforeObjectEntries(jsonGenerator60);
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = jsonGenerator60.getCodec();
        com.fasterxml.jackson.core.Version version64 = jsonGenerator60.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator66 = jsonGenerator60.setCodec(objectCodec65);
        defaultPrettyPrinter1.writeArrayValueSeparator(jsonGenerator60);
        jsonGenerator60.writeNumberField("[Source: N/A; line: 10, column: 0]", (int) '#');
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature22.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(bufferRecycler25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertNull(objectCodec30);
        org.junit.Assert.assertNotNull(version31);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100]");
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[100]");
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(jsonFactory57);
        org.junit.Assert.assertNotNull(bufferRecycler58);
        org.junit.Assert.assertNotNull(jsonGenerator60);
        org.junit.Assert.assertNull(objectCodec63);
        org.junit.Assert.assertNotNull(version64);
        org.junit.Assert.assertNotNull(jsonGenerator66);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test564");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.createInstance();
        com.fasterxml.jackson.core.SerializableString serializableString4 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString4);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter5);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter7 = defaultPrettyPrinter6.createInstance();
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray10 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory8.createParser(byteArray10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory8.setCodec(objectCodec12);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory13.createParser(byteArray16, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory13.enable(feature24);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = jsonFactory26._getBufferRecycler();
        java.io.OutputStream outputStream28 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = jsonFactory26.createJsonGenerator(outputStream28);
        jsonGenerator29.flush();
        defaultPrettyPrinter6.beforeObjectEntries(jsonGenerator29);
        java.lang.Object obj32 = jsonGenerator29.getOutputTarget();
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray35 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser36 = jsonFactory33.createParser(byteArray35);
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory33.setCodec(objectCodec37);
        com.fasterxml.jackson.core.JsonFactory.Feature feature39 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean41 = feature39.enabledIn((int) '#');
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory38.enable(feature39);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature43 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean44 = jsonFactory38.isEnabled(feature43);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator45 = jsonGenerator29.enable(feature43);
        defaultPrettyPrinter2.writeStartArray(jsonGenerator45);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter47 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter2);
        com.fasterxml.jackson.core.SerializableString serializableString48 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter49 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString48);
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray52 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory50.createParser(byteArray52);
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = jsonFactory50.setCodec(objectCodec54);
        byte[] byteArray58 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser61 = jsonFactory55.createParser(byteArray58, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory62 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray64 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser65 = jsonFactory62.createParser(byteArray64);
        com.fasterxml.jackson.core.JsonFactory.Feature feature66 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory67 = jsonFactory62.enable(feature66);
        com.fasterxml.jackson.core.JsonFactory jsonFactory68 = jsonFactory55.enable(feature66);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler69 = jsonFactory68._getBufferRecycler();
        java.io.OutputStream outputStream70 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator71 = jsonFactory68.createJsonGenerator(outputStream70);
        defaultPrettyPrinter49.writeObjectEntrySeparator(jsonGenerator71);
        com.fasterxml.jackson.core.JsonFactory jsonFactory73 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray75 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser76 = jsonFactory73.createParser(byteArray75);
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory78 = jsonFactory73.setCodec(objectCodec77);
        byte[] byteArray81 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser84 = jsonFactory78.createParser(byteArray81, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory85 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray87 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser88 = jsonFactory85.createParser(byteArray87);
        com.fasterxml.jackson.core.JsonFactory.Feature feature89 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory90 = jsonFactory85.enable(feature89);
        com.fasterxml.jackson.core.JsonFactory jsonFactory91 = jsonFactory78.enable(feature89);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler92 = jsonFactory91._getBufferRecycler();
        java.io.OutputStream outputStream93 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator94 = jsonFactory91.createJsonGenerator(outputStream93);
        jsonGenerator94.flush();
        defaultPrettyPrinter49.writeObjectFieldValueSeparator(jsonGenerator94);
        com.fasterxml.jackson.core.Version version97 = jsonGenerator94.version();
        defaultPrettyPrinter2.writeObjectEntrySeparator(jsonGenerator94);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(bufferRecycler27);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100]");
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jsonFactory42);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature43.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jsonGenerator45);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[100]");
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNotNull(jsonFactory55);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser61);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[100]");
        org.junit.Assert.assertNotNull(jsonParser65);
        org.junit.Assert.assertTrue("'" + feature66 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature66.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory67);
        org.junit.Assert.assertNotNull(jsonFactory68);
        org.junit.Assert.assertNotNull(bufferRecycler69);
        org.junit.Assert.assertNotNull(jsonGenerator71);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[100]");
        org.junit.Assert.assertNotNull(jsonParser76);
        org.junit.Assert.assertNotNull(jsonFactory78);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser84);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[100]");
        org.junit.Assert.assertNotNull(jsonParser88);
        org.junit.Assert.assertTrue("'" + feature89 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature89.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory90);
        org.junit.Assert.assertNotNull(jsonFactory91);
        org.junit.Assert.assertNotNull(bufferRecycler92);
        org.junit.Assert.assertNotNull(jsonGenerator94);
        org.junit.Assert.assertNotNull(version97);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test565");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory2.setCodec(objectCodec6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createParser(byteArray10, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.enable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory7.enable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray23 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory21.createParser(byteArray23);
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory21.enable(feature25);
        byte[] byteArray27 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory26.createJsonParser(byteArray27, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory7.createParser(byteArray27);
        int int33 = serializedString1.appendUnquotedUTF8(byteArray27, 56319);
        byte[] byteArray34 = serializedString1.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray37 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory35.createParser(byteArray37);
        int int40 = serializedString1.appendQuotedUTF8(byteArray37, (int) (byte) 0);
        char[] charArray41 = serializedString1.asQuotedChars();
        int int43 = serializedString0.appendUnquoted(charArray41, (int) (byte) 10);
        byte[] byteArray44 = serializedString0.asQuotedUTF8();
        java.lang.String str45 = serializedString0.getValue();
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(serializedString1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(byteArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[32]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[32]");
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[ ]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[32]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " " + "'", str45, " ");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test566");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        long long14 = uTF8StreamJsonParser12.getValueAsLong(100L);
        uTF8StreamJsonParser12.clearCurrentToken();
        boolean boolean16 = uTF8StreamJsonParser12.isClosed();
        java.lang.String str18 = uTF8StreamJsonParser12.getValueAsString("UTF-32LE");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF-32LE" + "'", str18, "UTF-32LE");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test567");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler1 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext4 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler1, (java.lang.Object) '4', true);
        java.io.InputStream inputStream6 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer8 = null;
        byte[] byteArray9 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext4, 0, inputStream6, objectCodec7, bytesToNameCanonicalizer8, byteArray9, 33, 33, false);
        java.io.InputStream inputStream15 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer17 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer20 = bytesToNameCanonicalizer17.makeChild(false, false);
        byte[] byteArray21 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser25 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext4, (int) 'a', inputStream15, objectCodec16, bytesToNameCanonicalizer20, byteArray21, (int) (byte) 10, 33, false);
        java.io.InputStream inputStream26 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken27 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray28 = jsonToken27.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream31 = new com.fasterxml.jackson.core.io.MergedStream(iOContext4, inputStream26, byteArray28, 56319, (int) (short) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler32 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext35 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler32, (java.lang.Object) '4', true);
        java.io.InputStream inputStream37 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer39 = null;
        byte[] byteArray40 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser44 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext35, 0, inputStream37, objectCodec38, bytesToNameCanonicalizer39, byteArray40, 33, 33, false);
        java.io.InputStream inputStream46 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer48 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer51 = bytesToNameCanonicalizer48.makeChild(false, false);
        byte[] byteArray52 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser56 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext35, (int) 'a', inputStream46, objectCodec47, bytesToNameCanonicalizer51, byteArray52, (int) (byte) 10, 33, false);
        java.io.InputStream inputStream57 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken58 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray59 = jsonToken58.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream62 = new com.fasterxml.jackson.core.io.MergedStream(iOContext35, inputStream57, byteArray59, 56319, (int) (short) 100);
        mergedStream62.mark(32);
        com.fasterxml.jackson.core.JsonToken jsonToken65 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray66 = jsonToken65.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream69 = new com.fasterxml.jackson.core.io.MergedStream(iOContext4, (java.io.InputStream) mergedStream62, byteArray66, (int) (byte) 100, 1269648022);
        int int71 = serializedString0.appendUnquotedUTF8(byteArray66, 10);
        java.nio.ByteBuffer byteBuffer72 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int73 = serializedString0.putUnquotedUTF8(byteBuffer72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer17);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertTrue("'" + jsonToken27 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken27.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer48);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertTrue("'" + jsonToken58 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken58.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertTrue("'" + jsonToken65 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken65.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test568");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        boolean boolean13 = uTF8StreamJsonParser12.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = uTF8StreamJsonParser12.getTokenLocation();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext18 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler15, (java.lang.Object) '4', true);
        java.io.InputStream inputStream20 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer22 = null;
        byte[] byteArray23 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser27 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext18, 0, inputStream20, objectCodec21, bytesToNameCanonicalizer22, byteArray23, 33, 33, false);
        java.io.InputStream inputStream29 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer31 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer34 = bytesToNameCanonicalizer31.makeChild(false, false);
        byte[] byteArray35 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser39 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext18, (int) 'a', inputStream29, objectCodec30, bytesToNameCanonicalizer34, byteArray35, (int) (byte) 10, 33, false);
        java.io.InputStream inputStream40 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken41 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray42 = jsonToken41.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream45 = new com.fasterxml.jackson.core.io.MergedStream(iOContext18, inputStream40, byteArray42, 56319, (int) (short) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler46 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext49 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler46, (java.lang.Object) '4', true);
        java.io.InputStream inputStream51 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer53 = null;
        byte[] byteArray54 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser58 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext49, 0, inputStream51, objectCodec52, bytesToNameCanonicalizer53, byteArray54, 33, 33, false);
        java.io.InputStream inputStream60 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer62 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer65 = bytesToNameCanonicalizer62.makeChild(false, false);
        byte[] byteArray66 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser70 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext49, (int) 'a', inputStream60, objectCodec61, bytesToNameCanonicalizer65, byteArray66, (int) (byte) 10, 33, false);
        java.io.InputStream inputStream71 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken72 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray73 = jsonToken72.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream76 = new com.fasterxml.jackson.core.io.MergedStream(iOContext49, inputStream71, byteArray73, 56319, (int) (short) 100);
        mergedStream76.mark(32);
        com.fasterxml.jackson.core.JsonToken jsonToken79 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray80 = jsonToken79.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream83 = new com.fasterxml.jackson.core.io.MergedStream(iOContext18, (java.io.InputStream) mergedStream76, byteArray80, (int) (byte) 100, 1269648022);
        uTF8StreamJsonParser12._inputBuffer = byteArray80;
        char[] charArray85 = uTF8StreamJsonParser12.getTextCharacters();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonLocation14);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer31);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertTrue("'" + jsonToken41 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken41.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer62);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer65);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[]");
        org.junit.Assert.assertTrue("'" + jsonToken72 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken72.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertTrue("'" + jsonToken79 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken79.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertNull(charArray85);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test569");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler1 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext4 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler1, (java.lang.Object) '4', true);
        java.io.InputStream inputStream6 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer8 = null;
        byte[] byteArray9 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext4, 0, inputStream6, objectCodec7, bytesToNameCanonicalizer8, byteArray9, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken14 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str15 = uTF8StreamJsonParser13._getText2(jsonToken14);
        com.fasterxml.jackson.core.JsonLocation jsonLocation19 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) uTF8StreamJsonParser13, (long) 33, (int) (byte) -1, (int) (short) 1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.setCodec(objectCodec24);
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory25.createJsonParser("hi!");
        java.lang.Object obj28 = jsonParser27.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonParser.Feature feature29 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonParser27.disable(feature29);
        com.fasterxml.jackson.core.JsonParser jsonParser32 = uTF8StreamJsonParser13.configure(feature29, false);
        com.fasterxml.jackson.core.JsonLocation jsonLocation37 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) jsonParser32, 1L, (long) (short) 100, 0, (int) (short) 10);
        com.fasterxml.jackson.core.JsonParseException jsonParseException38 = new com.fasterxml.jackson.core.JsonParseException("N/A", jsonLocation37);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken14 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken14.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES + "'", feature29.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES));
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonParser32);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test570");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        java.lang.String str2 = jsonFactory0.getFormatName();
        java.lang.String str3 = jsonFactory0.getFormatName();
        com.fasterxml.jackson.core.io.IOContext iOContext4 = null;
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray8 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser(byteArray8);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader13 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext4, inputStream5, byteArray8, (int) (short) 10, (int) (short) 10, false);
        boolean boolean14 = uTF32Reader13.markSupported();
        boolean boolean15 = uTF32Reader13.markSupported();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory0.createJsonParser((java.io.Reader) uTF32Reader13);
        // The following exception was thrown during execution in test generation
        try {
            uTF32Reader13.freeBuffers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSON" + "'", str2, "JSON");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSON" + "'", str3, "JSON");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test571");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        int int16 = uTF8StreamJsonParser12.getTextOffset();
        java.lang.Object obj17 = uTF8StreamJsonParser12.getInputSource();
        int int18 = uTF8StreamJsonParser12.getTokenColumnNr();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test572");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        int int16 = uTF8StreamJsonParser12._decodeCharForError((int) '#');
        com.fasterxml.jackson.core.JsonToken jsonToken17 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray18 = jsonToken17.asByteArray();
        java.lang.String str19 = uTF8StreamJsonParser12._getText2(jsonToken17);
        double double20 = uTF8StreamJsonParser12.getValueAsDouble();
        boolean boolean21 = uTF8StreamJsonParser12.canReadTypeId();
        com.fasterxml.jackson.core.FormatSchema formatSchema22 = null;
        boolean boolean23 = uTF8StreamJsonParser12.canUseSchema(formatSchema22);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "false" + "'", str19, "false");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test573");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = jsonFactory18.createJsonGenerator(outputStream20);
        jsonGenerator21.writeFieldName("[Source: N/A; line: 10, column: 0]");
        jsonGenerator21.writeNumber((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertNotNull(jsonGenerator21);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test574");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        defaultPrettyPrinter1.writeRootValueSeparator(jsonGenerator2);
        com.fasterxml.jackson.core.SerializableString serializableString4 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString4);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter5);
        com.fasterxml.jackson.core.SerializableString serializableString7 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter8 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString7);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter9 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter8);
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray12 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory10.createParser(byteArray12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory10.setCodec(objectCodec14);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory15.createParser(byteArray18, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray24 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory22.createParser(byteArray24);
        com.fasterxml.jackson.core.JsonFactory.Feature feature26 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory22.enable(feature26);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory15.enable(feature26);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = jsonFactory28._getBufferRecycler();
        java.io.OutputStream outputStream30 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = jsonFactory28.createJsonGenerator(outputStream30);
        jsonGenerator31.flush();
        defaultPrettyPrinter9.beforeObjectEntries(jsonGenerator31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = jsonGenerator31.getCodec();
        com.fasterxml.jackson.core.Version version35 = jsonGenerator31.version();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonGenerator31.setHighestNonEscapedChar((int) (short) 0);
        defaultPrettyPrinter5.writeEndObject(jsonGenerator37, 1);
        defaultPrettyPrinter1.writeStartArray(jsonGenerator37);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler41 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext44 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler41, (java.lang.Object) '4', true);
        java.io.InputStream inputStream46 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer48 = null;
        byte[] byteArray49 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser53 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext44, 0, inputStream46, objectCodec47, bytesToNameCanonicalizer48, byteArray49, 33, 33, false);
        uTF8StreamJsonParser53._tokenIncomplete = false;
        int int56 = uTF8StreamJsonParser53.getTextOffset();
        java.lang.String str57 = uTF8StreamJsonParser53.getCurrentName();
        com.fasterxml.jackson.core.Version version58 = uTF8StreamJsonParser53.version();
        int int59 = uTF8StreamJsonParser53.getFeatureMask();
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator37.copyCurrentEvent((com.fasterxml.jackson.core.JsonParser) uTF8StreamJsonParser53);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No current event to copy");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100]");
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature26.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(bufferRecycler29);
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertNull(objectCodec34);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(version58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test575");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream14 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer16 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = bytesToNameCanonicalizer16.makeChild(false, false);
        byte[] byteArray20 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser24 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) 'a', inputStream14, objectCodec15, bytesToNameCanonicalizer19, byteArray20, (int) (byte) 10, 33, false);
        java.io.InputStream inputStream25 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken26 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray27 = jsonToken26.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream30 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream25, byteArray27, 56319, (int) (short) 100);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding31 = com.fasterxml.jackson.core.JsonEncoding.UTF8;
        iOContext3.setEncoding(jsonEncoding31);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer16);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + jsonToken26 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken26.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertTrue("'" + jsonEncoding31 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF8 + "'", jsonEncoding31.equals(com.fasterxml.jackson.core.JsonEncoding.UTF8));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test576");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory2.setCodec(objectCodec6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createParser(byteArray10, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.enable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory7.enable(feature18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = jsonFactory20._getBufferRecycler();
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonFactory20.createJsonGenerator(outputStream22);
        defaultPrettyPrinter1.writeObjectEntrySeparator(jsonGenerator23);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray27 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory25.createParser(byteArray27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory25.setCodec(objectCodec29);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser36 = jsonFactory30.createParser(byteArray33, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray39 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory37.createParser(byteArray39);
        com.fasterxml.jackson.core.JsonFactory.Feature feature41 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory37.enable(feature41);
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = jsonFactory30.enable(feature41);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler44 = jsonFactory43._getBufferRecycler();
        java.io.OutputStream outputStream45 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator46 = jsonFactory43.createJsonGenerator(outputStream45);
        jsonGenerator46.flush();
        defaultPrettyPrinter1.writeObjectFieldValueSeparator(jsonGenerator46);
        char[] charArray49 = com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.HEX_CHARS;
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator46.writeString(charArray49, 1269648022, 56319);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1269648022");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(bufferRecycler21);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[100]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertTrue("'" + feature41 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature41.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory42);
        org.junit.Assert.assertNotNull(jsonFactory43);
        org.junit.Assert.assertNotNull(bufferRecycler44);
        org.junit.Assert.assertNotNull(jsonGenerator46);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "01234 6789ABCDEF");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "01234 6789ABCDEF");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[0, 1, 2, 3, 4,  , 6, 7, 8, 9, A, B, C, D, E, F]");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test577");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        int int16 = uTF8StreamJsonParser12._decodeCharForError((int) '#');
        com.fasterxml.jackson.core.JsonToken jsonToken17 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray18 = jsonToken17.asByteArray();
        java.lang.String str19 = uTF8StreamJsonParser12._getText2(jsonToken17);
        double double20 = uTF8StreamJsonParser12.getValueAsDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = uTF8StreamJsonParser12.getNumberValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "false" + "'", str19, "false");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test578");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        uTF8StreamJsonParser12._tokenIncomplete = false;
        int int16 = uTF8StreamJsonParser12.getValueAsInt((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12._reportInvalidToken("false", "false");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'false': was expecting false? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test579");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        double double17 = uTF8StreamJsonParser12.getValueAsDouble((double) (byte) 100);
        int int18 = uTF8StreamJsonParser12.getTextLength();
        long long19 = uTF8StreamJsonParser12.getValueAsLong();
        com.fasterxml.jackson.core.Base64Variant base64Variant20 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext24 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler21, (java.lang.Object) '4', true);
        java.io.InputStream inputStream26 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer28 = null;
        byte[] byteArray29 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser33 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext24, 0, inputStream26, objectCodec27, bytesToNameCanonicalizer28, byteArray29, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken34 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str35 = uTF8StreamJsonParser33._getText2(jsonToken34);
        boolean boolean36 = uTF8StreamJsonParser33.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken37 = uTF8StreamJsonParser33.getLastClearedToken();
        java.lang.String str38 = uTF8StreamJsonParser33.getText();
        int int40 = uTF8StreamJsonParser33._decodeCharForError((int) (byte) 1);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder41 = uTF8StreamJsonParser33._getByteArrayBuilder();
        // The following exception was thrown during execution in test generation
        try {
            int int42 = uTF8StreamJsonParser12.readBinaryValue(base64Variant20, (java.io.OutputStream) byteArrayBuilder41);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken34 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken34.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(jsonToken37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(byteArrayBuilder41);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test580");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory2.setCodec(objectCodec6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createParser(byteArray10, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.enable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory7.enable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray23 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory21.createParser(byteArray23);
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory21.enable(feature25);
        byte[] byteArray27 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory26.createJsonParser(byteArray27, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory7.createParser(byteArray27);
        int int33 = serializedString1.appendUnquotedUTF8(byteArray27, 56319);
        byte[] byteArray34 = serializedString1.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray37 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory35.createParser(byteArray37);
        int int40 = serializedString1.appendQuotedUTF8(byteArray37, (int) (byte) 0);
        char[] charArray41 = serializedString1.asQuotedChars();
        int int43 = serializedString0.appendUnquoted(charArray41, (int) (byte) 10);
        byte[] byteArray44 = serializedString0.asQuotedUTF8();
        java.nio.ByteBuffer byteBuffer45 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int46 = serializedString0.putQuotedUTF8(byteBuffer45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(serializedString1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(byteArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[32]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[32]");
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[ ]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[32]");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test581");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        java.lang.String str20 = jsonFactory18.getRootValueSeparator();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes21 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.setCharacterEscapes(characterEscapes21);
        com.fasterxml.jackson.core.io.IOContext iOContext23 = null;
        java.io.InputStream inputStream24 = null;
        byte[] byteArray25 = null;
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader29 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext23, inputStream24, byteArray25, (-1), (int) 'a', false);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory22.createParser((java.io.Reader) uTF32Reader29);
        com.fasterxml.jackson.core.JsonParser.Feature feature31 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory22.enable(feature31);
        java.net.URL uRL33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory22.createParser(uRL33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS + "'", feature31.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS));
        org.junit.Assert.assertNotNull(jsonFactory32);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test582");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        uTF8StreamJsonParser12._tokenIncomplete = false;
        int int15 = uTF8StreamJsonParser12.getTextOffset();
        java.lang.String str16 = uTF8StreamJsonParser12.getCurrentName();
        com.fasterxml.jackson.core.Version version17 = uTF8StreamJsonParser12.version();
        boolean boolean18 = uTF8StreamJsonParser12._bufferRecyclable;
        java.lang.Object obj19 = uTF8StreamJsonParser12.getTypeId();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test583");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream14 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer16 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = bytesToNameCanonicalizer16.makeChild(false, false);
        byte[] byteArray20 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser24 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) 'a', inputStream14, objectCodec15, bytesToNameCanonicalizer19, byteArray20, (int) (byte) 10, 33, false);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = iOContext3.constructTextBuffer();
        textBuffer25.releaseBuffers();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer16);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(textBuffer25);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test584");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        java.lang.String str16 = uTF8StreamJsonParser12.getText();
        long long17 = uTF8StreamJsonParser12.getTokenCharacterOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = uTF8StreamJsonParser12.getTokenLocation();
        int int20 = uTF8StreamJsonParser12._decodeCharForError(5);
        int int22 = uTF8StreamJsonParser12.getValueAsInt((int) ' ');
        uTF8StreamJsonParser12._bufferRecyclable = true;
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(jsonLocation18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test585");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        int int19 = feature16.getMask();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test586");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonParser3.skipChildren();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext8 = jsonParser7.getParsingContext();
        com.fasterxml.jackson.core.io.SerializedString serializedString9 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        java.lang.String str10 = serializedString9.getValue();
        byte[] byteArray11 = serializedString9.asQuotedUTF8();
        java.lang.String str12 = serializedString9.getValue();
        com.fasterxml.jackson.core.io.SerializedString serializedString13 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.setCodec(objectCodec18);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory19.createParser(byteArray22, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray28 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory26.createParser(byteArray28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory26.enable(feature30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory19.enable(feature30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray35 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser36 = jsonFactory33.createParser(byteArray35);
        com.fasterxml.jackson.core.JsonFactory.Feature feature37 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory33.enable(feature37);
        byte[] byteArray39 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonFactory38.createJsonParser(byteArray39, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = jsonFactory19.createParser(byteArray39);
        int int45 = serializedString13.appendUnquotedUTF8(byteArray39, 56319);
        byte[] byteArray46 = serializedString13.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray49 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory47.createParser(byteArray49);
        int int52 = serializedString13.appendQuotedUTF8(byteArray49, (int) (byte) 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler53 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext56 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler53, (java.lang.Object) '4', true);
        java.io.InputStream inputStream58 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer60 = null;
        byte[] byteArray61 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser65 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext56, 0, inputStream58, objectCodec59, bytesToNameCanonicalizer60, byteArray61, 33, 33, false);
        long long67 = uTF8StreamJsonParser65.getValueAsLong(100L);
        uTF8StreamJsonParser65.clearCurrentToken();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder69 = uTF8StreamJsonParser65._getByteArrayBuilder();
        int int70 = serializedString13.writeUnquotedUTF8((java.io.OutputStream) byteArrayBuilder69);
        int int71 = serializedString9.writeUnquotedUTF8((java.io.OutputStream) byteArrayBuilder69);
        int int72 = jsonParser7.releaseBuffered((java.io.OutputStream) byteArrayBuilder69);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonStreamContext8);
        org.junit.Assert.assertNotNull(serializedString9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[32]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertNotNull(serializedString13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100]");
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(byteArray39);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertNotNull(jsonParser43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[32]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[32]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 100L + "'", long67 == 100L);
        org.junit.Assert.assertNotNull(byteArrayBuilder69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test587");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream14 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer16 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = bytesToNameCanonicalizer16.makeChild(false, false);
        byte[] byteArray20 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser24 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) 'a', inputStream14, objectCodec15, bytesToNameCanonicalizer19, byteArray20, (int) (byte) 10, 33, false);
        java.io.InputStream inputStream25 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken26 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray27 = jsonToken26.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream30 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream25, byteArray27, 56319, (int) (short) 100);
        boolean boolean31 = mergedStream30.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            mergedStream30.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer16);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + jsonToken26 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken26.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test588");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str17 = uTF8StreamJsonParser12._getText2(jsonToken16);
        boolean boolean18 = jsonToken16.isStructStart();
        boolean boolean19 = jsonToken16.isNumeric();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test589");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        java.lang.String str16 = uTF8StreamJsonParser12.getText();
        java.lang.String str17 = uTF8StreamJsonParser12.getCurrentName();
        boolean boolean18 = uTF8StreamJsonParser12.hasTextCharacters();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test590");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.isClosed();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray18 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory16.createParser(byteArray18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory16.setCodec(objectCodec20);
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory21.createParser(byteArray24, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray30 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory28.createParser(byteArray30);
        com.fasterxml.jackson.core.JsonFactory.Feature feature32 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory28.enable(feature32);
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory21.enable(feature32);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = jsonFactory34._getBufferRecycler();
        java.lang.String str36 = jsonFactory34.getRootValueSeparator();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory34.setCharacterEscapes(characterEscapes37);
        com.fasterxml.jackson.core.io.IOContext iOContext39 = null;
        java.io.InputStream inputStream40 = null;
        byte[] byteArray41 = null;
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader45 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext39, inputStream40, byteArray41, (-1), (int) 'a', false);
        com.fasterxml.jackson.core.JsonParser jsonParser46 = jsonFactory38.createParser((java.io.Reader) uTF32Reader45);
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version48 = jsonFactory47.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature49 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = jsonFactory47.configure(feature49, false);
        boolean boolean52 = jsonFactory38.isEnabled(feature49);
        com.fasterxml.jackson.core.JsonParser jsonParser54 = uTF8StreamJsonParser12.configure(feature49, true);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken55 = uTF8StreamJsonParser12.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100]");
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature32.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(bufferRecycler35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + " " + "'", str36, " ");
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonParser46);
        org.junit.Assert.assertNotNull(version48);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature49.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jsonParser54);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test591");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.withoutSpacesInObjectEntries();
        com.fasterxml.jackson.core.SerializableString serializableString4 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString4);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter5);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter7 = defaultPrettyPrinter6.createInstance();
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray10 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory8.createParser(byteArray10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory8.setCodec(objectCodec12);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory13.createParser(byteArray16, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory13.enable(feature24);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = jsonFactory26._getBufferRecycler();
        java.io.OutputStream outputStream28 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = jsonFactory26.createJsonGenerator(outputStream28);
        jsonGenerator29.flush();
        defaultPrettyPrinter6.beforeObjectEntries(jsonGenerator29);
        java.lang.Object obj32 = jsonGenerator29.getOutputTarget();
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray35 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser36 = jsonFactory33.createParser(byteArray35);
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory33.setCodec(objectCodec37);
        com.fasterxml.jackson.core.JsonFactory.Feature feature39 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean41 = feature39.enabledIn((int) '#');
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory38.enable(feature39);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature43 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean44 = jsonFactory38.isEnabled(feature43);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator45 = jsonGenerator29.enable(feature43);
        jsonGenerator45.writeStartArray();
        defaultPrettyPrinter3.writeEndArray(jsonGenerator45, (-1272962340));
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(bufferRecycler27);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100]");
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jsonFactory42);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature43.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jsonGenerator45);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test592");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = defaultPrettyPrinter1.createInstance();
        com.fasterxml.jackson.core.SerializableString serializableString3 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString3);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter4);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = defaultPrettyPrinter5.createInstance();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray9 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory7.createParser(byteArray9);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory7.setCodec(objectCodec11);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory12.createParser(byteArray15, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.enable(feature23);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory12.enable(feature23);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = jsonFactory25._getBufferRecycler();
        java.io.OutputStream outputStream27 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = jsonFactory25.createJsonGenerator(outputStream27);
        jsonGenerator28.flush();
        defaultPrettyPrinter5.beforeObjectEntries(jsonGenerator28);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonGenerator28.setFeatureMask(35);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature33 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = jsonGenerator28.configure(feature33, false);
        com.fasterxml.jackson.core.io.IOContext iOContext36 = null;
        java.io.InputStream inputStream37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray40 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonFactory38.createParser(byteArray40);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader45 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext36, inputStream37, byteArray40, (int) (short) 10, (int) (short) 10, false);
        boolean boolean46 = uTF32Reader45.markSupported();
        long long48 = uTF32Reader45.skip((long) ' ');
        char[] charArray49 = new char[] {};
        int int52 = uTF32Reader45.read(charArray49, (int) (byte) -1, 0);
        jsonGenerator35.writeString(charArray49, 0, (-1272745925));
        defaultPrettyPrinter1.writeStartObject(jsonGenerator35);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter2);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(bufferRecycler26);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature33.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[100]");
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test593");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader9 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext0, inputStream1, byteArray4, (int) (short) 10, (int) (short) 10, false);
        boolean boolean10 = uTF32Reader9.markSupported();
        long long12 = uTF32Reader9.skip((long) ' ');
        char[] charArray13 = new char[] {};
        int int16 = uTF32Reader9.read(charArray13, (int) (byte) -1, 0);
        int int17 = uTF32Reader9.read();
        boolean boolean18 = uTF32Reader9.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            uTF32Reader9.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: reset() not supported");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test594");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn((int) '#');
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.enable(feature6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory9.setCodec(objectCodec10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonFactory11);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test595");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory1.createParser(byteArray3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory1.setCodec(objectCodec5);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory6.createParser(byteArray9, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray15 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory13.createParser(byteArray15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory13.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory6.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        byte[] byteArray26 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createJsonParser(byteArray26, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory6.createParser(byteArray26);
        int int32 = serializedString0.appendUnquotedUTF8(byteArray26, 56319);
        byte[] byteArray33 = serializedString0.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        int int39 = serializedString0.appendQuotedUTF8(byteArray36, (int) (byte) 0);
        java.lang.String str40 = serializedString0.getValue();
        java.lang.String str41 = serializedString0.toString();
        boolean boolean43 = serializedString0.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[32]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[32]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " " + "'", str40, " ");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + " " + "'", str41, " ");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test596");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        boolean boolean13 = uTF8StreamJsonParser12.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = uTF8StreamJsonParser12.getTokenLocation();
        java.lang.String str15 = uTF8StreamJsonParser12.getCurrentName();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonLocation14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test597");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        java.io.Writer writer19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory18.createJsonGenerator(writer19);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator20.writeRaw("OBJECT", (-1272886681), 1268789321);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1272886681");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test598");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType byteBufferType20 = com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version22 = jsonFactory21.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory21.configure(feature23, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray28 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory26.createParser(byteArray28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory26.enable(feature30);
        byte[] byteArray32 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory31.createJsonParser(byteArray32, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory21.createParser(byteArray32, (int) (short) 10, 2);
        bufferRecycler19.releaseByteBuffer(byteBufferType20, byteArray32);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        int int41 = textBuffer40.getCurrentSegmentSize();
        char[] charArray42 = textBuffer40.getCurrentSegment();
        textBuffer40.ensureNotShared();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertTrue("'" + byteBufferType20 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER + "'", byteBufferType20.equals(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER));
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature23.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(byteArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test599");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.enable(feature23);
        byte[] byteArray25 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory24.createJsonParser(byteArray25, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory5.createParser(byteArray25);
        byte[] byteArray30 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory5.createJsonParser(byteArray30);
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory5.setCodec(objectCodec32);
        java.lang.String str34 = jsonFactory33.getFormatName();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(byteArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JSON" + "'", str34, "JSON");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test600");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken13 = uTF8StreamJsonParser12.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test601");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        java.lang.String str20 = jsonFactory18.getRootValueSeparator();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes21 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.setCharacterEscapes(characterEscapes21);
        java.io.InputStream inputStream23 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory22.createParser(inputStream23);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser24);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test602");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        boolean boolean13 = uTF8StreamJsonParser12.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = uTF8StreamJsonParser12.getTokenLocation();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext15 = uTF8StreamJsonParser12.getParsingContext();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonLocation14);
        org.junit.Assert.assertNotNull(jsonStreamContext15);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test603");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getCurrentToken();
        double double18 = uTF8StreamJsonParser12.getValueAsDouble((double) 8);
        int int19 = uTF8StreamJsonParser12.getCurrentTokenId();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test604");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream14 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer16 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = bytesToNameCanonicalizer16.makeChild(false, false);
        byte[] byteArray20 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser24 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) 'a', inputStream14, objectCodec15, bytesToNameCanonicalizer19, byteArray20, (int) (byte) 10, 33, false);
        com.fasterxml.jackson.core.sym.Name name28 = bytesToNameCanonicalizer19.addName("[Source: hi!; line: 100, column: 35]", 4, 1268932845);
        int int29 = bytesToNameCanonicalizer19.size();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer16);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(name28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test605");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext15 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler12, (java.lang.Object) '4', true);
        java.io.InputStream inputStream17 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = null;
        byte[] byteArray20 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser24 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext15, 0, inputStream17, objectCodec18, bytesToNameCanonicalizer19, byteArray20, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken25 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str26 = uTF8StreamJsonParser24._getText2(jsonToken25);
        com.fasterxml.jackson.core.JsonLocation jsonLocation30 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) uTF8StreamJsonParser24, (long) 33, (int) (byte) -1, (int) (short) 1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray33 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory31.createParser(byteArray33);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory31.setCodec(objectCodec35);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory36.createJsonParser("hi!");
        java.lang.Object obj39 = jsonParser38.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonParser.Feature feature40 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
        com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonParser38.disable(feature40);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = uTF8StreamJsonParser24.configure(feature40, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory5.disable(feature40);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory5.setCodec(objectCodec45);
        com.fasterxml.jackson.core.Version version47 = jsonFactory5.version();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes48 = jsonFactory5.getCharacterEscapes();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken25 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken25.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100]");
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES + "'", feature40.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES));
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertNotNull(jsonParser43);
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertNotNull(version47);
        org.junit.Assert.assertNull(characterEscapes48);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test606");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        java.lang.String str20 = jsonFactory18.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray23 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory21.createParser(byteArray23);
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory21.setCodec(objectCodec25);
        com.fasterxml.jackson.core.JsonFactory.Feature feature27 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean29 = feature27.enabledIn((int) '#');
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory26.enable(feature27);
        com.fasterxml.jackson.core.JsonFactory.Feature feature31 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean32 = jsonFactory26.isEnabled(feature31);
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory18.configure(feature31, true);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100]");
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature27.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature31.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jsonFactory34);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test607");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str17 = uTF8StreamJsonParser12._getText2(jsonToken16);
        uTF8StreamJsonParser12.overrideCurrentName("ROOT");
        java.lang.String str20 = uTF8StreamJsonParser12.getCurrentName();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ROOT" + "'", str20, "ROOT");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test608");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType byteBufferType20 = com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version22 = jsonFactory21.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory21.configure(feature23, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray28 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory26.createParser(byteArray28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory26.enable(feature30);
        byte[] byteArray32 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory31.createJsonParser(byteArray32, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory21.createParser(byteArray32, (int) (short) 10, 2);
        bufferRecycler19.releaseByteBuffer(byteBufferType20, byteArray32);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer40.setCurrentLength(8);
        char[] charArray43 = textBuffer40.contentsAsArray();
        textBuffer40.ensureNotShared();
        char[] charArray45 = textBuffer40.getCurrentSegment();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertTrue("'" + byteBufferType20 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER + "'", byteBufferType20.equals(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER));
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature23.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(byteArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test609");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        double double17 = uTF8StreamJsonParser12.getValueAsDouble((double) (byte) 100);
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = uTF8StreamJsonParser12.getTokenLocation();
        int int19 = uTF8StreamJsonParser12.getCurrentTokenId();
        java.lang.String str21 = uTF8StreamJsonParser12.getValueAsString("OBJECT");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(jsonLocation18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OBJECT" + "'", str21, "OBJECT");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test610");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        long long14 = uTF8StreamJsonParser12.getValueAsLong(100L);
        uTF8StreamJsonParser12.clearCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = uTF8StreamJsonParser12.skipChildren();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(jsonParser16);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test611");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory2.setCodec(objectCodec6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createParser(byteArray10, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.enable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory7.enable(feature18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = jsonFactory20._getBufferRecycler();
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonFactory20.createJsonGenerator(outputStream22);
        defaultPrettyPrinter1.writeObjectEntrySeparator(jsonGenerator23);
        char[] charArray29 = new char[] { 'a', ' ', '#', ' ' };
        jsonGenerator23.writeRaw(charArray29, 1, (int) (short) 0);
        int int33 = jsonGenerator23.getHighestEscapedChar();
        com.fasterxml.jackson.core.JsonGenerator.Feature feature34 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
        boolean boolean35 = feature34.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = jsonGenerator23.disable(feature34);
        com.fasterxml.jackson.core.SerializableString serializableString37 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter38 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString37);
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray41 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonFactory39.createParser(byteArray41);
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory39.setCodec(objectCodec43);
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory44.createParser(byteArray47, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray53 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonFactory51.createParser(byteArray53);
        com.fasterxml.jackson.core.JsonFactory.Feature feature55 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory51.enable(feature55);
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = jsonFactory44.enable(feature55);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler58 = jsonFactory57._getBufferRecycler();
        java.io.OutputStream outputStream59 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator60 = jsonFactory57.createJsonGenerator(outputStream59);
        defaultPrettyPrinter38.writeObjectEntrySeparator(jsonGenerator60);
        jsonGenerator60.writeString("");
        char[] charArray68 = new char[] { '#', 'a', ' ', '4' };
        jsonGenerator60.writeRawValue(charArray68, (int) (short) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator36.writeString(charArray68, 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(bufferRecycler21);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "a # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "a # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a,  , #,  ]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS + "'", feature34.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100]");
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[100]");
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertTrue("'" + feature55 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature55.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(jsonFactory57);
        org.junit.Assert.assertNotNull(bufferRecycler58);
        org.junit.Assert.assertNotNull(jsonGenerator60);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "#a 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "#a 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[#, a,  , 4]");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test612");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray5 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory3.createParser(byteArray5);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory3.setCodec(objectCodec7);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory8.createParser(byteArray11, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray17 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory15.createParser(byteArray17);
        com.fasterxml.jackson.core.JsonFactory.Feature feature19 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory15.enable(feature19);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory8.enable(feature19);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = jsonFactory21._getBufferRecycler();
        java.io.OutputStream outputStream23 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = jsonFactory21.createJsonGenerator(outputStream23);
        jsonGenerator24.flush();
        defaultPrettyPrinter2.beforeObjectEntries(jsonGenerator24);
        boolean boolean27 = jsonGenerator24.isClosed();
        jsonGenerator24.writeRaw(' ');
        java.lang.Object obj30 = jsonGenerator24.getOutputTarget();
        boolean boolean31 = jsonGenerator24.canOmitFields();
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray34 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory32.createParser(byteArray34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory32.setCodec(objectCodec36);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature38 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean39 = feature38.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory37.configure(feature38, false);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator42 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = jsonFactory37.setOutputDecorator(outputDecorator42);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator44 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory37.setOutputDecorator(outputDecorator44);
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray48 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonFactory46.createParser(byteArray48);
        com.fasterxml.jackson.core.ObjectCodec objectCodec50 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = jsonFactory46.setCodec(objectCodec50);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature52 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean53 = feature52.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = jsonFactory51.configure(feature52, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory45.disable(feature52);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator57 = jsonGenerator24.enable(feature52);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100]");
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(bufferRecycler22);
        org.junit.Assert.assertNotNull(jsonGenerator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature38.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertNotNull(jsonFactory43);
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100]");
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertNotNull(jsonFactory51);
        org.junit.Assert.assertTrue("'" + feature52 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature52.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jsonFactory55);
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(jsonGenerator57);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test613");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding13 = null;
        iOContext3.setEncoding(jsonEncoding13);
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator18 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, 1269648022, objectCodec16, writer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test614");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        int int4 = jsonParser3.getTextOffset();
        jsonParser3.overrideCurrentName("hi!");
        jsonParser3.overrideCurrentName("JSON");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test615");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        com.fasterxml.jackson.core.SerializableString serializableString1 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray6 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory4.createParser(byteArray6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory4.setCodec(objectCodec8);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory9.createParser(byteArray12, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray18 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory16.createParser(byteArray18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory16.enable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory9.enable(feature20);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = jsonFactory22._getBufferRecycler();
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = jsonFactory22.createJsonGenerator(outputStream24);
        jsonGenerator25.flush();
        defaultPrettyPrinter3.beforeObjectEntries(jsonGenerator25);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = jsonGenerator25.getCodec();
        com.fasterxml.jackson.core.Version version29 = jsonGenerator25.version();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = jsonGenerator25.setHighestNonEscapedChar((int) (short) 0);
        lf2SpacesIndenter0.writeIndentation(jsonGenerator25, 79);
        com.fasterxml.jackson.core.SerializableString serializableString34 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter35 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString34);
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray38 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonFactory36.createParser(byteArray38);
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory36.setCodec(objectCodec40);
        byte[] byteArray44 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory41.createParser(byteArray44, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray50 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonFactory48.createParser(byteArray50);
        com.fasterxml.jackson.core.JsonFactory.Feature feature52 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = jsonFactory48.enable(feature52);
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = jsonFactory41.enable(feature52);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler55 = jsonFactory54._getBufferRecycler();
        java.io.OutputStream outputStream56 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator57 = jsonFactory54.createJsonGenerator(outputStream56);
        defaultPrettyPrinter35.writeObjectEntrySeparator(jsonGenerator57);
        jsonGenerator57.writeString("");
        com.fasterxml.jackson.core.JsonFactory jsonFactory61 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray63 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser64 = jsonFactory61.createParser(byteArray63);
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory66 = jsonFactory61.setCodec(objectCodec65);
        com.fasterxml.jackson.core.JsonFactory.Feature feature67 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean69 = feature67.enabledIn((int) '#');
        com.fasterxml.jackson.core.JsonFactory jsonFactory70 = jsonFactory66.enable(feature67);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature71 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean72 = jsonFactory66.isEnabled(feature71);
        boolean boolean73 = feature71.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator74 = jsonGenerator57.disable(feature71);
        lf2SpacesIndenter0.writeIndentation(jsonGenerator74, (int) (short) 1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter78 = lf2SpacesIndenter0.withLinefeed("com.fasterxml.jackson.core.JsonParseException: false\n at [Source: 4; line: 1, column: 34]");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter80 = lf2SpacesIndenter0.withLinefeed("UTF-32LE");
        org.junit.Assert.assertNotNull(lf2SpacesIndenter0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(bufferRecycler23);
        org.junit.Assert.assertNotNull(jsonGenerator25);
        org.junit.Assert.assertNull(objectCodec28);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100]");
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[100]");
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertTrue("'" + feature52 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature52.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory53);
        org.junit.Assert.assertNotNull(jsonFactory54);
        org.junit.Assert.assertNotNull(bufferRecycler55);
        org.junit.Assert.assertNotNull(jsonGenerator57);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[100]");
        org.junit.Assert.assertNotNull(jsonParser64);
        org.junit.Assert.assertNotNull(jsonFactory66);
        org.junit.Assert.assertTrue("'" + feature67 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature67.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(jsonFactory70);
        org.junit.Assert.assertTrue("'" + feature71 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature71.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jsonGenerator74);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter78);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter80);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test616");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.createInstance();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray6 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory4.createParser(byteArray6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory4.setCodec(objectCodec8);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory9.createParser(byteArray12, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray18 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory16.createParser(byteArray18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory16.enable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory9.enable(feature20);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = jsonFactory22._getBufferRecycler();
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = jsonFactory22.createJsonGenerator(outputStream24);
        jsonGenerator25.flush();
        defaultPrettyPrinter2.beforeObjectEntries(jsonGenerator25);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = jsonGenerator25.setFeatureMask(35);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature30 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonGenerator25.configure(feature30, false);
        com.fasterxml.jackson.core.io.SerializedString serializedString33 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = jsonFactory34.setCodec(objectCodec38);
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser45 = jsonFactory39.createParser(byteArray42, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray48 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonFactory46.createParser(byteArray48);
        com.fasterxml.jackson.core.JsonFactory.Feature feature50 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = jsonFactory46.enable(feature50);
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = jsonFactory39.enable(feature50);
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray55 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory53.createParser(byteArray55);
        com.fasterxml.jackson.core.JsonFactory.Feature feature57 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = jsonFactory53.enable(feature57);
        byte[] byteArray59 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser62 = jsonFactory58.createJsonParser(byteArray59, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory39.createParser(byteArray59);
        int int65 = serializedString33.appendUnquotedUTF8(byteArray59, 56319);
        byte[] byteArray66 = serializedString33.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory67 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray69 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser70 = jsonFactory67.createParser(byteArray69);
        int int72 = serializedString33.appendQuotedUTF8(byteArray69, (int) (byte) 0);
        java.lang.String str73 = serializedString33.getValue();
        java.lang.String str74 = serializedString33.getValue();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator75 = jsonGenerator25.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString33);
        jsonGenerator25.writeNumberField("UTF-16LE", (double) 5);
        com.fasterxml.jackson.core.TreeNode treeNode79 = null;
        jsonGenerator25.writeTree(treeNode79);
        com.fasterxml.jackson.core.io.SerializedString serializedString81 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        java.lang.String str82 = serializedString81.getValue();
        byte[] byteArray83 = serializedString81.asQuotedUTF8();
        java.lang.String str84 = serializedString81.getValue();
        jsonGenerator25.writeRaw((com.fasterxml.jackson.core.SerializableString) serializedString81);
        int int86 = serializedString81.charLength();
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(bufferRecycler23);
        org.junit.Assert.assertNotNull(jsonGenerator25);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature30.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(serializedString33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser45);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100]");
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertTrue("'" + feature50 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature50.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory51);
        org.junit.Assert.assertNotNull(jsonFactory52);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100]");
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature57.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory58);
        org.junit.Assert.assertNotNull(byteArray59);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser62);
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[32]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[32]");
        org.junit.Assert.assertNotNull(jsonParser70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + " " + "'", str73, " ");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + " " + "'", str74, " ");
        org.junit.Assert.assertNotNull(jsonGenerator75);
        org.junit.Assert.assertNotNull(serializedString81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + " " + "'", str82, " ");
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[32]");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + " " + "'", str84, " ");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test617");
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer0 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer3 = bytesToNameCanonicalizer0.makeChild(false, false);
        int int4 = bytesToNameCanonicalizer0.size();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = bytesToNameCanonicalizer0.makeChild(false, false);
        int int8 = bytesToNameCanonicalizer0.hashSeed();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler9, (java.lang.Object) '4', true);
        java.io.InputStream inputStream14 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer16 = null;
        byte[] byteArray17 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser21 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext12, 0, inputStream14, objectCodec15, bytesToNameCanonicalizer16, byteArray17, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken22 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str23 = uTF8StreamJsonParser21._getText2(jsonToken22);
        boolean boolean24 = uTF8StreamJsonParser21.loadMore();
        int int25 = uTF8StreamJsonParser21.getTextOffset();
        int[] intArray26 = uTF8StreamJsonParser21._quadBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = bytesToNameCanonicalizer0.calcHash(intArray26, (-1272890828));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer0);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1267007035) + "'", int8 == (-1267007035));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken22 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken22.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test618");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.isClosed();
        int int17 = uTF8StreamJsonParser12.getValueAsInt(56320);
        com.fasterxml.jackson.core.Version version18 = uTF8StreamJsonParser12.version();
        boolean boolean19 = uTF8StreamJsonParser12._tokenIncomplete;
        com.fasterxml.jackson.core.Version version20 = uTF8StreamJsonParser12.version();
        int int21 = uTF8StreamJsonParser12.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = uTF8StreamJsonParser12.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 56320 + "'", int17 == 56320);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test619");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        uTF8StreamJsonParser12._tokenIncomplete = false;
        int int15 = uTF8StreamJsonParser12.getTextOffset();
        java.lang.String str16 = uTF8StreamJsonParser12.getCurrentName();
        com.fasterxml.jackson.core.Version version17 = uTF8StreamJsonParser12.version();
        char[] charArray18 = uTF8StreamJsonParser12.getTextCharacters();
        java.lang.String str19 = uTF8StreamJsonParser12.getText();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(version17);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test620");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory1.createParser(byteArray3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory1.setCodec(objectCodec5);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory6.createParser(byteArray9, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray15 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory13.createParser(byteArray15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory13.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory6.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        byte[] byteArray26 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createJsonParser(byteArray26, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory6.createParser(byteArray26);
        int int32 = serializedString0.appendUnquotedUTF8(byteArray26, 56319);
        byte[] byteArray33 = serializedString0.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        int int39 = serializedString0.appendQuotedUTF8(byteArray36, (int) (byte) 0);
        java.lang.String str40 = serializedString0.getValue();
        com.fasterxml.jackson.core.SerializableString serializableString41 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter42 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString41);
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray45 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser46 = jsonFactory43.createParser(byteArray45);
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = jsonFactory43.setCodec(objectCodec47);
        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonFactory48.createParser(byteArray51, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray57 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser58 = jsonFactory55.createParser(byteArray57);
        com.fasterxml.jackson.core.JsonFactory.Feature feature59 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = jsonFactory55.enable(feature59);
        com.fasterxml.jackson.core.JsonFactory jsonFactory61 = jsonFactory48.enable(feature59);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler62 = jsonFactory61._getBufferRecycler();
        java.io.OutputStream outputStream63 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator64 = jsonFactory61.createJsonGenerator(outputStream63);
        defaultPrettyPrinter42.writeObjectEntrySeparator(jsonGenerator64);
        jsonGenerator64.writeString("");
        char[] charArray72 = new char[] { '#', 'a', ' ', '4' };
        jsonGenerator64.writeRawValue(charArray72, (int) (short) 10, (int) (byte) 0);
        int int77 = serializedString0.appendUnquoted(charArray72, (int) (short) 10);
        java.lang.String str78 = serializedString0.toString();
        byte[] byteArray79 = serializedString0.asUnquotedUTF8();
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[32]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[32]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " " + "'", str40, " ");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[100]");
        org.junit.Assert.assertNotNull(jsonParser46);
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[100]");
        org.junit.Assert.assertNotNull(jsonParser58);
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature59.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory60);
        org.junit.Assert.assertNotNull(jsonFactory61);
        org.junit.Assert.assertNotNull(bufferRecycler62);
        org.junit.Assert.assertNotNull(jsonGenerator64);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), "#a 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), "#a 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[#, a,  , 4]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + " " + "'", str78, " ");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[32]");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test621");
        com.fasterxml.jackson.core.io.SerializedString serializedString0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory1.createParser(byteArray3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory1.setCodec(objectCodec5);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory6.createParser(byteArray9, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray15 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory13.createParser(byteArray15);
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory13.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory6.enable(feature17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        byte[] byteArray26 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createJsonParser(byteArray26, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory6.createParser(byteArray26);
        int int32 = serializedString0.appendUnquotedUTF8(byteArray26, 56319);
        byte[] byteArray33 = serializedString0.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        int int39 = serializedString0.appendQuotedUTF8(byteArray36, (int) (byte) 0);
        java.lang.String str40 = serializedString0.getValue();
        java.lang.String str41 = serializedString0.getValue();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler42 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext45 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler42, (java.lang.Object) '4', true);
        java.io.InputStream inputStream47 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer49 = null;
        byte[] byteArray50 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser54 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext45, 0, inputStream47, objectCodec48, bytesToNameCanonicalizer49, byteArray50, 33, 33, false);
        long long56 = uTF8StreamJsonParser54.getValueAsLong(100L);
        uTF8StreamJsonParser54.clearCurrentToken();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder58 = uTF8StreamJsonParser54._getByteArrayBuilder();
        int int59 = serializedString0.writeUnquotedUTF8((java.io.OutputStream) byteArrayBuilder58);
        org.junit.Assert.assertNotNull(serializedString0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[32]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[32]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " " + "'", str40, " ");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + " " + "'", str41, " ");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 100L + "'", long56 == 100L);
        org.junit.Assert.assertNotNull(byteArrayBuilder58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test622");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        java.io.Writer writer19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory18.createJsonGenerator(writer19);
        jsonGenerator20.writeNumberField("UTF-32LE", (double) 1L);
        jsonGenerator20.writeRawValue(" ");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test623");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        java.lang.String str17 = uTF8StreamJsonParser12.getText();
        boolean boolean18 = uTF8StreamJsonParser12.hasCurrentToken();
        int int19 = uTF8StreamJsonParser12.getCurrentTokenId();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test624");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        long long14 = uTF8StreamJsonParser12.getValueAsLong(100L);
        uTF8StreamJsonParser12.clearCurrentToken();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder16 = uTF8StreamJsonParser12._getByteArrayBuilder();
        int int17 = uTF8StreamJsonParser12.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger18 = uTF8StreamJsonParser12.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(byteArrayBuilder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test625");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType byteBufferType20 = com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version22 = jsonFactory21.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory21.configure(feature23, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray28 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory26.createParser(byteArray28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory26.enable(feature30);
        byte[] byteArray32 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory31.createJsonParser(byteArray32, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory21.createParser(byteArray32, (int) (short) 10, 2);
        bufferRecycler19.releaseByteBuffer(byteBufferType20, byteArray32);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        java.lang.String str41 = textBuffer40.toString();
        char[] charArray42 = textBuffer40.getTextBuffer();
        java.lang.String str43 = textBuffer40.toString();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertTrue("'" + byteBufferType20 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER + "'", byteBufferType20.equals(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER));
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature23.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(byteArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(charArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test626");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = jsonFactory5.getCodec();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext23 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler20, (java.lang.Object) '4', true);
        java.io.InputStream inputStream25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer27 = null;
        byte[] byteArray28 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser32 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext23, 0, inputStream25, objectCodec26, bytesToNameCanonicalizer27, byteArray28, 33, 33, false);
        long long34 = uTF8StreamJsonParser32.getValueAsLong(100L);
        uTF8StreamJsonParser32.clearCurrentToken();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder36 = uTF8StreamJsonParser32._getByteArrayBuilder();
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding37 = com.fasterxml.jackson.core.JsonEncoding.UTF32_LE;
        int int38 = jsonEncoding37.bits();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator39 = jsonFactory5.createGenerator((java.io.OutputStream) byteArrayBuilder36, jsonEncoding37);
        com.fasterxml.jackson.core.Version version40 = jsonFactory5.version();
        com.fasterxml.jackson.core.JsonFactory.Feature feature41 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory5.enable(feature41);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNull(objectCodec19);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(byteArrayBuilder36);
        org.junit.Assert.assertTrue("'" + jsonEncoding37 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF32_LE + "'", jsonEncoding37.equals(com.fasterxml.jackson.core.JsonEncoding.UTF32_LE));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNotNull(jsonGenerator39);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertTrue("'" + feature41 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature41.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory42);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test627");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.isClosed();
        int int17 = uTF8StreamJsonParser12.getValueAsInt(56320);
        boolean boolean18 = uTF8StreamJsonParser12.isClosed();
        com.fasterxml.jackson.core.JsonToken jsonToken19 = uTF8StreamJsonParser12.getLastClearedToken();
        boolean boolean20 = uTF8StreamJsonParser12.hasTextCharacters();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 56320 + "'", int17 == 56320);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test628");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = uTF8StreamJsonParser12.getLastClearedToken();
        java.lang.String str17 = uTF8StreamJsonParser12.getText();
        boolean boolean18 = uTF8StreamJsonParser12.hasCurrentToken();
        java.lang.String str20 = uTF8StreamJsonParser12.getValueAsString("false");
        boolean boolean21 = uTF8StreamJsonParser12.isClosed();
        java.lang.String str22 = uTF8StreamJsonParser12.getValueAsString();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "false" + "'", str20, "false");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test629");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray6 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory4.createParser(byteArray6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory4.setCodec(objectCodec8);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory9.createParser(byteArray12, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray18 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory16.createParser(byteArray18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory16.enable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory9.enable(feature20);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = jsonFactory22._getBufferRecycler();
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = jsonFactory22.createJsonGenerator(outputStream24);
        defaultPrettyPrinter3.writeObjectEntrySeparator(jsonGenerator25);
        com.fasterxml.jackson.core.SerializableString serializableString27 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter28 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString27);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter29 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter28);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter30 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        defaultPrettyPrinter28.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter30);
        defaultPrettyPrinter3.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter30);
        defaultPrettyPrinter1.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version35 = jsonFactory34.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory34.configure(feature36, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray41 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonFactory39.createParser(byteArray41);
        com.fasterxml.jackson.core.JsonFactory.Feature feature43 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory39.enable(feature43);
        byte[] byteArray45 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonFactory44.createJsonParser(byteArray45, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonFactory34.createParser(byteArray45, (int) (short) 10, 2);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes52 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = jsonFactory34.setCharacterEscapes(characterEscapes52);
        java.io.Writer writer54 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator55 = jsonFactory53.createGenerator(writer54);
        defaultPrettyPrinter1.writeEndArray(jsonGenerator55, (-56219));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(bufferRecycler23);
        org.junit.Assert.assertNotNull(jsonGenerator25);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter30);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100]");
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature43.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertNotNull(byteArray45);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertNotNull(jsonFactory53);
        org.junit.Assert.assertNotNull(jsonGenerator55);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test630");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        uTF8StreamJsonParser12._tokenIncomplete = false;
        int int15 = uTF8StreamJsonParser12.getTextOffset();
        double double17 = uTF8StreamJsonParser12.getValueAsDouble((double) 'a');
        boolean boolean18 = uTF8StreamJsonParser12.hasCurrentToken();
        java.lang.Object obj19 = uTF8StreamJsonParser12.getInputSource();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test631");
        com.fasterxml.jackson.core.json.DupDetector dupDetector0 = null;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext1 = com.fasterxml.jackson.core.json.JsonReadContext.createRootContext(dupDetector0);
        boolean boolean2 = jsonReadContext1.inArray();
        jsonReadContext1._currentName = "N/A";
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray7 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory5.createParser(byteArray7);
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory5.setCodec(objectCodec9);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory10.createParser(byteArray13, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray19 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory17.createParser(byteArray19);
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory17.enable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory10.enable(feature21);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = jsonFactory23._getBufferRecycler();
        com.fasterxml.jackson.core.JsonLocation jsonLocation25 = jsonReadContext1.getStartLocation((java.lang.Object) jsonFactory23);
        com.fasterxml.jackson.core.JsonParser.Feature feature26 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        boolean boolean27 = feature26.enabledByDefault();
        boolean boolean28 = jsonFactory23.isEnabled(feature26);
        org.junit.Assert.assertNotNull(jsonReadContext1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100]");
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(bufferRecycler24);
        org.junit.Assert.assertNotNull(jsonLocation25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature26.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test632");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray7 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory5.createParser(byteArray7);
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory5.enable(feature9);
        byte[] byteArray11 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory10.createJsonParser(byteArray11, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory0.createParser(byteArray11, (int) (short) 10, 2);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory0.setCharacterEscapes(characterEscapes18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = jsonFactory19._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType21 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER;
        char[] charArray23 = new char[] { '#' };
        bufferRecycler20.releaseCharBuffer(charBufferType21, charArray23);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext28 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler25, (java.lang.Object) '4', true);
        java.io.InputStream inputStream30 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer32 = null;
        byte[] byteArray33 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser37 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext28, 0, inputStream30, objectCodec31, bytesToNameCanonicalizer32, byteArray33, 33, 33, false);
        java.io.InputStream inputStream39 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer41 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer44 = bytesToNameCanonicalizer41.makeChild(false, false);
        byte[] byteArray45 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser49 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext28, (int) 'a', inputStream39, objectCodec40, bytesToNameCanonicalizer44, byteArray45, (int) (byte) 10, 33, false);
        com.fasterxml.jackson.core.io.IOContext iOContext51 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler20, (java.lang.Object) iOContext28, true);
        java.lang.Object obj52 = iOContext51.getSourceReference();
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        java.io.OutputStream outputStream55 = null;
        com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator56 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext51, (-1272757989), objectCodec54, outputStream55);
        uTF8JsonGenerator56.writeNumber((double) (-1272962340));
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray61 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser62 = jsonFactory59.createParser(byteArray61);
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory64 = jsonFactory59.setCodec(objectCodec63);
        byte[] byteArray67 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser70 = jsonFactory64.createParser(byteArray67, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray73 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser74 = jsonFactory71.createParser(byteArray73);
        com.fasterxml.jackson.core.ObjectCodec objectCodec75 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory76 = jsonFactory71.setCodec(objectCodec75);
        byte[] byteArray79 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser82 = jsonFactory76.createParser(byteArray79, (-1), 0);
        com.fasterxml.jackson.core.JsonParser jsonParser83 = jsonFactory64.createParser(byteArray79);
        com.fasterxml.jackson.core.FormatSchema formatSchema84 = jsonParser83.getSchema();
        // The following exception was thrown during execution in test generation
        try {
            uTF8JsonGenerator56.copyCurrentEvent(jsonParser83);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No current event to copy");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(bufferRecycler20);
        org.junit.Assert.assertTrue("'" + charBufferType21 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER + "'", charBufferType21.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer41);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[100]");
        org.junit.Assert.assertNotNull(jsonParser62);
        org.junit.Assert.assertNotNull(jsonFactory64);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser70);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[100]");
        org.junit.Assert.assertNotNull(jsonParser74);
        org.junit.Assert.assertNotNull(jsonFactory76);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser82);
        org.junit.Assert.assertNotNull(jsonParser83);
        org.junit.Assert.assertNull(formatSchema84);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test633");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray6 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory5.createJsonParser(byteArray6);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = jsonFactory5._getBufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext11 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler8, (java.lang.Object) (-1272941686), true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version14 = jsonFactory13.version();
        java.lang.String str15 = jsonFactory13.getFormatName();
        java.lang.String str16 = jsonFactory13.getFormatName();
        com.fasterxml.jackson.core.io.IOContext iOContext17 = null;
        java.io.InputStream inputStream18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader26 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext17, inputStream18, byteArray21, (int) (short) 10, (int) (short) 10, false);
        boolean boolean27 = uTF32Reader26.markSupported();
        boolean boolean28 = uTF32Reader26.markSupported();
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory13.createJsonParser((java.io.Reader) uTF32Reader26);
        boolean boolean30 = uTF32Reader26.markSupported();
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser33 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext11, 256, (java.io.Reader) uTF32Reader26, objectCodec31, charsToNameCanonicalizer32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(bufferRecycler8);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JSON" + "'", str15, "JSON");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JSON" + "'", str16, "JSON");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test634");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory2.setCodec(objectCodec6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createParser(byteArray10, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.enable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory7.enable(feature18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = jsonFactory20._getBufferRecycler();
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonFactory20.createJsonGenerator(outputStream22);
        defaultPrettyPrinter1.writeObjectEntrySeparator(jsonGenerator23);
        com.fasterxml.jackson.core.SerializableString serializableString25 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter26 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray29 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory27.createParser(byteArray29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory27.setCodec(objectCodec31);
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory32.createParser(byteArray35, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray41 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonFactory39.createParser(byteArray41);
        com.fasterxml.jackson.core.JsonFactory.Feature feature43 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory39.enable(feature43);
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory32.enable(feature43);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler46 = jsonFactory45._getBufferRecycler();
        java.io.OutputStream outputStream47 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator48 = jsonFactory45.createJsonGenerator(outputStream47);
        defaultPrettyPrinter26.writeObjectEntrySeparator(jsonGenerator48);
        com.fasterxml.jackson.core.SerializableString serializableString50 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter51 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString50);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter52 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter51);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter53 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        defaultPrettyPrinter51.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter53);
        defaultPrettyPrinter26.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter53);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter56 = defaultPrettyPrinter26.createInstance();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter57 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        com.fasterxml.jackson.core.SerializableString serializableString58 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter59 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString58);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter60 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter59);
        com.fasterxml.jackson.core.JsonFactory jsonFactory61 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray63 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser64 = jsonFactory61.createParser(byteArray63);
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory66 = jsonFactory61.setCodec(objectCodec65);
        byte[] byteArray69 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser72 = jsonFactory66.createParser(byteArray69, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory73 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray75 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser76 = jsonFactory73.createParser(byteArray75);
        com.fasterxml.jackson.core.JsonFactory.Feature feature77 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory78 = jsonFactory73.enable(feature77);
        com.fasterxml.jackson.core.JsonFactory jsonFactory79 = jsonFactory66.enable(feature77);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler80 = jsonFactory79._getBufferRecycler();
        java.io.OutputStream outputStream81 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator82 = jsonFactory79.createJsonGenerator(outputStream81);
        jsonGenerator82.flush();
        defaultPrettyPrinter60.beforeObjectEntries(jsonGenerator82);
        com.fasterxml.jackson.core.ObjectCodec objectCodec85 = jsonGenerator82.getCodec();
        com.fasterxml.jackson.core.Version version86 = jsonGenerator82.version();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator88 = jsonGenerator82.setHighestNonEscapedChar((int) (short) 0);
        lf2SpacesIndenter57.writeIndentation(jsonGenerator82, 79);
        jsonGenerator82.writeNumberField(" ", (long) (byte) 10);
        defaultPrettyPrinter26.beforeArrayValues(jsonGenerator82);
        com.fasterxml.jackson.core.FormatSchema formatSchema95 = null;
        boolean boolean96 = jsonGenerator82.canUseSchema(formatSchema95);
        defaultPrettyPrinter1.writeObjectFieldValueSeparator(jsonGenerator82);
        com.fasterxml.jackson.core.TreeNode treeNode98 = null;
        jsonGenerator82.writeTree(treeNode98);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(bufferRecycler21);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100]");
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100]");
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature43.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(bufferRecycler46);
        org.junit.Assert.assertNotNull(jsonGenerator48);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter53);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter56);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter57);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[100]");
        org.junit.Assert.assertNotNull(jsonParser64);
        org.junit.Assert.assertNotNull(jsonFactory66);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser72);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[100]");
        org.junit.Assert.assertNotNull(jsonParser76);
        org.junit.Assert.assertTrue("'" + feature77 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature77.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory78);
        org.junit.Assert.assertNotNull(jsonFactory79);
        org.junit.Assert.assertNotNull(bufferRecycler80);
        org.junit.Assert.assertNotNull(jsonGenerator82);
        org.junit.Assert.assertNull(objectCodec85);
        org.junit.Assert.assertNotNull(version86);
        org.junit.Assert.assertNotNull(jsonGenerator88);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test635");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType byteBufferType20 = com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version22 = jsonFactory21.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory21.configure(feature23, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray28 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory26.createParser(byteArray28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory26.enable(feature30);
        byte[] byteArray32 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory31.createJsonParser(byteArray32, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory21.createParser(byteArray32, (int) (short) 10, 2);
        bufferRecycler19.releaseByteBuffer(byteBufferType20, byteArray32);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        java.lang.String str41 = textBuffer40.toString();
        char[] charArray42 = textBuffer40.getTextBuffer();
        java.lang.String str43 = textBuffer40.contentsAsString();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertTrue("'" + byteBufferType20 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER + "'", byteBufferType20.equals(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER));
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature23.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(byteArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(charArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test636");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream14 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer16 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = bytesToNameCanonicalizer16.makeChild(false, false);
        byte[] byteArray20 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser24 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) 'a', inputStream14, objectCodec15, bytesToNameCanonicalizer19, byteArray20, (int) (byte) 10, 33, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray29 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory27.createParser(byteArray29);
        int int31 = jsonParser30.getTextOffset();
        long long32 = jsonParser30.getValueAsLong();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext36 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler33, (java.lang.Object) '4', true);
        java.io.InputStream inputStream38 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer40 = null;
        byte[] byteArray41 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser45 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext36, 0, inputStream38, objectCodec39, bytesToNameCanonicalizer40, byteArray41, 33, 33, false);
        long long47 = uTF8StreamJsonParser45.getValueAsLong(100L);
        uTF8StreamJsonParser45.clearCurrentToken();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder49 = uTF8StreamJsonParser45._getByteArrayBuilder();
        int int50 = jsonParser30.releaseBuffered((java.io.OutputStream) byteArrayBuilder49);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator51 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext3, (int) (short) 100, objectCodec26, (java.io.OutputStream) byteArrayBuilder49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer16);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100]");
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L + "'", long47 == 100L);
        org.junit.Assert.assertNotNull(byteArrayBuilder49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test637");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.enable(feature23);
        byte[] byteArray25 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory24.createJsonParser(byteArray25, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory5.createParser(byteArray25);
        byte[] byteArray30 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.JsonParser jsonParser31 = jsonFactory5.createJsonParser(byteArray30);
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory5.setCodec(objectCodec32);
        com.fasterxml.jackson.core.io.IOContext iOContext34 = null;
        java.io.InputStream inputStream35 = null;
        byte[] byteArray36 = null;
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader40 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext34, inputStream35, byteArray36, (-1), (int) 'a', false);
        boolean boolean41 = uTF32Reader40.markSupported();
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonFactory5.createParser((java.io.Reader) uTF32Reader40);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(byteArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser31);
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jsonParser42);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test638");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.createInstance();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray6 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory4.createParser(byteArray6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory4.setCodec(objectCodec8);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory9.createParser(byteArray12, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray18 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory16.createParser(byteArray18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory16.enable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory9.enable(feature20);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = jsonFactory22._getBufferRecycler();
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = jsonFactory22.createJsonGenerator(outputStream24);
        jsonGenerator25.flush();
        defaultPrettyPrinter2.beforeObjectEntries(jsonGenerator25);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = jsonGenerator25.setFeatureMask(35);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature30 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonGenerator25.configure(feature30, false);
        com.fasterxml.jackson.core.io.SerializedString serializedString33 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray36 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory34.createParser(byteArray36);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = jsonFactory34.setCodec(objectCodec38);
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser45 = jsonFactory39.createParser(byteArray42, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray48 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonFactory46.createParser(byteArray48);
        com.fasterxml.jackson.core.JsonFactory.Feature feature50 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = jsonFactory46.enable(feature50);
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = jsonFactory39.enable(feature50);
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray55 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory53.createParser(byteArray55);
        com.fasterxml.jackson.core.JsonFactory.Feature feature57 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = jsonFactory53.enable(feature57);
        byte[] byteArray59 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser62 = jsonFactory58.createJsonParser(byteArray59, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory39.createParser(byteArray59);
        int int65 = serializedString33.appendUnquotedUTF8(byteArray59, 56319);
        byte[] byteArray66 = serializedString33.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory67 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray69 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser70 = jsonFactory67.createParser(byteArray69);
        int int72 = serializedString33.appendQuotedUTF8(byteArray69, (int) (byte) 0);
        java.lang.String str73 = serializedString33.getValue();
        java.lang.String str74 = serializedString33.getValue();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator75 = jsonGenerator25.setRootValueSeparator((com.fasterxml.jackson.core.SerializableString) serializedString33);
        byte[] byteArray77 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator25.writeBinaryField("/", byteArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(bufferRecycler23);
        org.junit.Assert.assertNotNull(jsonGenerator25);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature30.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(serializedString33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser45);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[100]");
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertTrue("'" + feature50 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature50.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory51);
        org.junit.Assert.assertNotNull(jsonFactory52);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100]");
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature57.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory58);
        org.junit.Assert.assertNotNull(byteArray59);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser62);
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[32]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[32]");
        org.junit.Assert.assertNotNull(jsonParser70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + " " + "'", str73, " ");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + " " + "'", str74, " ");
        org.junit.Assert.assertNotNull(jsonGenerator75);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test639");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        java.io.OutputStream outputStream20 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding21 = com.fasterxml.jackson.core.JsonEncoding.UTF8;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = jsonFactory18.createJsonGenerator(outputStream20, jsonEncoding21);
        boolean boolean23 = jsonFactory18.requiresCustomCodec();
        java.io.File file24 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding25 = com.fasterxml.jackson.core.JsonEncoding.UTF8;
        boolean boolean26 = jsonEncoding25.isBigEndian();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory18.createJsonGenerator(file24, jsonEncoding25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertTrue("'" + jsonEncoding21 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF8 + "'", jsonEncoding21.equals(com.fasterxml.jackson.core.JsonEncoding.UTF8));
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + jsonEncoding25 + "' != '" + com.fasterxml.jackson.core.JsonEncoding.UTF8 + "'", jsonEncoding25.equals(com.fasterxml.jackson.core.JsonEncoding.UTF8));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test640");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray7 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory5.createParser(byteArray7);
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory5.enable(feature9);
        byte[] byteArray11 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory10.createJsonParser(byteArray11, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory0.createParser(byteArray11, (int) (short) 10, 2);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory0.setCharacterEscapes(characterEscapes18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = jsonFactory19._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType21 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER;
        char[] charArray23 = new char[] { '#' };
        bufferRecycler20.releaseCharBuffer(charBufferType21, charArray23);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext28 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler25, (java.lang.Object) '4', true);
        java.io.InputStream inputStream30 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer32 = null;
        byte[] byteArray33 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser37 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext28, 0, inputStream30, objectCodec31, bytesToNameCanonicalizer32, byteArray33, 33, 33, false);
        java.io.InputStream inputStream39 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer41 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer44 = bytesToNameCanonicalizer41.makeChild(false, false);
        byte[] byteArray45 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser49 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext28, (int) 'a', inputStream39, objectCodec40, bytesToNameCanonicalizer44, byteArray45, (int) (byte) 10, 33, false);
        com.fasterxml.jackson.core.io.IOContext iOContext51 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler20, (java.lang.Object) iOContext28, true);
        java.lang.Object obj52 = iOContext51.getSourceReference();
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        java.io.OutputStream outputStream55 = null;
        com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator56 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext51, (-1272757989), objectCodec54, outputStream55);
        uTF8JsonGenerator56.writeNumber((double) (-1272962340));
        uTF8JsonGenerator56._writeFieldName("JSON");
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(bufferRecycler20);
        org.junit.Assert.assertTrue("'" + charBufferType21 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER + "'", charBufferType21.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer41);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test641");
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer0 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        boolean boolean1 = bytesToNameCanonicalizer0.maybeDirty();
        int int3 = bytesToNameCanonicalizer0.calcHash(100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext7 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler4, (java.lang.Object) '4', true);
        java.io.InputStream inputStream9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer11 = null;
        byte[] byteArray12 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser16 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext7, 0, inputStream9, objectCodec10, bytesToNameCanonicalizer11, byteArray12, 33, 33, false);
        java.io.InputStream inputStream18 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer20 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer23 = bytesToNameCanonicalizer20.makeChild(false, false);
        byte[] byteArray24 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser28 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext7, (int) 'a', inputStream18, objectCodec19, bytesToNameCanonicalizer23, byteArray24, (int) (byte) 10, 33, false);
        int int29 = bytesToNameCanonicalizer23.maxCollisionLength();
        int[] intArray30 = com.fasterxml.jackson.core.io.CharTypes.getInputCodeComment();
        int[] intArray32 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray30, 100);
        com.fasterxml.jackson.core.sym.Name name34 = bytesToNameCanonicalizer23.findName(intArray32, (-1272962340));
        int int36 = bytesToNameCanonicalizer0.calcHash(intArray32, 8);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1272531309) + "'", int3 == (-1272531309));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer20);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 10, -1, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, -1, -1, -1, -1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 10, -1, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, -1, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(name34);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1291731253) + "'", int36 == (-1291731253));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test642");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter0 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter2 = lf2SpacesIndenter0.withLinefeed("");
        boolean boolean3 = lf2SpacesIndenter2.isInline();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray6 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory4.createParser(byteArray6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory4.setCodec(objectCodec8);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory9.createParser(byteArray12, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray18 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory16.createParser(byteArray18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory16.enable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory9.enable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray25 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser26 = jsonFactory23.createParser(byteArray25);
        com.fasterxml.jackson.core.JsonFactory.Feature feature27 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory23.enable(feature27);
        byte[] byteArray29 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser32 = jsonFactory28.createJsonParser(byteArray29, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory9.createParser(byteArray29);
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory9.setRootValueSeparator(" ");
        java.io.Writer writer36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonFactory35.createJsonGenerator(writer36);
        lf2SpacesIndenter2.writeIndentation(jsonGenerator37, (int) (short) -1);
        com.fasterxml.jackson.core.Version version40 = jsonGenerator37.version();
        com.fasterxml.jackson.core.Version version41 = jsonGenerator37.version();
        org.junit.Assert.assertNotNull(lf2SpacesIndenter0);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100]");
        org.junit.Assert.assertNotNull(jsonParser26);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature27.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(byteArray29);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertNotNull(version40);
        org.junit.Assert.assertNotNull(version41);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test643");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature6 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean7 = feature6.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature6, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray12 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory10.createParser(byteArray12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory10.setCodec(objectCodec14);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature16 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean17 = feature16.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory15.configure(feature16, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray22 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory20.createParser(byteArray22);
        com.fasterxml.jackson.core.JsonFactory.Feature feature24 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory20.enable(feature24);
        boolean boolean26 = feature24.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory19.enable(feature24);
        boolean boolean28 = jsonFactory9.isEnabled(feature24);
        boolean boolean30 = feature24.enabledIn((-1267016211));
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature6.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature16.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature24.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test644");
        com.fasterxml.jackson.core.json.DupDetector dupDetector2 = null;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext3 = com.fasterxml.jackson.core.json.JsonReadContext.createRootContext((int) (short) 10, 1, dupDetector2);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext7 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler4, (java.lang.Object) '4', true);
        java.io.InputStream inputStream9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer11 = null;
        byte[] byteArray12 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser16 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext7, 0, inputStream9, objectCodec10, bytesToNameCanonicalizer11, byteArray12, 33, 33, false);
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = jsonReadContext3.getStartLocation((java.lang.Object) uTF8StreamJsonParser16);
        int int18 = jsonReadContext3.getEntryCount();
        org.junit.Assert.assertNotNull(jsonReadContext3);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonLocation17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test645");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory2.setCodec(objectCodec6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createParser(byteArray10, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.enable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory7.enable(feature18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = jsonFactory20._getBufferRecycler();
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonFactory20.createJsonGenerator(outputStream22);
        defaultPrettyPrinter1.writeObjectEntrySeparator(jsonGenerator23);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray27 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory25.createParser(byteArray27);
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory25.setCodec(objectCodec29);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser36 = jsonFactory30.createParser(byteArray33, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray39 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory37.createParser(byteArray39);
        com.fasterxml.jackson.core.JsonFactory.Feature feature41 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory37.enable(feature41);
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = jsonFactory30.enable(feature41);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler44 = jsonFactory43._getBufferRecycler();
        java.io.OutputStream outputStream45 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator46 = jsonFactory43.createJsonGenerator(outputStream45);
        jsonGenerator46.flush();
        defaultPrettyPrinter1.writeObjectFieldValueSeparator(jsonGenerator46);
        jsonGenerator46.writeRaw("ROOT");
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray53 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonFactory51.createParser(byteArray53);
        com.fasterxml.jackson.core.ObjectCodec objectCodec55 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory51.setCodec(objectCodec55);
        byte[] byteArray59 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser62 = jsonFactory56.createParser(byteArray59, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory63 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray65 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory63.createParser(byteArray65);
        com.fasterxml.jackson.core.JsonFactory.Feature feature67 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory68 = jsonFactory63.enable(feature67);
        com.fasterxml.jackson.core.JsonFactory jsonFactory69 = jsonFactory56.enable(feature67);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler70 = jsonFactory69._getBufferRecycler();
        java.lang.String str71 = jsonFactory69.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory72 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray74 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser75 = jsonFactory72.createParser(byteArray74);
        com.fasterxml.jackson.core.JsonParser jsonParser76 = jsonFactory69.createParser(byteArray74);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature77 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET;
        com.fasterxml.jackson.core.JsonFactory jsonFactory78 = jsonFactory69.disable(feature77);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator79 = jsonGenerator46.enable(feature77);
        boolean boolean80 = jsonGenerator46.canWriteBinaryNatively();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(bufferRecycler21);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[100]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertTrue("'" + feature41 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature41.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory42);
        org.junit.Assert.assertNotNull(jsonFactory43);
        org.junit.Assert.assertNotNull(bufferRecycler44);
        org.junit.Assert.assertNotNull(jsonGenerator46);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[100]");
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser62);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[100]");
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertTrue("'" + feature67 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature67.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory68);
        org.junit.Assert.assertNotNull(jsonFactory69);
        org.junit.Assert.assertNotNull(bufferRecycler70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + " " + "'", str71, " ");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[100]");
        org.junit.Assert.assertNotNull(jsonParser75);
        org.junit.Assert.assertNotNull(jsonParser76);
        org.junit.Assert.assertTrue("'" + feature77 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET + "'", feature77.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET));
        org.junit.Assert.assertNotNull(jsonFactory78);
        org.junit.Assert.assertNotNull(jsonGenerator79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test646");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        uTF8StreamJsonParser12._tokenIncomplete = false;
        int int15 = uTF8StreamJsonParser12.getTextOffset();
        boolean boolean16 = uTF8StreamJsonParser12.hasTextCharacters();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = uTF8StreamJsonParser12.getParsingContext();
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = uTF8StreamJsonParser12.getCodec();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertNull(objectCodec18);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test647");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream1 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext2 = null;
        java.io.InputStream inputStream3 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray6 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory4.createParser(byteArray6);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader11 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext2, inputStream3, byteArray6, (int) (short) 10, (int) (short) 10, false);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader15 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext0, inputStream1, byteArray6, (int) (byte) 100, 0, true);
        boolean boolean16 = uTF32Reader15.markSupported();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test648");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.createInstance();
        com.fasterxml.jackson.core.SerializableString serializableString4 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray8 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser(byteArray8);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory6.setCodec(objectCodec10);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory11.createParser(byteArray14, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray20 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory18.createParser(byteArray20);
        com.fasterxml.jackson.core.JsonFactory.Feature feature22 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory18.enable(feature22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory11.enable(feature22);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = jsonFactory24._getBufferRecycler();
        java.io.OutputStream outputStream26 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator27 = jsonFactory24.createJsonGenerator(outputStream26);
        defaultPrettyPrinter5.writeObjectEntrySeparator(jsonGenerator27);
        char[] charArray33 = new char[] { 'a', ' ', '#', ' ' };
        jsonGenerator27.writeRaw(charArray33, 1, (int) (short) 0);
        int int37 = jsonGenerator27.getHighestEscapedChar();
        java.math.BigDecimal bigDecimal38 = null;
        jsonGenerator27.writeNumber(bigDecimal38);
        jsonGenerator27.writeRaw("/");
        defaultPrettyPrinter2.writeEndObject(jsonGenerator27, 79);
        com.fasterxml.jackson.core.FormatSchema formatSchema44 = jsonGenerator27.getSchema();
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature22.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(bufferRecycler25);
        org.junit.Assert.assertNotNull(jsonGenerator27);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "a # ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "a # ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[a,  , #,  ]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(formatSchema44);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test649");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str17 = uTF8StreamJsonParser12._getText2(jsonToken16);
        char[] charArray18 = jsonToken16.asCharArray();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(charArray18);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test650");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream14 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer16 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = bytesToNameCanonicalizer16.makeChild(false, false);
        byte[] byteArray20 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser24 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) 'a', inputStream14, objectCodec15, bytesToNameCanonicalizer19, byteArray20, (int) (byte) 10, 33, false);
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser24._reportInvalidOther(1269648022);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Invalid UTF-8 middle byte 0x4bad4a96? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer16);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test651");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.isClosed();
        int int17 = uTF8StreamJsonParser12.getValueAsInt(56320);
        boolean boolean18 = uTF8StreamJsonParser12.isClosed();
        com.fasterxml.jackson.core.JsonToken jsonToken19 = uTF8StreamJsonParser12.getLastClearedToken();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext20 = uTF8StreamJsonParser12.getParsingContext();
        char[] charArray21 = uTF8StreamJsonParser12.getTextCharacters();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 56320 + "'", int17 == 56320);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertNotNull(jsonReadContext20);
        org.junit.Assert.assertNull(charArray21);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test652");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        java.lang.String str16 = uTF8StreamJsonParser12.getText();
        long long17 = uTF8StreamJsonParser12.getTokenCharacterOffset();
        boolean boolean18 = uTF8StreamJsonParser12.canReadObjectId();
        byte[] byteArray19 = uTF8StreamJsonParser12._inputBuffer;
        uTF8StreamJsonParser12._skipCR();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test653");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str17 = uTF8StreamJsonParser12._getText2(jsonToken16);
        uTF8StreamJsonParser12.overrideCurrentName("ROOT");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = uTF8StreamJsonParser12.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 34]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test654");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        java.io.Writer writer19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory18.createJsonGenerator(writer19);
        boolean boolean21 = jsonGenerator20.canWriteTypeId();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test655");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream13 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.setCodec(objectCodec18);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory19.createParser(byteArray22, (-1), 0);
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader29 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, inputStream13, byteArray22, (int) (byte) -1, 2, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding30 = iOContext3.getEncoding();
        com.fasterxml.jackson.core.io.SerializedString serializedString31 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.io.SerializedString serializedString32 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray35 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser36 = jsonFactory33.createParser(byteArray35);
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory33.setCodec(objectCodec37);
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory38.createParser(byteArray41, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray47 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonFactory45.createParser(byteArray47);
        com.fasterxml.jackson.core.JsonFactory.Feature feature49 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = jsonFactory45.enable(feature49);
        com.fasterxml.jackson.core.JsonFactory jsonFactory51 = jsonFactory38.enable(feature49);
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray54 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser55 = jsonFactory52.createParser(byteArray54);
        com.fasterxml.jackson.core.JsonFactory.Feature feature56 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = jsonFactory52.enable(feature56);
        byte[] byteArray58 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser61 = jsonFactory57.createJsonParser(byteArray58, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser62 = jsonFactory38.createParser(byteArray58);
        int int64 = serializedString32.appendUnquotedUTF8(byteArray58, 56319);
        byte[] byteArray65 = serializedString32.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonFactory jsonFactory66 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray68 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser69 = jsonFactory66.createParser(byteArray68);
        int int71 = serializedString32.appendQuotedUTF8(byteArray68, (int) (byte) 0);
        char[] charArray72 = serializedString32.asQuotedChars();
        int int74 = serializedString31.appendUnquoted(charArray72, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            iOContext3.releaseConcatBuffer(charArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertNull(jsonEncoding30);
        org.junit.Assert.assertNotNull(serializedString31);
        org.junit.Assert.assertNotNull(serializedString32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100]");
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100]");
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature49.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory50);
        org.junit.Assert.assertNotNull(jsonFactory51);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[100]");
        org.junit.Assert.assertNotNull(jsonParser55);
        org.junit.Assert.assertTrue("'" + feature56 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature56.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory57);
        org.junit.Assert.assertNotNull(byteArray58);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser61);
        org.junit.Assert.assertNotNull(jsonParser62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[32]");
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[32]");
        org.junit.Assert.assertNotNull(jsonParser69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[ ]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test656");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType byteBufferType20 = com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version22 = jsonFactory21.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory21.configure(feature23, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray28 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory26.createParser(byteArray28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory26.enable(feature30);
        byte[] byteArray32 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory31.createJsonParser(byteArray32, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory21.createParser(byteArray32, (int) (short) 10, 2);
        bufferRecycler19.releaseByteBuffer(byteBufferType20, byteArray32);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        java.lang.String str41 = textBuffer40.toString();
        char[] charArray42 = textBuffer40.getTextBuffer();
        char[] charArray43 = textBuffer40.emptyAndGetCurrentSegment();
        char[] charArray44 = textBuffer40.getCurrentSegment();
        char[] charArray45 = textBuffer40.getCurrentSegment();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertTrue("'" + byteBufferType20 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER + "'", byteBufferType20.equals(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER));
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature23.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(byteArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(charArray42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test657");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.isClosed();
        int int17 = uTF8StreamJsonParser12.getValueAsInt(56320);
        boolean boolean18 = uTF8StreamJsonParser12.isClosed();
        com.fasterxml.jackson.core.JsonToken jsonToken19 = uTF8StreamJsonParser12.getLastClearedToken();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext20 = uTF8StreamJsonParser12.getParsingContext();
        long long22 = uTF8StreamJsonParser12.getValueAsLong((long) 79);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 56320 + "'", int17 == 56320);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertNotNull(jsonReadContext20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 79L + "'", long22 == 79L);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test658");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        java.io.InputStream inputStream14 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer16 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = bytesToNameCanonicalizer16.makeChild(false, false);
        byte[] byteArray20 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser24 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) 'a', inputStream14, objectCodec15, bytesToNameCanonicalizer19, byteArray20, (int) (byte) 10, 33, false);
        java.io.InputStream inputStream25 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken26 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray27 = jsonToken26.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream30 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, inputStream25, byteArray27, 56319, (int) (short) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext34 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler31, (java.lang.Object) '4', true);
        java.io.InputStream inputStream36 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer38 = null;
        byte[] byteArray39 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser43 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext34, 0, inputStream36, objectCodec37, bytesToNameCanonicalizer38, byteArray39, 33, 33, false);
        java.io.InputStream inputStream45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer47 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer50 = bytesToNameCanonicalizer47.makeChild(false, false);
        byte[] byteArray51 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser55 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext34, (int) 'a', inputStream45, objectCodec46, bytesToNameCanonicalizer50, byteArray51, (int) (byte) 10, 33, false);
        java.io.InputStream inputStream56 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken57 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray58 = jsonToken57.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream61 = new com.fasterxml.jackson.core.io.MergedStream(iOContext34, inputStream56, byteArray58, 56319, (int) (short) 100);
        mergedStream61.mark(32);
        com.fasterxml.jackson.core.JsonToken jsonToken64 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray65 = jsonToken64.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream68 = new com.fasterxml.jackson.core.io.MergedStream(iOContext3, (java.io.InputStream) mergedStream61, byteArray65, (int) (byte) 100, 1269648022);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding69 = iOContext3.getEncoding();
        java.lang.Object obj70 = iOContext3.getSourceReference();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer16);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + jsonToken26 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken26.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer47);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
        org.junit.Assert.assertTrue("'" + jsonToken57 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken57.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertTrue("'" + jsonToken64 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken64.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertNull(jsonEncoding69);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + '4' + "'", obj70, '4');
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test659");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        com.fasterxml.jackson.core.JsonLocation jsonLocation18 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) uTF8StreamJsonParser12, (long) 33, (int) (byte) -1, (int) (short) 1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.setCodec(objectCodec23);
        com.fasterxml.jackson.core.JsonParser jsonParser26 = jsonFactory24.createJsonParser("hi!");
        java.lang.Object obj27 = jsonParser26.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonParser.Feature feature28 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonParser26.disable(feature28);
        com.fasterxml.jackson.core.JsonParser jsonParser31 = uTF8StreamJsonParser12.configure(feature28, false);
        com.fasterxml.jackson.core.JsonLocation jsonLocation36 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) jsonParser31, 1L, (long) (short) 100, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray37 = jsonParser31.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonParser26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES + "'", feature28.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES));
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser31);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test660");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.createInstance();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter2);
        com.fasterxml.jackson.core.SerializableString serializableString5 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter6 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString5);
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray9 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory7.createParser(byteArray9);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory7.setCodec(objectCodec11);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory12.createParser(byteArray15, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray21 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory19.createParser(byteArray21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory19.enable(feature23);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory12.enable(feature23);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = jsonFactory25._getBufferRecycler();
        java.io.OutputStream outputStream27 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = jsonFactory25.createJsonGenerator(outputStream27);
        defaultPrettyPrinter6.writeObjectEntrySeparator(jsonGenerator28);
        com.fasterxml.jackson.core.SerializableString serializableString30 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter31 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString30);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter32 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter31);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter33 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        defaultPrettyPrinter31.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter33);
        defaultPrettyPrinter6.indentObjectsWith((com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter) lf2SpacesIndenter33);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter36 = defaultPrettyPrinter6.createInstance();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter lf2SpacesIndenter37 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
        com.fasterxml.jackson.core.SerializableString serializableString38 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter39 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString38);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter40 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter39);
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray43 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser44 = jsonFactory41.createParser(byteArray43);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory41.setCodec(objectCodec45);
        byte[] byteArray49 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser52 = jsonFactory46.createParser(byteArray49, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory53 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray55 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory53.createParser(byteArray55);
        com.fasterxml.jackson.core.JsonFactory.Feature feature57 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = jsonFactory53.enable(feature57);
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = jsonFactory46.enable(feature57);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler60 = jsonFactory59._getBufferRecycler();
        java.io.OutputStream outputStream61 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator62 = jsonFactory59.createJsonGenerator(outputStream61);
        jsonGenerator62.flush();
        defaultPrettyPrinter40.beforeObjectEntries(jsonGenerator62);
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = jsonGenerator62.getCodec();
        com.fasterxml.jackson.core.Version version66 = jsonGenerator62.version();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator68 = jsonGenerator62.setHighestNonEscapedChar((int) (short) 0);
        lf2SpacesIndenter37.writeIndentation(jsonGenerator62, 79);
        jsonGenerator62.writeNumberField(" ", (long) (byte) 10);
        defaultPrettyPrinter6.beforeArrayValues(jsonGenerator62);
        com.fasterxml.jackson.core.FormatSchema formatSchema75 = null;
        boolean boolean76 = jsonGenerator62.canUseSchema(formatSchema75);
        defaultPrettyPrinter2.writeRootValueSeparator(jsonGenerator62);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator79 = jsonGenerator62.setFeatureMask((int) (byte) -1);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter80 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator81 = jsonGenerator79.setPrettyPrinter(prettyPrinter80);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100]");
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[100]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(bufferRecycler26);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter33);
        org.junit.Assert.assertNotNull(defaultPrettyPrinter36);
        org.junit.Assert.assertNotNull(lf2SpacesIndenter37);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100]");
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser52);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[100]");
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature57.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory58);
        org.junit.Assert.assertNotNull(jsonFactory59);
        org.junit.Assert.assertNotNull(bufferRecycler60);
        org.junit.Assert.assertNotNull(jsonGenerator62);
        org.junit.Assert.assertNull(objectCodec65);
        org.junit.Assert.assertNotNull(version66);
        org.junit.Assert.assertNotNull(jsonGenerator68);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jsonGenerator79);
        org.junit.Assert.assertNotNull(jsonGenerator81);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test661");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory5.createJsonParser("hi!");
        boolean boolean8 = jsonFactory5.requiresCustomCodec();
        java.io.Writer writer9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory5.createGenerator(writer9);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext14 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler11, (java.lang.Object) '4', true);
        java.io.InputStream inputStream16 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer18 = null;
        byte[] byteArray19 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser23 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext14, 0, inputStream16, objectCodec17, bytesToNameCanonicalizer18, byteArray19, 33, 33, false);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding24 = null;
        iOContext14.setEncoding(jsonEncoding24);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext30 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler27, (java.lang.Object) '4', true);
        java.io.InputStream inputStream32 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer34 = null;
        byte[] byteArray35 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser39 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext30, 0, inputStream32, objectCodec33, bytesToNameCanonicalizer34, byteArray35, 33, 33, false);
        java.io.InputStream inputStream41 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer43 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer46 = bytesToNameCanonicalizer43.makeChild(false, false);
        byte[] byteArray47 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser51 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext30, (int) 'a', inputStream41, objectCodec42, bytesToNameCanonicalizer46, byteArray47, (int) (byte) 10, 33, false);
        java.io.InputStream inputStream52 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken53 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray54 = jsonToken53.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream57 = new com.fasterxml.jackson.core.io.MergedStream(iOContext30, inputStream52, byteArray54, 56319, (int) (short) 100);
        boolean boolean58 = mergedStream57.markSupported();
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer60 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int62 = bytesToNameCanonicalizer60.calcHash((int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler63 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext66 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler63, (java.lang.Object) '4', true);
        java.io.InputStream inputStream68 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = null;
        byte[] byteArray71 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser75 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext66, 0, inputStream68, objectCodec69, bytesToNameCanonicalizer70, byteArray71, 33, 33, false);
        java.io.InputStream inputStream76 = null;
        byte[] byteArray77 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader81 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext66, inputStream76, byteArray77, (int) ' ', 100, true);
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser85 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext14, (-1272745925), (java.io.InputStream) mergedStream57, objectCodec59, bytesToNameCanonicalizer60, byteArray77, 3, 0, false);
        mergedStream57.reset();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser87 = jsonFactory5.createJsonParser((java.io.InputStream) mergedStream57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer43);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertTrue("'" + jsonToken53 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken53.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer60);
// flaky:         org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1272536174) + "'", int62 == (-1272536174));
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray77);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray77), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test662");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str17 = uTF8StreamJsonParser12._getText2(jsonToken16);
        boolean boolean18 = jsonToken16.isStructStart();
        java.lang.String str19 = jsonToken16.asString();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test663");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str17 = uTF8StreamJsonParser12._getText2(jsonToken16);
        com.fasterxml.jackson.core.JsonToken jsonToken18 = uTF8StreamJsonParser12.getLastClearedToken();
        java.io.Writer writer19 = null;
        int int20 = uTF8StreamJsonParser12.releaseBuffered(writer19);
        long long22 = uTF8StreamJsonParser12.getValueAsLong((-1272717397L));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(jsonToken18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1272717397L) + "'", long22 == (-1272717397L));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test664");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray7 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory5.createParser(byteArray7);
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory5.enable(feature9);
        byte[] byteArray11 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory10.createJsonParser(byteArray11, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory0.createParser(byteArray11, (int) (short) 10, 2);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory0.setCharacterEscapes(characterEscapes18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = jsonFactory19._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType21 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER;
        char[] charArray23 = new char[] { '#' };
        bufferRecycler20.releaseCharBuffer(charBufferType21, charArray23);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext28 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler25, (java.lang.Object) '4', true);
        java.io.InputStream inputStream30 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer32 = null;
        byte[] byteArray33 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser37 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext28, 0, inputStream30, objectCodec31, bytesToNameCanonicalizer32, byteArray33, 33, 33, false);
        java.io.InputStream inputStream39 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer41 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer44 = bytesToNameCanonicalizer41.makeChild(false, false);
        byte[] byteArray45 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser49 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext28, (int) 'a', inputStream39, objectCodec40, bytesToNameCanonicalizer44, byteArray45, (int) (byte) 10, 33, false);
        com.fasterxml.jackson.core.io.IOContext iOContext51 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler20, (java.lang.Object) iOContext28, true);
        java.lang.Object obj52 = iOContext51.getSourceReference();
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        java.io.OutputStream outputStream55 = null;
        com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator56 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext51, (-1272757989), objectCodec54, outputStream55);
        uTF8JsonGenerator56.writeNumber(0.0f);
        uTF8JsonGenerator56.writeNull();
        int int60 = uTF8JsonGenerator56._outputTail;
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(bufferRecycler20);
        org.junit.Assert.assertTrue("'" + charBufferType21 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER + "'", charBufferType21.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer41);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test665");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.FormatSchema formatSchema4 = null;
        boolean boolean5 = jsonParser3.canUseSchema(formatSchema4);
        double double6 = jsonParser3.getValueAsDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonParser3.skipChildren();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        jsonParser3.setCodec(objectCodec8);
        jsonParser3.clearCurrentToken();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test666");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.createInstance();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray6 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory4.createParser(byteArray6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory4.setCodec(objectCodec8);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory9.createParser(byteArray12, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray18 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory16.createParser(byteArray18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory16.enable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory9.enable(feature20);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = jsonFactory22._getBufferRecycler();
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = jsonFactory22.createJsonGenerator(outputStream24);
        jsonGenerator25.flush();
        defaultPrettyPrinter2.beforeObjectEntries(jsonGenerator25);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = jsonGenerator25.setFeatureMask(35);
        boolean boolean30 = jsonGenerator25.canOmitFields();
        int int31 = jsonGenerator25.getHighestEscapedChar();
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(bufferRecycler23);
        org.junit.Assert.assertNotNull(jsonGenerator25);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test667");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = jsonFactory18._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType byteBufferType20 = com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version22 = jsonFactory21.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature23 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory21.configure(feature23, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray28 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory26.createParser(byteArray28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory26.enable(feature30);
        byte[] byteArray32 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory31.createJsonParser(byteArray32, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory21.createParser(byteArray32, (int) (short) 10, 2);
        bufferRecycler19.releaseByteBuffer(byteBufferType20, byteArray32);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext43 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler40, (java.lang.Object) '4', true);
        java.io.InputStream inputStream45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer47 = null;
        byte[] byteArray48 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser52 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext43, 0, inputStream45, objectCodec46, bytesToNameCanonicalizer47, byteArray48, 33, 33, false);
        uTF8StreamJsonParser52._tokenIncomplete = false;
        int int55 = uTF8StreamJsonParser52.getTextOffset();
        double double57 = uTF8StreamJsonParser52.getValueAsDouble((double) 'a');
        com.fasterxml.jackson.core.io.IOContext iOContext59 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler19, (java.lang.Object) 'a', false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(bufferRecycler19);
        org.junit.Assert.assertTrue("'" + byteBufferType20 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER + "'", byteBufferType20.equals(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER));
        org.junit.Assert.assertNotNull(version22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature23.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(byteArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 97.0d + "'", double57 == 97.0d);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test668");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        uTF8StreamJsonParser12._tokenIncomplete = false;
        int int15 = uTF8StreamJsonParser12.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = uTF8StreamJsonParser12.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: 4; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test669");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding13 = null;
        iOContext3.setEncoding(jsonEncoding13);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext19 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler16, (java.lang.Object) '4', true);
        java.io.InputStream inputStream21 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer23 = null;
        byte[] byteArray24 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser28 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext19, 0, inputStream21, objectCodec22, bytesToNameCanonicalizer23, byteArray24, 33, 33, false);
        java.io.InputStream inputStream30 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer32 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer35 = bytesToNameCanonicalizer32.makeChild(false, false);
        byte[] byteArray36 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser40 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext19, (int) 'a', inputStream30, objectCodec31, bytesToNameCanonicalizer35, byteArray36, (int) (byte) 10, 33, false);
        java.io.InputStream inputStream41 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken42 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray43 = jsonToken42.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream46 = new com.fasterxml.jackson.core.io.MergedStream(iOContext19, inputStream41, byteArray43, 56319, (int) (short) 100);
        boolean boolean47 = mergedStream46.markSupported();
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer49 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int51 = bytesToNameCanonicalizer49.calcHash((int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler52 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext55 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler52, (java.lang.Object) '4', true);
        java.io.InputStream inputStream57 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer59 = null;
        byte[] byteArray60 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser64 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext55, 0, inputStream57, objectCodec58, bytesToNameCanonicalizer59, byteArray60, 33, 33, false);
        java.io.InputStream inputStream65 = null;
        byte[] byteArray66 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader70 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext55, inputStream65, byteArray66, (int) ' ', 100, true);
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser74 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (-1272745925), (java.io.InputStream) mergedStream46, objectCodec48, bytesToNameCanonicalizer49, byteArray66, 3, 0, false);
        mergedStream46.reset();
        mergedStream46.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long78 = mergedStream46.skip((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer32);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertTrue("'" + jsonToken42 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken42.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer49);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1272537757) + "'", int51 == (-1272537757));
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray66);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test670");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray14 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory12.createParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory12.enable(feature16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory5.enable(feature16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = jsonFactory5.getCodec();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes20 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory5.setCharacterEscapes(characterEscapes20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray24 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory22.createParser(byteArray24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory22.setCodec(objectCodec26);
        com.fasterxml.jackson.core.JsonFactory.Feature feature28 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean30 = feature28.enabledIn((int) '#');
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory27.enable(feature28);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature32 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean33 = jsonFactory27.isEnabled(feature32);
        boolean boolean34 = feature32.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory5.enable(feature32);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNull(objectCodec19);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100]");
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature28.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature32.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jsonFactory35);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test671");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonParser3.skipChildren();
        int int6 = jsonParser4.getValueAsInt((int) ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test672");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.Version version1 = jsonFactory0.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray7 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory5.createParser(byteArray7);
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory5.enable(feature9);
        byte[] byteArray11 = com.fasterxml.jackson.core.json.UTF8JsonGenerator.HEX_CHARS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory10.createJsonParser(byteArray11, 2, 10);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory0.createParser(byteArray11, (int) (short) 10, 2);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory0.setCharacterEscapes(characterEscapes18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = jsonFactory19._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType21 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER;
        char[] charArray23 = new char[] { '#' };
        bufferRecycler20.releaseCharBuffer(charBufferType21, charArray23);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext28 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler25, (java.lang.Object) '4', true);
        java.io.InputStream inputStream30 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer32 = null;
        byte[] byteArray33 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser37 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext28, 0, inputStream30, objectCodec31, bytesToNameCanonicalizer32, byteArray33, 33, 33, false);
        java.io.InputStream inputStream39 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer41 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer44 = bytesToNameCanonicalizer41.makeChild(false, false);
        byte[] byteArray45 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser49 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext28, (int) 'a', inputStream39, objectCodec40, bytesToNameCanonicalizer44, byteArray45, (int) (byte) 10, 33, false);
        com.fasterxml.jackson.core.io.IOContext iOContext51 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler20, (java.lang.Object) iOContext28, true);
        java.lang.Object obj52 = iOContext51.getSourceReference();
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        java.io.OutputStream outputStream55 = null;
        com.fasterxml.jackson.core.json.UTF8JsonGenerator uTF8JsonGenerator56 = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(iOContext51, (-1272757989), objectCodec54, outputStream55);
        uTF8JsonGenerator56.writeNumber(0.0f);
        uTF8JsonGenerator56.writeNull();
// flaky:         uTF8JsonGenerator56.writeNumber(100.0f);
        org.junit.Assert.assertNotNull(version1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[48, 49, 32, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(bufferRecycler20);
        org.junit.Assert.assertTrue("'" + charBufferType21 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER + "'", charBufferType21.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer41);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test673");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        int int16 = uTF8StreamJsonParser12._decodeCharForError((int) '#');
        com.fasterxml.jackson.core.JsonToken jsonToken17 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray18 = jsonToken17.asByteArray();
        java.lang.String str19 = uTF8StreamJsonParser12._getText2(jsonToken17);
        boolean boolean20 = jsonToken17.isNumeric();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "false" + "'", str19, "false");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test674");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray4 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory2.createParser(byteArray4);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory2.setCodec(objectCodec6);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createParser(byteArray10, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray16 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory14.createParser(byteArray16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory14.enable(feature18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory7.enable(feature18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = jsonFactory20._getBufferRecycler();
        java.io.OutputStream outputStream22 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = jsonFactory20.createJsonGenerator(outputStream22);
        defaultPrettyPrinter1.writeObjectEntrySeparator(jsonGenerator23);
        jsonGenerator23.writeString("");
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray29 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory27.createParser(byteArray29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory27.setCodec(objectCodec31);
        com.fasterxml.jackson.core.JsonFactory.Feature feature33 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean35 = feature33.enabledIn((int) '#');
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory32.enable(feature33);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature37 = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        boolean boolean38 = jsonFactory32.isEnabled(feature37);
        boolean boolean39 = feature37.enabledByDefault();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator40 = jsonGenerator23.disable(feature37);
        jsonGenerator23.writeFieldName("UTF-16LE");
        jsonGenerator23.writeNumber((short) 100);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(bufferRecycler21);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100]");
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS + "'", feature37.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jsonGenerator40);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test675");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        java.lang.String str16 = uTF8StreamJsonParser12.getText();
        boolean boolean17 = uTF8StreamJsonParser12.loadMore();
        long long18 = uTF8StreamJsonParser12.getTokenCharacterOffset();
        char[] charArray19 = uTF8StreamJsonParser12.getTextCharacters();
        boolean boolean20 = uTF8StreamJsonParser12.hasCurrentToken();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext24 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler21, (java.lang.Object) '4', true);
        java.io.InputStream inputStream26 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer28 = null;
        byte[] byteArray29 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser33 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext24, 0, inputStream26, objectCodec27, bytesToNameCanonicalizer28, byteArray29, 33, 33, false);
        java.io.InputStream inputStream35 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer37 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer40 = bytesToNameCanonicalizer37.makeChild(false, false);
        byte[] byteArray41 = new byte[] {};
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser45 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext24, (int) 'a', inputStream35, objectCodec36, bytesToNameCanonicalizer40, byteArray41, (int) (byte) 10, 33, false);
        java.io.InputStream inputStream46 = null;
        com.fasterxml.jackson.core.JsonToken jsonToken47 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
        byte[] byteArray48 = jsonToken47.asByteArray();
        com.fasterxml.jackson.core.io.MergedStream mergedStream51 = new com.fasterxml.jackson.core.io.MergedStream(iOContext24, inputStream46, byteArray48, 56319, (int) (short) 100);
        boolean boolean52 = mergedStream51.markSupported();
        uTF8StreamJsonParser12._inputStream = mergedStream51;
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser12._closeInput();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer37);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertTrue("'" + jsonToken47 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_FALSE + "'", jsonToken47.equals(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[102, 97, 108, 115, 101]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test676");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.Version version13 = uTF8StreamJsonParser12.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = uTF8StreamJsonParser12.getCodec();
        boolean boolean15 = uTF8StreamJsonParser12.hasTextCharacters();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNull(objectCodec14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test677");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler1 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext4 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler1, (java.lang.Object) '4', true);
        java.io.InputStream inputStream6 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer8 = null;
        byte[] byteArray9 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext4, 0, inputStream6, objectCodec7, bytesToNameCanonicalizer8, byteArray9, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken14 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str15 = uTF8StreamJsonParser13._getText2(jsonToken14);
        com.fasterxml.jackson.core.JsonLocation jsonLocation19 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) uTF8StreamJsonParser13, (long) 33, (int) (byte) -1, (int) (short) 1);
        int int20 = jsonLocation19.getLineNr();
        com.fasterxml.jackson.core.JsonParseException jsonParseException21 = new com.fasterxml.jackson.core.JsonParseException("/", jsonLocation19);
        long long22 = jsonLocation19.getByteOffset();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken14 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken14.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test678");
        com.fasterxml.jackson.core.SerializableString serializableString0 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(serializableString0);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter2 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = defaultPrettyPrinter2.createInstance();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter4 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray7 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory5.createParser(byteArray7);
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory5.setCodec(objectCodec9);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory10.createParser(byteArray13, (-1), 0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray19 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory17.createParser(byteArray19);
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory17.enable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory10.enable(feature21);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = jsonFactory23._getBufferRecycler();
        java.io.OutputStream outputStream25 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = jsonFactory23.createJsonGenerator(outputStream25);
        jsonGenerator26.flush();
        defaultPrettyPrinter4.writeEndArray(jsonGenerator26, (int) '4');
        boolean boolean30 = jsonGenerator26.canWriteTypeId();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = jsonGenerator26.setFeatureMask((-56219));
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator32.writeEndObject();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Current context not an object but ROOT");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(defaultPrettyPrinter3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100]");
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(bufferRecycler24);
        org.junit.Assert.assertNotNull(jsonGenerator26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jsonGenerator32);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test679");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) '4', true);
        java.io.InputStream inputStream5 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer7 = null;
        byte[] byteArray8 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, 0, inputStream5, objectCodec6, bytesToNameCanonicalizer7, byteArray8, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str14 = uTF8StreamJsonParser12._getText2(jsonToken13);
        boolean boolean15 = uTF8StreamJsonParser12.loadMore();
        java.lang.String str16 = uTF8StreamJsonParser12.getText();
        boolean boolean17 = uTF8StreamJsonParser12.loadMore();
        long long18 = uTF8StreamJsonParser12.getTokenCharacterOffset();
        char[] charArray19 = uTF8StreamJsonParser12.getTextCharacters();
        boolean boolean20 = uTF8StreamJsonParser12.hasCurrentToken();
        int int22 = uTF8StreamJsonParser12.getValueAsInt(0);
        boolean boolean23 = uTF8StreamJsonParser12._bufferRecyclable;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext24 = uTF8StreamJsonParser12.getParsingContext();
        int int25 = uTF8StreamJsonParser12.getTextOffset();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken13.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonReadContext24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test680");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory0.createParser(byteArray2);
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory0.setCodec(objectCodec4);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory5.createParser(byteArray8, (-1), 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext15 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler12, (java.lang.Object) '4', true);
        java.io.InputStream inputStream17 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer19 = null;
        byte[] byteArray20 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser24 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext15, 0, inputStream17, objectCodec18, bytesToNameCanonicalizer19, byteArray20, 33, 33, false);
        com.fasterxml.jackson.core.JsonToken jsonToken25 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        java.lang.String str26 = uTF8StreamJsonParser24._getText2(jsonToken25);
        com.fasterxml.jackson.core.JsonLocation jsonLocation30 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) uTF8StreamJsonParser24, (long) 33, (int) (byte) -1, (int) (short) 1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory();
        byte[] byteArray33 = new byte[] { (byte) 100 };
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory31.createParser(byteArray33);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory31.setCodec(objectCodec35);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory36.createJsonParser("hi!");
        java.lang.Object obj39 = jsonParser38.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonParser.Feature feature40 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES;
        com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonParser38.disable(feature40);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = uTF8StreamJsonParser24.configure(feature40, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory5.disable(feature40);
        java.net.URL uRL45 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser46 = jsonFactory5.createJsonParser(uRL45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertTrue("'" + jsonToken25 + "' != '" + com.fasterxml.jackson.core.JsonToken.FIELD_NAME + "'", jsonToken25.equals(com.fasterxml.jackson.core.JsonToken.FIELD_NAME));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100]");
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES + "'", feature40.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES));
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertNotNull(jsonParser43);
        org.junit.Assert.assertNotNull(jsonFactory44);
    }
}
