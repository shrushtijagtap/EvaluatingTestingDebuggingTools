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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        int int81 = uTF8StreamJsonParser78.getTokenLineNr();
        java.lang.Object obj82 = uTF8StreamJsonParser78.getInputSource();
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764514003) + "'", int71 == (-1764514003));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(obj82);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test502");
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
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory26.setInputDecorator(inputDecorator32);
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
        org.junit.Assert.assertNotNull(jsonFactory33);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test503");
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
        boolean boolean32 = jsonParser30.isExpectedStartArrayToken();
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
        org.junit.Assert.assertNotNull(jsonLocation31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test504");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.append(' ');
        int int23 = textBuffer20.size();
        writerBasedJsonGenerator17.writeObject((java.lang.Object) int23);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext25 = writerBasedJsonGenerator17.getOutputContext();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = writerBasedJsonGenerator17.useDefaultPrettyPrinter();
        writerBasedJsonGenerator17.writeNumber((float) (-1764608589));
        writerBasedJsonGenerator17.writeNumber((long) (-1764701969));
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(jsonWriteContext25);
        org.junit.Assert.assertNotNull(jsonGenerator26);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test505");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        long long82 = uTF8StreamJsonParser78.getValueAsLong(0L);
        // The following exception was thrown during execution in test generation
        try {
            float float83 = uTF8StreamJsonParser78.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 11]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764513013) + "'", int71 == (-1764513013));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test506");
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
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader88 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, (java.io.InputStream) mergedStream66, byteArray78, (int) (byte) 10, 2000, true);
        boolean boolean89 = uTF32Reader88.markSupported();
        boolean boolean90 = uTF32Reader88.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            uTF32Reader88.close();
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
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test507");
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
        com.fasterxml.jackson.core.JsonGenerator.Feature feature32 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
        int int33 = feature32.getMask();
        boolean boolean34 = jsonFactory26.isEnabled(feature32);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory(objectCodec35);
        java.io.Reader reader37 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory36.createParser(reader37);
        com.fasterxml.jackson.core.Version version39 = jsonParser38.version();
        boolean boolean41 = jsonParser38.getValueAsBoolean(false);
        boolean boolean42 = jsonParser38.canReadTypeId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = new com.fasterxml.jackson.core.JsonFactory(objectCodec43);
        com.fasterxml.jackson.core.JsonFactory.Feature feature45 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean47 = feature45.enabledIn(3);
        boolean boolean48 = jsonFactory44.isEnabled(feature45);
        com.fasterxml.jackson.core.JsonParser.Feature feature49 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = jsonFactory44.disable(feature49);
        int int51 = feature49.getMask();
        com.fasterxml.jackson.core.JsonParser jsonParser52 = jsonParser38.enable(feature49);
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = jsonFactory26.configure(feature49, false);
        java.lang.String str55 = jsonFactory26.getRootValueSeparator();
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
        org.junit.Assert.assertTrue("'" + feature32 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM + "'", feature32.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 64 + "'", int33 == 64);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNotNull(version39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + feature45 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature45.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature49.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertNotNull(jsonParser52);
        org.junit.Assert.assertNotNull(jsonFactory54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + " " + "'", str55, " ");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test508");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        int int7 = jsonParser3.nextIntValue(0);
        java.lang.String str8 = jsonParser3.getValueAsString();
        java.lang.String str9 = jsonParser3.getValueAsString();
        double double10 = jsonParser3.getValueAsDouble();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test509");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.append(' ');
        int int23 = textBuffer20.size();
        writerBasedJsonGenerator17.writeObject((java.lang.Object) int23);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext25 = writerBasedJsonGenerator17.getOutputContext();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = writerBasedJsonGenerator17.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.io.SerializedString serializedString28 = new com.fasterxml.jackson.core.io.SerializedString("JSON");
        writerBasedJsonGenerator17.writeString((com.fasterxml.jackson.core.SerializableString) serializedString28);
        byte[] byteArray30 = serializedString28.asQuotedUTF8();
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(jsonWriteContext25);
        org.junit.Assert.assertNotNull(jsonGenerator26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[74, 83, 79, 78]");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test510");
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
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory16.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory(objectCodec18);
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean22 = feature20.enabledIn(3);
        boolean boolean23 = jsonFactory19.isEnabled(feature20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = new com.fasterxml.jackson.core.JsonFactory(objectCodec24);
        com.fasterxml.jackson.core.JsonFactory.Feature feature26 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean28 = feature26.enabledIn(3);
        boolean boolean29 = jsonFactory25.isEnabled(feature26);
        com.fasterxml.jackson.core.JsonParser.Feature feature30 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory25.disable(feature30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory19.disable(feature30);
        java.lang.String str33 = jsonFactory19.getFormatName();
        java.io.InputStream inputStream34 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory19.createParser(inputStream34);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes36 = jsonFactory19.getCharacterEscapes();
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
        com.fasterxml.jackson.core.JsonGenerator.Feature feature59 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator60 = jsonGenerator57.enable(feature59);
        boolean boolean61 = jsonFactory19.isEnabled(feature59);
        com.fasterxml.jackson.core.JsonFactory jsonFactory62 = jsonFactory17.disable(feature59);
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
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature26.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "JSON" + "'", str33, "JSON");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNull(characterEscapes36);
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
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature59.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonGenerator60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(jsonFactory62);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test511");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str81 = uTF8StreamJsonParser78.getCurrentName();
        long long83 = uTF8StreamJsonParser78.getValueAsLong((long) (short) 100);
        com.fasterxml.jackson.core.JsonLocation jsonLocation84 = uTF8StreamJsonParser78.getCurrentLocation();
        com.fasterxml.jackson.core.ObjectCodec objectCodec85 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec85);
        int int87 = uTF8StreamJsonParser78.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal88 = uTF8StreamJsonParser78.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 11]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764512329) + "'", int71 == (-1764512329));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 100L + "'", long83 == 100L);
        org.junit.Assert.assertNotNull(jsonLocation84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test512");
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
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter17 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString18 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter19 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter17, serializableString18);
        boolean boolean20 = defaultPrettyPrinter19._spacesInObjectEntries;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter21 = null;
        defaultPrettyPrinter19._arrayIndenter = indenter21;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter fixedSpaceIndenter23 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        defaultPrettyPrinter19._objectIndenter = fixedSpaceIndenter23;
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator42 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext28, (-1764719943), objectCodec32, (java.io.Writer) uTF8Writer38);
        defaultPrettyPrinter19.beforeObjectEntries((com.fasterxml.jackson.core.JsonGenerator) writerBasedJsonGenerator42);
        com.fasterxml.jackson.core.io.SerializedString serializedString45 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray46 = serializedString45.asQuotedUTF8();
        java.lang.String str47 = serializedString45.toString();
        writerBasedJsonGenerator42.writeRaw((com.fasterxml.jackson.core.SerializableString) serializedString45);
        byte[] byteArray49 = serializedString45.asUnquotedUTF8();
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory14.createParser(byteArray49);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(fixedSpaceIndenter23);
        org.junit.Assert.assertNotNull(writer41);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\n" + "'", str47, "\n");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[10]");
        org.junit.Assert.assertNotNull(jsonParser50);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test513");
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
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader88 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, (java.io.InputStream) mergedStream66, byteArray78, (int) (byte) 10, 2000, true);
        boolean boolean89 = uTF32Reader88.ready();
        boolean boolean90 = uTF32Reader88.ready();
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
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test514");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str81 = uTF8StreamJsonParser78.getCurrentName();
        long long83 = uTF8StreamJsonParser78.getValueAsLong((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            uTF8StreamJsonParser78.close();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764511857) + "'", int71 == (-1764511857));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 100L + "'", long83 == 100L);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test515");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str82 = uTF8StreamJsonParser78.getValueAsString("\n");
        int int83 = uTF8StreamJsonParser78.getTextOffset();
        int int84 = uTF8StreamJsonParser78.getTokenLineNr();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext85 = uTF8StreamJsonParser78.getParsingContext();
        com.fasterxml.jackson.core.JsonLocation jsonLocation86 = uTF8StreamJsonParser78.getCurrentLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation87 = uTF8StreamJsonParser78.getTokenLocation();
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764511423) + "'", int71 == (-1764511423));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\n" + "'", str82, "\n");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(jsonStreamContext85);
        org.junit.Assert.assertNotNull(jsonLocation86);
        org.junit.Assert.assertNotNull(jsonLocation87);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test516");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.append(' ');
        int int23 = textBuffer20.size();
        writerBasedJsonGenerator17.writeObject((java.lang.Object) int23);
        java.math.BigInteger bigInteger25 = null;
        writerBasedJsonGenerator17.writeNumber(bigInteger25);
        java.lang.Object obj27 = writerBasedJsonGenerator17.getOutputTarget();
        writerBasedJsonGenerator17.flush();
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = writerBasedJsonGenerator17.setCodec(objectCodec29);
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(jsonGenerator30);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test517");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        mergedStream66.reset();
        byte[] byteArray80 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int81 = mergedStream66.read(byteArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764510395) + "'", int71 == (-1764510395));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test518");
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
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str17 = serializedString16.toString();
        int int18 = serializedString16.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext22 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler19, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream23 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer24 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext22, outputStream23);
        byte[] byteArray25 = iOContext22.allocReadIOBuffer();
        int int27 = serializedString16.appendQuotedUTF8(byteArray25, 3);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory13.createParser(byteArray25, (-1764668261), (-1764676579));
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext34 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler31, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream35 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = new com.fasterxml.jackson.core.JsonFactory(objectCodec36);
        com.fasterxml.jackson.core.JsonFactory.Feature feature38 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean40 = feature38.enabledIn(3);
        boolean boolean41 = jsonFactory37.isEnabled(feature38);
        com.fasterxml.jackson.core.JsonParser.Feature feature42 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = jsonFactory37.disable(feature42);
        java.io.OutputStream outputStream44 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator45 = jsonFactory37.createGenerator(outputStream44);
        com.fasterxml.jackson.core.io.IOContext iOContext46 = null;
        byte[] byteArray47 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper50 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext46, byteArray47, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory37.createJsonParser(byteArray47, 1, (int) (short) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = new com.fasterxml.jackson.core.JsonFactory(objectCodec54);
        com.fasterxml.jackson.core.JsonFactory.Feature feature56 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean58 = feature56.enabledIn(3);
        boolean boolean59 = jsonFactory55.isEnabled(feature56);
        com.fasterxml.jackson.core.JsonParser.Feature feature60 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory61 = jsonFactory55.disable(feature60);
        java.io.OutputStream outputStream62 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator63 = jsonFactory55.createGenerator(outputStream62);
        com.fasterxml.jackson.core.io.IOContext iOContext64 = null;
        byte[] byteArray65 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper68 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext64, byteArray65, 0, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser71 = jsonFactory55.createJsonParser(byteArray65, 1, (int) (short) 100);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter73 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString74 = defaultPrettyPrinter73._rootSeparator;
        byte[] byteArray81 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int83 = serializableString74.appendQuotedUTF8(byteArray81, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser84 = jsonFactory55.createJsonParser(byteArray81);
        com.fasterxml.jackson.core.JsonParser jsonParser87 = jsonFactory37.createJsonParser(byteArray81, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream90 = new com.fasterxml.jackson.core.io.MergedStream(iOContext34, inputStream35, byteArray81, 10, 2000);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser91 = jsonFactory13.createJsonParser((java.io.InputStream) mergedStream90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature38.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature42.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory43);
        org.junit.Assert.assertNotNull(jsonGenerator45);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertTrue("'" + feature56 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature56.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + feature60 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature60.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory61);
        org.junit.Assert.assertNotNull(jsonGenerator63);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser71);
        org.junit.Assert.assertNotNull(serializableString74);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(jsonParser84);
        org.junit.Assert.assertNotNull(jsonParser87);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test519");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        textBuffer1.append('a');
        int int6 = textBuffer1.getTextOffset();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test520");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str81 = uTF8StreamJsonParser78.getCurrentName();
        long long83 = uTF8StreamJsonParser78.getValueAsLong((long) (short) 100);
        com.fasterxml.jackson.core.JsonLocation jsonLocation84 = uTF8StreamJsonParser78.getCurrentLocation();
        com.fasterxml.jackson.core.ObjectCodec objectCodec85 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec85);
        int int87 = uTF8StreamJsonParser78.getTextOffset();
        boolean boolean89 = uTF8StreamJsonParser78.getValueAsBoolean(false);
        uTF8StreamJsonParser78.clearCurrentToken();
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764510051) + "'", int71 == (-1764510051));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 100L + "'", long83 == 100L);
        org.junit.Assert.assertNotNull(jsonLocation84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test521");
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
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader88 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, (java.io.InputStream) mergedStream66, byteArray78, (int) (byte) 10, 2000, true);
        boolean boolean89 = uTF32Reader88.markSupported();
        boolean boolean90 = uTF32Reader88.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            uTF32Reader88.mark((-1764669279));
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
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test522");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str82 = uTF8StreamJsonParser78.getValueAsString("\n");
        long long83 = uTF8StreamJsonParser78.getTokenCharacterOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation84 = uTF8StreamJsonParser78.getCurrentLocation();
        uTF8StreamJsonParser78.overrideCurrentName("[Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.Version version87 = uTF8StreamJsonParser78.version();
        java.lang.String str88 = uTF8StreamJsonParser78.getText();
        java.lang.Object obj89 = uTF8StreamJsonParser78.getEmbeddedObject();
        com.fasterxml.jackson.core.FormatSchema formatSchema90 = null;
        boolean boolean91 = uTF8StreamJsonParser78.canUseSchema(formatSchema90);
        // The following exception was thrown during execution in test generation
        try {
            float float92 = uTF8StreamJsonParser78.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 11]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764509553) + "'", int71 == (-1764509553));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\n" + "'", str82, "\n");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(jsonLocation84);
        org.junit.Assert.assertNotNull(version87);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test523");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = jsonParser3.getTokenLocation();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = jsonParser3.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonLocation5);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test524");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str81 = uTF8StreamJsonParser78.getCurrentName();
        long long83 = uTF8StreamJsonParser78.getValueAsLong((long) (short) 100);
        uTF8StreamJsonParser78.clearCurrentToken();
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764509023) + "'", int71 == (-1764509023));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 100L + "'", long83 == 100L);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test525");
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
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes56 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = jsonFactory14.setCharacterEscapes(characterEscapes56);
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = jsonFactory14.setCodec(objectCodec58);
        java.net.URL uRL60 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser61 = jsonFactory14.createParser(uRL60);
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
        org.junit.Assert.assertNotNull(jsonFactory57);
        org.junit.Assert.assertNotNull(jsonFactory59);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test526");
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
        textBuffer16.releaseBuffers();
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
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test527");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean19 = writerBasedJsonGenerator17.isEnabled(feature18);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes20 = writerBasedJsonGenerator17.getCharacterEscapes();
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = writerBasedJsonGenerator17.getCodec();
        com.fasterxml.jackson.core.io.SerializedString serializedString23 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str24 = serializedString23.toString();
        char[] charArray25 = new char[] {};
        int int27 = serializedString23.appendQuoted(charArray25, (int) (byte) 10);
        int int28 = serializedString23.charLength();
        int int29 = serializedString23.charLength();
        int int30 = serializedString23.charLength();
        java.lang.String str31 = serializedString23.toString();
        writerBasedJsonGenerator17.writeRaw((com.fasterxml.jackson.core.SerializableString) serializedString23);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = writerBasedJsonGenerator17.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = writerBasedJsonGenerator17.useDefaultPrettyPrinter();
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature18.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(characterEscapes20);
        org.junit.Assert.assertNull(objectCodec21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n" + "'", str31, "\n");
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNotNull(jsonGenerator34);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test528");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        writerBasedJsonGenerator17.writeNull();
        com.fasterxml.jackson.core.io.SerializedString serializedString21 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str22 = serializedString21.toString();
        int int23 = serializedString21.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext27 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler24, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream28 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer29 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext27, outputStream28);
        byte[] byteArray30 = iOContext27.allocReadIOBuffer();
        int int32 = serializedString21.appendQuotedUTF8(byteArray30, 3);
        byte[] byteArray33 = serializedString21.asQuotedUTF8();
        writerBasedJsonGenerator17.writeString((com.fasterxml.jackson.core.SerializableString) serializedString21);
        writerBasedJsonGenerator17.writeNumber((double) 0.0f);
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[92, 110]");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test529");
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
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str17 = serializedString16.toString();
        int int18 = serializedString16.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext22 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler19, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream23 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer24 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext22, outputStream23);
        byte[] byteArray25 = iOContext22.allocReadIOBuffer();
        int int27 = serializedString16.appendQuotedUTF8(byteArray25, 3);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory13.createParser(byteArray25, (-1764668261), (-1764676579));
        java.lang.String str31 = jsonFactory13.getRootValueSeparator();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " " + "'", str31, " ");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test530");
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
        boolean boolean20 = jsonParser3.canReadTypeId();
        boolean boolean21 = jsonParser3.canReadObjectId();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test531");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        boolean boolean6 = jsonParser3.getValueAsBoolean(false);
        boolean boolean7 = jsonParser3.canReadTypeId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = new com.fasterxml.jackson.core.JsonFactory(objectCodec8);
        com.fasterxml.jackson.core.JsonFactory.Feature feature10 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean12 = feature10.enabledIn(3);
        boolean boolean13 = jsonFactory9.isEnabled(feature10);
        com.fasterxml.jackson.core.JsonParser.Feature feature14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory9.disable(feature14);
        int int16 = feature14.getMask();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonParser3.enable(feature14);
        java.lang.String str18 = jsonParser17.getText();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean19 = jsonParser17.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature10.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test532");
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
        java.lang.String str16 = jsonFactory14.getFormatName();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes17 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory14.setCharacterEscapes(characterEscapes17);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory(objectCodec19);
        java.io.Reader reader21 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory20.createParser(reader21);
        com.fasterxml.jackson.core.Version version23 = jsonFactory20.version();
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = jsonFactory20.createGenerator(outputStream24);
        com.fasterxml.jackson.core.JsonFactory.Feature feature26 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonLocation jsonLocation31 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) feature26, 0L, (long) (byte) 1, 10, (int) (short) -1);
        boolean boolean32 = feature26.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory20.configure(feature26, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory14.configure(feature26, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = new com.fasterxml.jackson.core.JsonFactory(objectCodec37);
        java.io.Reader reader39 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory38.createParser(reader39);
        com.fasterxml.jackson.core.Version version41 = jsonParser40.version();
        boolean boolean43 = jsonParser40.getValueAsBoolean(false);
        boolean boolean44 = jsonParser40.canReadTypeId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory(objectCodec45);
        com.fasterxml.jackson.core.JsonFactory.Feature feature47 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean49 = feature47.enabledIn(3);
        boolean boolean50 = jsonFactory46.isEnabled(feature47);
        com.fasterxml.jackson.core.JsonParser.Feature feature51 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = jsonFactory46.disable(feature51);
        int int53 = feature51.getMask();
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonParser40.enable(feature51);
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory14.configure(feature51, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = jsonFactory56.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = new com.fasterxml.jackson.core.JsonFactory(objectCodec58);
        com.fasterxml.jackson.core.JsonFactory.Feature feature60 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean62 = feature60.enabledIn(3);
        boolean boolean63 = jsonFactory59.isEnabled(feature60);
        com.fasterxml.jackson.core.JsonParser.Feature feature64 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory65 = jsonFactory59.disable(feature64);
        java.io.OutputStream outputStream66 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator67 = jsonFactory59.createGenerator(outputStream66);
        com.fasterxml.jackson.core.JsonFactory.Feature feature68 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean70 = feature68.enabledIn(3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = jsonFactory59.disable(feature68);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler72 = jsonFactory71._getBufferRecycler();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator73 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory74 = jsonFactory71.setInputDecorator(inputDecorator73);
        com.fasterxml.jackson.core.JsonFactory jsonFactory75 = jsonFactory74.copy();
        com.fasterxml.jackson.core.JsonFactory.Feature feature76 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonLocation jsonLocation81 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) feature76, 0L, (long) (byte) 1, 10, (int) (short) -1);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature82 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean83 = jsonLocation81.equals((java.lang.Object) feature82);
        com.fasterxml.jackson.core.JsonFactory jsonFactory84 = jsonFactory74.disable(feature82);
        com.fasterxml.jackson.core.JsonFactory jsonFactory85 = jsonFactory57.disable(feature82);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JSON" + "'", str16, "JSON");
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertNotNull(version23);
        org.junit.Assert.assertNotNull(jsonGenerator25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature26.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(jsonFactory57);
        org.junit.Assert.assertTrue("'" + feature60 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature60.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + feature64 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature64.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory65);
        org.junit.Assert.assertNotNull(jsonGenerator67);
        org.junit.Assert.assertTrue("'" + feature68 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature68.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jsonFactory71);
        org.junit.Assert.assertNotNull(bufferRecycler72);
        org.junit.Assert.assertNotNull(jsonFactory74);
        org.junit.Assert.assertNotNull(jsonFactory75);
        org.junit.Assert.assertTrue("'" + feature76 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature76.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + feature82 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature82.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jsonFactory84);
        org.junit.Assert.assertNotNull(jsonFactory85);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test533");
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
        int int54 = feature51.getMask();
        com.fasterxml.jackson.core.JsonParser jsonParser55 = jsonParser38.disable(feature51);
        java.lang.Class<?> wildcardClass56 = jsonParser38.getClass();
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
        org.junit.Assert.assertTrue("'" + feature41 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature41.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature51.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory52);
        org.junit.Assert.assertNotNull(jsonFactory53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertNotNull(jsonParser55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test534");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory1.createJsonParser("com.fasterxml.jackson.core.JsonParseException: \n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) feature6, 0L, (long) (byte) 1, 10, (int) (short) -1);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature12 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        boolean boolean13 = jsonLocation11.equals((java.lang.Object) feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory1.configure(feature12, false);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature12.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonFactory15);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test535");
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
        textBuffer16.resetWithString("\n");
        textBuffer16.ensureNotShared();
        java.lang.String str20 = textBuffer16.contentsAsString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test536");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str81 = uTF8StreamJsonParser78.getCurrentName();
        long long83 = uTF8StreamJsonParser78.getValueAsLong((long) (short) 100);
        com.fasterxml.jackson.core.JsonLocation jsonLocation84 = uTF8StreamJsonParser78.getCurrentLocation();
        com.fasterxml.jackson.core.ObjectCodec objectCodec85 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec85);
        int int87 = uTF8StreamJsonParser78.getTextOffset();
        uTF8StreamJsonParser78.overrideCurrentName("UTF-32BE");
        uTF8StreamJsonParser78.overrideCurrentName("UTF-32BE");
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764504119) + "'", int71 == (-1764504119));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 100L + "'", long83 == 100L);
        org.junit.Assert.assertNotNull(jsonLocation84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test537");
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str2 = serializedString1.toString();
        int int3 = serializedString1.charLength();
        char[] charArray4 = serializedString1.asQuotedChars();
        byte[] byteArray5 = serializedString1.asUnquotedUTF8();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\\, n]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10]");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test538");
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter1 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString2 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter3 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter1, serializableString2);
        boolean boolean4 = defaultPrettyPrinter3._spacesInObjectEntries;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter indenter5 = null;
        defaultPrettyPrinter3._arrayIndenter = indenter5;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter fixedSpaceIndenter7 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        defaultPrettyPrinter3._objectIndenter = fixedSpaceIndenter7;
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator26 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext12, (-1764719943), objectCodec16, (java.io.Writer) uTF8Writer22);
        defaultPrettyPrinter3.beforeObjectEntries((com.fasterxml.jackson.core.JsonGenerator) writerBasedJsonGenerator26);
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray30 = serializedString29.asQuotedUTF8();
        java.lang.String str31 = serializedString29.toString();
        writerBasedJsonGenerator26.writeRaw((com.fasterxml.jackson.core.SerializableString) serializedString29);
        writerBasedJsonGenerator26.writeNumber((-1764719943));
        writerBasedJsonGenerator26.close();
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = new com.fasterxml.jackson.core.JsonFactory(objectCodec36);
        com.fasterxml.jackson.core.JsonFactory.Feature feature38 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean40 = feature38.enabledIn(3);
        boolean boolean41 = jsonFactory37.isEnabled(feature38);
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = new com.fasterxml.jackson.core.JsonFactory(objectCodec42);
        com.fasterxml.jackson.core.JsonFactory.Feature feature44 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean46 = feature44.enabledIn(3);
        boolean boolean47 = jsonFactory43.isEnabled(feature44);
        com.fasterxml.jackson.core.JsonParser.Feature feature48 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = jsonFactory43.disable(feature48);
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = jsonFactory37.disable(feature48);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = jsonFactory50._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer52 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler51);
        char[] charArray53 = textBuffer52.emptyAndGetCurrentSegment();
        int int56 = com.fasterxml.jackson.core.io.NumberInput.parseInt(charArray53, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator26.writeString(charArray53, (-1764669279), (-1764509023));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fixedSpaceIndenter7);
        org.junit.Assert.assertNotNull(writer25);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n" + "'", str31, "\n");
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature38.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature44.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature48.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory49);
        org.junit.Assert.assertNotNull(jsonFactory50);
        org.junit.Assert.assertNotNull(bufferRecycler51);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-48) + "'", int56 == (-48));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test539");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonFactory1.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory1.setCodec(objectCodec5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonFactory1.isEnabled(feature7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(jsonFactory6);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test540");
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
        java.io.Writer writer16 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = jsonFactory15.createJsonGenerator(writer16);
        // The following exception was thrown during execution in test generation
        try {
            jsonGenerator17.writeEndObject();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Current context not an object but ROOT");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNotNull(jsonGenerator17);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test541");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str81 = uTF8StreamJsonParser78.getCurrentName();
        long long83 = uTF8StreamJsonParser78.getValueAsLong((long) (short) 100);
        com.fasterxml.jackson.core.JsonLocation jsonLocation84 = uTF8StreamJsonParser78.getCurrentLocation();
        com.fasterxml.jackson.core.ObjectCodec objectCodec85 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec85);
        int int87 = uTF8StreamJsonParser78.getTextOffset();
        char[] charArray88 = uTF8StreamJsonParser78.getTextCharacters();
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764503041) + "'", int71 == (-1764503041));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 100L + "'", long83 == 100L);
        org.junit.Assert.assertNotNull(jsonLocation84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNull(charArray88);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test542");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str82 = uTF8StreamJsonParser78.getValueAsString("\n");
        long long83 = uTF8StreamJsonParser78.getTokenCharacterOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation84 = uTF8StreamJsonParser78.getCurrentLocation();
        uTF8StreamJsonParser78.overrideCurrentName("[Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.JsonToken jsonToken87 = uTF8StreamJsonParser78.getLastClearedToken();
        boolean boolean88 = uTF8StreamJsonParser78.isClosed();
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764502225) + "'", int71 == (-1764502225));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\n" + "'", str82, "\n");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(jsonLocation84);
        org.junit.Assert.assertNull(jsonToken87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test543");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = writerBasedJsonGenerator17.setFeatureMask((-1764679075));
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = writerBasedJsonGenerator17.setHighestNonEscapedChar(1);
        com.fasterxml.jackson.core.io.SerializedString serializedString24 = new com.fasterxml.jackson.core.io.SerializedString("JSON");
        writerBasedJsonGenerator17.writeString((com.fasterxml.jackson.core.SerializableString) serializedString24);
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler41 = jsonFactory40._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer42 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler41);
        char[] charArray43 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.SPACES;
        textBuffer42.append(charArray43, (int) (byte) 0, (int) (short) 1);
        int int48 = serializedString24.appendUnquoted(charArray43, 0);
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature28.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature38.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(bufferRecycler41);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "JSON                                                            ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "JSON                                                            ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[J, S, O, N,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test544");
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer0 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int1 = charsToNameCanonicalizer0.collisionCount();
        com.fasterxml.jackson.core.io.SerializedString serializedString3 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str4 = serializedString3.toString();
        char[] charArray5 = new char[] {};
        int int7 = serializedString3.appendQuoted(charArray5, (int) (byte) 10);
        java.lang.String str11 = charsToNameCanonicalizer0.findSymbol(charArray5, (-1764586087), (-1764612119), (-1764617075));
        int int12 = charsToNameCanonicalizer0.collisionCount();
        charsToNameCanonicalizer0.release();
        boolean boolean14 = charsToNameCanonicalizer0.maybeDirty();
        int int15 = charsToNameCanonicalizer0.size();
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test545");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.append(' ');
        int int23 = textBuffer20.size();
        writerBasedJsonGenerator17.writeObject((java.lang.Object) int23);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext25 = writerBasedJsonGenerator17.getOutputContext();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = writerBasedJsonGenerator17.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = writerBasedJsonGenerator17.setFeatureMask((-1764582169));
        com.fasterxml.jackson.core.TreeNode treeNode29 = null;
        jsonGenerator28.writeTree(treeNode29);
        jsonGenerator28.writeNumber(0.0d);
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(jsonWriteContext25);
        org.junit.Assert.assertNotNull(jsonGenerator26);
        org.junit.Assert.assertNotNull(jsonGenerator28);
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
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler37 = jsonFactory36._getBufferRecycler();
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler53 = jsonFactory52._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType charBufferType54 = com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER;
        char[] charArray56 = bufferRecycler53.allocCharBuffer(charBufferType54, (int) (byte) 0);
        char[][] charArray57 = bufferRecycler53._charBuffers;
        com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType byteBufferType58 = com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER;
        byte[] byteArray59 = null;
        bufferRecycler53.releaseByteBuffer(byteBufferType58, byteArray59);
        com.fasterxml.jackson.core.io.SerializedString serializedString62 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str63 = serializedString62.toString();
        char[] charArray64 = new char[] {};
        int int66 = serializedString62.appendQuoted(charArray64, (int) (byte) 10);
        byte[] byteArray67 = serializedString62.asQuotedUTF8();
        bufferRecycler37.releaseByteBuffer(byteBufferType58, byteArray67);
        byte[] byteArray69 = com.fasterxml.jackson.core.io.CharTypes.copyHexBytes();
        bufferRecycler21.releaseByteBuffer(byteBufferType58, byteArray69);
        byte[] byteArray71 = bufferRecycler15.allocByteBuffer(byteBufferType58);
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
        org.junit.Assert.assertNotNull(bufferRecycler37);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature40.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + feature46 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature46.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + feature50 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature50.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory51);
        org.junit.Assert.assertNotNull(jsonFactory52);
        org.junit.Assert.assertNotNull(bufferRecycler53);
        org.junit.Assert.assertTrue("'" + charBufferType54 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER + "'", charBufferType54.equals(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TEXT_BUFFER));
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertTrue("'" + byteBufferType58 + "' != '" + com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER + "'", byteBufferType58.equals(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\n" + "'", str63, "\n");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[92, 110]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(byteArray71);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test547");
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
        com.fasterxml.jackson.core.io.UTF32Reader uTF32Reader88 = new com.fasterxml.jackson.core.io.UTF32Reader(iOContext3, (java.io.InputStream) mergedStream66, byteArray78, (int) (byte) 10, 2000, true);
        boolean boolean89 = uTF32Reader88.ready();
        // The following exception was thrown during execution in test generation
        try {
            uTF32Reader88.mark((-1764665761));
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
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test548");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str82 = uTF8StreamJsonParser78.getValueAsString("\n");
        int int84 = uTF8StreamJsonParser78.getValueAsInt((-1768327820));
        com.fasterxml.jackson.core.ObjectCodec objectCodec85 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory86 = new com.fasterxml.jackson.core.JsonFactory(objectCodec85);
        java.io.Reader reader87 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser88 = jsonFactory86.createParser(reader87);
        boolean boolean89 = jsonParser88.requiresCustomCodec();
        java.lang.String str90 = jsonParser88.getText();
        int int92 = jsonParser88.nextIntValue(0);
        com.fasterxml.jackson.core.JsonLocation jsonLocation93 = jsonParser88.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParser.Feature feature94 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean95 = jsonParser88.isEnabled(feature94);
        com.fasterxml.jackson.core.JsonParser jsonParser96 = uTF8StreamJsonParser78.disable(feature94);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str97 = jsonParser96.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764499261) + "'", int71 == (-1764499261));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\n" + "'", str82, "\n");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1768327820) + "'", int84 == (-1768327820));
        org.junit.Assert.assertNotNull(jsonParser88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(jsonLocation93);
        org.junit.Assert.assertTrue("'" + feature94 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature94.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(jsonParser96);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test549");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        boolean boolean79 = uTF8StreamJsonParser78.isClosed();
        java.lang.String str80 = uTF8StreamJsonParser78.getCurrentName();
        java.lang.String str81 = uTF8StreamJsonParser78.getText();
        java.lang.String str82 = uTF8StreamJsonParser78.getCurrentName();
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764499233) + "'", int71 == (-1764499233));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test550");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        char[] charArray6 = jsonParser3.getTextCharacters();
        long long8 = jsonParser3.nextLongValue((long) (-1768373712));
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1768373712L) + "'", long8 == (-1768373712L));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test551");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        boolean boolean79 = uTF8StreamJsonParser78.isClosed();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder80 = uTF8StreamJsonParser78._getByteArrayBuilder();
        java.lang.Object obj81 = uTF8StreamJsonParser78.getEmbeddedObject();
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764498383) + "'", int71 == (-1764498383));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArrayBuilder80);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test552");
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
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory1.copy();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext21 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler18, (java.lang.Object) (byte) -1, true);
        java.io.InputStream inputStream22 = null;
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
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter60 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString61 = defaultPrettyPrinter60._rootSeparator;
        byte[] byteArray68 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        int int70 = serializableString61.appendQuotedUTF8(byteArray68, (int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser71 = jsonFactory42.createJsonParser(byteArray68);
        com.fasterxml.jackson.core.JsonParser jsonParser74 = jsonFactory24.createJsonParser(byteArray68, 64, 1);
        com.fasterxml.jackson.core.io.MergedStream mergedStream77 = new com.fasterxml.jackson.core.io.MergedStream(iOContext21, inputStream22, byteArray68, 10, 2000);
        com.fasterxml.jackson.core.JsonParser jsonParser80 = jsonFactory1.createJsonParser(byteArray68, (int) (short) 10, (int) (short) 0);
        java.lang.Object obj81 = jsonParser80.getTypeId();
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
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature29.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature43.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertNotNull(jsonGenerator50);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser58);
        org.junit.Assert.assertNotNull(serializableString61);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[-1, 0, -1, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(jsonParser71);
        org.junit.Assert.assertNotNull(jsonParser74);
        org.junit.Assert.assertNotNull(jsonParser80);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test553");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        com.fasterxml.jackson.core.ObjectCodec objectCodec81 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec81);
        java.lang.String str83 = uTF8StreamJsonParser78.getText();
        com.fasterxml.jackson.core.ObjectCodec objectCodec84 = uTF8StreamJsonParser78.getCodec();
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764497409) + "'", int71 == (-1764497409));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNull(objectCodec84);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test554");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        boolean boolean79 = uTF8StreamJsonParser78.isClosed();
        // The following exception was thrown during execution in test generation
        try {
            float float80 = uTF8StreamJsonParser78.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 11]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764496843) + "'", int71 == (-1764496843));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test555");
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer0 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory(objectCodec1);
        com.fasterxml.jackson.core.JsonFactory.Feature feature3 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean5 = feature3.enabledIn(3);
        boolean boolean6 = jsonFactory2.isEnabled(feature3);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory(objectCodec7);
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean11 = feature9.enabledIn(3);
        boolean boolean12 = jsonFactory8.isEnabled(feature9);
        com.fasterxml.jackson.core.JsonParser.Feature feature13 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory8.disable(feature13);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory2.disable(feature13);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = jsonFactory15._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        char[] charArray18 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.SPACES;
        textBuffer17.append(charArray18, (int) (byte) 0, (int) (short) 1);
        char[] charArray22 = textBuffer17.emptyAndGetCurrentSegment();
        int int25 = charsToNameCanonicalizer0.calcHash(charArray22, (-1764669279), (-1764665761));
        int int26 = charsToNameCanonicalizer0.size();
        int int27 = charsToNameCanonicalizer0.hashSeed();
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer0);
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature3.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature13.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNotNull(bufferRecycler16);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "JSON                                                            ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "JSON                                                            ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[J, S, O, N,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "J\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "J\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[J, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1764496781) + "'", int25 == (-1764496781));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1764496781) + "'", int27 == (-1764496781));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test556");
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
        boolean boolean82 = jsonParser3.isEnabled(feature76);
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
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test557");
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
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = jsonGenerator16.getOutputContext();
        jsonGenerator16.writeNull();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = jsonGenerator16.getOutputContext();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext23 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler20, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer25 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext23, outputStream24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext31 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler28, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream32 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer33 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext31, outputStream32);
        uTF8Writer33.flush();
        java.io.Writer writer36 = uTF8Writer33.append('a');
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator37 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext23, (-1764719943), objectCodec27, (java.io.Writer) uTF8Writer33);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature38 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean39 = writerBasedJsonGenerator37.isEnabled(feature38);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes40 = writerBasedJsonGenerator37.getCharacterEscapes();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter42 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString43 = defaultPrettyPrinter42._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler44 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer45 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler44);
        char[] charArray46 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer45.resetWithShared(charArray46, 2000, 2000);
        int int51 = serializableString43.appendUnquoted(charArray46, 0);
        writerBasedJsonGenerator37.writeRaw(serializableString43);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler53 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext56 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler53, (java.lang.Object) (byte) -1, true);
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
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper77 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext56, byteArray68, (-1764668261), (-1));
        writerBasedJsonGenerator37.writeBinary(byteArray68);
        jsonGenerator16.writeBinary(byteArray68, 0, (-1764724707));
        java.math.BigDecimal bigDecimal82 = null;
        jsonGenerator16.writeNumber(bigDecimal82);
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
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
        org.junit.Assert.assertNotNull(writer36);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature38.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(characterEscapes40);
        org.junit.Assert.assertNotNull(serializableString43);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + feature59 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature59.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + feature63 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature63.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory64);
        org.junit.Assert.assertNotNull(jsonGenerator66);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser74);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test558");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        textBuffer1.resetWithString("hi!");
        int int6 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test559");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        com.fasterxml.jackson.core.ObjectCodec objectCodec81 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec81);
        // The following exception was thrown during execution in test generation
        try {
            int int83 = uTF8StreamJsonParser78.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 11]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764495661) + "'", int71 == (-1764495661));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test560");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.append(' ');
        int int23 = textBuffer20.size();
        writerBasedJsonGenerator17.writeObject((java.lang.Object) int23);
        writerBasedJsonGenerator17.writeNumber((short) (byte) 0);
        com.fasterxml.jackson.core.Version version27 = writerBasedJsonGenerator17.version();
        writerBasedJsonGenerator17.writeNumber(0L);
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(version27);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test561");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.append(' ');
        int int23 = textBuffer20.size();
        writerBasedJsonGenerator17.writeObject((java.lang.Object) int23);
        java.math.BigInteger bigInteger25 = null;
        writerBasedJsonGenerator17.writeNumber(bigInteger25);
        java.lang.Object obj27 = writerBasedJsonGenerator17.getOutputTarget();
        writerBasedJsonGenerator17.flush();
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = writerBasedJsonGenerator17.getCodec();
        writerBasedJsonGenerator17.flush();
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNull(objectCodec29);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test562");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.append(' ');
        int int23 = textBuffer20.size();
        writerBasedJsonGenerator17.writeObject((java.lang.Object) int23);
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter26 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString27 = null;
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter28 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter(defaultPrettyPrinter26, serializableString27);
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
        java.io.OutputStream outputStream44 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator45 = jsonFactory30.createGenerator(outputStream44);
        defaultPrettyPrinter28.writeStartArray(jsonGenerator45);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature47 = com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator48 = jsonGenerator45.enable(feature47);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator49 = writerBasedJsonGenerator17.disable(feature47);
        writerBasedJsonGenerator17.writeNumber("");
        writerBasedJsonGenerator17.flush();
        writerBasedJsonGenerator17.writeOmittedField("com.fasterxml.jackson.core.JsonParseException: \n\n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        writerBasedJsonGenerator17.close();
        com.fasterxml.jackson.core.TreeNode treeNode56 = null;
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator17.writeTree(treeNode56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature31.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature37.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + feature41 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature41.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory42);
        org.junit.Assert.assertNotNull(jsonFactory43);
        org.junit.Assert.assertNotNull(jsonGenerator45);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES + "'", feature47.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonGenerator48);
        org.junit.Assert.assertNotNull(jsonGenerator49);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test563");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.append(' ');
        int int23 = textBuffer20.size();
        writerBasedJsonGenerator17.writeObject((java.lang.Object) int23);
        java.math.BigInteger bigInteger25 = null;
        writerBasedJsonGenerator17.writeNumber(bigInteger25);
        writerBasedJsonGenerator17.writeRaw(' ');
        // The following exception was thrown during execution in test generation
        try {
            writerBasedJsonGenerator17.writeStringField("[Source: -1; line: 1, column: 11]", "2.2250738585072012e-308");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: Can not write a field name, expecting a value");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test564");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter5 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString6 = defaultPrettyPrinter5._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        char[] charArray9 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer8.resetWithShared(charArray9, 2000, 2000);
        int int14 = serializableString6.appendUnquoted(charArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray9, (-1764652713), (-1764627037));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableString6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test565");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str82 = uTF8StreamJsonParser78.getValueAsString("\n");
        long long83 = uTF8StreamJsonParser78.getTokenCharacterOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation84 = uTF8StreamJsonParser78.getCurrentLocation();
        uTF8StreamJsonParser78.overrideCurrentName("[Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.Version version87 = uTF8StreamJsonParser78.version();
        com.fasterxml.jackson.core.Base64Variant base64Variant88 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray89 = uTF8StreamJsonParser78.getBinaryValue(base64Variant88);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: -1; line: 1, column: 11]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764494563) + "'", int71 == (-1764494563));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\n" + "'", str82, "\n");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(jsonLocation84);
        org.junit.Assert.assertNotNull(version87);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test566");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        boolean boolean4 = jsonParser3.requiresCustomCodec();
        java.lang.String str5 = jsonParser3.getText();
        int int7 = jsonParser3.nextIntValue(0);
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = jsonParser3.getCurrentLocation();
        java.lang.String str9 = jsonParser3.getValueAsString();
        // The following exception was thrown during execution in test generation
        try {
            float float10 = jsonParser3.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jsonLocation8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test567");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray2, 2000, 2000);
        textBuffer1.setCurrentLength(79);
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test568");
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
        java.lang.String str19 = jsonParser3.getValueAsString();
        int int20 = jsonParser3.getTextLength();
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test569");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        boolean boolean6 = jsonParser3.getValueAsBoolean(false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = jsonParser3.getCodec();
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = jsonParser3.getSchema();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectCodec7);
        org.junit.Assert.assertNull(formatSchema8);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test570");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        boolean boolean79 = uTF8StreamJsonParser78.isClosed();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder80 = uTF8StreamJsonParser78._getByteArrayBuilder();
        com.fasterxml.jackson.core.ObjectCodec objectCodec81 = uTF8StreamJsonParser78.getCodec();
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764493631) + "'", int71 == (-1764493631));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArrayBuilder80);
        org.junit.Assert.assertNull(objectCodec81);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test571");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        textBuffer1.resetWithString("hi!");
        char[] charArray6 = textBuffer1.expandCurrentSegment();
        textBuffer1.append(' ');
        char[] charArray9 = textBuffer1.contentsAsArray();
        int int10 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        boolean boolean12 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test572");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str81 = uTF8StreamJsonParser78.getCurrentName();
        long long83 = uTF8StreamJsonParser78.getValueAsLong((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal84 = uTF8StreamJsonParser78.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: -1; line: 1, column: 11]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764492673) + "'", int71 == (-1764492673));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 100L + "'", long83 == 100L);
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
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = jsonFactory14.getCharacterEscapes();
        java.lang.String str16 = jsonFactory14.getFormatName();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes17 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory14.setCharacterEscapes(characterEscapes17);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator19 = jsonFactory14.getInputDecorator();
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory(objectCodec20);
        java.io.Reader reader22 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory21.createParser(reader22);
        com.fasterxml.jackson.core.Version version24 = jsonParser23.version();
        boolean boolean26 = jsonParser23.getValueAsBoolean(false);
        java.lang.String str27 = jsonParser23.getCurrentName();
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory(objectCodec28);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean32 = feature30.enabledIn(3);
        boolean boolean33 = jsonFactory29.isEnabled(feature30);
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = new com.fasterxml.jackson.core.JsonFactory(objectCodec34);
        com.fasterxml.jackson.core.JsonFactory.Feature feature36 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean38 = feature36.enabledIn(3);
        boolean boolean39 = jsonFactory35.isEnabled(feature36);
        com.fasterxml.jackson.core.JsonParser.Feature feature40 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory35.disable(feature40);
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory29.disable(feature40);
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = new com.fasterxml.jackson.core.JsonFactory(objectCodec43);
        com.fasterxml.jackson.core.JsonFactory.Feature feature45 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean47 = feature45.enabledIn(3);
        boolean boolean48 = jsonFactory44.isEnabled(feature45);
        com.fasterxml.jackson.core.JsonParser.Feature feature49 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = jsonFactory44.disable(feature49);
        com.fasterxml.jackson.core.JsonFactory jsonFactory52 = jsonFactory42.configure(feature49, true);
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonParser23.disable(feature49);
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = jsonFactory14.configure(feature49, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = new com.fasterxml.jackson.core.JsonFactory(objectCodec56);
        com.fasterxml.jackson.core.JsonFactory.Feature feature58 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean60 = feature58.enabledIn(3);
        boolean boolean61 = jsonFactory57.isEnabled(feature58);
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory63 = new com.fasterxml.jackson.core.JsonFactory(objectCodec62);
        com.fasterxml.jackson.core.JsonFactory.Feature feature64 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean66 = feature64.enabledIn(3);
        boolean boolean67 = jsonFactory63.isEnabled(feature64);
        com.fasterxml.jackson.core.JsonParser.Feature feature68 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory69 = jsonFactory63.disable(feature68);
        com.fasterxml.jackson.core.JsonFactory jsonFactory70 = jsonFactory57.disable(feature68);
        com.fasterxml.jackson.core.JsonFactory.Feature feature71 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonLocation jsonLocation76 = new com.fasterxml.jackson.core.JsonLocation((java.lang.Object) feature71, 0L, (long) (byte) 1, 10, (int) (short) -1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory78 = jsonFactory70.configure(feature71, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory80 = jsonFactory14.configure(feature71, false);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JSON" + "'", str16, "JSON");
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNull(inputDecorator19);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNotNull(version24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature36.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature40.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertNotNull(jsonFactory42);
        org.junit.Assert.assertTrue("'" + feature45 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature45.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature49.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory50);
        org.junit.Assert.assertNotNull(jsonFactory52);
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNotNull(jsonFactory55);
        org.junit.Assert.assertTrue("'" + feature58 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature58.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + feature64 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature64.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + feature68 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature68.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory69);
        org.junit.Assert.assertNotNull(jsonFactory70);
        org.junit.Assert.assertTrue("'" + feature71 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature71.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory78);
        org.junit.Assert.assertNotNull(jsonFactory80);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test574");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        uTF8Writer13.flush();
        java.io.Writer writer20 = uTF8Writer13.append('a');
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = new com.fasterxml.jackson.core.JsonFactory(objectCodec21);
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean25 = feature23.enabledIn(3);
        boolean boolean26 = jsonFactory22.isEnabled(feature23);
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = new com.fasterxml.jackson.core.JsonFactory(objectCodec27);
        com.fasterxml.jackson.core.JsonFactory.Feature feature29 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean31 = feature29.enabledIn(3);
        boolean boolean32 = jsonFactory28.isEnabled(feature29);
        com.fasterxml.jackson.core.JsonParser.Feature feature33 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory28.disable(feature33);
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory22.disable(feature33);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler36 = jsonFactory35._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer37 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler36);
        char[] charArray38 = com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Lf2SpacesIndenter.SPACES;
        textBuffer37.append(charArray38, (int) (byte) 0, (int) (short) 1);
        uTF8Writer13.write(charArray38, 33, (int) (byte) 10);
        uTF8Writer13.write("\n", (-1764515271), (-1764649843));
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(writer20);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature29.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature33.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertNotNull(bufferRecycler36);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "JSON                                                            ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "JSON                                                            ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[J, S, O, N,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test575");
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
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str17 = serializedString16.toString();
        int int18 = serializedString16.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext22 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler19, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream23 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer24 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext22, outputStream23);
        byte[] byteArray25 = iOContext22.allocReadIOBuffer();
        int int27 = serializedString16.appendQuotedUTF8(byteArray25, 3);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory13.createParser(byteArray25, (-1764668261), (-1764676579));
        boolean boolean31 = jsonFactory13.requiresPropertyOrdering();
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory13.setCodec(objectCodec32);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jsonFactory33);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test576");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        byte[] byteArray4 = iOContext3.allocBase64Buffer();
        char[] charArray5 = iOContext3.allocConcatBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = com.fasterxml.jackson.core.io.NumberInput.parseLong(charArray5, 0, (-1768365009));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1768365018");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test577");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str81 = uTF8StreamJsonParser78.getCurrentName();
        com.fasterxml.jackson.core.JsonParser jsonParser83 = uTF8StreamJsonParser78.setFeatureMask(1000);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken84 = uTF8StreamJsonParser78.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764492101) + "'", int71 == (-1764492101));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(jsonParser83);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test578");
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str2 = serializedString1.toString();
        char[] charArray3 = new char[] {};
        int int5 = serializedString1.appendQuoted(charArray3, (int) (byte) 10);
        int int6 = serializedString1.charLength();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (byte) -1, true);
        byte[] byteArray11 = iOContext10.allocBase64Buffer();
        int int13 = serializedString1.appendUnquotedUTF8(byteArray11, (int) (short) 0);
        java.lang.String str14 = serializedString1.toString();
        java.nio.ByteBuffer byteBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = serializedString1.putQuotedUTF8(byteBuffer15);
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
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test579");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str82 = uTF8StreamJsonParser78.getValueAsString("\n");
        long long83 = uTF8StreamJsonParser78.getTokenCharacterOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation84 = uTF8StreamJsonParser78.getCurrentLocation();
        uTF8StreamJsonParser78.overrideCurrentName("[Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext87 = uTF8StreamJsonParser78.getParsingContext();
        com.fasterxml.jackson.core.Version version88 = uTF8StreamJsonParser78.version();
        java.lang.String str90 = uTF8StreamJsonParser78.getValueAsString("com.fasterxml.jackson.core.JsonParseException: \n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
        // The following exception was thrown during execution in test generation
        try {
            int int92 = uTF8StreamJsonParser78.nextIntValue((-1764616209));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764491477) + "'", int71 == (-1764491477));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\n" + "'", str82, "\n");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(jsonLocation84);
        org.junit.Assert.assertNotNull(jsonStreamContext87);
        org.junit.Assert.assertNotNull(version88);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "com.fasterxml.jackson.core.JsonParseException: \n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]" + "'", str90, "com.fasterxml.jackson.core.JsonParseException: \n at [Source: CANONICALIZE_FIELD_NAMES; line: 10, column: 100]");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test580");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createJsonParser(inputStream2);
        java.lang.Object obj4 = jsonParser3.getEmbeddedObject();
        java.lang.String str5 = jsonParser3.getValueAsString();
        boolean boolean6 = jsonParser3.isExpectedStartArrayToken();
        java.lang.Object obj7 = jsonParser3.getObjectId();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test581");
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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext15 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler12, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream16 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer17 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext15, outputStream16);
        uTF8Writer17.flush();
        int int19 = jsonParser11.releaseBuffered((java.io.Writer) uTF8Writer17);
        com.fasterxml.jackson.core.JsonLocation jsonLocation20 = jsonParser11.getCurrentLocation();
        boolean boolean21 = jsonParser11.isClosed();
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(jsonLocation20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
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
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory1.copy();
        com.fasterxml.jackson.core.io.IOContext iOContext18 = null;
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
        com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper byteSourceJsonBootstrapper39 = new com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper(iOContext18, byteArray30, 1, (int) (byte) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory17.createJsonParser(byteArray30);
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
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]");
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertNotNull(jsonParser40);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test583");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createParser(reader2);
        com.fasterxml.jackson.core.Version version4 = jsonParser3.version();
        int int6 = jsonParser3.getValueAsInt(0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = jsonParser3.getCodec();
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = jsonParser3.getCurrentLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = jsonParser3.getCurrentToken();
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(objectCodec7);
        org.junit.Assert.assertNotNull(jsonLocation8);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test584");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.append(' ');
        textBuffer1.resetWithString("hi!");
        char[] charArray6 = textBuffer1.expandCurrentSegment();
        textBuffer1.append(' ');
        char[] charArray9 = textBuffer1.contentsAsArray();
        int int10 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        char[] charArray12 = textBuffer1.expandCurrentSegment();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test585");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean19 = writerBasedJsonGenerator17.isEnabled(feature18);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes20 = writerBasedJsonGenerator17.getCharacterEscapes();
        com.fasterxml.jackson.core.util.DefaultPrettyPrinter defaultPrettyPrinter22 = new com.fasterxml.jackson.core.util.DefaultPrettyPrinter("hi!");
        com.fasterxml.jackson.core.SerializableString serializableString23 = defaultPrettyPrinter22._rootSeparator;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        char[] charArray26 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer25.resetWithShared(charArray26, 2000, 2000);
        int int31 = serializableString23.appendUnquoted(charArray26, 0);
        writerBasedJsonGenerator17.writeRaw(serializableString23);
        java.lang.Class<?> wildcardClass33 = serializableString23.getClass();
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature18.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(characterEscapes20);
        org.junit.Assert.assertNotNull(serializableString23);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test586");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.Version version18 = writerBasedJsonGenerator17.version();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.append(' ');
        int int23 = textBuffer20.size();
        writerBasedJsonGenerator17.writeObject((java.lang.Object) int23);
        java.math.BigInteger bigInteger25 = null;
        writerBasedJsonGenerator17.writeNumber(bigInteger25);
        writerBasedJsonGenerator17.writeRaw(' ');
        writerBasedJsonGenerator17.writeRaw('a');
        writerBasedJsonGenerator17.writeStartObject();
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(version18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test587");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str82 = uTF8StreamJsonParser78.getValueAsString("\n");
        int int84 = uTF8StreamJsonParser78.getValueAsInt((-1768327820));
        com.fasterxml.jackson.core.JsonParser jsonParser85 = uTF8StreamJsonParser78.skipChildren();
        com.fasterxml.jackson.core.ObjectCodec objectCodec86 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory87 = new com.fasterxml.jackson.core.JsonFactory(objectCodec86);
        java.io.Reader reader88 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser89 = jsonFactory87.createParser(reader88);
        boolean boolean90 = jsonParser89.requiresCustomCodec();
        java.lang.String str91 = jsonParser89.getText();
        int int93 = jsonParser89.nextIntValue(0);
        com.fasterxml.jackson.core.JsonLocation jsonLocation94 = jsonParser89.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParser.Feature feature95 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean96 = jsonParser89.isEnabled(feature95);
        boolean boolean97 = feature95.enabledByDefault();
        com.fasterxml.jackson.core.JsonParser jsonParser98 = uTF8StreamJsonParser78.enable(feature95);
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764488071) + "'", int71 == (-1764488071));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\n" + "'", str82, "\n");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1768327820) + "'", int84 == (-1768327820));
        org.junit.Assert.assertNotNull(jsonParser85);
        org.junit.Assert.assertNotNull(jsonParser89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(str91);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(jsonLocation94);
        org.junit.Assert.assertTrue("'" + feature95 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature95.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(jsonParser98);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test588");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonParser.Feature feature1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.disable(feature1);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createParser("");
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory5.disable(feature6);
        boolean boolean8 = jsonFactory2.isEnabled(feature6);
        boolean boolean9 = feature6.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature1 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature1.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test589");
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer0 = com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer.createRoot();
        int int1 = charsToNameCanonicalizer0.collisionCount();
        com.fasterxml.jackson.core.io.SerializedString serializedString3 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str4 = serializedString3.toString();
        char[] charArray5 = new char[] {};
        int int7 = serializedString3.appendQuoted(charArray5, (int) (byte) 10);
        java.lang.String str11 = charsToNameCanonicalizer0.findSymbol(charArray5, (-1764586087), (-1764612119), (-1764617075));
        int int12 = charsToNameCanonicalizer0.collisionCount();
        charsToNameCanonicalizer0.release();
        boolean boolean14 = charsToNameCanonicalizer0.maybeDirty();
        int int16 = charsToNameCanonicalizer0._hashToIndex((-1));
        org.junit.Assert.assertNotNull(charsToNameCanonicalizer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 62 + "'", int16 == 62);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test590");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createJsonParser(inputStream2);
        java.lang.Object obj4 = jsonParser3.getEmbeddedObject();
        int int5 = jsonParser3.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        jsonParser3.setCodec(objectCodec6);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test591");
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
        java.lang.String str71 = serializableString69.getValue();
        char[] charArray72 = serializableString69.asQuotedChars();
        java.lang.String str73 = serializableString69.getValue();
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
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[h, i, !]");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test592");
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
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator writerBasedJsonGenerator17 = new com.fasterxml.jackson.core.json.WriterBasedJsonGenerator(iOContext3, (-1764719943), objectCodec7, (java.io.Writer) uTF8Writer13);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature18 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT;
        boolean boolean19 = writerBasedJsonGenerator17.isEnabled(feature18);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes20 = writerBasedJsonGenerator17.getCharacterEscapes();
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = writerBasedJsonGenerator17.getCodec();
        com.fasterxml.jackson.core.io.SerializedString serializedString23 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        java.lang.String str24 = serializedString23.toString();
        char[] charArray25 = new char[] {};
        int int27 = serializedString23.appendQuoted(charArray25, (int) (byte) 10);
        int int28 = serializedString23.charLength();
        int int29 = serializedString23.charLength();
        int int30 = serializedString23.charLength();
        java.lang.String str31 = serializedString23.toString();
        writerBasedJsonGenerator17.writeRaw((com.fasterxml.jackson.core.SerializableString) serializedString23);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = writerBasedJsonGenerator17.useDefaultPrettyPrinter();
        java.math.BigDecimal bigDecimal34 = null;
        writerBasedJsonGenerator17.writeNumber(bigDecimal34);
        boolean boolean36 = writerBasedJsonGenerator17.isClosed();
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT + "'", feature18.equals(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(characterEscapes20);
        org.junit.Assert.assertNull(objectCodec21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n" + "'", str31, "\n");
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test593");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = new com.fasterxml.jackson.core.util.BufferRecycler();
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) -1, true);
        java.io.OutputStream outputStream4 = null;
        com.fasterxml.jackson.core.io.UTF8Writer uTF8Writer5 = new com.fasterxml.jackson.core.io.UTF8Writer(iOContext3, outputStream4);
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
        long long68 = mergedStream66.skip((long) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer70 = com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer.createRoot();
        int int71 = bytesToNameCanonicalizer70.hashSeed();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = new com.fasterxml.jackson.core.io.SerializedString("\n");
        byte[] byteArray74 = serializedString73.asQuotedUTF8();
        com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser78 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext3, (int) (short) 10, (java.io.InputStream) mergedStream66, objectCodec69, bytesToNameCanonicalizer70, byteArray74, 10, (int) (short) 100, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        uTF8StreamJsonParser78.setCodec(objectCodec79);
        java.lang.String str82 = uTF8StreamJsonParser78.getValueAsString("\n");
        long long83 = uTF8StreamJsonParser78.getTokenCharacterOffset();
        com.fasterxml.jackson.core.JsonLocation jsonLocation84 = uTF8StreamJsonParser78.getCurrentLocation();
        int int85 = uTF8StreamJsonParser78.getTextLength();
        com.fasterxml.jackson.core.JsonLocation jsonLocation86 = uTF8StreamJsonParser78.getCurrentLocation();
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
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertNotNull(bytesToNameCanonicalizer70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1764485209) + "'", int71 == (-1764485209));
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[92, 110]");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "\n" + "'", str82, "\n");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(jsonLocation84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(jsonLocation86);
    }
}
