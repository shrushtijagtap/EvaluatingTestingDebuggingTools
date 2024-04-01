package org.apache.commons.compress.archivers.tar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry17 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("\001\ufffd\ufffd\ufffd\ufffd\ufffd\000ddd\000");
        java.nio.file.attribute.FileTime fileTime18 = jarArchiveEntry17.getLastAccessTime();
        java.lang.Object obj19 = jarArchiveEntry17.clone();
        java.nio.file.attribute.FileTime fileTime20 = jarArchiveEntry17.getCreationTime();
        jarArchiveEntry17.setCrc(3771974808L);
        java.util.jar.Attributes attributes23 = jarArchiveEntry17.getManifestAttributes();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = jarArchiveEntry17.getExtraFields();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(fileTime18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "\001\ufffd\ufffd\ufffd\ufffd\ufffd\000ddd\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "\001\ufffd\ufffd\ufffd\ufffd\ufffd\000ddd\000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "\001\ufffd\ufffd\ufffd\ufffd\ufffd\000ddd\000");
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertNull(attributes23);
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, (int) (short) 0);
        int int11 = tarBuffer10.getCurrentRecordNum();
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (byte) -1);
        int int3 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray2);
        int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, 100, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray2);
        byte[] byteArray8 = zipLong7.getBytes();
        java.lang.Object obj9 = zipLong7.clone();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream16.closeArchiveEntry();
        boolean boolean18 = zipLong7.equals((java.lang.Object) tarArchiveOutputStream16);
        byte[] byteArray19 = zipLong7.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray21 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray19, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: data starting at 0 is in unknown format");
        } catch (java.util.zip.ZipException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65535 + "'", int3 == 65535);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, -1, -1, -1]");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarBuffer7.getBlockSize();
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        boolean boolean4 = tarArchiveEntry1.equals(tarArchiveEntry3);
        tarArchiveEntry3.setGroupId((int) 'a');
        java.io.File file7 = tarArchiveEntry3.getFile();
        long long8 = tarArchiveEntry3.getSize();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream15.closeArchiveEntry();
        tarArchiveOutputStream15.setLongFileMode((int) '#');
        tarArchiveOutputStream15.setLongFileMode(10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream15, 0, 97);
        boolean boolean24 = tarArchiveEntry3.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.setLongFileMode((int) '#');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, (int) '4', 25699);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream4.flush();
        jarArchiveOutputStream4.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        tarArchiveOutputStream8.setLongFileMode(25700);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, 100);
        int int10 = tarBuffer9.getRecordSize();
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = cpioArchiveOutputStream9.createArchiveEntry(file11, "org.apache.commons.compress.archivers.ArchiveException: \001\ufffd\ufffd\ufffd\ufffdhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream4.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, 10, 10);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray26, byteArray33, false);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray17, (int) (byte) 1, (int) (short) 100, byteArray26, (int) (byte) 0, 1);
        boolean boolean40 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, (int) (short) 0);
        tarArchiveOutputStream10.write(byteArray26, 100, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream44 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        tarArchiveOutputStream10.flush();
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0, 100, 0, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 0, 100, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 10, 1, -1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '4');
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        arArchiveOutputStream15.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry18 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("\001\ufffd\ufffd\ufffd\ufffd\ufffd\000ddd\000");
        java.nio.file.attribute.FileTime fileTime19 = jarArchiveEntry18.getLastAccessTime();
        java.util.jar.Attributes attributes20 = jarArchiveEntry18.getManifestAttributes();
        java.util.jar.Attributes attributes21 = jarArchiveEntry18.getManifestAttributes();
        jarArchiveEntry18.setExternalAttributes(312798716060L);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream15.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(fileTime19);
        org.junit.Assert.assertNull(attributes20);
        org.junit.Assert.assertNull(attributes21);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer16 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, 97);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 1);
        byte[] byteArray20 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.write(byteArray20, 25700, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '32' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[63, 63, 63, 63]");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream4.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, 10, 10);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray26, byteArray33, false);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray17, (int) (byte) 1, (int) (short) 100, byteArray26, (int) (byte) 0, 1);
        boolean boolean40 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, (int) (short) 0);
        tarArchiveOutputStream10.write(byteArray26, 100, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream44 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry46 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry48 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        boolean boolean49 = tarArchiveEntry46.equals(tarArchiveEntry48);
        boolean boolean50 = tarArchiveEntry46.isGNULongNameEntry();
        tarArchiveEntry46.setSize((long) (byte) 0);
        tarArchiveEntry46.setMode(10);
        java.io.InputStream inputStream55 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream55, (int) (short) 1);
        tarArchiveInputStream57.close();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream59 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream57);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry60 = jarArchiveInputStream59.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry61 = jarArchiveInputStream59.getNextEntry();
        boolean boolean62 = tarArchiveEntry46.equals((java.lang.Object) archiveEntry61);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream44.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry46);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0, 100, 0, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 0, 100, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 10, 1, -1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(archiveEntry60);
        org.junit.Assert.assertNull(archiveEntry61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer15 = tarArchiveOutputStream6.buffer;
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(tarBuffer15);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry11 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("\001\ufffd\ufffd\ufffd\ufffd\ufffd\000ddd\000");
        java.nio.file.attribute.FileTime fileTime12 = jarArchiveEntry11.getLastAccessTime();
        java.util.jar.Attributes attributes13 = jarArchiveEntry11.getManifestAttributes();
        java.security.cert.Certificate[] certificateArray14 = jarArchiveEntry11.getCertificates();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream9.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(fileTime12);
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertNull(certificateArray14);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        tarArchiveEntry1.setUserName("hi!");
        int int4 = tarArchiveEntry1.getGroupId();
        int int5 = tarArchiveEntry1.getGroupId();
        java.lang.String str6 = tarArchiveEntry1.getName();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry13 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", (long) 99, (int) '4', (int) (byte) -1, 0, (long) (short) -1);
        int int14 = arArchiveEntry13.getGroupId();
        boolean boolean15 = tarArchiveEntry1.equals((java.lang.Object) arArchiveEntry13);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream22.closeArchiveEntry();
        tarArchiveOutputStream22.setLongFileMode((int) '#');
        tarArchiveOutputStream22.setLongFileMode(10);
        boolean boolean28 = arArchiveEntry13.equals((java.lang.Object) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        tarArchiveOutputStream22.setLongFileMode((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream6.buffer;
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = tarArchiveOutputStream6.createArchiveEntry(file11, "\000!\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertNotNull(tarBuffer10);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.write((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream6.buffer;
        int int13 = tarArchiveOutputStream6.getRecordSize();
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream4.flush();
        jarArchiveOutputStream4.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        zipArchiveOutputStream9.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9);
        zipArchiveOutputStream9.flush();
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer16 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, 97);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = tarBuffer16.readRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: reading from an output buffer");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) 99);
        java.lang.String str13 = cpioArchiveEntry12.getName();
        cpioArchiveEntry12.setNumberOfLinks(100L);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream16);
        jarArchiveOutputStream20.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream20);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream20);
        boolean boolean24 = cpioArchiveEntry12.equals((java.lang.Object) jarArchiveOutputStream20);
        int int25 = cpioArchiveEntry12.getHeaderPadCount();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        tarArchiveOutputStream6.flush();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        boolean boolean4 = tarArchiveEntry1.equals(tarArchiveEntry3);
        tarArchiveEntry3.setGroupId((int) 'a');
        java.io.File file7 = tarArchiveEntry3.getFile();
        tarArchiveEntry3.setUserName("");
        java.io.File file10 = tarArchiveEntry3.getFile();
        tarArchiveEntry3.setModTime(201L);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream13);
        jarArchiveOutputStream17.flush();
        jarArchiveOutputStream17.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream17, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        boolean boolean23 = tarArchiveEntry3.equals((java.lang.Object) tarArchiveOutputStream21);
        java.io.File file24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = tarArchiveOutputStream21.createArchiveEntry(file24, "org.apache.commons.compress.archivers.ArchiveException: \001\ufffd\ufffd\ufffd\ufffd\ufffd\000ddd\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        java.io.File file17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = cpioArchiveOutputStream15.createArchiveEntry(file17, "org.apache.commons.compress.archivers.ArchiveException: \001\ufffd\ufffd\ufffd\ufffd\ufffd\000ddd\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = tarArchiveOutputStream6.buffer;
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertNotNull(tarBuffer13);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        byte[] byteArray0 = null;
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream9.buffer;
        int int11 = tarArchiveOutputStream9.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream9.closeArchiveEntry();
        tarArchiveOutputStream9.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream9, 1, (int) '4');
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream18 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(3771974808L);
        arArchiveOutputStream18.write(byteArray20, (int) (byte) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray0, (int) '#', 10, byteArray20, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 33, 0, 0]");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream4.flush();
        jarArchiveOutputStream4.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream9, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 10, 25700);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.setLongFileMode((int) '#');
        tarArchiveOutputStream6.setLongFileMode(10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream6.buffer;
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream6.buffer;
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream13, (int) (short) 1);
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (byte) -1);
        int int19 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray18);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray18, 100, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray18);
        int int26 = tarArchiveInputStream15.read(byteArray18, (int) (short) 1, (-1));
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer28 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.InputStream) tarArchiveInputStream15, (int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream15);
        int int30 = tarArchiveInputStream15.available();
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray38, byteArray45, false);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField48 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray38);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort49 = unicodeCommentExtraField48.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort50 = unicodeCommentExtraField48.getLocalFileDataLength();
        byte[] byteArray51 = zipShort50.getBytes();
        int int52 = tarArchiveInputStream15.read(byteArray51);
        boolean boolean54 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray51, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer12.writeRecord(byteArray51, 2815);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: record has length '2' with offset '2815' which is less than the record size of '1'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 65535 + "'", int19 == 65535);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 99 + "'", int22 == 99);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-1, 0, 100, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 10, 1, -1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(zipShort49);
        org.junit.Assert.assertNotNull(zipShort50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[5, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        java.lang.String str5 = jarArchiveOutputStream4.getEncoding();
        jarArchiveOutputStream4.setUseLanguageEncodingFlag(false);
        jarArchiveOutputStream4.setMethod(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (short) 0, 10);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        tarArchiveEntry15.setUserName("hi!");
        int int18 = tarArchiveEntry15.getGroupId();
        tarArchiveEntry15.setUserId(99);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream4.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        java.lang.String str5 = jarArchiveOutputStream4.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = null;
        jarArchiveOutputStream4.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        jarArchiveOutputStream4.setMethod(100);
        jarArchiveOutputStream4.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        tarArchiveEntry1.setUserName("hi!");
        int int4 = tarArchiveEntry1.getGroupId();
        int int5 = tarArchiveEntry1.getGroupId();
        java.lang.String str6 = tarArchiveEntry1.getName();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry13 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", (long) 99, (int) '4', (int) (byte) -1, 0, (long) (short) -1);
        int int14 = arArchiveEntry13.getGroupId();
        boolean boolean15 = tarArchiveEntry1.equals((java.lang.Object) arArchiveEntry13);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream22.closeArchiveEntry();
        tarArchiveOutputStream22.setLongFileMode((int) '#');
        tarArchiveOutputStream22.setLongFileMode(10);
        boolean boolean28 = arArchiveEntry13.equals((java.lang.Object) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream22.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer15 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream4.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, 10, 10);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry12 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("\001\ufffd\ufffd\ufffd\ufffd\ufffd\000ddd\000");
        long long13 = jarArchiveEntry12.getCompressedSize();
        jarArchiveEntry12.setInternalAttributes((int) (byte) 1);
        java.lang.String str16 = jarArchiveEntry12.getComment();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        tarArchiveEntry18.setUserName("hi!");
        int int21 = tarArchiveEntry18.getGroupId();
        java.util.Date date22 = tarArchiveEntry18.getModTime();
        int int23 = tarArchiveEntry18.getUserId();
        java.lang.String str24 = tarArchiveEntry18.getGroupName();
        tarArchiveEntry18.setIds((-1), (int) '#');
        boolean boolean28 = jarArchiveEntry12.equals((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream10.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Sun Mar 31 10:54:11 PDT 2024");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        boolean boolean4 = tarArchiveEntry1.equals(tarArchiveEntry3);
        tarArchiveEntry3.setGroupId((int) 'a');
        java.io.File file7 = tarArchiveEntry3.getFile();
        tarArchiveEntry3.setUserName("");
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream14 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream10);
        jarArchiveOutputStream14.flush();
        jarArchiveOutputStream14.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream14, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18);
        zipArchiveOutputStream19.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream19);
        boolean boolean23 = tarArchiveEntry3.equals((java.lang.Object) zipArchiveOutputStream22);
        zipArchiveOutputStream22.flush();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.setLongFileMode((int) '#');
        tarArchiveOutputStream6.setLongFileMode(10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, 0, 97);
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = tarArchiveOutputStream6.createArchiveEntry(file15, "\001\ufffd\ufffd\ufffd\ufffdhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertNotNull(tarBuffer10);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.setLongFileMode((int) '#');
        tarArchiveOutputStream6.setLongFileMode(10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 100);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer15 = tarArchiveOutputStream6.buffer;
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertNotNull(tarBuffer15);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        boolean boolean4 = tarArchiveEntry1.equals(tarArchiveEntry3);
        tarArchiveEntry3.setGroupId((int) 'a');
        java.io.File file7 = tarArchiveEntry3.getFile();
        tarArchiveEntry3.setUserName("");
        java.io.File file10 = tarArchiveEntry3.getFile();
        tarArchiveEntry3.setModTime(201L);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream13);
        jarArchiveOutputStream17.flush();
        jarArchiveOutputStream17.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream17, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        boolean boolean23 = tarArchiveEntry3.equals((java.lang.Object) tarArchiveOutputStream21);
        tarArchiveOutputStream21.setLongFileMode((int) (byte) 1);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry27 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("\001\ufffd\ufffd\ufffd\ufffd\ufffd\000ddd\000");
        java.nio.file.attribute.FileTime fileTime28 = jarArchiveEntry27.getLastAccessTime();
        java.util.jar.Attributes attributes29 = jarArchiveEntry27.getManifestAttributes();
        java.util.jar.Attributes attributes30 = jarArchiveEntry27.getManifestAttributes();
        jarArchiveEntry27.setExternalAttributes(312798716060L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry27);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream21.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(fileTime28);
        org.junit.Assert.assertNull(attributes29);
        org.junit.Assert.assertNull(attributes30);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        boolean boolean4 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray2, 0);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray2);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray5);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray6);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (byte) -1);
        int int11 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray10);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 100, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray10);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream16, (int) (short) 1);
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (byte) -1);
        int int22 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray21);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray21, 100, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong26 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray21);
        int int29 = tarArchiveInputStream18.read(byteArray21, (int) (short) 1, (-1));
        boolean boolean30 = zipLong15.equals((java.lang.Object) (short) 1);
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray38, byteArray45, false);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField48 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray38);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort49 = unicodeCommentExtraField48.getHeaderId();
        int int50 = zipShort49.getValue();
        java.lang.Object obj51 = zipShort49.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField52 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort49);
        boolean boolean53 = zipLong15.equals((java.lang.Object) zipShort49);
        byte[] byteArray54 = zipLong15.getBytes();
        java.io.OutputStream outputStream55 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream57 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream55, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream58 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream55);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream58, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer62 = tarArchiveOutputStream61.buffer;
        int int63 = tarArchiveOutputStream61.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer65 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream61, (int) (short) 0);
        boolean boolean66 = zipLong15.equals((java.lang.Object) tarBuffer65);
        java.io.InputStream inputStream67 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream69 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream67, (int) (short) 1);
        int int70 = tarArchiveInputStream69.available();
        byte[] byteArray74 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (byte) -1);
        int int75 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray74);
        int int78 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray74, 100, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong79 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray74);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField80 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray74);
        int int83 = tarArchiveInputStream69.read(byteArray74, (int) (byte) -1, (int) (short) 100);
        boolean boolean84 = tarBuffer65.isEOFRecord(byteArray74);
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField7.parseFromLocalFileData(byteArray74, 5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 65535 + "'", int11 == 65535);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 65535 + "'", int22 == 65535);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 99 + "'", int25 == 99);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-1, 0, 100, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, 10, 1, -1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(zipShort49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 25461 + "'", int50 == 25461);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(zipExtraField52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(tarBuffer62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 65535 + "'", int75 == 65535);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 99 + "'", int78 == 99);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarBuffer7.getCurrentRecordNum();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray10, 0);
        long long13 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray10);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, (int) (byte) -1);
        boolean boolean16 = tarBuffer7.isEOFRecord(byteArray10);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100, (byte) 1 };
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) (short) -1, (int) (short) 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort27 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray22);
        byte[] byteArray28 = zipShort27.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray10, 99, 99, byteArray28, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 4294967295L + "'", long13 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 201L + "'", long26 == 201L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100, 100]");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.setLongFileMode((int) '#');
        tarArchiveOutputStream6.setLongFileMode(10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6);
        int int14 = tarBuffer13.getRecordSize();
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream11.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '4');
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(3771974808L);
        arArchiveOutputStream15.write(byteArray17, (int) (byte) 100, (int) (short) -1);
        java.io.File file21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = arArchiveOutputStream15.createArchiveEntry(file21, "\001\ufffd\ufffd\ufffd\ufffdhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 33, 0, 0]");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '4');
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        arArchiveOutputStream15.closeArchiveEntry();
        byte[] byteArray17 = null;
        arArchiveOutputStream15.write(byteArray17, 2815, 0);
        java.io.File file21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = arArchiveOutputStream15.createArchiveEntry(file21, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.setLongFileMode((int) '#');
        tarArchiveOutputStream6.setLongFileMode(10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, 0, 97);
        int int15 = tarBuffer14.getCurrentRecordNum();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.flush();
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream4.flush();
        jarArchiveOutputStream4.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        tarArchiveOutputStream8.setLongFileMode((int) '4');
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, 1, (int) '4');
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        arArchiveOutputStream15.closeArchiveEntry();
        byte[] byteArray17 = null;
        arArchiveOutputStream15.write(byteArray17, 2815, 0);
        arArchiveOutputStream15.finish();
        java.io.File file22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = arArchiveOutputStream15.createArchiveEntry(file22, "\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.setLongFileMode((int) '#');
        tarArchiveOutputStream6.setLongFileMode(10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream4.flush();
        jarArchiveOutputStream4.flush();
        jarArchiveOutputStream4.setFallbackToUTF8(true);
        jarArchiveOutputStream4.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        arArchiveOutputStream11.closeArchiveEntry();
        arArchiveOutputStream11.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream11, (int) (short) 1);
        int int16 = tarArchiveOutputStream15.getRecordSize();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 512 + "'", int16 == 512);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        tarArchiveEntry1.setUserName("hi!");
        int int4 = tarArchiveEntry1.getGroupId();
        int int5 = tarArchiveEntry1.getGroupId();
        java.lang.String str6 = tarArchiveEntry1.getName();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry13 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", (long) 99, (int) '4', (int) (byte) -1, 0, (long) (short) -1);
        int int14 = arArchiveEntry13.getGroupId();
        boolean boolean15 = tarArchiveEntry1.equals((java.lang.Object) arArchiveEntry13);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream22.closeArchiveEntry();
        tarArchiveOutputStream22.setLongFileMode((int) '#');
        tarArchiveOutputStream22.setLongFileMode(10);
        boolean boolean28 = arArchiveEntry13.equals((java.lang.Object) tarArchiveOutputStream22);
        int int29 = tarArchiveOutputStream22.getRecordSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = tarArchiveOutputStream6.buffer;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertNotNull(tarBuffer10);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        java.lang.String str5 = jarArchiveOutputStream4.getEncoding();
        jarArchiveOutputStream4.setUseLanguageEncodingFlag(false);
        jarArchiveOutputStream4.setMethod(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        tarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.junit.Assert.assertNotNull(tarBuffer7);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        int int10 = tarArchiveOutputStream6.getRecordSize();
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry17 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("\001\ufffd\ufffd\ufffd\ufffd\ufffd\000ddd\000");
        java.nio.file.attribute.FileTime fileTime18 = jarArchiveEntry17.getLastAccessTime();
        int int19 = jarArchiveEntry17.getPlatform();
        byte[] byteArray20 = jarArchiveEntry17.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry17);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry17);
        int int23 = jarArchiveEntry17.getInternalAttributes();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream15.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(fileTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        java.lang.String str5 = jarArchiveOutputStream4.getEncoding();
        jarArchiveOutputStream4.setUseLanguageEncodingFlag(false);
        jarArchiveOutputStream4.setMethod(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (short) 0, 10);
        jarArchiveOutputStream4.setFallbackToUTF8(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream6.buffer;
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer12.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream4.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        jarArchiveOutputStream4.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream4.setComment("");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, 0, 99);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray30, byteArray37, false);
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray21, (int) (byte) 1, (int) (short) 100, byteArray30, (int) (byte) 0, 1);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField43 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray21);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort44 = unicodePathExtraField43.getHeaderId();
        byte[] byteArray45 = unicodePathExtraField43.getLocalFileDataData();
        byte[] byteArray46 = unicodePathExtraField43.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream4.write(byteArray46, (-4), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 100, 0, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 100, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 10, 1, -1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zipShort44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, -104, -60, -45, -32, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, -104, -60, -45, -32, 104, 105, 33]");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        tarArchiveEntry1.setUserName("hi!");
        int int4 = tarArchiveEntry1.getGroupId();
        int int5 = tarArchiveEntry1.getGroupId();
        java.lang.String str6 = tarArchiveEntry1.getName();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry13 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", (long) 99, (int) '4', (int) (byte) -1, 0, (long) (short) -1);
        int int14 = arArchiveEntry13.getGroupId();
        boolean boolean15 = tarArchiveEntry1.equals((java.lang.Object) arArchiveEntry13);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream22.closeArchiveEntry();
        tarArchiveOutputStream22.setLongFileMode((int) '#');
        tarArchiveOutputStream22.setLongFileMode(10);
        boolean boolean28 = arArchiveEntry13.equals((java.lang.Object) tarArchiveOutputStream22);
        java.lang.String str29 = arArchiveEntry13.getName();
        int int30 = arArchiveEntry13.getMode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.setLongFileMode((int) '#');
        tarArchiveOutputStream6.setLongFileMode(10);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream6.buffer;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        int int4 = tarArchiveInputStream2.getRecordSize();
        long long6 = tarArchiveInputStream2.skip(312798716060L);
        boolean boolean7 = tarArchiveInputStream2.isAtEOF();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, (int) '4', 2815);
        boolean boolean11 = tarArchiveInputStream2.isAtEOF();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, 0, (int) (short) 10);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream15, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream15);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream19 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream15);
        jarArchiveOutputStream19.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream19);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream19, 10, 10);
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        boolean boolean50 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray41, byteArray48, false);
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray32, (int) (byte) 1, (int) (short) 100, byteArray41, (int) (byte) 0, 1);
        boolean boolean55 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray41, (int) (short) 0);
        tarArchiveOutputStream25.write(byteArray41, 100, (int) (byte) -1);
        int int61 = tarArchiveInputStream2.read(byteArray41, 2815, 2815);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 100, 0, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 0, 100, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 10, 1, -1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        zipArchiveOutputStream9.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy11 = null;
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        zipArchiveOutputStream9.setComment("\001\ufffd\ufffd\ufffd\ufffd\ufffd\000ddd\000");
        zipArchiveOutputStream9.closeArchiveEntry();
        java.lang.String str16 = zipArchiveOutputStream9.getEncoding();
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF8" + "'", str16, "UTF8");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream4.flush();
        jarArchiveOutputStream4.flush();
        jarArchiveOutputStream4.setFallbackToUTF8(true);
        jarArchiveOutputStream4.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        arArchiveOutputStream11.closeArchiveEntry();
        arArchiveOutputStream11.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream11, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream11.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.setLongFileMode((int) '#');
        tarArchiveOutputStream6.setLongFileMode(10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (short) 0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = tarArchiveOutputStream6.buffer;
        int int8 = tarArchiveOutputStream6.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        boolean boolean15 = tarArchiveEntry12.equals(tarArchiveEntry14);
        tarArchiveEntry14.setGroupId((int) 'a');
        java.io.File file18 = tarArchiveEntry14.getFile();
        tarArchiveEntry14.setUserName("");
        java.lang.String str21 = tarArchiveEntry14.getName();
        tarArchiveEntry14.setGroupName("");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray24 = tarArchiveEntry14.getDirectoryEntries();
        java.io.File file25 = tarArchiveEntry14.getFile();
        int int26 = tarArchiveEntry14.getUserId();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 10, (int) (byte) 1);
        tarArchiveOutputStream6.closeArchiveEntry();
        tarArchiveOutputStream6.setLongFileMode((int) '#');
        tarArchiveOutputStream6.setLongFileMode(99);
        tarArchiveOutputStream6.setLongFileMode((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        java.lang.String str5 = jarArchiveOutputStream4.getEncoding();
        jarArchiveOutputStream4.setUseLanguageEncodingFlag(false);
        jarArchiveOutputStream4.setMethod(0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (short) 0, 10);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("\001\ufffd\ufffd\ufffd\ufffdhi!", (long) 'a');
        boolean boolean17 = cpioArchiveEntry16.isSymbolicLink();
        long long18 = cpioArchiveEntry16.getDeviceMaj();
        boolean boolean19 = cpioArchiveEntry16.isBlockDevice();
        cpioArchiveEntry16.setInode(1500423575L);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream13.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream4.flush();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, 10, 10);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray26, byteArray33, false);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray17, (int) (byte) 1, (int) (short) 100, byteArray26, (int) (byte) 0, 1);
        boolean boolean40 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, (int) (short) 0);
        tarArchiveOutputStream10.write(byteArray26, 100, (int) (byte) -1);
        byte[] byteArray45 = new byte[] { (byte) 1 };
        boolean boolean47 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray45, 0);
        tarArchiveOutputStream10.write(byteArray45, (int) (byte) 10, (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 0, 100, 0, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 0, 100, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 10, 1, -1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3, 0, (int) (byte) 1);
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (byte) -1);
        int int3 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray2);
        int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, 100, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray2);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream8, (int) (short) 1);
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (byte) -1);
        int int14 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray13);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray13, 100, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray13);
        int int21 = tarArchiveInputStream10.read(byteArray13, (int) (short) 1, (-1));
        boolean boolean22 = zipLong7.equals((java.lang.Object) (short) 1);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray30, byteArray37, false);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField40 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray30);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort41 = unicodeCommentExtraField40.getHeaderId();
        int int42 = zipShort41.getValue();
        java.lang.Object obj43 = zipShort41.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField44 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort41);
        boolean boolean45 = zipLong7.equals((java.lang.Object) zipShort41);
        byte[] byteArray46 = zipLong7.getBytes();
        java.io.OutputStream outputStream47 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream47, (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream50 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream47);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream53 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream50, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer54 = tarArchiveOutputStream53.buffer;
        int int55 = tarArchiveOutputStream53.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer57 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream53, (int) (short) 0);
        boolean boolean58 = zipLong7.equals((java.lang.Object) tarBuffer57);
        java.lang.Object obj59 = zipLong7.clone();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65535 + "'", int3 == 65535);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 65535 + "'", int14 == 65535);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 0, 100, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 10, 1, -1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(zipShort41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 25461 + "'", int42 == 25461);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(zipExtraField44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(tarBuffer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj59);
    }
}
