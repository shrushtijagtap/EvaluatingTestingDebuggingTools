package org.apache.commons.compress.archivers.tar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1001");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.setLongFileMode((int) (short) 0);
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1002");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer3 = new org.apache.commons.compress.archivers.tar.TarBuffer(inputStream0, 0, (int) '#');
        tarBuffer3.close();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream5, 1);
        tarArchiveOutputStream7.closeArchiveEntry();
        byte[] byteArray12 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray12);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        unicodePathExtraField13.setUnicodeName(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = unicodePathExtraField13.getHeaderId();
        byte[] byteArray22 = unicodePathExtraField13.getLocalFileDataData();
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray22, 100, (int) (byte) -1);
        tarArchiveOutputStream7.write(byteArray22, 10, (-1));
        boolean boolean29 = tarBuffer3.isEOFRecord(byteArray22);
        byte[] byteArray32 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField33 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray32);
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray38);
        unicodePathExtraField33.setUnicodeName(byteArray38);
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer3.writeRecord(byteArray38);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zipShort21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 99 + "'", int25 == 99);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1003");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) cpioArchiveOutputStream5, 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream5.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1004");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        int int8 = tarBuffer7.getBlockSize();
        int int9 = tarBuffer7.getRecordSize();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1005");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int10 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray13);
        arArchiveOutputStream11.write(byteArray13, (int) 'a', (int) (short) -1);
        arArchiveOutputStream11.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry25 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("-       1 ", (long) '4', (int) (byte) 100, 0, (int) (byte) 100, (long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream11.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry25);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '8' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1006");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str11 = jarArchiveOutputStream10.getEncoding();
        java.lang.String str12 = jarArchiveOutputStream10.getEncoding();
        jarArchiveOutputStream10.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream10.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1007");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean8 = zipArchiveOutputStream7.isSeekable();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) zipArchiveOutputStream7, (int) (short) 1);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream7.createArchiveEntry(file11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1008");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1009");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1010");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        zipArchiveOutputStream6.setMethod((int) (short) -1);
        zipArchiveOutputStream6.setComment("hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1011");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setComment("-       0 -       1 ");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1012");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int6 = tarArchiveOutputStream2.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1013");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1014");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getInternalAttributes();
        java.lang.String str3 = jarArchiveEntry1.getName();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int6 = jarArchiveEntry5.getUnixMode();
        jarArchiveEntry5.setUnixMode((int) ' ');
        long long9 = jarArchiveEntry5.getExternalAttributes();
        byte[] byteArray10 = jarArchiveEntry5.getLocalFileDataExtra();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) (short) 100);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray12);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10);
        jarArchiveEntry1.setExtra(byteArray10);
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry22 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        int int23 = arArchiveEntry22.getUserId();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream24, (int) (byte) 0, (int) '4');
        int int28 = tarArchiveInputStream27.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream27);
        int int30 = cpioArchiveInputStream29.available();
        boolean boolean31 = arArchiveEntry22.equals((java.lang.Object) cpioArchiveInputStream29);
        java.io.OutputStream outputStream32 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream32, 1);
        tarArchiveOutputStream34.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer36 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream34);
        tarArchiveOutputStream34.closeArchiveEntry();
        byte[] byteArray39 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray43 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean51 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray50);
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray43, (-1), (int) (short) 0, byteArray50, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean58 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray39, (int) (short) 100, (int) '#', byteArray43, 0, (int) (byte) -1);
        tarArchiveOutputStream34.write(byteArray43, (int) (short) 0, (int) (byte) 0);
        boolean boolean63 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray43, 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong64 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray43);
        boolean boolean65 = arArchiveEntry22.equals((java.lang.Object) byteArray43);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.setCentralDirectoryExtra(byteArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: data starting at 0 is in unknown format");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2097153L + "'", long9 == 2097153L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1015");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        zipArchiveOutputStream6.setMethod((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = arArchiveOutputStream12.createArchiveEntry(file13, "-       0 -       1 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1016");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1017");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        int int8 = tarBuffer7.getRecordSize();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray17);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, (-1), (int) (short) 0, byteArray17, (int) (byte) 10, (int) (byte) 10, false);
        int int23 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer7.writeRecord(byteArray10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: record has length '4' with offset '32' which is less than the record size of '52'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 65535 + "'", int23 == 65535);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1018");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (-1), (int) (short) 0, byteArray18, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, (int) (short) 100, (int) '#', byteArray11, 0, (int) (byte) -1);
        tarArchiveOutputStream2.write(byteArray11, (int) (short) 0, (int) (byte) 0);
        boolean boolean31 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray11, 0);
        int int32 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray11);
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean43 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray42);
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray42, (int) (byte) 10);
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray37, byteArray42);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray48 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray37, false);
        byte[] byteArray49 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray48);
        byte[] byteArray50 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray48);
        byte[] byteArray51 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray48);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray11, (int) (byte) 10, 99, byteArray51, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 65535 + "'", int32 == 65535);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[]");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1019");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        jarArchiveOutputStream5.setComment("-       1 ");
        boolean boolean10 = jarArchiveOutputStream5.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) jarArchiveOutputStream5, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1020");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str11 = jarArchiveOutputStream10.getEncoding();
        java.lang.String str12 = jarArchiveOutputStream10.getEncoding();
        boolean boolean13 = jarArchiveOutputStream10.isSeekable();
        jarArchiveOutputStream10.setFallbackToUTF8(false);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1021");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1022");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        int int8 = tarBuffer7.getRecordSize();
        byte[] byteArray12 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray12);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        unicodePathExtraField13.setUnicodeName(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = unicodePathExtraField13.getCentralDirectoryLength();
        byte[] byteArray22 = unicodePathExtraField13.getLocalFileDataData();
        byte[] byteArray23 = unicodePathExtraField13.getUnicodeName();
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("-       0 -       1 ", byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer7.writeRecord(byteArray23, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: record has length '3' with offset '1' which is less than the record size of '52'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zipShort21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1023");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        zipArchiveOutputStream6.setMethod((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        arArchiveOutputStream11.closeArchiveEntry();
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, 1);
        tarArchiveOutputStream15.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream15);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream15, (int) (short) 100, (int) '4');
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21, 1);
        tarArchiveOutputStream23.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream23);
        tarArchiveOutputStream23.closeArchiveEntry();
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray32 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray39);
        boolean boolean44 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray32, (-1), (int) (short) 0, byteArray39, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray28, (int) (short) 100, (int) '#', byteArray32, 0, (int) (byte) -1);
        tarArchiveOutputStream23.write(byteArray32, (int) (short) 0, (int) (byte) 0);
        boolean boolean52 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray32, 0);
        int int53 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray32);
        boolean boolean54 = tarBuffer20.isEOFRecord(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream11.write(byteArray32, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 65535 + "'", int53 == 65535);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1024");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry9.setNames("", "");
        boolean boolean13 = arArchiveEntry6.equals((java.lang.Object) "");
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 1);
        tarArchiveOutputStream16.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16);
        tarArchiveOutputStream16.closeArchiveEntry();
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, (-1), (int) (short) 0, byteArray32, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, (int) (short) 100, (int) '#', byteArray25, 0, (int) (byte) -1);
        tarArchiveOutputStream16.write(byteArray25, (int) (short) 0, (int) (byte) 0);
        boolean boolean44 = arArchiveEntry6.equals((java.lang.Object) (byte) 0);
        java.lang.String str45 = org.apache.commons.compress.utils.ArchiveUtils.toString((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry6);
        java.lang.String str46 = arArchiveEntry6.getName();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-       1 " + "'", str45, "-       1 ");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1025");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4');
        int int4 = tarArchiveInputStream3.available();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.InputStream) tarArchiveInputStream3, (int) (byte) 100, (int) (short) -1);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, (int) (byte) 0, (int) '4');
        int int13 = tarArchiveInputStream12.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        tarArchiveInputStream12.close();
        tarArchiveInputStream12.close();
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream17, 1);
        tarArchiveOutputStream19.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer21 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream19);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer24 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream19, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = tarArchiveOutputStream19.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream27, 0, (int) (byte) 1);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream31, (int) (byte) 0, (int) '4');
        int int35 = tarArchiveInputStream34.available();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream34, (int) (byte) 100, (int) '#');
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray46);
        boolean boolean49 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray46, (int) (byte) 10);
        boolean boolean50 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray41, byteArray46);
        int int51 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray41);
        int int52 = tarArchiveInputStream34.read(byteArray41);
        tarArchiveOutputStream30.write(byteArray41, (int) (byte) 0, 0);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray56 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray41);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort57 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray41);
        int int60 = tarArchiveInputStream12.read(byteArray41, (int) (byte) 0, (int) '4');
        int int63 = tarArchiveInputStream3.read(byteArray41, (int) (byte) 10, 65380);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(tarArchiveEntry5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(tarBuffer25);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 65380 + "'", int51 == 65380);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1026");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int10 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = tarArchiveOutputStream2.buffer;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(tarBuffer11);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1027");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = unicodeCommentExtraField14.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField14.getHeaderId();
        unicodeCommentExtraField14.setNameCRC32(312796988238L);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = unicodeCommentExtraField14.getHeaderId();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipShort19);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1028");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1029");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1030");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setMethod(0);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1031");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int10 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str15 = tarArchiveEntry14.getUserName();
        java.lang.String str16 = tarArchiveEntry14.getLinkName();
        java.util.Date date17 = tarArchiveEntry14.getModTime();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry19 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int20 = jarArchiveEntry19.getUnixMode();
        jarArchiveEntry19.setUnixMode((int) ' ');
        long long23 = jarArchiveEntry19.getExternalAttributes();
        boolean boolean24 = tarArchiveEntry14.equals((java.lang.Object) jarArchiveEntry19);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream11.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Sun Mar 31 23:04:48 PDT 2024");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2097153L + "'", long23 == 2097153L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1032");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        jarArchiveEntry1.setSize(312796988238L);
        jarArchiveEntry1.setSize((long) (short) 100);
        java.nio.file.attribute.FileTime fileTime26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.zip.ZipEntry zipEntry27 = jarArchiveEntry1.setCreationTime(fileTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: creationTime");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1033");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        byte[] byteArray15 = unicodeCommentExtraField14.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField14.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = unicodeCommentExtraField14.getHeaderId();
        int int18 = zipShort17.getValue();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25461 + "'", int18 == 25461);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1034");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (-1), (int) (short) 0, byteArray18, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, (int) (short) 100, (int) '#', byteArray11, 0, (int) (byte) -1);
        tarArchiveOutputStream2.write(byteArray11, (int) (short) 0, (int) (byte) 0);
        boolean boolean31 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray11, 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong32 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray11);
        byte[] byteArray34 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray36 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long38 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray36, 0);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray34, byteArray36, false);
        boolean boolean41 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            long long43 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 4294967295L + "'", long38 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1035");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy12 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        jarArchiveOutputStream5.closeArchiveEntry();
        jarArchiveOutputStream5.setComment("hi!");
        jarArchiveOutputStream5.setMethod(0);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1036");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str11 = jarArchiveOutputStream10.getEncoding();
        java.lang.String str12 = jarArchiveOutputStream10.getEncoding();
        jarArchiveOutputStream10.setFallbackToUTF8(false);
        jarArchiveOutputStream10.setFallbackToUTF8(false);
        jarArchiveOutputStream10.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream10, (int) ' ');
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("-       1 ");
        boolean boolean22 = cpioArchiveEntry21.isSocket();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream10.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1037");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray3 = jarArchiveEntry1.getExtraFields();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream4, 1);
        tarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream6.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14, 0, (int) (byte) 1);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream18, (int) (byte) 0, (int) '4');
        int int22 = tarArchiveInputStream21.available();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream21, (int) (byte) 100, (int) '#');
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray33);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray33, (int) (byte) 10);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray28, byteArray33);
        int int38 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray28);
        int int39 = tarArchiveInputStream21.read(byteArray28);
        tarArchiveOutputStream17.write(byteArray28, (int) (byte) 0, 0);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray43 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray28);
        jarArchiveEntry1.setExtraFields(zipExtraFieldArray43);
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray52 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray52);
        boolean boolean55 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray52, (int) (byte) 10);
        boolean boolean56 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray47, byteArray52);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray58 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray47, false);
        byte[] byteArray59 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray58);
        byte[] byteArray60 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray58);
        byte[] byteArray61 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray58);
        jarArchiveEntry1.setExtra(byteArray61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray3);
        org.junit.Assert.assertNotNull(tarBuffer12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 65380 + "'", int38 == 65380);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray43);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray58);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1038");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str3 = tarArchiveEntry2.getUserName();
        long long4 = tarArchiveEntry2.getSize();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        tarArchiveOutputStream8.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream8);
        tarArchiveOutputStream8.closeArchiveEntry();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray24);
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, (-1), (int) (short) 0, byteArray24, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, (int) (short) 100, (int) '#', byteArray17, 0, (int) (byte) -1);
        tarArchiveOutputStream8.write(byteArray17, (int) (short) 0, (int) (byte) 0);
        boolean boolean37 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray17, 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong38 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray17);
        java.lang.Object obj39 = zipLong38.clone();
        boolean boolean40 = tarArchiveEntry2.equals((java.lang.Object) zipLong38);
        tarArchiveEntry2.setSize(0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sun Mar 31 23:04:49 PDT 2024");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1039");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        zipArchiveOutputStream6.setMethod((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        arArchiveOutputStream11.closeArchiveEntry();
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = arArchiveOutputStream11.createArchiveEntry(file13, "\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1040");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy12 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1041");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy12 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        jarArchiveOutputStream5.closeArchiveEntry();
        jarArchiveOutputStream5.setComment("hi!");
        jarArchiveOutputStream5.setMethod(0);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1042");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        int int3 = jarArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        byte[] byteArray8 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField9 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray8);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField11 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("-       1 ", byteArray8);
        jarArchiveEntry1.setExtra(byteArray8);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream16);
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray23 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long25 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray23, 0);
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, byteArray23, false);
        boolean boolean28 = tarBuffer19.isEOFRecord(byteArray23);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray23);
        byte[] byteArray30 = unicodeCommentExtraField29.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray8, (int) (byte) 100, (int) (byte) 0, byteArray30, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 4294967295L + "'", long25 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, -1, -1, -1]");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1043");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry9.setNames("", "");
        boolean boolean13 = arArchiveEntry6.equals((java.lang.Object) "");
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 1);
        tarArchiveOutputStream16.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16);
        tarArchiveOutputStream16.closeArchiveEntry();
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, (-1), (int) (short) 0, byteArray32, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, (int) (short) 100, (int) '#', byteArray25, 0, (int) (byte) -1);
        tarArchiveOutputStream16.write(byteArray25, (int) (short) 0, (int) (byte) 0);
        boolean boolean44 = arArchiveEntry6.equals((java.lang.Object) (byte) 0);
        long long45 = arArchiveEntry6.getSize();
        boolean boolean46 = arArchiveEntry6.isDirectory();
        int int47 = arArchiveEntry6.getGroupId();
        long long48 = arArchiveEntry6.getSize();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1044");
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream2);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long11 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray9, 0);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, byteArray9, false);
        boolean boolean14 = tarBuffer5.isEOFRecord(byteArray9);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField15.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = unicodeCommentExtraField15.getHeaderId();
        byte[] byteArray18 = unicodeCommentExtraField15.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField21 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("-       1 ", byteArray18, 0, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4294967295L + "'", long11 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, -1, -1, -1, -1]");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1045");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        tarArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream3, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream3.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream11, 0, (int) (byte) 1);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream15, (int) (byte) 0, (int) '4');
        int int19 = tarArchiveInputStream18.available();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream18, (int) (byte) 100, (int) '#');
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray30);
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray30, (int) (byte) 10);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, byteArray30);
        int int35 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray25);
        int int36 = tarArchiveInputStream18.read(byteArray25);
        tarArchiveOutputStream14.write(byteArray25, (int) (byte) 0, 0);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray40 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray25);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort41 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 100, byteArray25, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 65380 + "'", int35 == 65380);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray40);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1046");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4');
        int int4 = tarArchiveInputStream3.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream3);
        int int6 = cpioArchiveInputStream5.available();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry14 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        int int15 = arArchiveEntry14.getUserId();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream16, (int) (byte) 0, (int) '4');
        int int20 = tarArchiveInputStream19.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream19);
        int int22 = cpioArchiveInputStream21.available();
        boolean boolean23 = arArchiveEntry14.equals((java.lang.Object) cpioArchiveInputStream21);
        java.io.OutputStream outputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream24, 1);
        tarArchiveOutputStream26.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer28 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream26);
        tarArchiveOutputStream26.closeArchiveEntry();
        byte[] byteArray31 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray35 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean43 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray42);
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray35, (-1), (int) (short) 0, byteArray42, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean50 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray31, (int) (short) 100, (int) '#', byteArray35, 0, (int) (byte) -1);
        tarArchiveOutputStream26.write(byteArray35, (int) (short) 0, (int) (byte) 0);
        boolean boolean55 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray35, 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong56 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray35);
        boolean boolean57 = arArchiveEntry14.equals((java.lang.Object) byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = arArchiveInputStream7.read(byteArray35, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1047");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1048");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry9.setNames("", "");
        boolean boolean13 = arArchiveEntry6.equals((java.lang.Object) "");
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 1);
        tarArchiveOutputStream16.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16);
        tarArchiveOutputStream16.closeArchiveEntry();
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, (-1), (int) (short) 0, byteArray32, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, (int) (short) 100, (int) '#', byteArray25, 0, (int) (byte) -1);
        tarArchiveOutputStream16.write(byteArray25, (int) (short) 0, (int) (byte) 0);
        boolean boolean44 = arArchiveEntry6.equals((java.lang.Object) (byte) 0);
        long long45 = arArchiveEntry6.getLength();
        java.lang.String str46 = arArchiveEntry6.getName();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1049");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1050");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        jarArchiveEntry1.setSize(312796988238L);
        int int24 = jarArchiveEntry1.getMethod();
        int int25 = jarArchiveEntry1.getMethod();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1051");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream5, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1052");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1053");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1054");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray16);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray16, (int) (byte) 10);
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray16);
        int int21 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray11);
        int int22 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray11);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray11);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.write(byteArray11, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 65380 + "'", int21 == 65380);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 65380 + "'", int22 == 65380);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 355L + "'", long24 == 355L);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1055");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setComment("");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        java.lang.String str14 = tarArchiveEntry13.getUserName();
        int int15 = tarArchiveEntry13.getUserId();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1056");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        jarArchiveEntry1.setSize(312796988238L);
        jarArchiveEntry1.setCompressedSize((long) (short) 10);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray34);
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray34, (int) (byte) 10);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray34);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray40 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray29, false);
        byte[] byteArray41 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray40);
        byte[] byteArray42 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray40);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField43 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("-       0 -       1 ", byteArray42);
        byte[] byteArray49 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField50 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray49);
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean56 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray55);
        unicodePathExtraField50.setUnicodeName(byteArray55);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort58 = unicodePathExtraField50.getHeaderId();
        byte[] byteArray59 = unicodePathExtraField50.getLocalFileDataData();
        int int62 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray59, 100, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray63 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray64 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray63);
        boolean boolean66 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray59, byteArray64, false);
        boolean boolean69 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray42, 0, (int) (byte) 1, byteArray64, 99, 0);
        boolean boolean70 = jarArchiveEntry1.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[10]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(zipShort58);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 99 + "'", int62 == 99);
        org.junit.Assert.assertNotNull(zipExtraFieldArray63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1057");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("-       1 ");
        tarArchiveEntry10.setSize((long) 'a');
        java.lang.String str13 = tarArchiveEntry10.getGroupName();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1058");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setComment("");
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer16 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) jarArchiveOutputStream5, 1, (int) (byte) 1);
        java.lang.String str17 = jarArchiveOutputStream5.getEncoding();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF8" + "'", str17, "UTF8");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1059");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        jarArchiveEntry1.setComment("-       1 ");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry23 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        byte[] byteArray26 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField27 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray26);
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        unicodePathExtraField27.setUnicodeName(byteArray32);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort35 = unicodePathExtraField27.getCentralDirectoryLength();
        byte[] byteArray36 = unicodePathExtraField27.getLocalFileDataData();
        byte[] byteArray37 = unicodePathExtraField27.getUnicodeName();
        byte[] byteArray38 = unicodePathExtraField27.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort39 = unicodePathExtraField27.getHeaderId();
        jarArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodePathExtraField27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(zipShort35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertNotNull(zipShort39);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1060");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry1);
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream3, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream3);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long12 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray10, 0);
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray8, byteArray10, false);
        boolean boolean15 = tarBuffer6.isEOFRecord(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.setExtra(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: data starting at 0 is in unknown format");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 4294967295L + "'", long12 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1061");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.Class<?> wildcardClass6 = tarArchiveOutputStream2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1062");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = unicodeCommentExtraField14.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField14.getHeaderId();
        byte[] byteArray17 = unicodeCommentExtraField14.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray17, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: data starting at 0 is in unknown format");
        } catch (java.util.zip.ZipException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, -1, -1]");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1063");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry9.setNames("", "");
        boolean boolean13 = arArchiveEntry6.equals((java.lang.Object) "");
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 1);
        tarArchiveOutputStream16.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16);
        tarArchiveOutputStream16.closeArchiveEntry();
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, (-1), (int) (short) 0, byteArray32, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, (int) (short) 100, (int) '#', byteArray25, 0, (int) (byte) -1);
        tarArchiveOutputStream16.write(byteArray25, (int) (short) 0, (int) (byte) 0);
        boolean boolean44 = arArchiveEntry6.equals((java.lang.Object) (byte) 0);
        long long45 = arArchiveEntry6.getSize();
        java.io.OutputStream outputStream46 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream46, 1);
        tarArchiveOutputStream48.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer50 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream48);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream51 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream48);
        boolean boolean52 = arArchiveEntry6.equals((java.lang.Object) jarArchiveOutputStream51);
        int int53 = arArchiveEntry6.getGroupId();
        long long54 = arArchiveEntry6.getSize();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1064");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int10 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray13);
        arArchiveOutputStream11.write(byteArray13, (int) 'a', (int) (short) -1);
        arArchiveOutputStream11.flush();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream11.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archives contains unclosed entries.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1065");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream9.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1066");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10, 0, (int) (byte) 1);
        tarArchiveOutputStream13.closeArchiveEntry();
        int int15 = tarArchiveOutputStream13.getRecordSize();
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1067");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy12 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        jarArchiveOutputStream5.closeArchiveEntry();
        jarArchiveOutputStream5.setComment("hi!");
        jarArchiveOutputStream5.setMethod(0);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry20 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int21 = jarArchiveEntry20.getUnixMode();
        jarArchiveEntry20.setUnixMode((int) ' ');
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream25, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer28 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream25);
        byte[] byteArray30 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray32 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long34 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray32, 0);
        boolean boolean36 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray30, byteArray32, false);
        boolean boolean37 = tarBuffer28.isEOFRecord(byteArray32);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField38 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray32);
        jarArchiveEntry20.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField38);
        boolean boolean40 = jarArchiveEntry20.isDirectory();
        jarArchiveEntry20.setSize(312796988238L);
        jarArchiveEntry20.setCompressedSize((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry20);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: crc checksum is required for STORED method when not writing to a file");
        } catch (java.util.zip.ZipException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 4294967295L + "'", long34 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1068");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str13 = tarArchiveEntry12.getUserName();
        long long14 = tarArchiveEntry12.getSize();
        int int15 = tarArchiveEntry12.getUserId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry18.setNames("", "");
        tarArchiveEntry18.setName("");
        boolean boolean24 = tarArchiveEntry12.equals(tarArchiveEntry18);
        long long25 = tarArchiveEntry12.getSize();
        int int26 = tarArchiveEntry12.getUserId();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1069");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setMethod(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("-       1 ");
        boolean boolean14 = cpioArchiveEntry13.isSocket();
        boolean boolean15 = cpioArchiveEntry13.isBlockDevice();
        boolean boolean16 = cpioArchiveEntry13.isSocket();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1070");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("-       1 ");
        boolean boolean14 = cpioArchiveEntry13.isSocket();
        int int15 = cpioArchiveEntry13.getHeaderSize();
        java.lang.String str16 = cpioArchiveEntry13.getName();
        cpioArchiveEntry13.setDeviceMaj((long) 100);
        boolean boolean19 = cpioArchiveEntry13.isNetwork();
        long long20 = cpioArchiveEntry13.getChksum();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 110 + "'", int15 == 110);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-       1 " + "'", str16, "-       1 ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1071");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.setComment("-       1 ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1072");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str3 = tarArchiveEntry2.getUserName();
        long long4 = tarArchiveEntry2.getSize();
        int int5 = tarArchiveEntry2.getUserId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry8.setNames("", "");
        tarArchiveEntry8.setName("");
        boolean boolean14 = tarArchiveEntry2.equals(tarArchiveEntry8);
        java.util.Date date15 = tarArchiveEntry8.getModTime();
        tarArchiveEntry8.setName("hi!");
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, 1);
        tarArchiveOutputStream20.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        jarArchiveOutputStream23.setFallbackToUTF8(true);
        jarArchiveOutputStream23.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream23.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy30 = null;
        jarArchiveOutputStream23.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy30);
        boolean boolean32 = tarArchiveEntry8.equals((java.lang.Object) unicodeExtraFieldPolicy30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Sun Mar 31 23:04:52 PDT 2024");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1073");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        byte[] byteArray15 = unicodeCommentExtraField14.getCentralDirectoryData();
        byte[] byteArray16 = unicodeCommentExtraField14.getUnicodeName();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1074");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy12 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        jarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream5);
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = arArchiveOutputStream15.createArchiveEntry(file16, "\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1075");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.setCrc(312796988238L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid entry crc-32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1076");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean8 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray7);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray7, (int) (byte) 10);
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray2, byteArray7);
        int int12 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray2);
        int int13 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray2);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 1);
        tarArchiveOutputStream16.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer21 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = tarArchiveOutputStream16.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16);
        int int25 = tarArchiveOutputStream16.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray26);
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray27, byteArray32, false);
        tarArchiveOutputStream16.write(byteArray27);
        byte[] byteArray40 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray45);
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray45, (int) (byte) 10);
        boolean boolean49 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray40, byteArray45);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray51 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray40, false);
        byte[] byteArray52 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray51);
        byte[] byteArray53 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray51);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField54 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("-       0 -       1 ", byteArray53);
        byte[] byteArray60 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField61 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray60);
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean67 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray66);
        unicodePathExtraField61.setUnicodeName(byteArray66);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort69 = unicodePathExtraField61.getHeaderId();
        byte[] byteArray70 = unicodePathExtraField61.getLocalFileDataData();
        int int73 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray70, 100, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray74 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray75 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray74);
        boolean boolean77 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray70, byteArray75, false);
        boolean boolean80 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray53, 0, (int) (byte) 1, byteArray75, 99, 0);
        tarArchiveOutputStream16.write(byteArray75, 99, (int) (byte) -1);
        boolean boolean85 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray2, byteArray75, false);
        // The following exception was thrown during execution in test generation
        try {
            long long88 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 65380);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 65380 + "'", int12 == 65380);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 65380 + "'", int13 == 65380);
        org.junit.Assert.assertNotNull(tarBuffer22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[10]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(zipShort69);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 99 + "'", int73 == 99);
        org.junit.Assert.assertNotNull(zipExtraFieldArray74);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1077");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        tarArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.closeArchiveEntry();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray19);
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray12, (-1), (int) (short) 0, byteArray19, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray8, (int) (short) 100, (int) '#', byteArray12, 0, (int) (byte) -1);
        tarArchiveOutputStream3.write(byteArray12, (int) (short) 0, (int) (byte) 0);
        boolean boolean32 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray12, 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong33 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray12);
        java.lang.Object obj34 = zipLong33.clone();
        long long35 = zipLong33.getValue();
        java.lang.Object obj36 = zipLong33.clone();
        byte[] byteArray37 = zipLong33.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 0, byteArray37, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 4294967295L + "'", long35 == 4294967295L);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1, -1, -1, -1]");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1078");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        byte[] byteArray15 = unicodeCommentExtraField14.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField14.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = unicodeCommentExtraField14.getHeaderId();
        long long18 = unicodeCommentExtraField14.getNameCRC32();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 4294967295L + "'", long18 == 4294967295L);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1079");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        zipArchiveOutputStream6.setMethod((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream11, (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1080");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setComment("");
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setComment("-       0 -       1 ");
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1081");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int10 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray13);
        arArchiveOutputStream11.write(byteArray13, (int) 'a', (int) (short) -1);
        arArchiveOutputStream11.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream11, (int) (short) 0, (int) ' ');
        byte[] byteArray24 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField25 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray24);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray30);
        unicodePathExtraField25.setUnicodeName(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = unicodePathExtraField25.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort34 = unicodePathExtraField25.getCentralDirectoryLength();
        byte[] byteArray35 = unicodePathExtraField25.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream21.write(byteArray35, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '97' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(zipShort33);
        org.junit.Assert.assertNotNull(zipShort34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, -109, 6, -41, 50, -1, 1, 0]");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1082");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        byte[] byteArray11 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray11);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = unicodePathExtraField12.getHeaderId();
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray22);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray22, (int) (byte) 10);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, byteArray22);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField27 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray17);
        unicodePathExtraField12.setUnicodeName(byteArray17);
        byte[] byteArray29 = unicodePathExtraField12.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream8.write(byteArray29);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '7' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10]");
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, -109, 6, -41, 50, 100, -1]");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1083");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int10 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream11.putArchiveEntry(archiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '8' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1084");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream8, 1);
        tarArchiveOutputStream10.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream10);
        tarArchiveOutputStream10.closeArchiveEntry();
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray26);
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray19, (-1), (int) (short) 0, byteArray26, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, (int) (short) 100, (int) '#', byteArray19, 0, (int) (byte) -1);
        tarArchiveOutputStream10.write(byteArray19, (int) (short) 0, (int) (byte) 0);
        boolean boolean39 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray19, 0);
        int int40 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray19);
        boolean boolean41 = tarBuffer7.isEOFRecord(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray19, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 65535 + "'", int40 == 65535);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1085");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = unicodeCommentExtraField14.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField14.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNotNull(zipShort16);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1086");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        int int8 = tarBuffer7.getBlockSize();
        int int9 = tarBuffer7.getCurrentRecordNum();
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer7.skipRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: reading (via skip) from an output buffer");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1087");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        boolean boolean8 = jarArchiveOutputStream5.isSeekable();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 1);
        tarArchiveOutputStream11.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer16 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream11, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveOutputStream11.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        int int20 = tarArchiveOutputStream11.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray21 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray22 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray21);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean28 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray27);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray22, byteArray27, false);
        tarArchiveOutputStream11.write(byteArray22);
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean41 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray40);
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray40, (int) (byte) 10);
        boolean boolean44 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray35, byteArray40);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray46 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray35, false);
        byte[] byteArray47 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray46);
        byte[] byteArray48 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray46);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField49 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("-       0 -       1 ", byteArray48);
        byte[] byteArray55 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField56 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray55);
        byte[] byteArray61 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean62 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray61);
        unicodePathExtraField56.setUnicodeName(byteArray61);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort64 = unicodePathExtraField56.getHeaderId();
        byte[] byteArray65 = unicodePathExtraField56.getLocalFileDataData();
        int int68 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray65, 100, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray69 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray70 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray69);
        boolean boolean72 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray65, byteArray70, false);
        boolean boolean75 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray48, 0, (int) (byte) 1, byteArray70, 99, 0);
        tarArchiveOutputStream11.write(byteArray70, 99, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.write(byteArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tarBuffer17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
        org.junit.Assert.assertNotNull(zipExtraFieldArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[10]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(zipShort64);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 99 + "'", int68 == 99);
        org.junit.Assert.assertNotNull(zipExtraFieldArray69);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1088");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str11 = jarArchiveOutputStream10.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy12 = null;
        jarArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        jarArchiveOutputStream10.closeArchiveEntry();
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1089");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = unicodeCommentExtraField14.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField14.getHeaderId();
        unicodeCommentExtraField14.setNameCRC32(312796988238L);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = unicodeCommentExtraField14.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipShort19);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1090");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str11 = jarArchiveOutputStream10.getEncoding();
        java.lang.String str12 = jarArchiveOutputStream10.getEncoding();
        jarArchiveOutputStream10.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream10.setMethod(65281);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1091");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10, 0, (int) (byte) 1);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream14, (int) (byte) 0, (int) '4');
        int int18 = tarArchiveInputStream17.available();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream17, (int) (byte) 100, (int) '#');
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray29);
        boolean boolean32 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray29, (int) (byte) 10);
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray24, byteArray29);
        int int34 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray24);
        int int35 = tarArchiveInputStream17.read(byteArray24);
        tarArchiveOutputStream13.write(byteArray24, (int) (byte) 0, 0);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray39 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray24);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort40 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray24);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField41 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort40);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 65380 + "'", int34 == 65380);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray39);
        org.junit.Assert.assertNotNull(zipExtraField41);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1092");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        int int6 = tarArchiveOutputStream2.getRecordSize();
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1093");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream5);
        boolean boolean13 = jarArchiveOutputStream5.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1094");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        jarArchiveOutputStream5.setComment("-       1 ");
        boolean boolean10 = jarArchiveOutputStream5.isSeekable();
        boolean boolean11 = jarArchiveOutputStream5.isSeekable();
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1095");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        byte[] byteArray15 = unicodeCommentExtraField14.getCentralDirectoryData();
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 65380);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray15, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1096");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("-       1 ");
        boolean boolean2 = cpioArchiveEntry1.isSocket();
        cpioArchiveEntry1.setRemoteDeviceMaj((long) (byte) -1);
        short short5 = cpioArchiveEntry1.getFormat();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        tarArchiveOutputStream8.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream8, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = tarArchiveOutputStream8.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        int int17 = tarArchiveOutputStream8.getRecordSize();
        boolean boolean18 = cpioArchiveEntry1.equals((java.lang.Object) int17);
        boolean boolean19 = cpioArchiveEntry1.isDirectory();
        cpioArchiveEntry1.setDeviceMaj((long) ' ');
        cpioArchiveEntry1.setGID(852952723L);
        java.lang.String str24 = cpioArchiveEntry1.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertNotNull(tarBuffer14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-       1 " + "'", str24, "-       1 ");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1097");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        byte[] byteArray5 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray11);
        unicodePathExtraField6.setUnicodeName(byteArray11);
        unicodePathExtraField6.setNameCRC32(0L);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodePathExtraField6);
        java.nio.file.attribute.FileTime fileTime17 = jarArchiveEntry1.getLastModifiedTime();
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, 1);
        tarArchiveOutputStream20.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        boolean boolean25 = zipArchiveOutputStream24.isSeekable();
        zipArchiveOutputStream24.closeArchiveEntry();
        zipArchiveOutputStream24.setMethod((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream29 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream24);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream30 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream24);
        boolean boolean31 = jarArchiveEntry1.equals((java.lang.Object) arArchiveOutputStream30);
        arArchiveOutputStream30.closeArchiveEntry();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(fileTime17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1098");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry11.setNames("", "");
        tarArchiveEntry11.setName("");
        tarArchiveEntry11.setModTime(312796988387L);
        tarArchiveEntry11.setMode((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1099");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        jarArchiveEntry1.setUnixMode((int) 'a');
        java.security.cert.Certificate[] certificateArray24 = jarArchiveEntry1.getCertificates();
        int int25 = jarArchiveEntry1.getUnixMode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(certificateArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1100");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        jarArchiveOutputStream5.setComment("-       1 ");
        jarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream5, (int) (short) 10);
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = tarArchiveOutputStream12.createArchiveEntry(file13, "-       0 -       1 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1101");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1102");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (-1), (int) (short) 0, byteArray18, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, (int) (short) 100, (int) '#', byteArray11, 0, (int) (byte) -1);
        tarArchiveOutputStream2.write(byteArray11, (int) (short) 0, (int) (byte) 0);
        boolean boolean31 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray11, 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong32 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray11);
        byte[] byteArray34 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray36 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long38 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray36, 0);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray34, byteArray36, false);
        boolean boolean41 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray43 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray11, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: data starting at 0 is in unknown format");
        } catch (java.util.zip.ZipException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 4294967295L + "'", long38 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1103");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, (int) ' ');
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long11 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.write(byteArray9, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '52' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4294967295L + "'", long11 == 4294967295L);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1104");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        tarArchiveOutputStream2.setLongFileMode((int) '#');
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean9 = jarArchiveOutputStream8.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1105");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray8);
        unicodePathExtraField3.setUnicodeName(byteArray8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = unicodePathExtraField3.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = unicodePathExtraField3.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = unicodePathExtraField3.getHeaderId();
        byte[] byteArray14 = unicodePathExtraField3.getLocalFileDataData();
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream16);
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray23 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long25 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray23, 0);
        boolean boolean27 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, byteArray23, false);
        boolean boolean28 = tarBuffer19.isEOFRecord(byteArray23);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray23);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = unicodeCommentExtraField29.getHeaderId();
        byte[] byteArray31 = unicodeCommentExtraField29.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            unicodePathExtraField3.parseFromLocalFileData(byteArray31, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: UniCode path extra data must have at least 5 bytes.");
        } catch (java.util.zip.ZipException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 4294967295L + "'", long25 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zipShort30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, -1, -1, -1, -1]");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1106");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray8);
        unicodePathExtraField3.setUnicodeName(byteArray8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = unicodePathExtraField3.getHeaderId();
        byte[] byteArray12 = unicodePathExtraField3.getLocalFileDataData();
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray12, (int) '4', (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray12, (int) (byte) -1);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer24 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream21);
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long30 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray28, 0);
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray26, byteArray28, false);
        boolean boolean33 = tarBuffer24.isEOFRecord(byteArray28);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField34 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray28);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort35 = unicodeCommentExtraField34.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort36 = unicodeCommentExtraField34.getHeaderId();
        byte[] byteArray37 = unicodeCommentExtraField34.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray12, 0, 10, byteArray37, (int) (short) 100, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 4294967295L + "'", long30 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(zipShort35);
        org.junit.Assert.assertNotNull(zipShort36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, -1, -1, -1, -1]");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1107");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getInternalAttributes();
        long long3 = jarArchiveEntry1.getCrc();
        boolean boolean4 = jarArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        int int6 = jarArchiveEntry5.getInternalAttributes();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7, 1);
        tarArchiveOutputStream9.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream9.closeArchiveEntry();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray25);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, (-1), (int) (short) 0, byteArray25, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray14, (int) (short) 100, (int) '#', byteArray18, 0, (int) (byte) -1);
        tarArchiveOutputStream9.write(byteArray18, (int) (short) 0, (int) (byte) 0);
        boolean boolean38 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray18, 0);
        boolean boolean39 = jarArchiveEntry5.equals((java.lang.Object) byteArray18);
        jarArchiveEntry5.setSize((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1108");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        jarArchiveEntry1.setUnixMode((int) (short) -1);
        long long4 = jarArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str8 = tarArchiveEntry7.getUserName();
        java.lang.String str9 = tarArchiveEntry7.getLinkName();
        java.util.Date date10 = tarArchiveEntry7.getModTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(date10);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray14);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodePathExtraField15.getHeaderId();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray25);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray25, (int) (byte) 10);
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray25);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField30 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray20);
        unicodePathExtraField15.setUnicodeName(byteArray20);
        boolean boolean32 = zipLong11.equals((java.lang.Object) unicodePathExtraField15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = unicodePathExtraField15.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = jarArchiveEntry1.getExtraField(zipShort33);
        java.io.OutputStream outputStream35 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream35, 1);
        tarArchiveOutputStream37.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream37);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer42 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream37, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer43 = tarArchiveOutputStream37.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37);
        int int46 = tarArchiveOutputStream37.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray47 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray48 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray47);
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean54 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray53);
        boolean boolean56 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray48, byteArray53, false);
        tarArchiveOutputStream37.write(byteArray48);
        jarArchiveEntry1.setExtra(byteArray48);
        long long59 = jarArchiveEntry1.getCompressedSize();
        java.nio.file.attribute.FileTime fileTime60 = jarArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Sun Mar 31 23:04:54 PDT 2024");
        org.junit.Assert.assertNotNull(zipLong11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10]");
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zipShort33);
        org.junit.Assert.assertNull(zipExtraField34);
        org.junit.Assert.assertNotNull(tarBuffer43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 512 + "'", int46 == 512);
        org.junit.Assert.assertNotNull(zipExtraFieldArray47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertNull(fileTime60);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1109");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4');
        int int4 = tarArchiveInputStream3.available();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream3);
        zipArchiveInputStream6.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = zipArchiveInputStream6.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = zipArchiveInputStream6.getNextZipEntry();
        zipArchiveInputStream6.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = zipArchiveInputStream6.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = zipArchiveInputStream6.getNextEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry14 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        jarArchiveEntry14.setUnixMode((int) (short) -1);
        long long17 = jarArchiveEntry14.getTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str21 = tarArchiveEntry20.getUserName();
        java.lang.String str22 = tarArchiveEntry20.getLinkName();
        java.util.Date date23 = tarArchiveEntry20.getModTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong24 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(date23);
        byte[] byteArray27 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField28 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray27);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = unicodePathExtraField28.getHeaderId();
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray38);
        boolean boolean41 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray38, (int) (byte) 10);
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray33, byteArray38);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField43 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray33);
        unicodePathExtraField28.setUnicodeName(byteArray33);
        boolean boolean45 = zipLong24.equals((java.lang.Object) unicodePathExtraField28);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort46 = unicodePathExtraField28.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField47 = jarArchiveEntry14.getExtraField(zipShort46);
        java.io.OutputStream outputStream48 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream48, 1);
        tarArchiveOutputStream50.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer52 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream50);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer55 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream50, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer56 = tarArchiveOutputStream50.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream57 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream50);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream58 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream50);
        int int59 = tarArchiveOutputStream50.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray60 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray61 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray60);
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean67 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray66);
        boolean boolean69 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray61, byteArray66, false);
        tarArchiveOutputStream50.write(byteArray61);
        jarArchiveEntry14.setExtra(byteArray61);
        // The following exception was thrown during execution in test generation
        try {
            int int74 = zipArchiveInputStream6.read(byteArray61, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(tarArchiveEntry5);
        org.junit.Assert.assertNull(zipArchiveEntry8);
        org.junit.Assert.assertNull(zipArchiveEntry9);
        org.junit.Assert.assertNull(zipArchiveEntry11);
        org.junit.Assert.assertNull(archiveEntry12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Sun Mar 31 23:04:55 PDT 2024");
        org.junit.Assert.assertNotNull(zipLong24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10]");
        org.junit.Assert.assertNotNull(zipShort29);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(zipShort46);
        org.junit.Assert.assertNull(zipExtraField47);
        org.junit.Assert.assertNotNull(tarBuffer56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 512 + "'", int59 == 512);
        org.junit.Assert.assertNotNull(zipExtraFieldArray60);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1110");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str4 = tarArchiveEntry3.getUserName();
        long long5 = tarArchiveEntry3.getSize();
        java.util.Date date6 = tarArchiveEntry3.getModTime();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7, 1);
        tarArchiveOutputStream9.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream9.closeArchiveEntry();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray25);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, (-1), (int) (short) 0, byteArray25, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray14, (int) (short) 100, (int) '#', byteArray18, 0, (int) (byte) -1);
        tarArchiveOutputStream9.write(byteArray18, (int) (short) 0, (int) (byte) 0);
        boolean boolean38 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray18, 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong39 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray18);
        java.lang.Object obj40 = zipLong39.clone();
        boolean boolean41 = tarArchiveEntry3.equals((java.lang.Object) zipLong39);
        byte[] byteArray42 = zipLong39.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField45 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray42, 65281, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Sun Mar 31 23:04:55 PDT 2024");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, -1, -1, -1]");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1111");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream7.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1112");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        tarArchiveOutputStream2.setLongFileMode((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1113");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry9.setNames("", "");
        boolean boolean13 = arArchiveEntry6.equals((java.lang.Object) "");
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 1);
        tarArchiveOutputStream16.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16);
        tarArchiveOutputStream16.closeArchiveEntry();
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, (-1), (int) (short) 0, byteArray32, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, (int) (short) 100, (int) '#', byteArray25, 0, (int) (byte) -1);
        tarArchiveOutputStream16.write(byteArray25, (int) (short) 0, (int) (byte) 0);
        boolean boolean44 = arArchiveEntry6.equals((java.lang.Object) (byte) 0);
        java.lang.String str45 = org.apache.commons.compress.utils.ArchiveUtils.toString((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry6);
        boolean boolean46 = arArchiveEntry6.isDirectory();
        int int47 = arArchiveEntry6.getGroupId();
        boolean boolean48 = arArchiveEntry6.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-       1 " + "'", str45, "-       1 ");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1114");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        zipArchiveOutputStream6.setMethod((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream12.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1115");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry10 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int11 = jarArchiveEntry10.getUnixMode();
        int int12 = jarArchiveEntry10.getMethod();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry13 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry10);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray16);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = unicodePathExtraField17.getHeaderId();
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean28 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray27);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray27, (int) (byte) 10);
        boolean boolean31 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray22, byteArray27);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField32 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray22);
        unicodePathExtraField17.setUnicodeName(byteArray22);
        jarArchiveEntry10.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodePathExtraField17);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream7.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10]");
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1116");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        int int7 = arArchiveEntry6.getUserId();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream8, (int) (byte) 0, (int) '4');
        int int12 = tarArchiveInputStream11.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream11);
        int int14 = cpioArchiveInputStream13.available();
        boolean boolean15 = arArchiveEntry6.equals((java.lang.Object) cpioArchiveInputStream13);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.InputStream) cpioArchiveInputStream13, (int) (byte) 1);
        boolean boolean18 = cpioArchiveInputStream13.markSupported();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, 1);
        tarArchiveOutputStream21.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream21);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream21, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer27 = tarArchiveOutputStream21.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream21);
        int int30 = tarArchiveOutputStream21.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray32 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray31);
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray37);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray32, byteArray37, false);
        tarArchiveOutputStream21.write(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = cpioArchiveInputStream13.read(byteArray32, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tarBuffer27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1117");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int11 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray12);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18, false);
        tarArchiveOutputStream2.write(byteArray13);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) ' ');
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long29 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray27, 0);
        boolean boolean31 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray27, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort32 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer25.writeRecord(byteArray27, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: record has length '4' with offset '100' which is less than the record size of '512'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 4294967295L + "'", long29 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1118");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (-1), (int) (short) 0, byteArray18, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, (int) (short) 100, (int) '#', byteArray11, 0, (int) (byte) -1);
        tarArchiveOutputStream2.write(byteArray11, (int) (short) 0, (int) (byte) 0);
        boolean boolean31 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray11, 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong33 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray11, 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1119");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 1);
        tarArchiveEntry10.setIds((-1), (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str17 = tarArchiveEntry16.getUserName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray18 = tarArchiveEntry16.getDirectoryEntries();
        java.lang.Object obj19 = null;
        boolean boolean20 = tarArchiveEntry16.equals(obj19);
        java.util.Date date21 = tarArchiveEntry16.getModTime();
        java.lang.String str22 = tarArchiveEntry16.getUserName();
        boolean boolean23 = tarArchiveEntry16.isGNULongNameEntry();
        boolean boolean24 = tarArchiveEntry16.isDirectory();
        boolean boolean25 = tarArchiveEntry10.isDescendent(tarArchiveEntry16);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Sun Mar 31 23:04:55 PDT 2024");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1120");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray14);
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, (-1), (int) (short) 0, byteArray14, (int) (byte) 10, (int) (byte) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray7, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1121");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream7.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1122");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        byte[] byteArray5 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray5);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray11);
        unicodePathExtraField6.setUnicodeName(byteArray11);
        unicodePathExtraField6.setNameCRC32(0L);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodePathExtraField6);
        java.nio.file.attribute.FileTime fileTime17 = jarArchiveEntry1.getLastModifiedTime();
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, 1);
        tarArchiveOutputStream20.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        boolean boolean25 = zipArchiveOutputStream24.isSeekable();
        zipArchiveOutputStream24.closeArchiveEntry();
        zipArchiveOutputStream24.setMethod((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream29 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream24);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream30 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream24);
        boolean boolean31 = jarArchiveEntry1.equals((java.lang.Object) arArchiveOutputStream30);
        long long32 = jarArchiveEntry1.getExternalAttributes();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(fileTime17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1123");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        tarArchiveOutputStream2.setLongFileMode((int) '#');
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1124");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!");
        java.lang.String str2 = tarArchiveEntry1.getUserName();
        int int3 = tarArchiveEntry1.getUserId();
        java.io.File file4 = tarArchiveEntry1.getFile();
        tarArchiveEntry1.setModTime((long) (short) 100);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int9 = jarArchiveEntry8.getUnixMode();
        jarArchiveEntry8.setUnixMode((int) ' ');
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer16 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream13);
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long22 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray20, 0);
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray20, false);
        boolean boolean25 = tarBuffer16.isEOFRecord(byteArray20);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray20);
        jarArchiveEntry8.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField26);
        boolean boolean28 = jarArchiveEntry8.isDirectory();
        jarArchiveEntry8.setUnixMode((int) 'a');
        boolean boolean31 = tarArchiveEntry1.equals((java.lang.Object) 'a');
        java.lang.String str32 = tarArchiveEntry1.getUserName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 4294967295L + "'", long22 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1125");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        byte[] byteArray12 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("-       0 -       1 ");
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.write(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[45, 32, 32, 32, 32, 32, 32, 32, 48, 32, 45, 32, 32, 32, 32, 32, 32, 32, 49, 32]");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1126");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        int int6 = tarArchiveOutputStream2.getRecordSize();
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("-       1 ");
        cpioArchiveEntry10.setGID(312796988387L);
        boolean boolean13 = cpioArchiveEntry10.isCharacterDevice();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1127");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1128");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int10 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = tarArchiveOutputStream2.buffer;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(tarBuffer11);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1129");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = tarArchiveOutputStream2.createArchiveEntry(file11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1130");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.setLongFileMode((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1131");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer3 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream0, (int) (short) 1, 65380);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray11);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray11, (int) (byte) 10);
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray11);
        int int16 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray6);
        int int17 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray6);
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, 1);
        tarArchiveOutputStream20.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream20);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream20, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = tarArchiveOutputStream20.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        int int29 = tarArchiveOutputStream20.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray30 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray31 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray30);
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray36);
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray31, byteArray36, false);
        tarArchiveOutputStream20.write(byteArray31);
        byte[] byteArray44 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean50 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray49);
        boolean boolean52 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray49, (int) (byte) 10);
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray44, byteArray49);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray55 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray44, false);
        byte[] byteArray56 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray55);
        byte[] byteArray57 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray55);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField58 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("-       0 -       1 ", byteArray57);
        byte[] byteArray64 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField65 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray64);
        byte[] byteArray70 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean71 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray70);
        unicodePathExtraField65.setUnicodeName(byteArray70);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort73 = unicodePathExtraField65.getHeaderId();
        byte[] byteArray74 = unicodePathExtraField65.getLocalFileDataData();
        int int77 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray74, 100, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray78 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray79 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray78);
        boolean boolean81 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray74, byteArray79, false);
        boolean boolean84 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray57, 0, (int) (byte) 1, byteArray79, 99, 0);
        tarArchiveOutputStream20.write(byteArray79, 99, (int) (byte) -1);
        boolean boolean89 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray79, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean90 = tarBuffer3.isEOFRecord(byteArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 65380 + "'", int16 == 65380);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 65380 + "'", int17 == 65380);
        org.junit.Assert.assertNotNull(tarBuffer26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertNotNull(zipExtraFieldArray30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[10]");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(zipShort73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 99 + "'", int77 == 99);
        org.junit.Assert.assertNotNull(zipExtraFieldArray78);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1132");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        long long22 = jarArchiveEntry1.getCompressedSize();
        java.lang.String str23 = jarArchiveEntry1.getName();
        jarArchiveEntry1.setTime(312796866867L);
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream27, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer30 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream27);
        byte[] byteArray32 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray34 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long36 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray34, 0);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray32, byteArray34, false);
        boolean boolean39 = tarBuffer30.isEOFRecord(byteArray34);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField40 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray34);
        byte[] byteArray41 = unicodeCommentExtraField40.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort42 = unicodeCommentExtraField40.getLocalFileDataLength();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.removeExtraField(zipShort42);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 4294967295L + "'", long36 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipShort42);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1133");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        zipArchiveOutputStream6.setFallbackToUTF8(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1134");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 1);
        tarArchiveOutputStream11.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream11);
        tarArchiveOutputStream11.closeArchiveEntry();
        tarArchiveOutputStream11.setLongFileMode((int) '#');
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray25);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, (-1), (int) (short) 0, byteArray25, (int) (byte) 10, (int) (byte) 10, false);
        tarArchiveOutputStream11.write(byteArray18, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.write(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1135");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry9.setNames("", "");
        boolean boolean13 = arArchiveEntry6.equals((java.lang.Object) "");
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 1);
        tarArchiveOutputStream16.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16);
        tarArchiveOutputStream16.closeArchiveEntry();
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, (-1), (int) (short) 0, byteArray32, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, (int) (short) 100, (int) '#', byteArray25, 0, (int) (byte) -1);
        tarArchiveOutputStream16.write(byteArray25, (int) (short) 0, (int) (byte) 0);
        boolean boolean44 = arArchiveEntry6.equals((java.lang.Object) (byte) 0);
        java.lang.String str45 = org.apache.commons.compress.utils.ArchiveUtils.toString((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry6);
        boolean boolean46 = arArchiveEntry6.isDirectory();
        long long47 = arArchiveEntry6.getLastModified();
        long long48 = arArchiveEntry6.getLength();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-       1 " + "'", str45, "-       1 ");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1136");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        tarArchiveOutputStream2.setLongFileMode((int) '#');
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream8.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1137");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1138");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1139");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10, 0, (int) (byte) 1);
        tarArchiveOutputStream13.closeArchiveEntry();
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = tarArchiveOutputStream13.createArchiveEntry(file15, "-       0 -       1 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1140");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        jarArchiveEntry1.setUnixMode((int) 'a');
        jarArchiveEntry1.setCompressedSize((long) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1141");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry9.setNames("", "");
        boolean boolean13 = arArchiveEntry6.equals((java.lang.Object) "");
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 1);
        tarArchiveOutputStream16.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16);
        tarArchiveOutputStream16.closeArchiveEntry();
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, (-1), (int) (short) 0, byteArray32, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, (int) (short) 100, (int) '#', byteArray25, 0, (int) (byte) -1);
        tarArchiveOutputStream16.write(byteArray25, (int) (short) 0, (int) (byte) 0);
        boolean boolean44 = arArchiveEntry6.equals((java.lang.Object) (byte) 0);
        java.lang.String str45 = org.apache.commons.compress.utils.ArchiveUtils.toString((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry6);
        boolean boolean46 = arArchiveEntry6.isDirectory();
        int int47 = arArchiveEntry6.getGroupId();
        java.io.OutputStream outputStream49 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream49, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer52 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream49);
        byte[] byteArray54 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray56 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long58 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray56, 0);
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray54, byteArray56, false);
        boolean boolean61 = tarBuffer52.isEOFRecord(byteArray56);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField62 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray56);
        byte[] byteArray63 = unicodeCommentExtraField62.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort64 = unicodeCommentExtraField62.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField65 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort64);
        boolean boolean66 = arArchiveEntry6.equals((java.lang.Object) zipShort64);
        java.io.OutputStream outputStream68 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream70 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream68, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer71 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream68);
        byte[] byteArray73 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray75 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long77 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray75, 0);
        boolean boolean79 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray73, byteArray75, false);
        boolean boolean80 = tarBuffer71.isEOFRecord(byteArray75);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField81 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray75);
        byte[] byteArray82 = unicodeCommentExtraField81.getCentralDirectoryData();
        boolean boolean83 = arArchiveEntry6.equals((java.lang.Object) byteArray82);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-       1 " + "'", str45, "-       1 ");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 4294967295L + "'", long58 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipShort64);
        org.junit.Assert.assertNotNull(zipExtraField65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 4294967295L + "'", long77 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1142");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (-1), (int) (short) 0, byteArray18, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, (int) (short) 100, (int) '#', byteArray11, 0, (int) (byte) -1);
        tarArchiveOutputStream2.write(byteArray11, (int) (short) 0, (int) (byte) 0);
        tarArchiveOutputStream2.closeArchiveEntry();
        java.io.File file31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = tarArchiveOutputStream2.createArchiveEntry(file31, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1143");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (-1), (int) (short) 0, byteArray18, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, (int) (short) 100, (int) '#', byteArray11, 0, (int) (byte) -1);
        tarArchiveOutputStream2.write(byteArray11, (int) (short) 0, (int) (byte) 0);
        boolean boolean31 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray11, 0);
        int int32 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray11);
        int int33 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray11);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 65535 + "'", int32 == 65535);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 65535 + "'", int33 == 65535);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1144");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream5);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.write(byteArray14, (int) (short) 100, 65281);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 33, 0, 0]");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1145");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        tarArchiveOutputStream3.closeArchiveEntry();
        byte[] byteArray8 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField9 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray8);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray14);
        unicodePathExtraField9.setUnicodeName(byteArray14);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = unicodePathExtraField9.getHeaderId();
        byte[] byteArray18 = unicodePathExtraField9.getLocalFileDataData();
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray18, 100, (int) (byte) -1);
        tarArchiveOutputStream3.write(byteArray18, 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField27 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray18, 65281, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1146");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        tarArchiveOutputStream2.setLongFileMode((int) '#');
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        byte[] byteArray9 = null;
        tarArchiveOutputStream2.write(byteArray9, 65380, (int) (short) 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1147");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int10 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray13);
        arArchiveOutputStream11.write(byteArray13, (int) 'a', (int) (short) -1);
        byte[] byteArray18 = null;
        arArchiveOutputStream11.write(byteArray18, (int) (byte) 1, (-53));
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream11.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1148");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", (-1L));
        long long3 = arArchiveEntry2.getLastModified();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream4, 1);
        tarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        jarArchiveOutputStream9.setFallbackToUTF8(true);
        jarArchiveOutputStream9.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream9.setComment("");
        jarArchiveOutputStream9.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) jarArchiveOutputStream9, 1, (int) (byte) 1);
        jarArchiveOutputStream9.setFallbackToUTF8(false);
        boolean boolean23 = arArchiveEntry2.equals((java.lang.Object) jarArchiveOutputStream9);
        boolean boolean24 = jarArchiveOutputStream9.isSeekable();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1711951497934L + "'", long3 == 1711951497934L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1149");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        jarArchiveEntry1.setUnixMode((int) (short) -1);
        long long4 = jarArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str8 = tarArchiveEntry7.getUserName();
        java.lang.String str9 = tarArchiveEntry7.getLinkName();
        java.util.Date date10 = tarArchiveEntry7.getModTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(date10);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray14);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodePathExtraField15.getHeaderId();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray25);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray25, (int) (byte) 10);
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray25);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField30 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray20);
        unicodePathExtraField15.setUnicodeName(byteArray20);
        boolean boolean32 = zipLong11.equals((java.lang.Object) unicodePathExtraField15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = unicodePathExtraField15.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = jarArchiveEntry1.getExtraField(zipShort33);
        java.io.OutputStream outputStream35 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream35, 1);
        tarArchiveOutputStream37.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream37);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer42 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream37, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer43 = tarArchiveOutputStream37.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37);
        int int46 = tarArchiveOutputStream37.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray47 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray48 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray47);
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean54 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray53);
        boolean boolean56 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray48, byteArray53, false);
        tarArchiveOutputStream37.write(byteArray48);
        jarArchiveEntry1.setExtra(byteArray48);
        long long59 = jarArchiveEntry1.getCompressedSize();
        java.nio.file.attribute.FileTime fileTime60 = jarArchiveEntry1.getLastModifiedTime();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Sun Mar 31 23:04:57 PDT 2024");
        org.junit.Assert.assertNotNull(zipLong11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10]");
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zipShort33);
        org.junit.Assert.assertNull(zipExtraField34);
        org.junit.Assert.assertNotNull(tarBuffer43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 512 + "'", int46 == 512);
        org.junit.Assert.assertNotNull(zipExtraFieldArray47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertNull(fileTime60);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1150");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        zipArchiveOutputStream6.setMethod((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        arArchiveOutputStream12.closeArchiveEntry();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1151");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry12 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry15.setNames("", "");
        boolean boolean19 = arArchiveEntry12.equals((java.lang.Object) "");
        java.lang.String str20 = arArchiveEntry12.getName();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.ar.ArArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1152");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1153");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setComment("");
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer16 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) jarArchiveOutputStream5, 1, (int) (byte) 1);
        jarArchiveOutputStream5.setFallbackToUTF8(false);
        jarArchiveOutputStream5.setComment("");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1154");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1155");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        int int9 = tarArchiveOutputStream2.getRecordSize();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1156");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = tarArchiveOutputStream2.createArchiveEntry(file6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1157");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (-1), (int) (short) 0, byteArray18, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, (int) (short) 100, (int) '#', byteArray11, 0, (int) (byte) -1);
        tarArchiveOutputStream2.write(byteArray11, (int) (short) 0, (int) (byte) 0);
        boolean boolean31 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray11, 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong32 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray11);
        java.lang.Object obj33 = zipLong32.clone();
        java.io.OutputStream outputStream34 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream34, 1);
        tarArchiveOutputStream36.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer38 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream36);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream39 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream36);
        jarArchiveOutputStream39.setFallbackToUTF8(true);
        jarArchiveOutputStream39.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream39.setComment("");
        jarArchiveOutputStream39.setFallbackToUTF8(true);
        jarArchiveOutputStream39.setComment("-       0 -       1 ");
        boolean boolean50 = zipLong32.equals((java.lang.Object) jarArchiveOutputStream39);
        byte[] byteArray51 = zipLong32.getBytes();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[-1, -1, -1, -1]");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1158");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1159");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        jarArchiveEntry1.setSize(312796988238L);
        long long24 = jarArchiveEntry1.getTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1160");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        int int5 = tarBuffer4.getRecordSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1161");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setComment("-       1 ");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream5, 100);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray22);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray22, (int) (byte) 10);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, byteArray22);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField27 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray17);
        boolean boolean29 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.write(byteArray17, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1162");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10, 0, (int) (byte) 1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str17 = tarArchiveEntry16.getUserName();
        java.lang.String str18 = tarArchiveEntry16.getLinkName();
        java.util.Date date19 = tarArchiveEntry16.getModTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(date19);
        byte[] byteArray23 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField24 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray23);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort25 = unicodePathExtraField24.getHeaderId();
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray34);
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray34, (int) (byte) 10);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray34);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField39 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray29);
        unicodePathExtraField24.setUnicodeName(byteArray29);
        boolean boolean41 = zipLong20.equals((java.lang.Object) unicodePathExtraField24);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort42 = unicodePathExtraField24.getHeaderId();
        byte[] byteArray43 = unicodePathExtraField24.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.write(byteArray43, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Sun Mar 31 23:04:59 PDT 2024");
        org.junit.Assert.assertNotNull(zipLong20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10]");
        org.junit.Assert.assertNotNull(zipShort25);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(zipShort42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, -109, 6, -41, 50, 100, -1]");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1163");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int10 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray13);
        arArchiveOutputStream11.write(byteArray13, (int) 'a', (int) (short) -1);
        arArchiveOutputStream11.closeArchiveEntry();
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1164");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int11 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray12);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18, false);
        tarArchiveOutputStream2.write(byteArray13);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) ' ');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1165");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str11 = jarArchiveOutputStream10.getEncoding();
        java.lang.String str12 = jarArchiveOutputStream10.getEncoding();
        jarArchiveOutputStream10.setFallbackToUTF8(false);
        jarArchiveOutputStream10.setFallbackToUTF8(false);
        jarArchiveOutputStream10.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream10, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str23 = tarArchiveEntry22.getUserName();
        java.lang.String str24 = tarArchiveEntry22.getName();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream19.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1166");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        int int6 = tarArchiveOutputStream2.getRecordSize();
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1167");
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream2);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long11 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray9, 0);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, byteArray9, false);
        boolean boolean14 = tarBuffer5.isEOFRecord(byteArray9);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray9);
        byte[] byteArray16 = unicodeCommentExtraField15.getCentralDirectoryData();
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray22 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray29);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray22, (-1), (int) (short) 0, byteArray29, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, (int) (short) 100, (int) '#', byteArray22, 0, (int) (byte) -1);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray16, byteArray22);
        boolean boolean40 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField43 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("-       0 -       1 ", byteArray22, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4294967295L + "'", long11 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1168");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1169");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        long long22 = jarArchiveEntry1.getCompressedSize();
        java.lang.String str23 = jarArchiveEntry1.getName();
        jarArchiveEntry1.setTime(312796866867L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1170");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        jarArchiveEntry1.setUnixMode((int) (short) -1);
        long long4 = jarArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str8 = tarArchiveEntry7.getUserName();
        java.lang.String str9 = tarArchiveEntry7.getLinkName();
        java.util.Date date10 = tarArchiveEntry7.getModTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(date10);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray14);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodePathExtraField15.getHeaderId();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray25);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray25, (int) (byte) 10);
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray25);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField30 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray20);
        unicodePathExtraField15.setUnicodeName(byteArray20);
        boolean boolean32 = zipLong11.equals((java.lang.Object) unicodePathExtraField15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = unicodePathExtraField15.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = jarArchiveEntry1.getExtraField(zipShort33);
        java.io.OutputStream outputStream35 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream35, 1);
        tarArchiveOutputStream37.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream37);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer42 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream37, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer43 = tarArchiveOutputStream37.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37);
        int int46 = tarArchiveOutputStream37.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray47 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray48 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray47);
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean54 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray53);
        boolean boolean56 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray48, byteArray53, false);
        tarArchiveOutputStream37.write(byteArray48);
        jarArchiveEntry1.setExtra(byteArray48);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray48, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Sun Mar 31 23:04:59 PDT 2024");
        org.junit.Assert.assertNotNull(zipLong11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10]");
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zipShort33);
        org.junit.Assert.assertNull(zipExtraField34);
        org.junit.Assert.assertNotNull(tarBuffer43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 512 + "'", int46 == 512);
        org.junit.Assert.assertNotNull(zipExtraFieldArray47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1171");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        jarArchiveOutputStream5.setComment("-       1 ");
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1172");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        java.lang.Class<?> wildcardClass15 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1173");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        tarArchiveOutputStream2.setLongFileMode((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1174");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        jarArchiveOutputStream5.setComment("-       1 ");
        jarArchiveOutputStream5.closeArchiveEntry();
        boolean boolean11 = jarArchiveOutputStream5.isSeekable();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream5, (int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1175");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str11 = jarArchiveOutputStream10.getEncoding();
        java.lang.String str12 = jarArchiveOutputStream10.getEncoding();
        jarArchiveOutputStream10.setFallbackToUTF8(false);
        jarArchiveOutputStream10.setFallbackToUTF8(false);
        jarArchiveOutputStream10.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream10.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1176");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str3 = tarArchiveEntry2.getUserName();
        java.lang.String str4 = tarArchiveEntry2.getLinkName();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(date5);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = unicodePathExtraField10.getHeaderId();
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray20);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray20, (int) (byte) 10);
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, byteArray20);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField25 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        unicodePathExtraField10.setUnicodeName(byteArray15);
        boolean boolean27 = zipLong6.equals((java.lang.Object) unicodePathExtraField10);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry29 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int30 = jarArchiveEntry29.getInternalAttributes();
        long long31 = jarArchiveEntry29.getCrc();
        boolean boolean32 = jarArchiveEntry29.isDirectory();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry33 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry29);
        int int34 = jarArchiveEntry33.getInternalAttributes();
        java.io.OutputStream outputStream35 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream35, 1);
        tarArchiveOutputStream37.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream37);
        tarArchiveOutputStream37.closeArchiveEntry();
        byte[] byteArray42 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray46 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean54 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray53);
        boolean boolean58 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray46, (-1), (int) (short) 0, byteArray53, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean61 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray42, (int) (short) 100, (int) '#', byteArray46, 0, (int) (byte) -1);
        tarArchiveOutputStream37.write(byteArray46, (int) (short) 0, (int) (byte) 0);
        boolean boolean66 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray46, 0);
        boolean boolean67 = jarArchiveEntry33.equals((java.lang.Object) byteArray46);
        unicodePathExtraField10.setUnicodeName(byteArray46);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sun Mar 31 23:05:00 PDT 2024");
        org.junit.Assert.assertNotNull(zipLong6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1177");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry9.setNames("", "");
        boolean boolean13 = arArchiveEntry6.equals((java.lang.Object) "");
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 1);
        tarArchiveOutputStream16.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16);
        tarArchiveOutputStream16.closeArchiveEntry();
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, (-1), (int) (short) 0, byteArray32, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, (int) (short) 100, (int) '#', byteArray25, 0, (int) (byte) -1);
        tarArchiveOutputStream16.write(byteArray25, (int) (short) 0, (int) (byte) 0);
        boolean boolean44 = arArchiveEntry6.equals((java.lang.Object) (byte) 0);
        java.lang.String str45 = org.apache.commons.compress.utils.ArchiveUtils.toString((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry6);
        boolean boolean46 = arArchiveEntry6.isDirectory();
        int int47 = arArchiveEntry6.getUserId();
        java.lang.Class<?> wildcardClass48 = arArchiveEntry6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ExtraFieldUtils.register((java.lang.Class) wildcardClass48);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: class org.apache.commons.compress.archivers.ar.ArArchiveEntry is not a concrete class");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-       1 " + "'", str45, "-       1 ");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1178");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        int int8 = tarBuffer7.getRecordSize();
        int int9 = tarBuffer7.getBlockSize();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = tarBuffer7.readRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: reading from an output buffer");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1179");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        jarArchiveEntry1.setSize(312796988238L);
        jarArchiveEntry1.setCompressedSize((long) (short) 10);
        int int26 = jarArchiveEntry1.getUnixMode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1180");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("-       1 ");
        int int11 = cpioArchiveEntry10.getHeaderSize();
        boolean boolean12 = cpioArchiveEntry10.isSocket();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream7.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 110 + "'", int11 == 110);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1181");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        jarArchiveEntry1.setComment("-       1 ");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry23 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        int int24 = jarArchiveEntry1.getInternalAttributes();
        java.lang.Object obj25 = jarArchiveEntry1.clone();
        byte[] byteArray28 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray28);
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray34);
        unicodePathExtraField29.setUnicodeName(byteArray34);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort37 = unicodePathExtraField29.getCentralDirectoryLength();
        byte[] byteArray38 = unicodePathExtraField29.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort39 = unicodePathExtraField29.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort40 = unicodePathExtraField29.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField41 = jarArchiveEntry1.getExtraField(zipShort40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(zipShort37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertNotNull(zipShort39);
        org.junit.Assert.assertNotNull(zipShort40);
        org.junit.Assert.assertNull(zipExtraField41);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1182");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = unicodeCommentExtraField14.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField14.getHeaderId();
        byte[] byteArray17 = unicodeCommentExtraField14.getUnicodeName();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1183");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        jarArchiveEntry1.setSize(312796988238L);
        int int24 = jarArchiveEntry1.getMethod();
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray33);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray33, (int) (byte) 10);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray28, byteArray33);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray39 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray28, false);
        byte[] byteArray40 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray39);
        byte[] byteArray41 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray39);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField42 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("-       0 -       1 ", byteArray41);
        byte[] byteArray43 = unicodePathExtraField42.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort44 = unicodePathExtraField42.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField45 = jarArchiveEntry1.getExtraField(zipShort44);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry47 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        long long48 = jarArchiveEntry47.getExternalAttributes();
        byte[] byteArray49 = jarArchiveEntry47.getExtra();
        java.util.jar.Attributes attributes50 = jarArchiveEntry47.getManifestAttributes();
        java.nio.file.attribute.FileTime fileTime51 = jarArchiveEntry47.getCreationTime();
        boolean boolean52 = jarArchiveEntry1.equals((java.lang.Object) fileTime51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 0, 0, 0, 0, 45, 32, 32, 32, 32, 32, 32, 32, 48, 32, 45, 32, 32, 32, 32, 32, 32, 32, 49, 32]");
        org.junit.Assert.assertNotNull(zipShort44);
        org.junit.Assert.assertNull(zipExtraField45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNull(byteArray49);
        org.junit.Assert.assertNull(attributes50);
        org.junit.Assert.assertNull(fileTime51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1184");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1185");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveOutputStream2.buffer;
        org.junit.Assert.assertNotNull(tarBuffer9);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1186");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1187");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        jarArchiveEntry1.setUnixMode((int) 'a');
        jarArchiveEntry1.setCrc((long) (short) 1);
        long long26 = jarArchiveEntry1.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1188");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = unicodeCommentExtraField14.getHeaderId();
        byte[] byteArray16 = unicodeCommentExtraField14.getLocalFileDataData();
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField14.parseFromCentralDirectoryData(byteArray18, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: UniCode path extra data must have at least 5 bytes.");
        } catch (java.util.zip.ZipException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 0]");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1189");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        jarArchiveEntry1.setUnixMode((int) 'a');
        java.lang.String str24 = jarArchiveEntry1.getComment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1190");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        int int5 = tarBuffer4.getCurrentRecordNum();
        int int6 = tarBuffer4.getCurrentRecordNum();
        int int7 = tarBuffer4.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer4.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1191");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) zipArchiveOutputStream6, 0, (-1));
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray20);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray20, (int) (byte) 10);
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, byteArray20);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray15, false);
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray26);
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray26);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("-       0 -       1 ", byteArray28);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField36 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray35);
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray41);
        unicodePathExtraField36.setUnicodeName(byteArray41);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort44 = unicodePathExtraField36.getHeaderId();
        byte[] byteArray45 = unicodePathExtraField36.getLocalFileDataData();
        int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray45, 100, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray49 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray50 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray49);
        boolean boolean52 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray50, false);
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray28, 0, (int) (byte) 1, byteArray50, 99, 0);
        boolean boolean56 = tarBuffer11.isEOFRecord(byteArray28);
        byte[] byteArray59 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField62 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray59, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer11.writeRecord(byteArray59, 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: record has length '4' with offset '10' which is less than the record size of '-1'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[10]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zipShort44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 99 + "'", int48 == 99);
        org.junit.Assert.assertNotNull(zipExtraFieldArray49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[0, 33, 0, 0]");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1192");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray8);
        unicodePathExtraField3.setUnicodeName(byteArray8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = unicodePathExtraField3.getCentralDirectoryLength();
        byte[] byteArray12 = unicodePathExtraField3.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = unicodePathExtraField3.getCentralDirectoryLength();
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 1);
        tarArchiveOutputStream16.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer21 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = tarArchiveOutputStream16.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream24 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream16);
        java.lang.String str25 = jarArchiveOutputStream24.getEncoding();
        java.lang.String str26 = jarArchiveOutputStream24.getEncoding();
        jarArchiveOutputStream24.setFallbackToUTF8(false);
        jarArchiveOutputStream24.setFallbackToUTF8(false);
        boolean boolean31 = zipShort13.equals((java.lang.Object) false);
        int int32 = zipShort13.getValue();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(tarBuffer22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTF8" + "'", str25, "UTF8");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTF8" + "'", str26, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1193");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream8.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archives contains unclosed entries.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1194");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.setLongFileMode((int) (byte) -1);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray20);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray20, (int) (byte) 10);
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, byteArray20);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray15, false);
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray26);
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray26);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray28);
        byte[] byteArray30 = unicodePathExtraField29.getUnicodeName();
        byte[] byteArray32 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long34 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray32, 0);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray30, byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray30, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '10' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 4294967295L + "'", long34 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1195");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean8 = zipArchiveOutputStream7.isSeekable();
        zipArchiveOutputStream7.setFallbackToUTF8(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1196");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        zipArchiveOutputStream6.setMethod((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        zipArchiveOutputStream6.setComment("-       1 ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1197");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry9 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int10 = jarArchiveEntry9.getUnixMode();
        jarArchiveEntry9.setUnixMode((int) ' ');
        long long13 = jarArchiveEntry9.getExternalAttributes();
        byte[] byteArray14 = jarArchiveEntry9.getLocalFileDataExtra();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = tarBuffer7.isEOFRecord(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2097153L + "'", long13 == 2097153L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1198");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        int int6 = tarArchiveOutputStream2.getRecordSize();
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1199");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        int int3 = jarArchiveEntry1.getMethod();
        int int4 = jarArchiveEntry1.getPlatform();
        jarArchiveEntry1.setCrc((long) (byte) 100);
        long long7 = jarArchiveEntry1.getTime();
        java.util.jar.Attributes attributes8 = jarArchiveEntry1.getManifestAttributes();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream10);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long19 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray17, 0);
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, byteArray17, false);
        boolean boolean22 = tarBuffer13.isEOFRecord(byteArray17);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray17);
        long long24 = unicodeCommentExtraField23.getNameCRC32();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort25 = unicodeCommentExtraField23.getHeaderId();
        byte[] byteArray26 = unicodeCommentExtraField23.getLocalFileDataData();
        int int27 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray26);
        boolean boolean29 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray26, 99);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.setCentralDirectoryExtra(byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: data starting at 0 is in unknown format");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4294967295L + "'", long19 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 4294967295L + "'", long24 == 4294967295L);
        org.junit.Assert.assertNotNull(zipShort25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 65281 + "'", int27 == 65281);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1200");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1201");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream9.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1202");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int10 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray13);
        arArchiveOutputStream11.write(byteArray13, (int) 'a', (int) (short) -1);
        arArchiveOutputStream11.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream11, (int) (short) 0, (int) ' ');
        java.io.File file22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = arArchiveOutputStream11.createArchiveEntry(file22, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1203");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream8);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1204");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        boolean boolean8 = jarArchiveOutputStream5.isSeekable();
        jarArchiveOutputStream5.closeArchiveEntry();
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) jarArchiveOutputStream5, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1205");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.setLevel((-53));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: -53");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1206");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int11 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray12);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18, false);
        tarArchiveOutputStream2.write(byteArray13);
        boolean boolean24 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, (int) (byte) -1);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) (byte) 1);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1207");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = tarArchiveOutputStream2.createArchiveEntry(file8, "-       0 -       1 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1208");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1209");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream5, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1210");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        int int9 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 0, 65380);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry14 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int15 = jarArchiveEntry14.getUnixMode();
        jarArchiveEntry14.setUnixMode((int) ' ');
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream19, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream19);
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long28 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray26, 0);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray24, byteArray26, false);
        boolean boolean31 = tarBuffer22.isEOFRecord(byteArray26);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField32 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray26);
        jarArchiveEntry14.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField32);
        jarArchiveEntry14.setComment("-       1 ");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry36 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry14);
        int int37 = jarArchiveEntry14.getInternalAttributes();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 4294967295L + "'", long28 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1211");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1212");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry9.setNames("", "");
        boolean boolean13 = arArchiveEntry6.equals((java.lang.Object) "");
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 1);
        tarArchiveOutputStream16.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16);
        tarArchiveOutputStream16.closeArchiveEntry();
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, (-1), (int) (short) 0, byteArray32, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, (int) (short) 100, (int) '#', byteArray25, 0, (int) (byte) -1);
        tarArchiveOutputStream16.write(byteArray25, (int) (short) 0, (int) (byte) 0);
        boolean boolean44 = arArchiveEntry6.equals((java.lang.Object) (byte) 0);
        java.lang.String str45 = org.apache.commons.compress.utils.ArchiveUtils.toString((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry6);
        boolean boolean46 = arArchiveEntry6.isDirectory();
        int int47 = arArchiveEntry6.getGroupId();
        java.lang.String str48 = arArchiveEntry6.getName();
        int int49 = arArchiveEntry6.getUserId();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-       1 " + "'", str45, "-       1 ");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1213");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1214");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1215");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        tarArchiveOutputStream2.setLongFileMode((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1216");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int10 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = arArchiveOutputStream11.createArchiveEntry(file12, "-       0 -       1 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1217");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.setLongFileMode(100);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1218");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, (int) ' ');
        byte[] byteArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray8, (-101), 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '100' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1219");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        zipArchiveOutputStream6.setMethod((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry13 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int14 = jarArchiveEntry13.getInternalAttributes();
        long long15 = jarArchiveEntry13.getCrc();
        java.util.jar.Attributes attributes16 = jarArchiveEntry13.getManifestAttributes();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream11.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNull(attributes16);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1220");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = unicodeCommentExtraField14.getHeaderId();
        byte[] byteArray16 = unicodeCommentExtraField14.getLocalFileDataData();
        long long17 = unicodeCommentExtraField14.getNameCRC32();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4294967295L + "'", long17 == 4294967295L);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1221");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        zipArchiveOutputStream6.setMethod((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str15 = tarArchiveEntry14.getUserName();
        java.lang.String str16 = tarArchiveEntry14.getLinkName();
        java.util.Date date17 = tarArchiveEntry14.getModTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(date17);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField22 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray21);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = unicodePathExtraField22.getHeaderId();
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray32, (int) (byte) 10);
        boolean boolean36 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray27, byteArray32);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField37 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray27);
        unicodePathExtraField22.setUnicodeName(byteArray27);
        boolean boolean39 = zipLong18.equals((java.lang.Object) unicodePathExtraField22);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort40 = unicodePathExtraField22.getHeaderId();
        byte[] byteArray41 = unicodePathExtraField22.getLocalFileDataData();
        unicodePathExtraField22.setNameCRC32(2097153L);
        byte[] byteArray44 = unicodePathExtraField22.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream11.write(byteArray44, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Sun Mar 31 23:05:03 PDT 2024");
        org.junit.Assert.assertNotNull(zipLong18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10]");
        org.junit.Assert.assertNotNull(zipShort23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(zipShort40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, -109, 6, -41, 50, 100, -1]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 1, 0, 32, 0, 100, -1]");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1222");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        int int6 = tarArchiveOutputStream2.getRecordSize();
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream10);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long19 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray17, 0);
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, byteArray17, false);
        boolean boolean22 = tarBuffer13.isEOFRecord(byteArray17);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray17);
        byte[] byteArray24 = unicodeCommentExtraField23.getCentralDirectoryData();
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray30 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray37);
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray30, (-1), (int) (short) 0, byteArray37, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean45 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray26, (int) (short) 100, (int) '#', byteArray30, 0, (int) (byte) -1);
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray24, byteArray30);
        boolean boolean48 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray30, (int) (byte) 100);
        java.io.OutputStream outputStream50 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream52 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream50, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer53 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream50);
        byte[] byteArray55 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray57 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long59 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray57, 0);
        boolean boolean61 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray55, byteArray57, false);
        boolean boolean62 = tarBuffer53.isEOFRecord(byteArray57);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField63 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray57);
        byte[] byteArray64 = unicodeCommentExtraField63.getCentralDirectoryData();
        boolean boolean66 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray64, (-1));
        boolean boolean68 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray30, byteArray64, true);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.write(byteArray30, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4294967295L + "'", long19 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 4294967295L + "'", long59 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1223");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) jarArchiveOutputStream5, 65380, 100);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream14);
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long23 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray21, 0);
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray19, byteArray21, false);
        boolean boolean26 = tarBuffer17.isEOFRecord(byteArray21);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField27 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray21);
        int int28 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.write(byteArray21, (-53), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 4294967295L + "'", long23 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 65535 + "'", int28 == 65535);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1224");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4');
        int int4 = tarArchiveInputStream3.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.InputStream) cpioArchiveInputStream6, 10);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream10);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long19 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray17, 0);
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, byteArray17, false);
        boolean boolean22 = tarBuffer13.isEOFRecord(byteArray17);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray17);
        int int24 = cpioArchiveInputStream6.read(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = cpioArchiveInputStream6.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4294967295L + "'", long19 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1225");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, (int) ' ');
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) cpioArchiveOutputStream8);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1226");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1227");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        zipArchiveOutputStream6.setMethod((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1228");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10, 0, (int) (byte) 1);
        tarArchiveOutputStream13.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1229");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setComment("");
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.closeArchiveEntry();
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1230");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray7 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean14 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray13);
        unicodePathExtraField8.setUnicodeName(byteArray13);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodePathExtraField8.getHeaderId();
        byte[] byteArray17 = unicodePathExtraField8.getLocalFileDataData();
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray17, 100, (int) (byte) -1);
        tarArchiveOutputStream2.write(byteArray17, 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (-43), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -43");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1231");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        int int9 = tarBuffer8.getRecordSize();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(852952723L);
        boolean boolean12 = tarBuffer8.isEOFRecord(byteArray11);
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray23);
        boolean boolean28 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray16, (-1), (int) (short) 0, byteArray23, (int) (byte) 10, (int) (byte) 10, false);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("-       0 -       1 ", byteArray16);
        long long30 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray16);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray16, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            tarBuffer8.writeRecord(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-109, 6, -41, 50]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[48, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 4294967295L + "'", long30 == 4294967295L);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1232");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        byte[] byteArray15 = unicodeCommentExtraField14.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField14.getLocalFileDataLength();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry18 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int19 = jarArchiveEntry18.getUnixMode();
        jarArchiveEntry18.setUnixMode((int) ' ');
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream23, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream23);
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray30 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long32 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray30, 0);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray28, byteArray30, false);
        boolean boolean35 = tarBuffer26.isEOFRecord(byteArray30);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField36 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray30);
        jarArchiveEntry18.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField36);
        boolean boolean38 = jarArchiveEntry18.isDirectory();
        jarArchiveEntry18.setSize(312796988238L);
        jarArchiveEntry18.setSize((long) (short) 100);
        jarArchiveEntry18.setComment("-       0 -       1 ");
        byte[] byteArray45 = jarArchiveEntry18.getLocalFileDataExtra();
        boolean boolean46 = zipShort16.equals((java.lang.Object) jarArchiveEntry18);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 4294967295L + "'", long32 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[117, 99, 5, 0, 1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1233");
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream2);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long11 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray9, 0);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, byteArray9, false);
        boolean boolean14 = tarBuffer5.isEOFRecord(byteArray9);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField15.getHeaderId();
        byte[] byteArray17 = unicodeCommentExtraField15.getLocalFileDataData();
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream20, 1);
        tarArchiveOutputStream22.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer24 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer27 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream22, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer28 = tarArchiveOutputStream22.buffer;
        int int29 = tarBuffer28.getRecordSize();
        byte[] byteArray31 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(852952723L);
        boolean boolean32 = tarBuffer28.isEOFRecord(byteArray31);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, (int) '4', (-1), byteArray31, 99, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField38 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("\ufffd", byteArray31, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4294967295L + "'", long11 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(tarBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-109, 6, -41, 50]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1234");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("-       1 ");
        boolean boolean2 = cpioArchiveEntry1.isSocket();
        cpioArchiveEntry1.setRemoteDeviceMaj((long) (byte) -1);
        short short5 = cpioArchiveEntry1.getFormat();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        tarArchiveOutputStream8.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream8, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = tarArchiveOutputStream8.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        int int17 = tarArchiveOutputStream8.getRecordSize();
        boolean boolean18 = cpioArchiveEntry1.equals((java.lang.Object) int17);
        boolean boolean19 = cpioArchiveEntry1.isDirectory();
        cpioArchiveEntry1.setDeviceMaj((long) ' ');
        cpioArchiveEntry1.setGID(852952723L);
        cpioArchiveEntry1.setRemoteDeviceMaj((long) (byte) -1);
        cpioArchiveEntry1.setSize(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertNotNull(tarBuffer14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1235");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4');
        int int4 = tarArchiveInputStream3.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.InputStream) cpioArchiveInputStream6, 10);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream10);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long19 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray17, 0);
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, byteArray17, false);
        boolean boolean22 = tarBuffer13.isEOFRecord(byteArray17);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray17);
        int int24 = cpioArchiveInputStream6.read(byteArray17);
        int int25 = cpioArchiveInputStream6.available();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4294967295L + "'", long19 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1236");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer3 = new org.apache.commons.compress.archivers.tar.TarBuffer(inputStream0, 0, (int) '#');
        tarBuffer3.close();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream5, 1);
        tarArchiveOutputStream7.closeArchiveEntry();
        byte[] byteArray12 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray12);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        unicodePathExtraField13.setUnicodeName(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = unicodePathExtraField13.getHeaderId();
        byte[] byteArray22 = unicodePathExtraField13.getLocalFileDataData();
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray22, 100, (int) (byte) -1);
        tarArchiveOutputStream7.write(byteArray22, 10, (-1));
        boolean boolean29 = tarBuffer3.isEOFRecord(byteArray22);
        java.lang.String str30 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray22);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zipShort21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 99 + "'", int25 == 99);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001\ufffd\006\ufffd\ufffd\001\000" + "'", str30, "\001\ufffd\006\ufffd\ufffd\001\000");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1237");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        jarArchiveEntry1.setSize(312796988238L);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = jarArchiveEntry1.getExtraFields();
        java.security.cert.Certificate[] certificateArray25 = jarArchiveEntry1.getCertificates();
        java.lang.String str26 = jarArchiveEntry1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
        org.junit.Assert.assertNull(certificateArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1238");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean8 = zipArchiveOutputStream7.isSeekable();
        zipArchiveOutputStream7.setMethod(99);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1239");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int11 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray12);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18, false);
        tarArchiveOutputStream2.write(byteArray13);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) ' ');
        int int26 = tarBuffer25.getCurrentBlockNum();
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1240");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry9.setNames("", "");
        boolean boolean13 = arArchiveEntry6.equals((java.lang.Object) "");
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 1);
        tarArchiveOutputStream16.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16);
        tarArchiveOutputStream16.closeArchiveEntry();
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, (-1), (int) (short) 0, byteArray32, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, (int) (short) 100, (int) '#', byteArray25, 0, (int) (byte) -1);
        tarArchiveOutputStream16.write(byteArray25, (int) (short) 0, (int) (byte) 0);
        boolean boolean44 = arArchiveEntry6.equals((java.lang.Object) (byte) 0);
        long long45 = arArchiveEntry6.getLength();
        int int46 = arArchiveEntry6.getUserId();
        int int47 = arArchiveEntry6.getMode();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1241");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str11 = jarArchiveOutputStream10.getEncoding();
        java.lang.String str12 = jarArchiveOutputStream10.getEncoding();
        jarArchiveOutputStream10.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = null;
        jarArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1242");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream6.closeArchiveEntry();
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1243");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("-       1 ");
        boolean boolean2 = cpioArchiveEntry1.isSocket();
        cpioArchiveEntry1.setRemoteDeviceMaj((long) (byte) -1);
        short short5 = cpioArchiveEntry1.getFormat();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        tarArchiveOutputStream8.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream8, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = tarArchiveOutputStream8.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        int int17 = tarArchiveOutputStream8.getRecordSize();
        boolean boolean18 = cpioArchiveEntry1.equals((java.lang.Object) int17);
        cpioArchiveEntry1.setNumberOfLinks(1711951488916L);
        long long21 = cpioArchiveEntry1.getDeviceMaj();
        cpioArchiveEntry1.setUID(355L);
        cpioArchiveEntry1.setUID((long) (-53));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertNotNull(tarBuffer14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1244");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setComment("-       0 -       1 ");
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry17 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int18 = jarArchiveEntry17.getUnixMode();
        jarArchiveEntry17.setUnixMode((int) ' ');
        long long21 = jarArchiveEntry17.getExternalAttributes();
        byte[] byteArray22 = jarArchiveEntry17.getLocalFileDataExtra();
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) (short) 100);
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray22, byteArray24);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.write(byteArray22, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2097153L + "'", long21 == 2097153L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1245");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) zipArchiveOutputStream6, 0, (-1));
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray20);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray20, (int) (byte) 10);
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, byteArray20);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray15, false);
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray26);
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray26);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("-       0 -       1 ", byteArray28);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField36 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray35);
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray41);
        unicodePathExtraField36.setUnicodeName(byteArray41);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort44 = unicodePathExtraField36.getHeaderId();
        byte[] byteArray45 = unicodePathExtraField36.getLocalFileDataData();
        int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray45, 100, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray49 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray50 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray49);
        boolean boolean52 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray45, byteArray50, false);
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray28, 0, (int) (byte) 1, byteArray50, 99, 0);
        boolean boolean56 = tarBuffer11.isEOFRecord(byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray57 = tarBuffer11.readRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: reading from an output buffer");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[10]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zipShort44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 99 + "'", int48 == 99);
        org.junit.Assert.assertNotNull(zipExtraFieldArray49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1246");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        int int6 = tarArchiveOutputStream2.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1247");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray3);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray9);
        unicodePathExtraField4.setUnicodeName(byteArray9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = unicodePathExtraField4.getHeaderId();
        byte[] byteArray13 = unicodePathExtraField4.getLocalFileDataData();
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray13, 100, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray17);
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18, false);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream21, 1);
        tarArchiveOutputStream23.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer25 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream23);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer28 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream23, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer29 = tarArchiveOutputStream23.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23);
        int int31 = tarArchiveOutputStream23.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream32 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23);
        byte[] byteArray34 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipShort zipShort35 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray34);
        arArchiveOutputStream32.write(byteArray34, (int) 'a', (int) (short) -1);
        boolean boolean40 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray34, 0);
        boolean boolean41 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, byteArray34);
        boolean boolean43 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray34, 100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tarBuffer29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 512 + "'", int31 == 512);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1248");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4');
        int int4 = tarArchiveInputStream3.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.InputStream) cpioArchiveInputStream6, 10);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream10, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream10);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long19 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray17, 0);
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, byteArray17, false);
        boolean boolean22 = tarBuffer13.isEOFRecord(byteArray17);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray17);
        int int24 = cpioArchiveInputStream6.read(byteArray17);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6);
        long long27 = cpioArchiveInputStream6.skip(1711951488916L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4294967295L + "'", long19 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1249");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str11 = jarArchiveOutputStream10.getEncoding();
        java.lang.String str12 = jarArchiveOutputStream10.getEncoding();
        jarArchiveOutputStream10.setUseLanguageEncodingFlag(true);
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = jarArchiveOutputStream10.createArchiveEntry(file15, "\001\ufffd\006\ufffd\ufffd\001\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1250");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        tarArchiveEntry9.setNames("", "");
        boolean boolean13 = arArchiveEntry6.equals((java.lang.Object) "");
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream14, 1);
        tarArchiveOutputStream16.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream16);
        tarArchiveOutputStream16.closeArchiveEntry();
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, (-1), (int) (short) 0, byteArray32, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray21, (int) (short) 100, (int) '#', byteArray25, 0, (int) (byte) -1);
        tarArchiveOutputStream16.write(byteArray25, (int) (short) 0, (int) (byte) 0);
        boolean boolean44 = arArchiveEntry6.equals((java.lang.Object) (byte) 0);
        long long45 = arArchiveEntry6.getSize();
        long long46 = arArchiveEntry6.getSize();
        java.lang.String str47 = arArchiveEntry6.getName();
        int int48 = arArchiveEntry6.getGroupId();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1251");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str3 = tarArchiveEntry2.getUserName();
        java.lang.String str4 = tarArchiveEntry2.getLinkName();
        java.util.Date date5 = tarArchiveEntry2.getModTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(date5);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = unicodePathExtraField10.getHeaderId();
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean21 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray20);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray20, (int) (byte) 10);
        boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, byteArray20);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField25 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        unicodePathExtraField10.setUnicodeName(byteArray15);
        boolean boolean27 = zipLong6.equals((java.lang.Object) unicodePathExtraField10);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = unicodePathExtraField10.getHeaderId();
        byte[] byteArray29 = unicodePathExtraField10.getLocalFileDataData();
        java.io.OutputStream outputStream30 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream30, 1);
        tarArchiveOutputStream32.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer34 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream32);
        tarArchiveOutputStream32.closeArchiveEntry();
        byte[] byteArray37 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray41 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean49 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray48);
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray41, (-1), (int) (short) 0, byteArray48, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean56 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray37, (int) (short) 100, (int) '#', byteArray41, 0, (int) (byte) -1);
        tarArchiveOutputStream32.write(byteArray41, (int) (short) 0, (int) (byte) 0);
        boolean boolean61 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray41, 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong62 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray41);
        byte[] byteArray64 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray66 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long68 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray66, 0);
        boolean boolean70 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray64, byteArray66, false);
        boolean boolean71 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray41, byteArray64);
        unicodePathExtraField10.setUnicodeName(byteArray64);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sun Mar 31 23:05:05 PDT 2024");
        org.junit.Assert.assertNotNull(zipLong6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(zipShort28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, -109, 6, -41, 50, 100, -1]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 4294967295L + "'", long68 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1252");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        tarArchiveOutputStream2.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1253");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        byte[] byteArray15 = unicodeCommentExtraField14.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField14.getLocalFileDataLength();
        unicodeCommentExtraField14.setNameCRC32((long) '#');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipShort16);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1254");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6, (int) ' ');
        zipArchiveOutputStream6.setComment("-       1 ");
        zipArchiveOutputStream6.closeArchiveEntry();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1255");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = unicodeCommentExtraField14.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField14.getHeaderId();
        byte[] byteArray17 = unicodeCommentExtraField14.getLocalFileDataData();
        int int19 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray17, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 65535 + "'", int19 == 65535);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1256");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        boolean boolean8 = jarArchiveOutputStream5.isSeekable();
        jarArchiveOutputStream5.closeArchiveEntry();
        jarArchiveOutputStream5.setMethod((int) (byte) 10);
        jarArchiveOutputStream5.setComment("-       1 ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1257");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1258");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        jarArchiveOutputStream5.setComment("-       1 ");
        boolean boolean10 = jarArchiveOutputStream5.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1259");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4');
        int int4 = tarArchiveInputStream3.available();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long11 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray9, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray9, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray9);
        byte[] byteArray17 = null;
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray9, (int) 'a', (int) (byte) 0, byteArray17, (int) 'a', 0);
        int int23 = zipArchiveInputStream6.read(byteArray9, (int) (byte) -1, (int) (short) -1);
        byte[] byteArray26 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField27 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray26);
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray32);
        unicodePathExtraField27.setUnicodeName(byteArray32);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray36 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray32, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort38 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray32, 0);
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry45 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        int int46 = arArchiveEntry45.getUserId();
        java.io.InputStream inputStream47 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream47, (int) (byte) 0, (int) '4');
        int int51 = tarArchiveInputStream50.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream52 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream50);
        int int53 = cpioArchiveInputStream52.available();
        boolean boolean54 = arArchiveEntry45.equals((java.lang.Object) cpioArchiveInputStream52);
        java.io.OutputStream outputStream55 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream55, 1);
        tarArchiveOutputStream57.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer59 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream57);
        tarArchiveOutputStream57.closeArchiveEntry();
        byte[] byteArray62 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray66 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray73 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean74 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray73);
        boolean boolean78 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray66, (-1), (int) (short) 0, byteArray73, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean81 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray62, (int) (short) 100, (int) '#', byteArray66, 0, (int) (byte) -1);
        tarArchiveOutputStream57.write(byteArray66, (int) (short) 0, (int) (byte) 0);
        boolean boolean86 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray66, 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong87 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray66);
        boolean boolean88 = arArchiveEntry45.equals((java.lang.Object) byteArray66);
        boolean boolean90 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray32, byteArray66, false);
        int int93 = zipArchiveInputStream6.read(byteArray32, (int) (byte) 1, 99);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(tarArchiveEntry5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4294967295L + "'", long11 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray36);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1260");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        zipArchiveOutputStream6.setMethod((int) (short) -1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream11.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archives contains unclosed entries.");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1261");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setComment("-       0 -       1 ");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("-       1 ");
        cpioArchiveEntry15.setGID(312796988387L);
        cpioArchiveEntry15.setUID(312796988238L);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1262");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        boolean boolean8 = jarArchiveOutputStream5.isSeekable();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) jarArchiveOutputStream5, 99, (int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy12 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        java.lang.String str14 = jarArchiveOutputStream5.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1263");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray3 = jarArchiveEntry1.getExtraFields();
        byte[] byteArray4 = jarArchiveEntry1.getExtra();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int7 = jarArchiveEntry6.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = jarArchiveEntry6.getExtraFields();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, 1);
        tarArchiveOutputStream11.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer13 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer16 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream11, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveOutputStream11.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream19, 0, (int) (byte) 1);
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream23, (int) (byte) 0, (int) '4');
        int int27 = tarArchiveInputStream26.available();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream26, (int) (byte) 100, (int) '#');
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray38);
        boolean boolean41 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray38, (int) (byte) 10);
        boolean boolean42 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray33, byteArray38);
        int int43 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray33);
        int int44 = tarArchiveInputStream26.read(byteArray33);
        tarArchiveOutputStream22.write(byteArray33, (int) (byte) 0, 0);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray48 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray33);
        jarArchiveEntry6.setExtraFields(zipExtraFieldArray48);
        jarArchiveEntry1.setExtraFields(zipExtraFieldArray48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertNotNull(tarBuffer17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 65380 + "'", int43 == 65380);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray48);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1264");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Output buffer is closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1265");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        int int3 = jarArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        byte[] byteArray7 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray7);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = unicodePathExtraField8.getHeaderId();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray18, (int) (byte) 10);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray13);
        unicodePathExtraField8.setUnicodeName(byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodePathExtraField8);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry27 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int28 = jarArchiveEntry27.getUnixMode();
        jarArchiveEntry27.setUnixMode((int) ' ');
        long long31 = jarArchiveEntry27.getExternalAttributes();
        byte[] byteArray32 = jarArchiveEntry27.getLocalFileDataExtra();
        byte[] byteArray34 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) (short) 100);
        boolean boolean35 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray32, byteArray34);
        jarArchiveEntry1.setCentralDirectoryExtra(byteArray32);
        java.io.OutputStream outputStream37 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream37, 1);
        tarArchiveOutputStream39.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer41 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream39);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer44 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream39, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer45 = tarArchiveOutputStream39.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream46 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream39);
        tarArchiveOutputStream39.closeArchiveEntry();
        tarArchiveOutputStream39.setLongFileMode((-1));
        boolean boolean50 = jarArchiveEntry1.equals((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2097153L + "'", long31 == 2097153L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(tarBuffer45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1266");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray18);
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, (-1), (int) (short) 0, byteArray18, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, (int) (short) 100, (int) '#', byteArray11, 0, (int) (byte) -1);
        tarArchiveOutputStream2.write(byteArray11, (int) (short) 0, (int) (byte) 0);
        int int30 = tarArchiveOutputStream2.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 512 + "'", int30 == 512);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1267");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str3 = tarArchiveEntry2.getUserName();
        long long4 = tarArchiveEntry2.getSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray5 = tarArchiveEntry2.getDirectoryEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray6 = tarArchiveEntry2.getDirectoryEntries();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7, 1);
        tarArchiveOutputStream9.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer14 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream9, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer15 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream9);
        boolean boolean16 = tarArchiveEntry2.equals((java.lang.Object) tarBuffer15);
        java.lang.String str17 = tarArchiveEntry2.getLinkName();
        tarArchiveEntry2.setMode((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray5);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1268");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int11 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer12 = tarArchiveOutputStream2.buffer;
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertNotNull(tarBuffer12);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1269");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        int int9 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 0, 65380);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry14 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int15 = jarArchiveEntry14.getUnixMode();
        byte[] byteArray18 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray18);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray24);
        unicodePathExtraField19.setUnicodeName(byteArray24);
        unicodePathExtraField19.setNameCRC32(0L);
        jarArchiveEntry14.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodePathExtraField19);
        java.nio.file.attribute.FileTime fileTime30 = jarArchiveEntry14.getLastAccessTime();
        int int31 = jarArchiveEntry14.getMethod();
        long long32 = jarArchiveEntry14.getCrc();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream12.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(fileTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1270");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        long long15 = unicodeCommentExtraField14.getNameCRC32();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField14.getHeaderId();
        java.lang.Object obj17 = zipShort16.clone();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1271");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        long long15 = unicodeCommentExtraField14.getNameCRC32();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField14.getHeaderId();
        byte[] byteArray17 = unicodeCommentExtraField14.getLocalFileDataData();
        int int18 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray17);
        boolean boolean20 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray17, 99);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray17);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65281 + "'", int18 == 65281);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1272");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray9 = null;
        tarArchiveOutputStream2.write(byteArray9, 10, (-1));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1273");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str11 = jarArchiveOutputStream10.getEncoding();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long17 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray15, 0);
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray15, false);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream10.write(byteArray15, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4294967295L + "'", long17 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1274");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        boolean boolean21 = jarArchiveEntry1.isDirectory();
        jarArchiveEntry1.setSize(312796988238L);
        jarArchiveEntry1.setSize((long) (short) 100);
        java.nio.file.attribute.FileTime fileTime26 = jarArchiveEntry1.getLastModifiedTime();
        java.security.cert.Certificate[] certificateArray27 = jarArchiveEntry1.getCertificates();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(fileTime26);
        org.junit.Assert.assertNull(certificateArray27);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1275");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setComment("-       1 ");
        jarArchiveOutputStream5.setLevel(0);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1276");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        jarArchiveEntry1.setUnixMode((int) (short) -1);
        long long4 = jarArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("hi!", (byte) 100);
        java.lang.String str8 = tarArchiveEntry7.getUserName();
        java.lang.String str9 = tarArchiveEntry7.getLinkName();
        java.util.Date date10 = tarArchiveEntry7.getModTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(date10);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray14);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodePathExtraField15.getHeaderId();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray25);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray25, (int) (byte) 10);
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray25);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField30 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray20);
        unicodePathExtraField15.setUnicodeName(byteArray20);
        boolean boolean32 = zipLong11.equals((java.lang.Object) unicodePathExtraField15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = unicodePathExtraField15.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = jarArchiveEntry1.getExtraField(zipShort33);
        java.io.OutputStream outputStream35 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream35, 1);
        tarArchiveOutputStream37.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer39 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream37);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer42 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream37, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer43 = tarArchiveOutputStream37.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream37);
        int int46 = tarArchiveOutputStream37.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray47 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray48 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray47);
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean54 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray53);
        boolean boolean56 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray48, byteArray53, false);
        tarArchiveOutputStream37.write(byteArray48);
        jarArchiveEntry1.setExtra(byteArray48);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Sun Mar 31 23:05:07 PDT 2024");
        org.junit.Assert.assertNotNull(zipLong11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10]");
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zipShort33);
        org.junit.Assert.assertNull(zipExtraField34);
        org.junit.Assert.assertNotNull(tarBuffer43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 512 + "'", int46 == 512);
        org.junit.Assert.assertNotNull(zipExtraFieldArray47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1277");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        boolean boolean7 = zipArchiveOutputStream6.isSeekable();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6, (int) ' ');
        zipArchiveOutputStream6.setComment("-       1 ");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1278");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        cpioArchiveOutputStream7.flush();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream7.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1279");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        jarArchiveOutputStream5.setComment("-       1 ");
        jarArchiveOutputStream5.closeArchiveEntry();
        boolean boolean11 = jarArchiveOutputStream5.isSeekable();
        jarArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy13 = null;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1280");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.write((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1281");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        boolean boolean8 = jarArchiveOutputStream5.isSeekable();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer11 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) jarArchiveOutputStream5, 99, (int) (byte) 100);
        int int12 = tarBuffer11.getCurrentBlockNum();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1282");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        long long21 = jarArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.zip.ZipEntry zipEntry23 = jarArchiveEntry1.setLastModifiedTime(fileTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: lastModifiedTime");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1283");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = arArchiveOutputStream8.createArchiveEntry(file9, "\001\ufffd\006\ufffd\ufffd\001\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1284");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray8);
        unicodePathExtraField3.setUnicodeName(byteArray8);
        unicodePathExtraField3.setNameCRC32(315475202472L);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = unicodePathExtraField3.getLocalFileDataLength();
        byte[] byteArray15 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes("hi!");
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, 1);
        tarArchiveOutputStream20.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer22 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream20);
        tarArchiveOutputStream20.closeArchiveEntry();
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray29 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray36);
        boolean boolean41 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, (-1), (int) (short) 0, byteArray36, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean44 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray25, (int) (short) 100, (int) '#', byteArray29, 0, (int) (byte) -1);
        tarArchiveOutputStream20.write(byteArray29, (int) (short) 0, (int) (byte) 0);
        boolean boolean49 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray29, 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong50 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray29);
        byte[] byteArray52 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray54 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long56 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray54, 0);
        boolean boolean58 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray52, byteArray54, false);
        boolean boolean59 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray29, byteArray52);
        boolean boolean62 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray15, (int) (short) 0, 0, byteArray52, 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            unicodePathExtraField3.parseFromCentralDirectoryData(byteArray52, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: UniCode path extra data must have at least 5 bytes.");
        } catch (java.util.zip.ZipException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 4294967295L + "'", long56 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1285");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (short) 100);
        byte[] byteArray14 = zipLong13.getBytes();
        int int15 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream11.write(byteArray14, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1286");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        tarArchiveOutputStream2.closeArchiveEntry();
        org.junit.Assert.assertNotNull(tarBuffer8);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1287");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str11 = jarArchiveOutputStream10.getEncoding();
        java.lang.String str12 = jarArchiveOutputStream10.getEncoding();
        jarArchiveOutputStream10.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1288");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int2 = jarArchiveEntry1.getUnixMode();
        jarArchiveEntry1.setUnixMode((int) ' ');
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream6, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream6);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 0);
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray13, false);
        boolean boolean18 = tarBuffer9.isEOFRecord(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray13);
        jarArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField19);
        byte[] byteArray21 = unicodeCommentExtraField19.getUnicodeName();
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22, 1);
        tarArchiveOutputStream24.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer26 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream24);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24);
        boolean boolean29 = zipArchiveOutputStream28.isSeekable();
        zipArchiveOutputStream28.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer33 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) zipArchiveOutputStream28, 0, (-1));
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean43 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray42);
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray42, (int) (byte) 10);
        boolean boolean46 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray37, byteArray42);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray48 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray37, false);
        byte[] byteArray49 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray48);
        byte[] byteArray50 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray48);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField51 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("-       0 -       1 ", byteArray50);
        byte[] byteArray57 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField58 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray57);
        byte[] byteArray63 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean64 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray63);
        unicodePathExtraField58.setUnicodeName(byteArray63);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort66 = unicodePathExtraField58.getHeaderId();
        byte[] byteArray67 = unicodePathExtraField58.getLocalFileDataData();
        int int70 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray67, 100, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray71 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] {};
        byte[] byteArray72 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray71);
        boolean boolean74 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray67, byteArray72, false);
        boolean boolean77 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray50, 0, (int) (byte) 1, byteArray72, 99, 0);
        boolean boolean78 = tarBuffer33.isEOFRecord(byteArray50);
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField19.parseFromLocalFileData(byteArray50, 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4294967295L + "'", long15 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[10]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(zipShort66);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[1, -109, 6, -41, 50, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 99 + "'", int70 == 99);
        org.junit.Assert.assertNotNull(zipExtraFieldArray71);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1289");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.closeArchiveEntry();
        jarArchiveOutputStream5.setMethod(97);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.setEncoding("\ufffd");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: d?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1290");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream5.setComment("");
        jarArchiveOutputStream5.setFallbackToUTF8(true);
        jarArchiveOutputStream5.setComment("-       0 -       1 ");
        jarArchiveOutputStream5.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = new org.apache.commons.compress.archivers.zip.ZipShort((int) (short) 100);
        byte[] byteArray20 = zipShort19.getBytes();
        boolean boolean22 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray20, 1);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream5.write(byteArray20, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1291");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream6.setComment("-     100 -       1 ");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1292");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long10 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray8, 0);
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray8, false);
        boolean boolean13 = tarBuffer4.isEOFRecord(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = unicodeCommentExtraField14.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unicodeCommentExtraField14.getHeaderId();
        byte[] byteArray17 = unicodeCommentExtraField14.getUnicodeName();
        byte[] byteArray18 = unicodeCommentExtraField14.getUnicodeName();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4294967295L + "'", long10 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1293");
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream2);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long11 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray9, 0);
        boolean boolean13 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray7, byteArray9, false);
        boolean boolean14 = tarBuffer5.isEOFRecord(byteArray9);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray9);
        byte[] byteArray16 = unicodeCommentExtraField15.getCentralDirectoryData();
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray22 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray29);
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray22, (-1), (int) (short) 0, byteArray29, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray18, (int) (short) 100, (int) '#', byteArray22, 0, (int) (byte) -1);
        boolean boolean38 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray16, byteArray22);
        boolean boolean40 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, (int) (byte) 100);
        java.io.OutputStream outputStream42 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream42, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer45 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream42);
        byte[] byteArray47 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray49 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long51 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray49, 0);
        boolean boolean53 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray47, byteArray49, false);
        boolean boolean54 = tarBuffer45.isEOFRecord(byteArray49);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField55 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray49);
        byte[] byteArray56 = unicodeCommentExtraField55.getCentralDirectoryData();
        boolean boolean58 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray56, (-1));
        boolean boolean60 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray22, byteArray56, true);
        boolean boolean62 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray56, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 10, byteArray56, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4294967295L + "'", long11 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 4294967295L + "'", long51 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1294");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("hi!");
        int int3 = jarArchiveEntry2.getUnixMode();
        jarArchiveEntry2.setUnixMode((int) ' ');
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7, 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer10 = new org.apache.commons.compress.archivers.tar.TarBuffer(outputStream7);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        long long16 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray14, 0);
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray12, byteArray14, false);
        boolean boolean19 = tarBuffer10.isEOFRecord(byteArray14);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField20 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray14);
        jarArchiveEntry2.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField20);
        boolean boolean22 = jarArchiveEntry2.isDirectory();
        jarArchiveEntry2.setSize(312796988238L);
        jarArchiveEntry2.setSize((long) (short) 100);
        jarArchiveEntry2.setComment("-       0 -       1 ");
        byte[] byteArray29 = jarArchiveEntry2.getLocalFileDataExtra();
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("-     100 -       1 ", byteArray29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 4294967295L + "'", long16 == 4294967295L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[117, 99, 5, 0, 1, -1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1295");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 1);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer4 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer7 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100, (int) '4');
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveOutputStream2.buffer;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10, 0, (int) (byte) 1);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream14, (int) (byte) 0, (int) '4');
        int int18 = tarArchiveInputStream17.available();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream17, (int) (byte) 100, (int) '#');
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) -1 };
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray29);
        boolean boolean32 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray29, (int) (byte) 10);
        boolean boolean33 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray24, byteArray29);
        int int34 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray24);
        int int35 = tarArchiveInputStream17.read(byteArray24);
        tarArchiveOutputStream13.write(byteArray24, (int) (byte) 0, 0);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray39 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray24);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort40 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong41 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, -1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 65380 + "'", int34 == 65380);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray39);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test1296");
        byte[] byteArray3 = new byte[] { (byte) 10 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray3);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray9);
        unicodePathExtraField4.setUnicodeName(byteArray9);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray9, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray9, 0);
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry22 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", 1L, (int) (byte) 0, (int) (short) -1, 1, 1L);
        int int23 = arArchiveEntry22.getUserId();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream24, (int) (byte) 0, (int) '4');
        int int28 = tarArchiveInputStream27.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream27);
        int int30 = cpioArchiveInputStream29.available();
        boolean boolean31 = arArchiveEntry22.equals((java.lang.Object) cpioArchiveInputStream29);
        java.io.OutputStream outputStream32 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream32, 1);
        tarArchiveOutputStream34.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer36 = new org.apache.commons.compress.archivers.tar.TarBuffer((java.io.OutputStream) tarArchiveOutputStream34);
        tarArchiveOutputStream34.closeArchiveEntry();
        byte[] byteArray39 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        byte[] byteArray43 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((-1L));
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean51 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("hi!", byteArray50);
        boolean boolean55 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray43, (-1), (int) (short) 0, byteArray50, (int) (byte) 10, (int) (byte) 10, false);
        boolean boolean58 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray39, (int) (short) 100, (int) '#', byteArray43, 0, (int) (byte) -1);
        tarArchiveOutputStream34.write(byteArray43, (int) (short) 0, (int) (byte) 0);
        boolean boolean63 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray43, 0);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong64 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray43);
        boolean boolean65 = arArchiveEntry22.equals((java.lang.Object) byteArray43);
        boolean boolean67 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray9, byteArray43, false);
        boolean boolean68 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("\ufffd", byteArray43);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }
}
