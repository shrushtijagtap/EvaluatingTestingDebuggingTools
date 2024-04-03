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
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray4 = new String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession5 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.traccar.model.Position position2 = null;
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            meitrackProtocolDecoder1.getLastLocation(position2, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            meitrackProtocolDecoder1.handleUpstream(channelHandlerContext2, channelEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        Class<?> wildcardClass2 = meitrackProtocolDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        // The following exception was thrown during execution in test generation
        try {
            String str2 = meitrackProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession5 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray6 = new String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession7 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = meitrackProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = meitrackProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray5 = new String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession6 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray6 = new String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession7 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray6 = new String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession7 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray6 = new String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession7 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray5 = new String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession6 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray7 = new String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray8 = new String[] { "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray9 = new String[] { "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        MeitrackProtocol meitrackProtocol0 = null;
        MeitrackProtocolDecoder meitrackProtocolDecoder1 = new MeitrackProtocolDecoder(meitrackProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        String[] strArray10 = new String[] { "", "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = meitrackProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }
}

