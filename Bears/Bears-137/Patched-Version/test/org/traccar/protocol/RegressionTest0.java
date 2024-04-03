package org.traccar.protocol;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = org.jboss.netty.handler.codec.frame.FrameDecoder.DEFAULT_MAX_COMPOSITEBUFFER_COMPONENTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelBound(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 1 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext1, writeCompletionEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        int int3 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext1, channelStateEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext7, exceptionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        Class<?> wildcardClass5 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        TotemFrameDecoder totemFrameDecoder4 = new TotemFrameDecoder();
        totemFrameDecoder4.setMaxCumulationBufferCapacity((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.MessageEvent messageEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext3, messageEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        int int3 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext4, channelEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext3, channelEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        TotemFrameDecoder totemFrameDecoder4 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder4.afterRemove(channelHandlerContext5);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext9, exceptionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext3, exceptionEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        int int3 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.setMaxCumulationBufferComponents((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 1 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        Class<?> wildcardClass1 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        TotemFrameDecoder totemFrameDecoder13 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder13.afterRemove(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder13.afterAdd(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        totemFrameDecoder13.afterAdd(channelHandlerContext18);
        boolean boolean20 = totemFrameDecoder13.isUnfold();
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("hi!", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext3, childChannelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferComponents(1024);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        TotemFrameDecoder totemFrameDecoder8 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder8.afterRemove(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder8.afterAdd(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        totemFrameDecoder8.beforeRemove(channelHandlerContext13);
        totemFrameDecoder8.setMaxCumulationBufferComponents((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("hi!", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelBound(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext5, childChannelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext7);
        TotemFrameDecoder totemFrameDecoder10 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder10.afterAdd(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        totemFrameDecoder10.afterAdd(channelHandlerContext13);
        int int15 = totemFrameDecoder10.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder10.beforeRemove(channelHandlerContext16);
        totemFrameDecoder10.setUnfold(false);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("hi!", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1024 + "'", int15 == 1024);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext3, childChannelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext11, exceptionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext5, childChannelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferComponents(1024);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext5, writeCompletionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext5, channelEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelBound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelBound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.MessageEvent messageEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext11, messageEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 100);
        TotemFrameDecoder totemFrameDecoder12 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        totemFrameDecoder12.afterRemove(channelHandlerContext13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        totemFrameDecoder12.afterAdd(channelHandlerContext15);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        int int3 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) 'a');
        Class<?> wildcardClass11 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.MessageEvent messageEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext7, messageEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.MessageEvent messageEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext13, messageEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity(100);
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext9, writeCompletionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        Class<?> wildcardClass5 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandler channelHandler6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("hi!", channelHandler6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        Class<?> wildcardClass3 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext6);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext3);
        TotemFrameDecoder totemFrameDecoder6 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder6.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder6.afterAdd(channelHandlerContext9);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferComponents(1024);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext11);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferCapacity must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        Class<?> wildcardClass7 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        Class<?> wildcardClass9 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext7, writeCompletionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext5, exceptionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext5, childChannelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity(100);
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        Class<?> wildcardClass7 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        int int3 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        org.jboss.netty.channel.MessageEvent messageEvent2 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext1, messageEvent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        Class<?> wildcardClass8 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) 'a');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelBound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext12);
        TotemFrameDecoder totemFrameDecoder15 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder15.afterRemove(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        totemFrameDecoder15.afterAdd(channelHandlerContext18);
        boolean boolean20 = totemFrameDecoder15.isUnfold();
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext9, exceptionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        TotemFrameDecoder totemFrameDecoder13 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder13.afterRemove(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder13.afterAdd(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        totemFrameDecoder13.beforeRemove(channelHandlerContext18);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        totemFrameDecoder13.beforeRemove(channelHandlerContext20);
        int int22 = totemFrameDecoder13.getMaxCumulationBufferCapacity();
        totemFrameDecoder13.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        totemFrameDecoder13.beforeRemove(channelHandlerContext25);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("hi!", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (short) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext7, exceptionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext14, exceptionEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext12, writeCompletionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferComponents(1024);
        Class<?> wildcardClass11 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferComponents(1024);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 10);
        Class<?> wildcardClass9 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        boolean boolean13 = totemFrameDecoder0.isUnfold();
        TotemFrameDecoder totemFrameDecoder15 = new TotemFrameDecoder();
        totemFrameDecoder15.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        totemFrameDecoder15.beforeRemove(channelHandlerContext18);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("hi!", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        boolean boolean13 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        int int3 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext9, writeCompletionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        int int3 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext4, channelEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferComponents(1024);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) '#');
        int int7 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelBound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext10, writeCompletionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1024 + "'", int9 == 1024);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext7);
        Class<?> wildcardClass9 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 100);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext14, childChannelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext15);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext3);
        TotemFrameDecoder totemFrameDecoder6 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder6.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder6.afterAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder6.afterAdd(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        totemFrameDecoder6.beforeRemove(channelHandlerContext13);
        totemFrameDecoder6.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        totemFrameDecoder6.afterAdd(channelHandlerContext17);
        totemFrameDecoder6.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        totemFrameDecoder6.afterRemove(channelHandlerContext21);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("hi!", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.MessageEvent messageEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext10, messageEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1024 + "'", int9 == 1024);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.MessageEvent messageEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext6, messageEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        boolean boolean11 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext14, writeCompletionEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        TotemFrameDecoder totemFrameDecoder10 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder10.afterRemove(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        totemFrameDecoder10.afterAdd(channelHandlerContext13);
        boolean boolean15 = totemFrameDecoder10.isUnfold();
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext18, channelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext6);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelBound(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.MessageEvent messageEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext8, messageEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.setMaxCumulationBufferComponents((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 1 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        int int7 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext8, exceptionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        boolean boolean11 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext12, exceptionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        int int7 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferCapacity(10);
        TotemFrameDecoder totemFrameDecoder18 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        totemFrameDecoder18.afterAdd(channelHandlerContext19);
        totemFrameDecoder18.setUnfold(false);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext3, exceptionEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) ' ');
        TotemFrameDecoder totemFrameDecoder12 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        totemFrameDecoder12.afterRemove(channelHandlerContext13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        totemFrameDecoder12.afterAdd(channelHandlerContext15);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        totemFrameDecoder12.afterAdd(channelHandlerContext17);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        totemFrameDecoder12.beforeRemove(channelHandlerContext19);
        totemFrameDecoder12.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        totemFrameDecoder12.afterAdd(channelHandlerContext23);
        totemFrameDecoder12.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext27 = null;
        totemFrameDecoder12.afterRemove(channelHandlerContext27);
        totemFrameDecoder12.setMaxCumulationBufferCapacity((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1024 + "'", int8 == 1024);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        boolean boolean9 = totemFrameDecoder0.isUnfold();
        Class<?> wildcardClass10 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferComponents(1024);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext11);
        int int13 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        Class<?> wildcardClass14 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext7);
        Class<?> wildcardClass9 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.MessageEvent messageEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext3, messageEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        int int7 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.MessageEvent messageEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext8, messageEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        boolean boolean13 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext18, channelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext7, exceptionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1024 + "'", int8 == 1024);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) '#');
        int int7 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        totemFrameDecoder0.setUnfold(false);
        boolean boolean8 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext7);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 0 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        boolean boolean9 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext10, writeCompletionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) '4');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        boolean boolean13 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext16, writeCompletionEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        boolean boolean13 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext16);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (short) 10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        boolean boolean9 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        boolean boolean11 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferCapacity must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        boolean boolean13 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext18);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext5, exceptionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) ' ');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext11, exceptionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext6);
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.setMaxCumulationBufferComponents(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 1 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.setMaxCumulationBufferComponents(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 0 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext7, exceptionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferComponents(1024);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext11);
        int int13 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity(0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext6, writeCompletionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        int int1 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext2, childChannelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1024 + "'", int8 == 1024);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        int int12 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext13, channelEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1024 + "'", int12 == 1024);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        int int12 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.MessageEvent messageEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext13, messageEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1024 + "'", int12 == 1024);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext5, channelEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        boolean boolean11 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        int int16 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        int int17 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext18);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext20, childChannelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1024 + "'", int16 == 1024);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1024 + "'", int17 == 1024);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        boolean boolean11 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        boolean boolean8 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 100);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        int int16 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        int int17 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext18, writeCompletionEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1024 + "'", int16 == 1024);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1024 + "'", int17 == 1024);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        boolean boolean11 = totemFrameDecoder0.isUnfold();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelBound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        int int13 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        TotemFrameDecoder totemFrameDecoder15 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder15.afterRemove(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        totemFrameDecoder15.afterAdd(channelHandlerContext18);
        totemFrameDecoder15.setMaxCumulationBufferComponents((int) '#');
        int int22 = totemFrameDecoder15.getMaxCumulationBufferCapacity();
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1024 + "'", int13 == 1024);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        int int7 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) 'a');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext6);
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext6);
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        Class<?> wildcardClass9 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext13);
        Class<?> wildcardClass15 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext5, channelEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        int int7 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext8, writeCompletionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferCapacity(10);
        boolean boolean17 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext18);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext15);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelBound(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        int int12 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        totemFrameDecoder0.setMaxCumulationBufferCapacity(1024);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1024 + "'", int12 == 1024);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        int int16 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        int int17 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        int int18 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        boolean boolean19 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext20, childChannelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1024 + "'", int16 == 1024);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1024 + "'", int17 == 1024);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1024 + "'", int18 == 1024);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.MessageEvent messageEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext12, messageEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 100);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        int int3 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext4);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext3);
        Class<?> wildcardClass5 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        int int16 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        TotemFrameDecoder totemFrameDecoder18 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        totemFrameDecoder18.afterRemove(channelHandlerContext19);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        totemFrameDecoder18.afterAdd(channelHandlerContext21);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        totemFrameDecoder18.afterAdd(channelHandlerContext23);
        totemFrameDecoder18.setMaxCumulationBufferCapacity((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1024 + "'", int16 == 1024);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        Class<?> wildcardClass8 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferCapacity(10);
        boolean boolean17 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.setMaxCumulationBufferComponents(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 1 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setUnfold(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        Class<?> wildcardClass11 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext3);
        totemFrameDecoder0.setUnfold(false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 100);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) '#');
        int int7 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) 'a');
        TotemFrameDecoder totemFrameDecoder9 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        totemFrameDecoder9.afterRemove(channelHandlerContext10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder9.afterAdd(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder9.afterAdd(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder9.beforeRemove(channelHandlerContext16);
        totemFrameDecoder9.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        totemFrameDecoder9.afterAdd(channelHandlerContext20);
        boolean boolean22 = totemFrameDecoder9.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        totemFrameDecoder9.afterRemove(channelHandlerContext23);
        boolean boolean25 = totemFrameDecoder9.isUnfold();
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext6);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext10);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext6);
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelBound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        int int7 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        boolean boolean9 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext10);
        totemFrameDecoder0.setUnfold(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext14, channelEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext6);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext8, exceptionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        boolean boolean13 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext16);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (short) 10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext20, childChannelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext7, channelEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext12);
        boolean boolean14 = totemFrameDecoder0.isUnfold();
        Class<?> wildcardClass15 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        TotemFrameDecoder totemFrameDecoder6 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder6.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder6.afterAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder6.beforeRemove(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        totemFrameDecoder6.beforeRemove(channelHandlerContext13);
        int int15 = totemFrameDecoder6.getMaxCumulationBufferCapacity();
        totemFrameDecoder6.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        totemFrameDecoder6.afterRemove(channelHandlerContext18);
        totemFrameDecoder6.setMaxCumulationBufferCapacity((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext6);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelBound(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 100);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext18, writeCompletionEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 100);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext12);
        TotemFrameDecoder totemFrameDecoder15 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder15.afterRemove(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        totemFrameDecoder15.afterAdd(channelHandlerContext18);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        totemFrameDecoder15.beforeRemove(channelHandlerContext20);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        totemFrameDecoder15.beforeRemove(channelHandlerContext22);
        int int24 = totemFrameDecoder15.getMaxCumulationBufferCapacity();
        totemFrameDecoder15.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext27 = null;
        totemFrameDecoder15.afterRemove(channelHandlerContext27);
        totemFrameDecoder15.setMaxCumulationBufferCapacity((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("hi!", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext5, childChannelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity(100);
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setUnfold(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        int int3 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext6);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        boolean boolean13 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext14, childChannelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        int int1 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext2, channelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity(100);
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelOpen(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        int int7 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext6);
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext9);
        TotemFrameDecoder totemFrameDecoder12 = new TotemFrameDecoder();
        totemFrameDecoder12.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        totemFrameDecoder12.afterRemove(channelHandlerContext15);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        totemFrameDecoder12.beforeRemove(channelHandlerContext17);
        boolean boolean19 = totemFrameDecoder12.isUnfold();
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("hi!", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext9, exceptionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        boolean boolean13 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext18);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext20, writeCompletionEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext15, writeCompletionEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext7);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.MessageEvent messageEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext12, messageEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) 'a');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (short) 100);
        TotemFrameDecoder totemFrameDecoder10 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder10.afterRemove(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        totemFrameDecoder10.afterAdd(channelHandlerContext13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        totemFrameDecoder10.beforeRemove(channelHandlerContext15);
        int int17 = totemFrameDecoder10.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        totemFrameDecoder10.beforeRemove(channelHandlerContext18);
        boolean boolean20 = totemFrameDecoder10.isUnfold();
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        int int12 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1024 + "'", int12 == 1024);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        TotemFrameDecoder totemFrameDecoder6 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder6.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder6.afterAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder6.afterAdd(channelHandlerContext11);
        boolean boolean13 = totemFrameDecoder6.isUnfold();
        int int14 = totemFrameDecoder6.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        totemFrameDecoder6.beforeRemove(channelHandlerContext15);
        boolean boolean17 = totemFrameDecoder6.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        totemFrameDecoder6.afterRemove(channelHandlerContext18);
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 100);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext12);
        boolean boolean14 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.writeComplete(channelHandlerContext17, writeCompletionEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) 'a');
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext10, channelEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext11);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext9);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelBound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1024 + "'", int9 == 1024);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext16, childChannelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext14);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        boolean boolean13 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext16);
        int int18 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext19);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext15);
        int int17 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        boolean boolean18 = totemFrameDecoder0.isUnfold();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1024 + "'", int17 == 1024);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelBound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        boolean boolean10 = totemFrameDecoder0.isUnfold();
        TotemFrameDecoder totemFrameDecoder12 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        totemFrameDecoder12.afterRemove(channelHandlerContext13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        totemFrameDecoder12.afterAdd(channelHandlerContext15);
        boolean boolean17 = totemFrameDecoder12.isUnfold();
        int int18 = totemFrameDecoder12.getMaxCumulationBufferCapacity();
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1024 + "'", int9 == 1024);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        boolean boolean11 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext11);
        TotemFrameDecoder totemFrameDecoder14 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        totemFrameDecoder14.afterAdd(channelHandlerContext15);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        totemFrameDecoder14.afterAdd(channelHandlerContext17);
        int int19 = totemFrameDecoder14.getMaxCumulationBufferComponents();
        totemFrameDecoder14.setUnfold(false);
        boolean boolean22 = totemFrameDecoder14.isUnfold();
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("hi!", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1024 + "'", int19 == 1024);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity(100);
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext13, exceptionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        int int7 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) 'a');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.handleUpstream(channelHandlerContext10, channelEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity(100);
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (short) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext9);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext9);
        boolean boolean11 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext6);
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        int int7 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        boolean boolean11 = totemFrameDecoder0.isUnfold();
        int int12 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1024 + "'", int12 == 1024);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext9);
        boolean boolean11 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.exceptionCaught(channelHandlerContext14, exceptionEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 10);
        boolean boolean9 = totemFrameDecoder0.isUnfold();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext15);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setUnfold(false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) 'a');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext8);
        totemFrameDecoder0.setUnfold(true);
        totemFrameDecoder0.setUnfold(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1024 + "'", int8 == 1024);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext8);
        totemFrameDecoder0.setUnfold(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        int int3 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1024 + "'", int3 == 1024);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext9);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext5);
        TotemFrameDecoder totemFrameDecoder8 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder8.afterRemove(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder8.afterAdd(channelHandlerContext11);
        boolean boolean13 = totemFrameDecoder8.isUnfold();
        int int14 = totemFrameDecoder8.getMaxCumulationBufferCapacity();
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.replace("", (org.jboss.netty.channel.ChannelHandler) totemFrameDecoder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        totemFrameDecoder0.setUnfold(true);
        Class<?> wildcardClass9 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) ' ');
        totemFrameDecoder0.setMaxCumulationBufferComponents(100);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext11);
        totemFrameDecoder0.setMaxCumulationBufferComponents(1024);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        boolean boolean13 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext16);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (short) 10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelDisconnected(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext9);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        Class<?> wildcardClass12 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        int int5 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelClosed(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        int int7 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferComponents((int) (short) 100);
        int int11 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext14);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.childChannelOpen(channelHandlerContext16, childChannelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        int int7 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        totemFrameDecoder0.setUnfold(false);
        totemFrameDecoder0.setMaxCumulationBufferCapacity(10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelInterestChanged(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelBound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelClosed(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        int int3 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.MessageEvent messageEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.messageReceived(channelHandlerContext4, messageEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        int int9 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (byte) 100);
        int int16 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        int int17 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        int int18 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelUnbound(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1024 + "'", int16 == 1024);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1024 + "'", int17 == 1024);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1024 + "'", int18 == 1024);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setMaxCumulationBufferComponents(1024);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext11);
        boolean boolean13 = totemFrameDecoder0.isUnfold();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext11);
        totemFrameDecoder0.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext15);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            totemFrameDecoder0.channelConnected(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        int int1 = totemFrameDecoder0.getMaxCumulationBufferComponents();
        totemFrameDecoder0.setMaxCumulationBufferCapacity((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext3);
        totemFrameDecoder0.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext7);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext5);
        boolean boolean7 = totemFrameDecoder0.isUnfold();
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext9);
        boolean boolean11 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext12);
        boolean boolean14 = totemFrameDecoder0.isUnfold();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        totemFrameDecoder0.setMaxCumulationBufferCapacity(100);
        int int8 = totemFrameDecoder0.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.beforeAdd(channelHandlerContext9);
        Class<?> wildcardClass11 = totemFrameDecoder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        TotemFrameDecoder totemFrameDecoder0 = new TotemFrameDecoder();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext1 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        totemFrameDecoder0.afterAdd(channelHandlerContext3);
        boolean boolean5 = totemFrameDecoder0.isUnfold();
        boolean boolean6 = totemFrameDecoder0.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        totemFrameDecoder0.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        totemFrameDecoder0.afterRemove(channelHandlerContext9);
        boolean boolean11 = totemFrameDecoder0.isUnfold();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}

