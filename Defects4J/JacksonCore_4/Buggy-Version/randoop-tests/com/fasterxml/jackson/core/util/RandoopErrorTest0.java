package com.fasterxml.jackson.core.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test01");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setRootValueSeparator("true");
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory8.setRootValueSeparator("hi!");
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory8.createJsonParser(byteArray11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createJsonParser(byteArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Boolean boolean14 = jsonParser13.nextBooleanValue();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test02");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        double double9 = jsonParser6.getValueAsDouble();
        int int11 = jsonParser6.nextIntValue(0);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = jsonParser6.getLastClearedToken();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Boolean boolean13 = jsonParser6.nextBooleanValue();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test03");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        char[] charArray4 = textBuffer3.finishCurrentSegment();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test04");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = jsonParser6.nextValue();
        java.lang.String str13 = jsonParser6.getValueAsString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Boolean boolean14 = jsonParser6.nextBooleanValue();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test05");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray5 = bufferRecycler2.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray8 = new char[] { ' ' };
        bufferRecycler2.releaseCharBuffer(0, charArray8);
        char[] charArray12 = bufferRecycler2.allocCharBuffer(0, (int) ' ');
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        int int14 = textBuffer13.size();
        boolean boolean15 = textBuffer13.hasTextAsCharacters();
        textBuffer13.resetWithString("}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        char[] charArray18 = textBuffer13.finishCurrentSegment();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test06");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler(0, 0);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        char[] charArray5 = textBuffer3.expandCurrentSegment((int) (byte) 100);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test07");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        boolean boolean13 = jsonParser6.isExpectedStartArrayToken();
        java.lang.Object obj14 = jsonParser6.getTypeId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Boolean boolean15 = jsonParser6.nextBooleanValue();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test08");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        int int4 = textBuffer3.getCurrentSegmentSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        char[] charArray5 = textBuffer3.finishCurrentSegment();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test09");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray5 = bufferRecycler2.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray8 = new char[] { ' ' };
        bufferRecycler2.releaseCharBuffer(0, charArray8);
        char[] charArray12 = bufferRecycler2.allocCharBuffer(0, (int) ' ');
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        int int14 = textBuffer13.size();
        textBuffer13.resetWithString("false");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        char[] charArray17 = textBuffer13.finishCurrentSegment();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test10");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Boolean boolean11 = jsonParser6.nextBooleanValue();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test11");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        int int4 = textBuffer3.getCurrentSegmentSize();
        textBuffer3.resetWithEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        char[] charArray6 = textBuffer3.expandCurrentSegment();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test12");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray3 = bufferRecycler2._byteBuffers;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        char[] charArray6 = textBuffer4.expandCurrentSegment((int) (byte) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test13");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray5 = bufferRecycler2.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray8 = new char[] { ' ' };
        bufferRecycler2.releaseCharBuffer(0, charArray8);
        char[] charArray12 = bufferRecycler2.allocCharBuffer(0, (int) ' ');
        char[] charArray14 = bufferRecycler2.allocCharBuffer((int) (byte) 0);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        textBuffer15.resetWithString("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        char[] charArray18 = textBuffer15.finishCurrentSegment();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test14");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        char[] charArray5 = textBuffer4.finishCurrentSegment();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test15");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = jsonParser6.getCodec();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        java.lang.Boolean boolean12 = jsonParser6.nextBooleanValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Boolean boolean13 = jsonParser6.nextBooleanValue();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test16");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        boolean boolean13 = jsonParser6.isExpectedStartArrayToken();
        boolean boolean14 = jsonParser6.getValueAsBoolean();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = jsonParser6.nextValue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Boolean boolean16 = jsonParser6.nextBooleanValue();
    }
}

