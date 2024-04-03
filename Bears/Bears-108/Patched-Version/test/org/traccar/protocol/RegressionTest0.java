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
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = cguardProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cguardProtocolDecoder1.handleUpstream(channelHandlerContext2, channelEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = cguardProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        org.traccar.protocol.CguardProtocol cguardProtocol4 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder5 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) cguardProtocolDecoder5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.CguardProtocolDecoder cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = cguardProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.traccar.model.Position position2 = null;
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cguardProtocolDecoder1.getLastLocation(position2, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession6 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray4 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession5 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession5 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession7 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession7 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        org.traccar.protocol.CguardProtocol cguardProtocol4 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder5 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) cguardProtocol4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession7 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession6 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        org.traccar.protocol.CguardProtocol cguardProtocol4 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder5 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol4);
        java.lang.Class<?> wildcardClass6 = cguardProtocolDecoder5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession8 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = cguardProtocolDecoder1.decode(channel2, socketAddress3, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession7 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        org.traccar.protocol.CguardProtocol cguardProtocol4 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder5 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol4);
        java.lang.Class<?> wildcardClass6 = cguardProtocolDecoder5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) cguardProtocolDecoder5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.CguardProtocolDecoder cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = cguardProtocolDecoder1.decode(channel2, socketAddress3, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession9 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession10 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.traccar.protocol.CguardProtocol cguardProtocol0 = null;
        org.traccar.protocol.CguardProtocolDecoder cguardProtocolDecoder1 = new org.traccar.protocol.CguardProtocolDecoder(cguardProtocol0);
        org.jboss.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.traccar.DeviceSession deviceSession11 = cguardProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }
}

