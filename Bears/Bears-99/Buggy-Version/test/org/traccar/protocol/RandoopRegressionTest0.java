package org.traccar.protocol;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

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
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        H02FrameDecoder h02FrameDecoder4 = new H02FrameDecoder(100);
        int int5 = h02FrameDecoder4.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        h02FrameDecoder4.beforeRemove(channelHandlerContext6);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.setMaxCumulationBufferComponents((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 0 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext5, exceptionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext5);
        H02FrameDecoder h02FrameDecoder9 = new H02FrameDecoder(100);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("hi!", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.setMaxCumulationBufferComponents((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 0 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext5, exceptionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext5, exceptionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.setMaxCumulationBufferCapacity((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferCapacity must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext3);
        Class<?> wildcardClass5 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext3, channelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        H02FrameDecoder h02FrameDecoder4 = new H02FrameDecoder(100);
        int int5 = h02FrameDecoder4.getMaxCumulationBufferCapacity();
        h02FrameDecoder4.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder4.afterRemove(channelHandlerContext8);
        int int10 = h02FrameDecoder4.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder4.afterAdd(channelHandlerContext11);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("hi!", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelBound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1024 + "'", int10 == 1024);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.MessageEvent messageEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext2, messageEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        Class<?> wildcardClass3 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        Class<?> wildcardClass4 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext3, exceptionEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        H02FrameDecoder h02FrameDecoder9 = new H02FrameDecoder(100);
        int int10 = h02FrameDecoder9.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder9.beforeRemove(channelHandlerContext11);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1024 + "'", int10 == 1024);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        int int4 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext5, exceptionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext2, channelEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext2, channelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.MessageEvent messageEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext11, messageEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1024 + "'", int10 == 1024);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelBound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.MessageEvent messageEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext3, messageEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext9, exceptionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext2, childChannelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 0);
        H02FrameDecoder h02FrameDecoder11 = new H02FrameDecoder((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 0);
        Class<?> wildcardClass9 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.MessageEvent messageEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext4, messageEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext2, channelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelBound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext2, channelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(1);
        Class<?> wildcardClass2 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext7, channelEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1);
        int int15 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1);
        int int15 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext16, channelEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.MessageEvent messageEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext8, messageEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        boolean boolean7 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext8, exceptionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelBound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1);
        int int15 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        Class<?> wildcardClass16 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext3);
        H02FrameDecoder h02FrameDecoder7 = new H02FrameDecoder((int) (byte) -1);
        int int8 = h02FrameDecoder7.getMaxCumulationBufferCapacity();
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("hi!", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        Class<?> wildcardClass2 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext2, channelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelBound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        H02FrameDecoder h02FrameDecoder7 = new H02FrameDecoder(100);
        int int8 = h02FrameDecoder7.getMaxCumulationBufferCapacity();
        h02FrameDecoder7.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder7.afterRemove(channelHandlerContext11);
        int int13 = h02FrameDecoder7.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        h02FrameDecoder7.afterAdd(channelHandlerContext14);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("hi!", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext3);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.setMaxCumulationBufferCapacity((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferCapacity must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.setMaxCumulationBufferCapacity((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferCapacity must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext3, childChannelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        Class<?> wildcardClass7 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        int int4 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext2, exceptionEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.MessageEvent messageEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext2, messageEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext4, exceptionEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext7, exceptionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext5, channelEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext10, writeCompletionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        boolean boolean8 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 100);
        boolean boolean2 = h02FrameDecoder1.isUnfold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.MessageEvent messageEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext7, messageEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext9);
        int int11 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext11, channelEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        Class<?> wildcardClass2 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        int int4 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext11, writeCompletionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext11, channelEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1024 + "'", int10 == 1024);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        boolean boolean11 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext9);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        int int4 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1024 + "'", int4 == 1024);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext4);
        Class<?> wildcardClass6 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        Class<?> wildcardClass11 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1024 + "'", int10 == 1024);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext7, exceptionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 1);
        Class<?> wildcardClass8 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        int int13 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext14, exceptionEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext4, exceptionEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        boolean boolean8 = h02FrameDecoder1.isUnfold();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelBound(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.MessageEvent messageEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext10, messageEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        h02FrameDecoder1.setUnfold(true);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferCapacity must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext3, channelEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext6);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext8, writeCompletionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelBound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        H02FrameDecoder h02FrameDecoder7 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder7.beforeRemove(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        h02FrameDecoder7.afterAdd(channelHandlerContext10);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("hi!", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext2, channelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandler channelHandler10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("", channelHandler10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 100);
        Class<?> wildcardClass2 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext10, exceptionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 0);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        Class<?> wildcardClass2 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext9);
        int int11 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        Class<?> wildcardClass5 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        h02FrameDecoder1.setMaxCumulationBufferComponents((int) (short) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext9, writeCompletionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        Class<?> wildcardClass5 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        h02FrameDecoder1.setUnfold(false);
        int int4 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext5, childChannelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.MessageEvent messageEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext11, messageEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext9);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        h02FrameDecoder1.setMaxCumulationBufferComponents((int) (short) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(10);
        h02FrameDecoder1.setMaxCumulationBufferComponents(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        h02FrameDecoder1.setMaxCumulationBufferComponents((int) (short) 100);
        Class<?> wildcardClass9 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext8, channelEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext5, channelEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext3);
        int int5 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext2, channelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int3 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.MessageEvent messageEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext11, messageEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        H02FrameDecoder h02FrameDecoder5 = new H02FrameDecoder((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        int int4 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext5, writeCompletionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext2, childChannelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        boolean boolean7 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext8, channelEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext8);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext10, channelEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(10);
        h02FrameDecoder1.setMaxCumulationBufferComponents(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.MessageEvent messageEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext4, messageEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext8);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.setMaxCumulationBufferComponents(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 1 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        Class<?> wildcardClass11 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.setMaxCumulationBufferComponents(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 1 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(10);
        h02FrameDecoder1.setMaxCumulationBufferComponents(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(1);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.setMaxCumulationBufferComponents((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 1 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext3);
        int int5 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext13, exceptionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        Class<?> wildcardClass8 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext15);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelBound(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        boolean boolean11 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext12);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext4, exceptionEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext8);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (byte) 10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.MessageEvent messageEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext3, messageEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        h02FrameDecoder1.setMaxCumulationBufferComponents((int) (short) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext13, channelEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(10);
        h02FrameDecoder1.setMaxCumulationBufferComponents(100);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.setMaxCumulationBufferComponents((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 0 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelBound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        H02FrameDecoder h02FrameDecoder5 = new H02FrameDecoder((int) (byte) -1);
        int int6 = h02FrameDecoder5.getMaxCumulationBufferCapacity();
        int int7 = h02FrameDecoder5.getMaxCumulationBufferCapacity();
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext2, writeCompletionEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext2, channelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext9, exceptionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext3, writeCompletionEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        boolean boolean11 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext3, childChannelStateEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext6);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext2, exceptionEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int3 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1024 + "'", int3 == 1024);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        int int11 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        boolean boolean8 = h02FrameDecoder1.isUnfold();
        h02FrameDecoder1.setUnfold(true);
        int int11 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1024 + "'", int11 == 1024);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext6);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 0);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (byte) 0);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        int int13 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) '#');
        Class<?> wildcardClass2 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        int int11 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(1);
        h02FrameDecoder1.setUnfold(true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext11, writeCompletionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1024 + "'", int10 == 1024);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) 10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext2, exceptionEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferCapacity must be >= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext9, exceptionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.MessageEvent messageEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext10, messageEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext3);
        int int5 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext2);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        Class<?> wildcardClass5 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext2, channelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext7, channelEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext4);
        H02FrameDecoder h02FrameDecoder8 = new H02FrameDecoder(100);
        h02FrameDecoder8.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder8.setUnfold(true);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("hi!", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(1);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) ' ');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        boolean boolean7 = h02FrameDecoder1.isUnfold();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        Class<?> wildcardClass9 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1024 + "'", int8 == 1024);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext6);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext2, channelEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1);
        Class<?> wildcardClass7 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) ' ');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext2, channelEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(1);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) ' ');
        h02FrameDecoder1.setMaxCumulationBufferComponents(100);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.setMaxCumulationBufferComponents((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: -1 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext2, childChannelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        Class<?> wildcardClass10 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1);
        int int15 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext18, exceptionEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext11, writeCompletionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        boolean boolean11 = h02FrameDecoder1.isUnfold();
        boolean boolean12 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext13, channelEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(1);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) ' ');
        h02FrameDecoder1.setMaxCumulationBufferComponents(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext7);
        int int9 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1024 + "'", int9 == 1024);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext6);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        boolean boolean10 = h02FrameDecoder1.isUnfold();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        h02FrameDecoder1.setMaxCumulationBufferComponents((int) (byte) 100);
        H02FrameDecoder h02FrameDecoder17 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        h02FrameDecoder17.beforeRemove(channelHandlerContext18);
        int int20 = h02FrameDecoder17.getMaxCumulationBufferCapacity();
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("hi!", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(1);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) ' ');
        h02FrameDecoder1.setMaxCumulationBufferComponents(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext6);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext11);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.MessageEvent messageEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext13, messageEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext6);
        Class<?> wildcardClass8 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int3 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1024 + "'", int3 == 1024);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext3);
        int int5 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (byte) 100);
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext7, writeCompletionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        h02FrameDecoder1.setMaxCumulationBufferComponents((int) (byte) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1);
        int int15 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(100);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        h02FrameDecoder1.setUnfold(false);
        H02FrameDecoder h02FrameDecoder6 = new H02FrameDecoder((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext2, channelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelBound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext4, channelEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext11, channelEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        h02FrameDecoder1.setUnfold(false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        boolean boolean8 = h02FrameDecoder1.isUnfold();
        h02FrameDecoder1.setUnfold(true);
        int int11 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelDisconnected(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1024 + "'", int11 == 1024);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext4);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        boolean boolean3 = h02FrameDecoder1.isUnfold();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext10);
        int int12 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1024 + "'", int12 == 1024);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(10);
        H02FrameDecoder h02FrameDecoder11 = new H02FrameDecoder(100);
        int int12 = h02FrameDecoder11.getMaxCumulationBufferCapacity();
        h02FrameDecoder11.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        h02FrameDecoder11.afterRemove(channelHandlerContext15);
        int int17 = h02FrameDecoder11.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        h02FrameDecoder11.afterAdd(channelHandlerContext18);
        int int20 = h02FrameDecoder11.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        h02FrameDecoder11.beforeRemove(channelHandlerContext21);
        int int23 = h02FrameDecoder11.getMaxCumulationBufferCapacity();
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext12);
        int int14 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1024 + "'", int14 == 1024);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext4, channelEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext7);
        h02FrameDecoder1.setMaxCumulationBufferComponents((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        h02FrameDecoder1.setUnfold(false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        boolean boolean9 = h02FrameDecoder1.isUnfold();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext8);
        boolean boolean10 = h02FrameDecoder1.isUnfold();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setMaxCumulationBufferComponents(10);
        h02FrameDecoder1.setUnfold(true);
        Class<?> wildcardClass7 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext8);
        boolean boolean10 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext8);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        int int6 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1024 + "'", int6 == 1024);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int3 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.MessageEvent messageEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext4, messageEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1024 + "'", int3 == 1024);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext6);
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext9, writeCompletionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext6);
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext9, writeCompletionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int3 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        h02FrameDecoder1.setUnfold(false);
        int int4 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.exceptionCaught(channelHandlerContext5, exceptionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        int int4 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        int int4 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setMaxCumulationBufferComponents(10);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext7, writeCompletionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext3);
        int int5 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (byte) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        h02FrameDecoder1.setMaxCumulationBufferComponents((int) (byte) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext15);
        Class<?> wildcardClass17 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        h02FrameDecoder1.setUnfold(false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((-1));
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext2, channelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext4);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) 'a');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(1);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) ' ');
        h02FrameDecoder1.setMaxCumulationBufferComponents(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (byte) 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        boolean boolean11 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        int int13 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelBound(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1024 + "'", int13 == 1024);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        h02FrameDecoder1.setUnfold(true);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) '4');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext13);
        h02FrameDecoder1.setMaxCumulationBufferComponents((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext2);
        boolean boolean4 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext5, writeCompletionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((-1));
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelBound(channelHandlerContext2, channelStateEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        Class<?> wildcardClass13 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        h02FrameDecoder1.setUnfold(false);
        int int4 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext4);
        h02FrameDecoder1.setUnfold(false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext5, childChannelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(10);
        h02FrameDecoder1.setMaxCumulationBufferComponents(100);
        H02FrameDecoder h02FrameDecoder6 = new H02FrameDecoder(1);
        h02FrameDecoder6.setMaxCumulationBufferCapacity((int) ' ');
        h02FrameDecoder6.setMaxCumulationBufferComponents(100);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(10);
        Class<?> wildcardClass9 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext8);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.MessageEvent messageEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext11, messageEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext8);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.setMaxCumulationBufferComponents(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 0 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(1);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) ' ');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext4);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        h02FrameDecoder1.setMaxCumulationBufferComponents((int) (byte) 100);
        int int15 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext3, writeCompletionEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        h02FrameDecoder1.setMaxCumulationBufferComponents(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) '4');
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext6, writeCompletionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) 10);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) ' ');
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelUnbound(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext5, writeCompletionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext9);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.writeComplete(channelHandlerContext15, writeCompletionEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.MessageEvent messageEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext10, messageEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setMaxCumulationBufferComponents(10);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext9);
        int int11 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1024 + "'", int11 == 1024);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setMaxCumulationBufferComponents(10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelClosed(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        h02FrameDecoder1.setMaxCumulationBufferComponents((int) '#');
        Class<?> wildcardClass9 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        int int4 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int5 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        H02FrameDecoder h02FrameDecoder13 = new H02FrameDecoder(100);
        h02FrameDecoder13.setMaxCumulationBufferCapacity(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        h02FrameDecoder13.afterRemove(channelHandlerContext16);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        h02FrameDecoder13.afterRemove(channelHandlerContext18);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        h02FrameDecoder13.afterAdd(channelHandlerContext20);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("hi!", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setMaxCumulationBufferComponents(10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.MessageEvent messageEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext5, messageEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        boolean boolean9 = h02FrameDecoder1.isUnfold();
        boolean boolean10 = h02FrameDecoder1.isUnfold();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setMaxCumulationBufferComponents((int) (byte) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.MessageEvent messageEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext5, messageEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        boolean boolean8 = h02FrameDecoder1.isUnfold();
        h02FrameDecoder1.setUnfold(true);
        int int11 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1024 + "'", int11 == 1024);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext11);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext15);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext17, channelEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int3 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setMaxCumulationBufferCapacity(0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) 0);
        H02FrameDecoder h02FrameDecoder4 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder4.beforeRemove(channelHandlerContext5);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.replace("hi!", (org.jboss.netty.channel.ChannelHandler) h02FrameDecoder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Replace cann only be called once the FrameDecoder is added to the ChannelPipeline");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        int int5 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1024 + "'", int5 == 1024);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((-1));
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext2, channelEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext8);
        int int10 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        boolean boolean11 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext12);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int3 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext6);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 0);
        int int9 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext10);
        int int12 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1024 + "'", int9 == 1024);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1024 + "'", int12 == 1024);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int3 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        int int4 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1024 + "'", int3 == 1024);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1024 + "'", int4 == 1024);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 0);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (byte) 0);
        int int9 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelConnected(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1024 + "'", int9 == 1024);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setMaxCumulationBufferComponents(10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelOpen(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext9);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (short) 1);
        h02FrameDecoder1.setUnfold(true);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) '4');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext6);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelBound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        h02FrameDecoder1.setMaxCumulationBufferCapacity(1024);
        h02FrameDecoder1.setUnfold(true);
        boolean boolean6 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.beforeAdd(channelHandlerContext7);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setMaxCumulationBufferComponents(10);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext7);
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.setMaxCumulationBufferComponents((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCumulationBufferComponents: 1 (expected: >= 2)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder((int) (byte) -1);
        h02FrameDecoder1.setUnfold(false);
        Class<?> wildcardClass4 = h02FrameDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        int int8 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        h02FrameDecoder1.setMaxCumulationBufferComponents((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setUnfold(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext5);
        int int7 = h02FrameDecoder1.getMaxCumulationBufferComponents();
        boolean boolean8 = h02FrameDecoder1.isUnfold();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext9);
        h02FrameDecoder1.setUnfold(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1024 + "'", int7 == 1024);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(100);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        h02FrameDecoder1.beforeRemove(channelHandlerContext3);
        h02FrameDecoder1.setMaxCumulationBufferCapacity((int) (short) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            h02FrameDecoder1.channelInterestChanged(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        H02FrameDecoder h02FrameDecoder1 = new H02FrameDecoder(0);
        int int2 = h02FrameDecoder1.getMaxCumulationBufferCapacity();
        h02FrameDecoder1.setMaxCumulationBufferComponents(10);
        h02FrameDecoder1.setUnfold(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        h02FrameDecoder1.afterRemove(channelHandlerContext7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        h02FrameDecoder1.afterAdd(channelHandlerContext9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

