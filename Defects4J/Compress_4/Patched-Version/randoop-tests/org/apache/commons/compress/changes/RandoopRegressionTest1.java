package org.apache.commons.compress.changes;

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
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 8);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test502");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        zipArchiveOutputStream16.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test503");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        long long3 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField4 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = asiExtraField4.getHeaderId();
        byte[] byteArray6 = asiExtraField4.getLocalFileDataData();
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean15 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, (int) (short) 1);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray13);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = unicodeCommentExtraField18.getHeaderId();
        byte[] byteArray20 = unicodeCommentExtraField18.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray22 = asiExtraField21.getLocalFileDataData();
        int int23 = asiExtraField21.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort24 = asiExtraField21.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField25 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort24);
        byte[] byteArray26 = zipExtraField25.getLocalFileDataData();
        byte[] byteArray27 = zipExtraField25.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField4, unicodeCommentExtraField18, zipExtraField25 };
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray28);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
        zipArchiveEntry1.setCrc(16777216L);
        java.io.InputStream inputStream33 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream33, (int) 'a');
        tarArchiveInputStream35.close();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream37 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream35);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry38 = jarArchiveInputStream37.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry39 = jarArchiveInputStream37.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry40 = jarArchiveInputStream37.getNextJarEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) jarArchiveInputStream37);
        java.io.OutputStream outputStream42 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream42, (int) '4');
        tarArchiveOutputStream44.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField48 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj49 = asiExtraField48.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField50 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField51 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj52 = asiExtraField51.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField53 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField54 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField55 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray56 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField48, asiExtraField50, asiExtraField51, asiExtraField53, asiExtraField54, asiExtraField55 };
        byte[] byteArray57 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray56);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField58 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray57);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField59 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray57);
        tarArchiveOutputStream44.write(byteArray57, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort63 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray57);
        boolean boolean65 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray57, (int) (byte) 1);
        int int68 = jarArchiveInputStream37.read(byteArray57, (int) (byte) 100, 100);
        boolean boolean69 = zipArchiveEntry1.equals((java.lang.Object) jarArchiveInputStream37);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry70 = jarArchiveInputStream37.getNextJarEntry();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(zipShort24);
        org.junit.Assert.assertNotNull(zipExtraField25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertNull(jarArchiveEntry38);
        org.junit.Assert.assertNull(jarArchiveEntry39);
        org.junit.Assert.assertNull(jarArchiveEntry40);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(zipExtraFieldArray56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(jarArchiveEntry70);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test504");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) 'a');
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int9 = tarArchiveInputStream2.read(byteArray8);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        cpioArchiveInputStream12.close();
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream14, (int) 'a');
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int23 = tarArchiveInputStream16.read(byteArray22);
        tarArchiveInputStream16.reset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream16);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream26 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream16);
        long long28 = tarArchiveInputStream16.skip(0L);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream29 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream16);
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream30, (int) 'a');
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int39 = tarArchiveInputStream32.read(byteArray38);
        int int40 = tarArchiveInputStream32.available();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream32);
        java.io.OutputStream outputStream42 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream42, (int) '4');
        tarArchiveOutputStream44.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField48 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj49 = asiExtraField48.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField50 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField51 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj52 = asiExtraField51.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField53 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField54 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField55 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray56 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField48, asiExtraField50, asiExtraField51, asiExtraField53, asiExtraField54, asiExtraField55 };
        byte[] byteArray57 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray56);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField58 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray57);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField59 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray57);
        tarArchiveOutputStream44.write(byteArray57, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort63 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray57);
        int int66 = tarArchiveInputStream32.read(byteArray57, 16384, 0);
        int int69 = arArchiveInputStream29.read(byteArray57, (int) (short) -1, 36864);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField70 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray71 = asiExtraField70.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort72 = asiExtraField70.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort73 = asiExtraField70.getHeaderId();
        java.lang.Object obj74 = asiExtraField70.clone();
        byte[] byteArray75 = asiExtraField70.getCentralDirectoryData();
        int int78 = arArchiveInputStream29.read(byteArray75, (int) (short) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int81 = cpioArchiveInputStream12.read(byteArray75, 2048, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(zipExtraFieldArray56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort72);
        org.junit.Assert.assertNotNull(zipShort73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test505");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        byte[] byteArray26 = null;
        arArchiveOutputStream25.write(byteArray26, 0, 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test506");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry16.getLastAccessTime();
        long long18 = zipArchiveEntry16.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField19 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = asiExtraField19.getHeaderId();
        byte[] byteArray21 = asiExtraField19.getLocalFileDataData();
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean30 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray28, (int) (short) 1);
        boolean boolean32 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray28, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField33 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray28);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort34 = unicodeCommentExtraField33.getHeaderId();
        byte[] byteArray35 = unicodeCommentExtraField33.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField36 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray37 = asiExtraField36.getLocalFileDataData();
        int int38 = asiExtraField36.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort39 = asiExtraField36.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField40 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort39);
        byte[] byteArray41 = zipExtraField40.getLocalFileDataData();
        byte[] byteArray42 = zipExtraField40.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray43 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField19, unicodeCommentExtraField33, zipExtraField40 };
        zipArchiveEntry16.setExtraFields(zipExtraFieldArray43);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry16);
        java.lang.String str46 = zipArchiveEntry45.getComment();
        java.lang.String str47 = zipArchiveEntry45.getName();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry45);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(fileTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zipShort34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(zipShort39);
        org.junit.Assert.assertNotNull(zipExtraField40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "070702" + "'", str47, "070702");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test507");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        tarArchiveOutputStream22.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField27 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj28 = asiExtraField27.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField29 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField30 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj31 = asiExtraField30.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField32 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField33 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField34 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField27, asiExtraField29, asiExtraField30, asiExtraField32, asiExtraField33, asiExtraField34 };
        byte[] byteArray36 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray35);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField37 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray36);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField38 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray36);
        byte[] byteArray39 = unicodePathExtraField38.getLocalFileDataData();
        byte[] byteArray41 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        unicodePathExtraField38.setUnicodeName(byteArray41);
        byte[] byteArray43 = unicodePathExtraField38.getUnicodeName();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream22.write(byteArray43, 14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '35' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 69, 102, 25, 55, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10, 0, 0, 0]");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test508");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.closeArchiveEntry();
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test509");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField27 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = unicodePathExtraField27.getHeaderId();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField29 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray30 = asiExtraField29.getCentralDirectoryData();
        unicodePathExtraField27.setUnicodeName(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort32 = unicodePathExtraField27.getHeaderId();
        zipArchiveEntry26.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodePathExtraField27);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream34, (int) 'a');
        tarArchiveInputStream36.reset();
        byte[] byteArray39 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int40 = tarArchiveInputStream36.read(byteArray39);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = zipArchiveInputStream41.getNextZipEntry();
        long long44 = zipArchiveInputStream41.skip(0L);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField45 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj46 = asiExtraField45.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField47 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField48 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj49 = asiExtraField48.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField50 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField51 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField52 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray53 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField45, asiExtraField47, asiExtraField48, asiExtraField50, asiExtraField51, asiExtraField52 };
        byte[] byteArray54 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray53);
        byte[] byteArray55 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray53);
        byte[] byteArray56 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray53);
        int int59 = zipArchiveInputStream41.read(byteArray56, 256, (int) (short) -1);
        zipArchiveEntry26.setExtra(byteArray56);
        zipArchiveEntry26.setSize(30062L);
        int int63 = zipArchiveEntry26.getInternalAttributes();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream24.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "not encodeable" + "'", str19, "not encodeable");
        org.junit.Assert.assertNotNull(zipShort28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort32);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(zipExtraFieldArray53);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test510");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        tarArchiveOutputStream4.finish();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test511");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        zipArchiveOutputStream3.setEncoding("never");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.setLevel((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test512");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream9.finish();
        tarArchiveOutputStream9.setLongFileMode(0);
        tarArchiveOutputStream9.finish();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test513");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.lang.String str18 = jarArchiveOutputStream17.getEncoding();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream17);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF8" + "'", str18, "UTF8");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test514");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 28789, 22752);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 12");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test515");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13);
        zipArchiveOutputStream14.setComment("org.apache.commons.compress.archivers.ArchiveException: hi!");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream14);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry19.getLastAccessTime();
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream21, (int) 'a');
        tarArchiveInputStream23.reset();
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int27 = tarArchiveInputStream23.read(byteArray26);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream23);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = zipArchiveInputStream28.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream28);
        boolean boolean31 = cpioArchiveInputStream30.markSupported();
        boolean boolean32 = zipArchiveEntry19.equals((java.lang.Object) cpioArchiveInputStream30);
        long long33 = zipArchiveEntry19.getCompressedSize();
        long long34 = zipArchiveEntry19.getTime();
        int int35 = zipArchiveEntry19.getPlatform();
        long long36 = zipArchiveEntry19.getTime();
        zipArchiveEntry19.setTime((long) (short) 3);
        byte[] byteArray39 = zipArchiveEntry19.getExtra();
        int int40 = zipArchiveEntry19.getUnixMode();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField41 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray42 = asiExtraField41.getLocalFileDataData();
        int int43 = asiExtraField41.getMode();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray44 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField41 };
        byte[] byteArray45 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray44);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray47 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray45, true);
        zipArchiveEntry19.setExtraFields(zipExtraFieldArray47);
        byte[] byteArray49 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray47);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream17.write(byteArray49);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '18' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNull(byteArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray47);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[110, 117, 14, 0, 57, 104, -33, -123, 0, -128, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test516");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        tarArchiveOutputStream9.finish();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test517");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        boolean boolean6 = jarArchiveOutputStream5.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test518");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream3.setMethod(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        int int19 = zipArchiveEntry18.getMethod();
        int int20 = zipArchiveEntry18.getPlatform();
        int int21 = zipArchiveEntry18.getInternalAttributes();
        long long22 = zipArchiveEntry18.getTime();
        long long23 = zipArchiveEntry18.getSize();
        byte[] byteArray24 = zipArchiveEntry18.getLocalFileDataExtra();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream16.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test519");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13);
        zipArchiveOutputStream14.setComment("org.apache.commons.compress.archivers.ArchiveException: hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str18 = unicodeExtraFieldPolicy17.toString();
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy17);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream14, 493);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "not encodeable" + "'", str18, "not encodeable");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test520");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        zipArchiveOutputStream5.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream9, (int) 'a');
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int18 = tarArchiveInputStream11.read(byteArray17);
        tarArchiveInputStream11.reset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream11, (int) (byte) 0, (int) (short) 3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream11, 10);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField29 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj30 = asiExtraField29.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField31 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField32 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj33 = asiExtraField32.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField34 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField35 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField36 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray37 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField29, asiExtraField31, asiExtraField32, asiExtraField34, asiExtraField35, asiExtraField36 };
        byte[] byteArray38 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray37);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField39 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray38);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField40 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray38);
        int int43 = tarArchiveInputStream11.read(byteArray38, 100, 8);
        tarArchiveOutputStream8.write(byteArray38, (int) (byte) 1, (int) (short) -1);
        int int47 = tarArchiveOutputStream8.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream48 = archiveStreamFactory0.createArchiveOutputStream("070707", (java.io.OutputStream) tarArchiveOutputStream8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 070707 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(zipExtraFieldArray37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 512 + "'", int47 == 512);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test521");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        tarArchiveOutputStream2.setLongFileMode(3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 0);
        java.io.File file26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = tarArchiveOutputStream23.createArchiveEntry(file26, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test522");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        java.lang.String str11 = zipArchiveOutputStream3.getEncoding();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        int int13 = tarArchiveOutputStream12.getRecordSize();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 512 + "'", int13 == 512);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test523");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        arArchiveOutputStream13.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker16 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = jarMarker16.getCentralDirectoryLength();
        byte[] byteArray18 = jarMarker16.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField19 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = asiExtraField19.getHeaderId();
        asiExtraField19.setGroupId(256);
        byte[] byteArray23 = asiExtraField19.getCentralDirectoryData();
        jarMarker16.parseFromCentralDirectoryData(byteArray23, 0, 0);
        byte[] byteArray27 = jarMarker16.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField28 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream13.write(byteArray27, 24576, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-32, 88, -115, -108, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test524");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 64, 30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 420, 493);
        tarArchiveOutputStream15.closeArchiveEntry();
        tarArchiveOutputStream15.setLongFileMode(100);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test525");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 28789, 22752);
        arArchiveOutputStream26.closeArchiveEntry();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test526");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("UTF8");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setUnixMode(2048);
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastModifiedTime();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream7);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream10);
        boolean boolean12 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveOutputStream11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test527");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        int int26 = tarArchiveOutputStream2.getRecordSize();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test528");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        zipArchiveOutputStream3.setComment("070702");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray14 = asiExtraField13.getLocalFileDataData();
        int int15 = asiExtraField13.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = asiExtraField13.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        int int20 = asiExtraField18.getGroupId();
        boolean boolean21 = zipShort16.equals((java.lang.Object) asiExtraField18);
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24);
        zipArchiveOutputStream25.closeArchiveEntry();
        boolean boolean27 = zipShort16.equals((java.lang.Object) zipArchiveOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy29 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        zipArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        java.lang.String str31 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 511);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream34, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream34.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "not encodeable" + "'", str31, "not encodeable");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test529");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        boolean boolean16 = zipArchiveOutputStream12.isSeekable();
        boolean boolean17 = zipArchiveOutputStream12.isSeekable();
        zipArchiveOutputStream12.setUseLanguageEncodingFlag(true);
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 24576);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.write(byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 33, 0, 0]");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test530");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream4.setMethod(2);
        zipArchiveOutputStream4.flush();
        boolean boolean8 = zipArchiveOutputStream4.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test531");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        zipArchiveOutputStream5.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str9 = unicodeExtraFieldPolicy8.toString();
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        boolean boolean18 = zipArchiveOutputStream5.isSeekable();
        java.lang.String str19 = zipArchiveOutputStream5.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream20 = archiveStreamFactory0.createArchiveOutputStream("org.apache.commons.compress.archivers.ArchiveException: ", (java.io.OutputStream) zipArchiveOutputStream5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: org.apache.commons.compress.archivers.ArchiveException:  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "not encodeable" + "'", str9, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF8" + "'", str19, "UTF8");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test532");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.lang.String str7 = zipArchiveOutputStream3.getEncoding();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test533");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.setEncoding("org.apache.commons.compress.archivers.ArchiveException: org.apache.commons.compress.archivers.ArchiveException: not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: org.apache.commons.compress.archivers.ArchiveException: org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test534");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray24 = asiExtraField23.getCentralDirectoryData();
        byte[] byteArray25 = asiExtraField23.getLocalFileDataData();
        tarArchiveOutputStream22.write(byteArray25, 0, 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream22.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test535");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        zipArchiveOutputStream10.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str14 = unicodeExtraFieldPolicy13.toString();
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        java.lang.String str17 = unicodeExtraFieldPolicy13.toString();
        java.lang.String str18 = unicodeExtraFieldPolicy13.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "not encodeable" + "'", str14, "not encodeable");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "not encodeable" + "'", str17, "not encodeable");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "not encodeable" + "'", str18, "not encodeable");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test536");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        jarArchiveOutputStream5.setMethod(128);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test537");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 64, 30062);
        zipArchiveOutputStream3.setMethod(0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test538");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 64, 30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 420, 493);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test539");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        int int5 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField7 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj8 = asiExtraField7.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField10 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj11 = asiExtraField10.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField14 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField7, asiExtraField9, asiExtraField10, asiExtraField12, asiExtraField13, asiExtraField14 };
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray15);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray16);
        boolean boolean19 = zipLong17.equals((java.lang.Object) 24576);
        byte[] byteArray20 = zipLong17.getBytes();
        boolean boolean22 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray20, 8192);
        long long23 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.write(byteArray20, 26742, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[110, 117, 14, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 947566L + "'", long23 == 947566L);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test540");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test541");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setComment("org.apache.commons.compress.archivers.ArchiveException: org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test542");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 64, 30062);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) 2);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField17 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj18 = asiExtraField17.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField19 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj21 = asiExtraField20.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField22 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray25 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField17, asiExtraField19, asiExtraField20, asiExtraField22, asiExtraField23, asiExtraField24 };
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray25);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField27 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray26);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField28 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray26);
        byte[] byteArray29 = unicodePathExtraField28.getLocalFileDataData();
        byte[] byteArray30 = unicodePathExtraField28.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream14.write(byteArray30, (int) (short) 100, 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(zipExtraFieldArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 69, 102, 25, 55, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 69, 102, 25, 55, 104, 105, 33]");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test543");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = zipArchiveOutputStream3.createArchiveEntry(file13, "070701");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test544");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test545");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        arArchiveOutputStream5.close();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test546");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setMethod(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test547");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream22.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '420' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test548");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream7, (int) 'a');
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int16 = tarArchiveInputStream9.read(byteArray15);
        tarArchiveInputStream9.reset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9, (int) (byte) 0, (int) (short) 3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9, 10);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField27 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj28 = asiExtraField27.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField29 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField30 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj31 = asiExtraField30.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField32 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField33 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField34 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField27, asiExtraField29, asiExtraField30, asiExtraField32, asiExtraField33, asiExtraField34 };
        byte[] byteArray36 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray35);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField37 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray36);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField38 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray36);
        int int41 = tarArchiveInputStream9.read(byteArray36, 100, 8);
        tarArchiveOutputStream6.write(byteArray36, (int) (byte) 1, (int) (short) -1);
        tarArchiveOutputStream6.finish();
        tarArchiveOutputStream6.finish();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test549");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray24 = asiExtraField23.getCentralDirectoryData();
        byte[] byteArray25 = asiExtraField23.getLocalFileDataData();
        tarArchiveOutputStream22.write(byteArray25, 0, 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        java.io.File file30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = tarArchiveOutputStream22.createArchiveEntry(file30, "org.apache.commons.compress.archivers.ArchiveException: org.apache.commons.compress.archivers.ArchiveException: not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test550");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream14.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test551");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        boolean boolean14 = zipArchiveOutputStream3.isSeekable();
        java.lang.String str15 = zipArchiveOutputStream3.getEncoding();
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream16, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18);
        zipArchiveOutputStream19.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str23 = unicodeExtraFieldPolicy22.toString();
        zipArchiveOutputStream19.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        zipArchiveOutputStream19.setComment("");
        zipArchiveOutputStream19.setComment("070702");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField29 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray30 = asiExtraField29.getLocalFileDataData();
        int int31 = asiExtraField29.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort32 = asiExtraField29.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField33 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort32);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField34 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj35 = asiExtraField34.clone();
        int int36 = asiExtraField34.getGroupId();
        boolean boolean37 = zipShort32.equals((java.lang.Object) asiExtraField34);
        java.io.OutputStream outputStream38 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream38, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream40);
        zipArchiveOutputStream41.closeArchiveEntry();
        boolean boolean43 = zipShort32.equals((java.lang.Object) zipArchiveOutputStream41);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream44 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream41);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy45 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        zipArchiveOutputStream44.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy45);
        java.lang.String str47 = unicodeExtraFieldPolicy45.toString();
        zipArchiveOutputStream19.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy45);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy45);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF8" + "'", str15, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "not encodeable" + "'", str23, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(zipShort32);
        org.junit.Assert.assertNotNull(zipExtraField33);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "not encodeable" + "'", str47, "not encodeable");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test552");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        long long3 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField4 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = asiExtraField4.getHeaderId();
        byte[] byteArray6 = asiExtraField4.getLocalFileDataData();
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean15 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, (int) (short) 1);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray13);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = unicodeCommentExtraField18.getHeaderId();
        byte[] byteArray20 = unicodeCommentExtraField18.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray22 = asiExtraField21.getLocalFileDataData();
        int int23 = asiExtraField21.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort24 = asiExtraField21.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField25 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort24);
        byte[] byteArray26 = zipExtraField25.getLocalFileDataData();
        byte[] byteArray27 = zipExtraField25.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField4, unicodeCommentExtraField18, zipExtraField25 };
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray28);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
        zipArchiveEntry1.setCrc(16777216L);
        java.io.InputStream inputStream33 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream33, (int) 'a');
        tarArchiveInputStream35.close();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream37 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream35);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry38 = jarArchiveInputStream37.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry39 = jarArchiveInputStream37.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry40 = jarArchiveInputStream37.getNextJarEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) jarArchiveInputStream37);
        java.io.OutputStream outputStream42 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream42, (int) '4');
        tarArchiveOutputStream44.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField48 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj49 = asiExtraField48.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField50 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField51 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj52 = asiExtraField51.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField53 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField54 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField55 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray56 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField48, asiExtraField50, asiExtraField51, asiExtraField53, asiExtraField54, asiExtraField55 };
        byte[] byteArray57 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray56);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField58 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray57);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField59 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray57);
        tarArchiveOutputStream44.write(byteArray57, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort63 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray57);
        boolean boolean65 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray57, (int) (byte) 1);
        int int68 = jarArchiveInputStream37.read(byteArray57, (int) (byte) 100, 100);
        boolean boolean69 = zipArchiveEntry1.equals((java.lang.Object) jarArchiveInputStream37);
        zipArchiveEntry1.setInternalAttributes((int) (byte) 0);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(zipShort24);
        org.junit.Assert.assertNotNull(zipExtraField25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertNull(jarArchiveEntry38);
        org.junit.Assert.assertNull(jarArchiveEntry39);
        org.junit.Assert.assertNull(jarArchiveEntry40);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(zipExtraFieldArray56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test553");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.closeArchiveEntry();
        zipArchiveOutputStream3.setMethod(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test554");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        zipArchiveOutputStream5.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str9 = unicodeExtraFieldPolicy8.toString();
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        boolean boolean16 = zipArchiveOutputStream5.isSeekable();
        java.lang.String str17 = zipArchiveOutputStream5.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream18 = archiveStreamFactory0.createArchiveOutputStream("", (java.io.OutputStream) zipArchiveOutputStream5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver:  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "not encodeable" + "'", str9, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF8" + "'", str17, "UTF8");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test555");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test556");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream15.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        java.lang.String str18 = zipArchiveOutputStream15.getEncoding();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF8" + "'", str18, "UTF8");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test557");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) 'a');
        tarArchiveInputStream2.close();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = jarArchiveInputStream4.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry6 = jarArchiveInputStream4.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = jarArchiveInputStream4.getNextJarEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) jarArchiveInputStream4);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        tarArchiveOutputStream11.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField15 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj16 = asiExtraField15.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField17 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField22 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray23 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField15, asiExtraField17, asiExtraField18, asiExtraField20, asiExtraField21, asiExtraField22 };
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray23);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField25 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray24);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray24);
        tarArchiveOutputStream11.write(byteArray24, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray24);
        boolean boolean32 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray24, (int) (byte) 1);
        int int35 = jarArchiveInputStream4.read(byteArray24, (int) (byte) 100, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = jarArchiveInputStream4.getNextEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry37 = jarArchiveInputStream4.getNextJarEntry();
        org.junit.Assert.assertNull(jarArchiveEntry5);
        org.junit.Assert.assertNull(jarArchiveEntry6);
        org.junit.Assert.assertNull(jarArchiveEntry7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(zipExtraFieldArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(archiveEntry36);
        org.junit.Assert.assertNull(jarArchiveEntry37);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test558");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) 8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime23 = zipArchiveEntry22.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime26 = zipArchiveEntry25.getLastAccessTime();
        long long27 = zipArchiveEntry25.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField28 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = asiExtraField28.getHeaderId();
        byte[] byteArray30 = asiExtraField28.getLocalFileDataData();
        byte[] byteArray37 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean39 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray37, (int) (short) 1);
        boolean boolean41 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray37, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField42 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray37);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort43 = unicodeCommentExtraField42.getHeaderId();
        byte[] byteArray44 = unicodeCommentExtraField42.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField45 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray46 = asiExtraField45.getLocalFileDataData();
        int int47 = asiExtraField45.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort48 = asiExtraField45.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField49 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort48);
        byte[] byteArray50 = zipExtraField49.getLocalFileDataData();
        byte[] byteArray51 = zipExtraField49.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray52 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField28, unicodeCommentExtraField42, zipExtraField49 };
        zipArchiveEntry25.setExtraFields(zipExtraFieldArray52);
        zipArchiveEntry22.setExtraFields(zipExtraFieldArray52);
        long long55 = zipArchiveEntry22.getTime();
        zipArchiveEntry22.setCrc((long) 36864);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream20.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertNull(fileTime23);
        org.junit.Assert.assertNull(fileTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(zipShort29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(zipShort43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(zipShort48);
        org.junit.Assert.assertNotNull(zipExtraField49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test559");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.File file18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = zipArchiveOutputStream3.createArchiveEntry(file18, "org.apache.commons.compress.archivers.ArchiveException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test560");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.close();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test561");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setComment("TRAILER!!!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "not encodeable" + "'", str19, "not encodeable");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test562");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray24 = asiExtraField23.getCentralDirectoryData();
        byte[] byteArray25 = asiExtraField23.getLocalFileDataData();
        tarArchiveOutputStream22.write(byteArray25, 0, 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        java.io.File file30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = cpioArchiveOutputStream29.createArchiveEntry(file30, "org.apache.commons.compress.archivers.ArchiveException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test563");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        arArchiveOutputStream13.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test564");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setComment("not encodeable");
        zipArchiveOutputStream3.closeArchiveEntry();
        boolean boolean7 = zipArchiveOutputStream3.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test565");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream15.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        zipArchiveOutputStream15.setFallbackToUTF8(false);
        zipArchiveOutputStream15.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test566");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 26742);
        arArchiveOutputStream26.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream30.setLevel((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test567");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        java.lang.String str11 = zipArchiveOutputStream3.getEncoding();
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean21 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray19, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField22 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray19);
        boolean boolean24 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (byte) 0);
        int int25 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray19);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray19, (int) (short) 2, 36864);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 65280 + "'", int25 == 65280);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test568");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setFallbackToUTF8(true);
        zipArchiveOutputStream3.setComment("070702");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test569");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        zipArchiveOutputStream16.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream19 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream16);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test570");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        zipArchiveOutputStream3.setComment("070702");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray14 = asiExtraField13.getLocalFileDataData();
        int int15 = asiExtraField13.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = asiExtraField13.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        int int20 = asiExtraField18.getGroupId();
        boolean boolean21 = zipShort16.equals((java.lang.Object) asiExtraField18);
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24);
        zipArchiveOutputStream25.closeArchiveEntry();
        boolean boolean27 = zipShort16.equals((java.lang.Object) zipArchiveOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy29 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        zipArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        java.lang.String str31 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 511);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream34, (short) 1);
        java.io.File file37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry39 = tarArchiveOutputStream34.createArchiveEntry(file37, "TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "not encodeable" + "'", str31, "not encodeable");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test571");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod(28789);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream1.createArchiveEntry(file7, "org.apache.commons.compress.archivers.ArchiveException: org.apache.commons.compress.archivers.ArchiveException: not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test572");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15, 49152);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.putArchiveEntry(archiveEntry19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test573");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        arArchiveOutputStream13.closeArchiveEntry();
        arArchiveOutputStream13.closeArchiveEntry();
        arArchiveOutputStream13.closeArchiveEntry();
        java.io.File file18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = arArchiveOutputStream13.createArchiveEntry(file18, "org.apache.commons.compress.archivers.ArchiveException: TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test574");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        boolean boolean16 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.closeArchiveEntry();
        zipArchiveOutputStream3.setComment("TRAILER!!!");
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime24 = zipArchiveEntry23.getLastAccessTime();
        long long25 = zipArchiveEntry23.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField26 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort27 = asiExtraField26.getHeaderId();
        byte[] byteArray28 = asiExtraField26.getLocalFileDataData();
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean37 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray35, (int) (short) 1);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray35, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField40 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray35);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort41 = unicodeCommentExtraField40.getHeaderId();
        byte[] byteArray42 = unicodeCommentExtraField40.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField43 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray44 = asiExtraField43.getLocalFileDataData();
        int int45 = asiExtraField43.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort46 = asiExtraField43.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField47 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort46);
        byte[] byteArray48 = zipExtraField47.getLocalFileDataData();
        byte[] byteArray49 = zipExtraField47.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray50 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField26, unicodeCommentExtraField40, zipExtraField47 };
        zipArchiveEntry23.setExtraFields(zipExtraFieldArray50);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry52 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry23);
        java.lang.String str53 = zipArchiveEntry52.getName();
        java.lang.String str54 = zipArchiveEntry52.getComment();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression method");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(fileTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(zipShort27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(zipShort41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(zipShort46);
        org.junit.Assert.assertNotNull(zipExtraField47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "070702" + "'", str53, "070702");
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test575");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        boolean boolean14 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.closeArchiveEntry();
        zipArchiveOutputStream3.setMethod(1024);
        zipArchiveOutputStream3.setMethod(2048);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test576");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 100, 493);
        tarArchiveOutputStream3.setLongFileMode((int) '4');
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test577");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 36864);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test578");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveOutputStream4.createArchiveEntry(file5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test579");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream3.setMethod(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test580");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        arArchiveOutputStream13.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        arArchiveOutputStream13.closeArchiveEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream13.putArchiveEntry(archiveEntry20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test581");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) 420);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream11.write(byteArray13, (int) (short) -1, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-92, 1, 0, 0]");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test582");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        int int14 = tarArchiveOutputStream13.getRecordSize();
        tarArchiveOutputStream13.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, (short) 2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream17.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test583");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) 'a');
        tarArchiveInputStream2.close();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = jarArchiveInputStream4.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry6 = jarArchiveInputStream4.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = jarArchiveInputStream4.getNextJarEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) jarArchiveInputStream4);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        tarArchiveOutputStream11.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField15 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj16 = asiExtraField15.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField17 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField22 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray23 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField15, asiExtraField17, asiExtraField18, asiExtraField20, asiExtraField21, asiExtraField22 };
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray23);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField25 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray24);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray24);
        tarArchiveOutputStream11.write(byteArray24, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray24);
        boolean boolean32 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray24, (int) (byte) 1);
        int int35 = jarArchiveInputStream4.read(byteArray24, (int) (byte) 100, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = jarArchiveInputStream4.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = jarArchiveInputStream4.getNextEntry();
        org.junit.Assert.assertNull(jarArchiveEntry5);
        org.junit.Assert.assertNull(jarArchiveEntry6);
        org.junit.Assert.assertNull(jarArchiveEntry7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(zipExtraFieldArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(archiveEntry36);
        org.junit.Assert.assertNull(archiveEntry37);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test584");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test585");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        java.lang.String str13 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str14 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str15 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str16 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str17 = unicodeExtraFieldPolicy10.toString();
        java.lang.String str18 = unicodeExtraFieldPolicy10.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "not encodeable" + "'", str13, "not encodeable");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "not encodeable" + "'", str14, "not encodeable");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "not encodeable" + "'", str15, "not encodeable");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "not encodeable" + "'", str17, "not encodeable");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "not encodeable" + "'", str18, "not encodeable");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test586");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) (short) 100, 493);
        tarArchiveOutputStream3.setLongFileMode(3);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test587");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream4.setMethod(2);
        zipArchiveOutputStream4.setComment("070701");
        zipArchiveOutputStream4.flush();
        zipArchiveOutputStream4.setFallbackToUTF8(true);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test588");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        tarArchiveOutputStream2.setLongFileMode(3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream25.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test589");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str4 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.closeArchiveEntry();
        zipArchiveOutputStream3.setComment("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test590");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test591");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2, (int) '4');
        tarArchiveOutputStream4.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj9 = asiExtraField8.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField10 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj12 = asiExtraField11.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField14 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField15 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField8, asiExtraField10, asiExtraField11, asiExtraField13, asiExtraField14, asiExtraField15 };
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray16);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray17);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray17);
        tarArchiveOutputStream4.write(byteArray17, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4, 420);
        tarArchiveOutputStream24.setLongFileMode(61440);
        tarArchiveOutputStream24.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream28 = archiveStreamFactory0.createArchiveOutputStream("org.apache.commons.compress.archivers.ArchiveException: ", (java.io.OutputStream) tarArchiveOutputStream24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: org.apache.commons.compress.archivers.ArchiveException:  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test592");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime27 = zipArchiveEntry26.getLastAccessTime();
        long long28 = zipArchiveEntry26.getSize();
        zipArchiveEntry26.setInternalAttributes((int) ' ');
        java.lang.Object obj31 = zipArchiveEntry26.clone();
        java.io.OutputStream outputStream32 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream32, (int) '4');
        tarArchiveOutputStream34.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField38 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj39 = asiExtraField38.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField40 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField41 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj42 = asiExtraField41.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField43 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField44 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField45 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray46 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField38, asiExtraField40, asiExtraField41, asiExtraField43, asiExtraField44, asiExtraField45 };
        byte[] byteArray47 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray46);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField48 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray47);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField49 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray47);
        tarArchiveOutputStream34.write(byteArray47, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort53 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray47);
        zipArchiveEntry26.setExtra(byteArray47);
        java.lang.String str55 = zipArchiveEntry26.getName();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream24.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "not encodeable" + "'", str19, "not encodeable");
        org.junit.Assert.assertNull(fileTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "070702");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "070702");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "070702");
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(zipExtraFieldArray46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "070702" + "'", str55, "070702");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test593");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (int) (short) 12, 2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry19.getLastAccessTime();
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream21, (int) 'a');
        tarArchiveInputStream23.reset();
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int27 = tarArchiveInputStream23.read(byteArray26);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream23);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = zipArchiveInputStream28.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream28);
        boolean boolean31 = cpioArchiveInputStream30.markSupported();
        boolean boolean32 = zipArchiveEntry19.equals((java.lang.Object) cpioArchiveInputStream30);
        long long33 = zipArchiveEntry19.getCompressedSize();
        long long34 = zipArchiveEntry19.getTime();
        int int35 = zipArchiveEntry19.getPlatform();
        long long36 = zipArchiveEntry19.getCompressedSize();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream17.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test594");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
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
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test595");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15, 49152);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime21 = zipArchiveEntry20.getLastAccessTime();
        long long22 = zipArchiveEntry20.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort24 = asiExtraField23.getHeaderId();
        byte[] byteArray25 = asiExtraField23.getLocalFileDataData();
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean34 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray32, (int) (short) 1);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray32, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField37 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray32);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort38 = unicodeCommentExtraField37.getHeaderId();
        byte[] byteArray39 = unicodeCommentExtraField37.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField40 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray41 = asiExtraField40.getLocalFileDataData();
        int int42 = asiExtraField40.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort43 = asiExtraField40.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField44 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort43);
        byte[] byteArray45 = zipExtraField44.getLocalFileDataData();
        byte[] byteArray46 = zipExtraField44.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray47 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField23, unicodeCommentExtraField37, zipExtraField44 };
        zipArchiveEntry20.setExtraFields(zipExtraFieldArray47);
        int int49 = zipArchiveEntry20.getUnixMode();
        java.lang.String str50 = zipArchiveEntry20.getName();
        java.lang.String str51 = zipArchiveEntry20.getName();
        java.nio.file.attribute.FileTime fileTime52 = zipArchiveEntry20.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry20);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray54 = zipArchiveEntry20.getExtraFields();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(fileTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(zipShort24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(zipShort38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(zipShort43);
        org.junit.Assert.assertNotNull(zipExtraField44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "070702" + "'", str50, "070702");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "070702" + "'", str51, "070702");
        org.junit.Assert.assertNull(fileTime52);
        org.junit.Assert.assertNotNull(zipExtraFieldArray54);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test596");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        boolean boolean12 = jarArchiveOutputStream11.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream11, 8, 29127);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test597");
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream1, (int) 'a');
        tarArchiveInputStream3.reset();
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int7 = tarArchiveInputStream3.read(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream3);
        long long10 = zipArchiveInputStream8.skip((long) (short) 2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime14 = zipArchiveEntry13.getLastAccessTime();
        long long15 = zipArchiveEntry13.getSize();
        byte[] byteArray16 = zipArchiveEntry13.getLocalFileDataExtra();
        zipArchiveEntry13.setTime((long) (byte) 0);
        long long19 = zipArchiveEntry13.getCompressedSize();
        java.lang.Object obj20 = zipArchiveEntry13.clone();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker21 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = jarMarker21.getCentralDirectoryLength();
        byte[] byteArray23 = jarMarker21.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort25 = asiExtraField24.getHeaderId();
        asiExtraField24.setGroupId(256);
        byte[] byteArray28 = asiExtraField24.getCentralDirectoryData();
        jarMarker21.parseFromCentralDirectoryData(byteArray28, 0, 0);
        byte[] byteArray32 = jarMarker21.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = jarMarker21.getHeaderId();
        zipArchiveEntry13.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) jarMarker21);
        byte[] byteArray35 = jarMarker21.getLocalFileDataData();
        int int38 = arArchiveInputStream11.read(byteArray35, (int) (byte) 1, (int) (short) 8);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField39 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray40 = asiExtraField39.getCentralDirectoryData();
        boolean boolean42 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray40, 0);
        int int43 = arArchiveInputStream11.read(byteArray40);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField44 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("TRAILER!!!", byteArray40);
        java.io.OutputStream outputStream45 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream45, (int) '4');
        tarArchiveOutputStream47.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField51 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj52 = asiExtraField51.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField53 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField54 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj55 = asiExtraField54.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField56 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField57 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField58 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray59 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField51, asiExtraField53, asiExtraField54, asiExtraField56, asiExtraField57, asiExtraField58 };
        byte[] byteArray60 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray59);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField61 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray60);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField62 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray60);
        tarArchiveOutputStream47.write(byteArray60, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort66 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray60);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray67 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray60);
        long long68 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray60);
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField44.parseFromCentralDirectoryData(byteArray60, 24576, 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24576");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(fileTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "070702");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "070702");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "070702");
        org.junit.Assert.assertNotNull(zipShort22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(zipShort25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-32, 88, -115, -108, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(zipShort33);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(zipExtraFieldArray59);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 947566L + "'", long68 == 947566L);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test598");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        arArchiveOutputStream11.closeArchiveEntry();
        arArchiveOutputStream11.closeArchiveEntry();
        arArchiveOutputStream11.closeArchiveEntry();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test599");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        zipArchiveOutputStream15.closeArchiveEntry();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test600");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 26742);
        arArchiveOutputStream26.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        int int33 = zipArchiveEntry32.getMethod();
        int int34 = zipArchiveEntry32.getPlatform();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream30.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test601");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str4 = zipArchiveOutputStream3.getEncoding();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) 4);
        zipArchiveOutputStream3.setLevel((-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test602");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        zipArchiveOutputStream3.setComment("070702");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray14 = asiExtraField13.getLocalFileDataData();
        int int15 = asiExtraField13.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = asiExtraField13.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        int int20 = asiExtraField18.getGroupId();
        boolean boolean21 = zipShort16.equals((java.lang.Object) asiExtraField18);
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24);
        zipArchiveOutputStream25.closeArchiveEntry();
        boolean boolean27 = zipShort16.equals((java.lang.Object) zipArchiveOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy29 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        zipArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        java.lang.String str31 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 511);
        java.io.File file35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry37 = tarArchiveOutputStream34.createArchiveEntry(file35, "070702");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "not encodeable" + "'", str31, "not encodeable");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test603");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 32868, 32);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = tarArchiveOutputStream3.createArchiveEntry(file4, "never");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test604");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        int int17 = zipArchiveEntry16.getMethod();
        int int18 = zipArchiveEntry16.getPlatform();
        int int19 = zipArchiveEntry16.getInternalAttributes();
        java.lang.Object obj20 = zipArchiveEntry16.clone();
        boolean boolean21 = zipArchiveEntry16.isDirectory();
        zipArchiveEntry16.setUnixMode((int) (short) 100);
        long long24 = zipArchiveEntry16.getSize();
        long long25 = zipArchiveEntry16.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry16);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream14.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "070702");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "070702");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "070702");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 6553601L + "'", long25 == 6553601L);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test605");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        long long3 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setInternalAttributes((int) ' ');
        java.lang.Object obj6 = zipArchiveEntry1.clone();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream7, (int) '4');
        tarArchiveOutputStream9.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj14 = asiExtraField13.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField15 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField16 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj17 = asiExtraField16.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField19 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray21 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField13, asiExtraField15, asiExtraField16, asiExtraField18, asiExtraField19, asiExtraField20 };
        byte[] byteArray22 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray21);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray22);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField24 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray22);
        tarArchiveOutputStream9.write(byteArray22, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray22);
        zipArchiveEntry1.setExtra(byteArray22);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray22);
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "070702");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "070702");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "070702");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(zipExtraFieldArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test606");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        int int28 = zipArchiveEntry27.getMethod();
        int int29 = zipArchiveEntry27.getPlatform();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker30 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort31 = jarMarker30.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort32 = jarMarker30.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = jarMarker30.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort33);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField35 = zipArchiveEntry27.getExtraField(zipShort33);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker36 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort37 = jarMarker36.getCentralDirectoryLength();
        byte[] byteArray38 = jarMarker36.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort39 = jarMarker36.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort40 = jarMarker36.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort41 = jarMarker36.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort42 = jarMarker36.getCentralDirectoryLength();
        zipArchiveEntry27.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) jarMarker36);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream25.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(zipShort31);
        org.junit.Assert.assertNotNull(zipShort32);
        org.junit.Assert.assertNotNull(zipShort33);
        org.junit.Assert.assertNotNull(zipExtraField34);
        org.junit.Assert.assertNull(zipExtraField35);
        org.junit.Assert.assertNotNull(zipShort37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(zipShort39);
        org.junit.Assert.assertNotNull(zipShort40);
        org.junit.Assert.assertNotNull(zipShort41);
        org.junit.Assert.assertNotNull(zipShort42);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test607");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 64, 30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry14.getLastAccessTime();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream16, (int) 'a');
        tarArchiveInputStream18.reset();
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int22 = tarArchiveInputStream18.read(byteArray21);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = zipArchiveInputStream23.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream23);
        boolean boolean26 = cpioArchiveInputStream25.markSupported();
        boolean boolean27 = zipArchiveEntry14.equals((java.lang.Object) cpioArchiveInputStream25);
        long long28 = zipArchiveEntry14.getCompressedSize();
        long long29 = zipArchiveEntry14.getTime();
        int int30 = zipArchiveEntry14.getPlatform();
        long long31 = zipArchiveEntry14.getTime();
        long long32 = zipArchiveEntry14.getCompressedSize();
        java.nio.file.attribute.FileTime fileTime33 = zipArchiveEntry14.getLastModifiedTime();
        long long34 = zipArchiveEntry14.getCrc();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream12.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNull(fileTime33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test608");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.setFallbackToUTF8(true);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test609");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setComment("not encodeable");
        zipArchiveOutputStream3.closeArchiveEntry();
        boolean boolean7 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry9.getLastAccessTime();
        long long11 = zipArchiveEntry9.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = asiExtraField12.getHeaderId();
        byte[] byteArray14 = asiExtraField12.getLocalFileDataData();
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean23 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray21, (int) (short) 1);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray21, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray21);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort27 = unicodeCommentExtraField26.getHeaderId();
        byte[] byteArray28 = unicodeCommentExtraField26.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField29 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray30 = asiExtraField29.getLocalFileDataData();
        int int31 = asiExtraField29.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort32 = asiExtraField29.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField33 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort32);
        byte[] byteArray34 = zipExtraField33.getLocalFileDataData();
        byte[] byteArray35 = zipExtraField33.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray36 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField12, unicodeCommentExtraField26, zipExtraField33 };
        zipArchiveEntry9.setExtraFields(zipExtraFieldArray36);
        int int38 = zipArchiveEntry9.getUnixMode();
        java.lang.String str39 = zipArchiveEntry9.getName();
        java.lang.String str40 = zipArchiveEntry9.getName();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zipShort27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(zipShort32);
        org.junit.Assert.assertNotNull(zipExtraField33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "070702" + "'", str39, "070702");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "070702" + "'", str40, "070702");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test610");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream15.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream15.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test611");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) (byte) 1);
        java.io.File file24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = zipArchiveOutputStream3.createArchiveEntry(file24, "org.apache.commons.compress.archivers.ArchiveException: TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "not encodeable" + "'", str19, "not encodeable");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test612");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream16.setFallbackToUTF8(true);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test613");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str4 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        arArchiveOutputStream6.closeArchiveEntry();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test614");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        tarArchiveOutputStream2.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test615");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        zipArchiveOutputStream3.setComment("070702");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray14 = asiExtraField13.getLocalFileDataData();
        int int15 = asiExtraField13.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = asiExtraField13.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        int int20 = asiExtraField18.getGroupId();
        boolean boolean21 = zipShort16.equals((java.lang.Object) asiExtraField18);
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24);
        zipArchiveOutputStream25.closeArchiveEntry();
        boolean boolean27 = zipShort16.equals((java.lang.Object) zipArchiveOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy29 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        zipArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        java.lang.String str31 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 0, (int) (short) 2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.lang.String str37 = zipArchiveOutputStream3.getEncoding();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "not encodeable" + "'", str31, "not encodeable");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTF8" + "'", str37, "UTF8");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test616");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        zipArchiveOutputStream15.setFallbackToUTF8(false);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test617");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 28789, 22752);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream31.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test618");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (int) (short) 12, 2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        jarArchiveOutputStream17.setMethod(28789);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test619");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) 'a');
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int9 = tarArchiveInputStream2.read(byteArray8);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        long long14 = tarArchiveInputStream2.skip(0L);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream16, (int) 'a');
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int25 = tarArchiveInputStream18.read(byteArray24);
        int int26 = tarArchiveInputStream18.available();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream28, (int) '4');
        tarArchiveOutputStream30.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField34 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj35 = asiExtraField34.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField36 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField37 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj38 = asiExtraField37.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField39 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField40 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField41 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray42 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField34, asiExtraField36, asiExtraField37, asiExtraField39, asiExtraField40, asiExtraField41 };
        byte[] byteArray43 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray42);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField44 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray43);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField45 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray43);
        tarArchiveOutputStream30.write(byteArray43, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort49 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray43);
        int int52 = tarArchiveInputStream18.read(byteArray43, 16384, 0);
        int int55 = arArchiveInputStream15.read(byteArray43, (int) (short) -1, 36864);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField56 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray57 = asiExtraField56.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort58 = asiExtraField56.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort59 = asiExtraField56.getHeaderId();
        java.lang.Object obj60 = asiExtraField56.clone();
        byte[] byteArray61 = asiExtraField56.getCentralDirectoryData();
        int int64 = arArchiveInputStream15.read(byteArray61, (int) (short) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong66 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray61, 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(zipExtraFieldArray42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort58);
        org.junit.Assert.assertNotNull(zipShort59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test620");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        arArchiveOutputStream13.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13, (int) (byte) 0);
        arArchiveOutputStream13.flush();
        java.io.File file19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = arArchiveOutputStream13.createArchiveEntry(file19, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test621");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test622");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.lang.String str7 = zipArchiveOutputStream3.getEncoding();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveOutputStream3.createArchiveEntry(file9, "org.apache.commons.compress.archivers.ArchiveException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test623");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        java.lang.String str4 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry7.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry10.getLastAccessTime();
        long long12 = zipArchiveEntry10.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = asiExtraField13.getHeaderId();
        byte[] byteArray15 = asiExtraField13.getLocalFileDataData();
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean24 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray22, (int) (short) 1);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray22, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField27 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray22);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = unicodeCommentExtraField27.getHeaderId();
        byte[] byteArray29 = unicodeCommentExtraField27.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField30 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray31 = asiExtraField30.getLocalFileDataData();
        int int32 = asiExtraField30.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = asiExtraField30.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort33);
        byte[] byteArray35 = zipExtraField34.getLocalFileDataData();
        byte[] byteArray36 = zipExtraField34.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray37 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField13, unicodeCommentExtraField27, zipExtraField34 };
        zipArchiveEntry10.setExtraFields(zipExtraFieldArray37);
        zipArchiveEntry7.setExtraFields(zipExtraFieldArray37);
        byte[] byteArray40 = zipArchiveEntry7.getCentralDirectoryExtra();
        boolean boolean42 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray40, 26742);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zipShort28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(zipShort33);
        org.junit.Assert.assertNotNull(zipExtraField34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray37);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 117, 99, 8, 0, 1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test624");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 64, 30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test625");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        java.lang.String str11 = zipArchiveOutputStream3.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test626");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream3.setMethod(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) (byte) 1);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField17 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray18 = asiExtraField17.getLocalFileDataData();
        int int19 = asiExtraField17.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = asiExtraField17.getHeaderId();
        byte[] byteArray21 = asiExtraField17.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream16.write(byteArray21, 40960, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test627");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test628");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) 'a');
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int9 = tarArchiveInputStream2.read(byteArray8);
        int int10 = tarArchiveInputStream2.available();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12, (int) '4');
        tarArchiveOutputStream14.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj22 = asiExtraField21.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField25 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField18, asiExtraField20, asiExtraField21, asiExtraField23, asiExtraField24, asiExtraField25 };
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray26);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField28 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray27);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray27);
        tarArchiveOutputStream14.write(byteArray27, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray27);
        int int36 = tarArchiveInputStream2.read(byteArray27, 16384, 0);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField37 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort38 = asiExtraField37.getHeaderId();
        int int39 = zipShort38.getValue();
        int int40 = zipShort38.getValue();
        int int41 = zipShort38.getValue();
        byte[] byteArray42 = zipShort38.getBytes();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray44 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray42, false);
        byte[] byteArray45 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray44);
        int int48 = tarArchiveInputStream2.read(byteArray45, 16384, (int) (short) 0);
        long long50 = tarArchiveInputStream2.skip((long) 26984);
        tarArchiveInputStream2.close();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(zipShort38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 30062 + "'", int39 == 30062);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 30062 + "'", int40 == 30062);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 30062 + "'", int41 == 30062);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[110, 117]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test629");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.closeArchiveEntry();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setLevel(0);
        zipArchiveOutputStream1.setComment("org.apache.commons.compress.archivers.ArchiveException: org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        boolean boolean9 = zipArchiveOutputStream1.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test630");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) 8);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream20.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test631");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime26 = zipArchiveEntry25.getLastAccessTime();
        long long27 = zipArchiveEntry25.getSize();
        byte[] byteArray28 = zipArchiveEntry25.getLocalFileDataExtra();
        long long29 = zipArchiveEntry25.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime32 = zipArchiveEntry31.getLastAccessTime();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream33, (int) 'a');
        tarArchiveInputStream35.reset();
        byte[] byteArray38 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int39 = tarArchiveInputStream35.read(byteArray38);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream40 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream35);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = zipArchiveInputStream40.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream40);
        boolean boolean43 = cpioArchiveInputStream42.markSupported();
        boolean boolean44 = zipArchiveEntry31.equals((java.lang.Object) cpioArchiveInputStream42);
        long long45 = zipArchiveEntry31.getCompressedSize();
        java.nio.file.attribute.FileTime fileTime46 = zipArchiveEntry31.getCreationTime();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker47 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort48 = jarMarker47.getCentralDirectoryLength();
        byte[] byteArray49 = jarMarker47.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort50 = jarMarker47.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField51 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort50);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField52 = zipArchiveEntry31.getExtraField(zipShort50);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField53 = zipArchiveEntry25.getExtraField(zipShort50);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream23.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "not encodeable" + "'", str19, "not encodeable");
        org.junit.Assert.assertNull(fileTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNull(fileTime32);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNull(fileTime46);
        org.junit.Assert.assertNotNull(zipShort48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(zipShort50);
        org.junit.Assert.assertNotNull(zipExtraField51);
        org.junit.Assert.assertNull(zipExtraField52);
        org.junit.Assert.assertNull(zipExtraField53);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test632");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 28789, 22752);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, (short) 1);
        arArchiveOutputStream26.closeArchiveEntry();
        arArchiveOutputStream26.closeArchiveEntry();
        java.io.File file34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = arArchiveOutputStream26.createArchiveEntry(file34, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test633");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod(28789);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test634");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        zipArchiveOutputStream3.closeArchiveEntry();
        zipArchiveOutputStream3.closeArchiveEntry();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test635");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream7, (int) 'a');
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int16 = tarArchiveInputStream9.read(byteArray15);
        tarArchiveInputStream9.reset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9, (int) (byte) 0, (int) (short) 3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9, 10);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField27 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj28 = asiExtraField27.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField29 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField30 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj31 = asiExtraField30.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField32 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField33 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField34 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField27, asiExtraField29, asiExtraField30, asiExtraField32, asiExtraField33, asiExtraField34 };
        byte[] byteArray36 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray35);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField37 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray36);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField38 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray36);
        int int41 = tarArchiveInputStream9.read(byteArray36, 100, 8);
        tarArchiveOutputStream6.write(byteArray36, (int) (byte) 1, (int) (short) -1);
        tarArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream46 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        jarArchiveOutputStream46.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream50 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream46, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test636");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        zipArchiveOutputStream5.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str9 = unicodeExtraFieldPolicy8.toString();
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, 10);
        zipArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str18 = unicodeExtraFieldPolicy17.toString();
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy17);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream22 = archiveStreamFactory0.createArchiveOutputStream("never", (java.io.OutputStream) cpioArchiveOutputStream21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: never not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "not encodeable" + "'", str9, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "not encodeable" + "'", str18, "not encodeable");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test637");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream3.setMethod(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) (byte) 1);
        java.io.File file17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = cpioArchiveOutputStream16.createArchiveEntry(file17, "never");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test638");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.setLongFileMode((int) (short) 12);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test639");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        java.lang.String str18 = zipArchiveOutputStream3.getEncoding();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF8" + "'", str18, "UTF8");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test640");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray15);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong22 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong24 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray15, 24576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test641");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        int int28 = tarArchiveOutputStream2.getRecordSize();
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test642");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 26742);
        arArchiveOutputStream26.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        int int33 = zipArchiveEntry32.getMethod();
        int int34 = zipArchiveEntry32.getPlatform();
        int int35 = zipArchiveEntry32.getInternalAttributes();
        java.lang.Object obj36 = zipArchiveEntry32.clone();
        boolean boolean37 = zipArchiveEntry32.isDirectory();
        zipArchiveEntry32.setUnixMode((int) (short) 100);
        long long40 = zipArchiveEntry32.getSize();
        long long41 = zipArchiveEntry32.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry32);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream30.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "070702");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "070702");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "070702");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 6553601L + "'", long41 == 6553601L);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test643");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((-1L));
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray1);
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream3, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        zipArchiveOutputStream6.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        boolean boolean19 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        zipArchiveOutputStream6.setComment("TRAILER!!!");
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(false);
        boolean boolean25 = zipShort2.equals((java.lang.Object) zipArchiveOutputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        zipArchiveEntry27.setTime(0L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry27);
        long long31 = zipArchiveEntry30.getSize();
        int int32 = zipArchiveEntry30.getUnixMode();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression method");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 33, 0, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test644");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream3.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream14 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.lang.String str15 = jarArchiveOutputStream14.getEncoding();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF8" + "'", str15, "UTF8");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test645");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream15.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream18, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        zipArchiveOutputStream21.setMethod(30062);
        java.lang.String str24 = zipArchiveOutputStream21.getEncoding();
        zipArchiveOutputStream21.setComment("not encodeable");
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream27, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29);
        zipArchiveOutputStream30.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy33 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str34 = unicodeExtraFieldPolicy33.toString();
        zipArchiveOutputStream30.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy33);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy36 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str37 = unicodeExtraFieldPolicy36.toString();
        zipArchiveOutputStream30.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        zipArchiveOutputStream21.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        java.lang.String str41 = unicodeExtraFieldPolicy36.toString();
        java.lang.String str42 = unicodeExtraFieldPolicy36.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTF8" + "'", str24, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "not encodeable" + "'", str34, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "not encodeable" + "'", str37, "not encodeable");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "not encodeable" + "'", str41, "not encodeable");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "not encodeable" + "'", str42, "not encodeable");
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test646");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        int int14 = tarArchiveOutputStream13.getRecordSize();
        tarArchiveOutputStream13.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13, (short) 2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream18 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream18.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test647");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream14.putArchiveEntry(archiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test648");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry3.getLastAccessTime();
        long long5 = zipArchiveEntry3.getSize();
        byte[] byteArray6 = zipArchiveEntry3.getLocalFileDataExtra();
        long long7 = zipArchiveEntry3.getSize();
        long long8 = zipArchiveEntry3.getCompressedSize();
        zipArchiveEntry3.setComment("070701");
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test649");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 29127, 2048);
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.write(byteArray4, (int) (byte) 100, 256);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '256' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test650");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, (int) '4');
        tarArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField7 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj8 = asiExtraField7.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField10 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj11 = asiExtraField10.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField14 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField7, asiExtraField9, asiExtraField10, asiExtraField12, asiExtraField13, asiExtraField14 };
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray16);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray16);
        tarArchiveOutputStream3.write(byteArray16, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray16);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray23 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray16);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField24 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("org.apache.commons.compress.archivers.ArchiveException: UTF8", byteArray16);
        unicodePathExtraField24.setNameCRC32((long) (-1));
        unicodePathExtraField24.setNameCRC32((long) (short) 2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray23);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test651");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        zipArchiveOutputStream3.setEncoding("never");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test652");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        zipArchiveOutputStream5.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str9 = unicodeExtraFieldPolicy8.toString();
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, 10);
        zipArchiveOutputStream5.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, 30062, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream20 = archiveStreamFactory0.createArchiveOutputStream("", (java.io.OutputStream) tarArchiveOutputStream19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver:  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "not encodeable" + "'", str9, "not encodeable");
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test653");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 26742);
        arArchiveOutputStream26.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26);
        java.io.File file31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = arArchiveOutputStream26.createArchiveEntry(file31, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test654");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) (byte) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream16.putArchiveEntry(archiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test655");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        boolean boolean7 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.setFallbackToUTF8(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.setLevel(61440);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 61440");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test656");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        int int14 = tarArchiveOutputStream13.getRecordSize();
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = tarArchiveOutputStream13.createArchiveEntry(file15, "070701");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test657");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream11, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13);
        zipArchiveOutputStream14.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy17 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str18 = unicodeExtraFieldPolicy17.toString();
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy17);
        zipArchiveOutputStream14.setComment("");
        zipArchiveOutputStream14.setComment("070702");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray25 = asiExtraField24.getLocalFileDataData();
        int int26 = asiExtraField24.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort27 = asiExtraField24.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort27);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField29 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj30 = asiExtraField29.clone();
        int int31 = asiExtraField29.getGroupId();
        boolean boolean32 = zipShort27.equals((java.lang.Object) asiExtraField29);
        java.io.OutputStream outputStream33 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream33, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream35);
        zipArchiveOutputStream36.closeArchiveEntry();
        boolean boolean38 = zipShort27.equals((java.lang.Object) zipArchiveOutputStream36);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream39 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream36);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy40 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        zipArchiveOutputStream39.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy40);
        java.lang.String str42 = unicodeExtraFieldPolicy40.toString();
        zipArchiveOutputStream14.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy40);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy40);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "not encodeable" + "'", str18, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(zipShort27);
        org.junit.Assert.assertNotNull(zipExtraField28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "not encodeable" + "'", str42, "not encodeable");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test658");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        zipArchiveOutputStream16.setFallbackToUTF8(true);
        java.io.File file19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = zipArchiveOutputStream16.createArchiveEntry(file19, "UTF8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test659");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setComment("not encodeable");
        zipArchiveOutputStream3.setComment("");
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveOutputStream3.createArchiveEntry(file8, "070701");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test660");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 26742);
        arArchiveOutputStream26.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30, (int) '4');
        boolean boolean33 = jarArchiveOutputStream30.isSeekable();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test661");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream22.setLongFileMode(61440);
        tarArchiveOutputStream22.closeArchiveEntry();
        tarArchiveOutputStream22.closeArchiveEntry();
        int int27 = tarArchiveOutputStream22.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream22.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '420' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test662");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime12 = zipArchiveEntry11.getLastAccessTime();
        long long13 = zipArchiveEntry11.getSize();
        byte[] byteArray14 = zipArchiveEntry11.getLocalFileDataExtra();
        zipArchiveEntry11.setTime((long) (byte) 0);
        long long17 = zipArchiveEntry11.getCompressedSize();
        java.lang.Object obj18 = zipArchiveEntry11.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry11);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream9.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNull(fileTime12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "070702");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "070702");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "070702");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test663");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        boolean boolean7 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.setFallbackToUTF8(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        zipArchiveOutputStream3.closeArchiveEntry();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test664");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (int) (short) 12, 2);
        boolean boolean17 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        tarArchiveOutputStream18.finish();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test665");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 28789, 22752);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, (short) 1);
        arArchiveOutputStream26.closeArchiveEntry();
        arArchiveOutputStream26.finish();
        java.io.File file34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = arArchiveOutputStream26.createArchiveEntry(file34, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test666");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setMethod(420);
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = zipArchiveOutputStream3.createArchiveEntry(file12, "org.apache.commons.compress.archivers.ArchiveException: org.apache.commons.compress.archivers.ArchiveException: not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test667");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        arArchiveOutputStream13.closeArchiveEntry();
        arArchiveOutputStream13.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test668");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        arArchiveOutputStream26.closeArchiveEntry();
        arArchiveOutputStream26.closeArchiveEntry();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test669");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream3.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream14.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test670");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (int) (short) 12, 2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry19.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime23 = zipArchiveEntry22.getLastAccessTime();
        long long24 = zipArchiveEntry22.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField25 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort26 = asiExtraField25.getHeaderId();
        byte[] byteArray27 = asiExtraField25.getLocalFileDataData();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean36 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray34, (int) (short) 1);
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray34, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField39 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray34);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort40 = unicodeCommentExtraField39.getHeaderId();
        byte[] byteArray41 = unicodeCommentExtraField39.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField42 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray43 = asiExtraField42.getLocalFileDataData();
        int int44 = asiExtraField42.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort45 = asiExtraField42.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField46 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort45);
        byte[] byteArray47 = zipExtraField46.getLocalFileDataData();
        byte[] byteArray48 = zipExtraField46.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray49 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField25, unicodeCommentExtraField39, zipExtraField46 };
        zipArchiveEntry22.setExtraFields(zipExtraFieldArray49);
        zipArchiveEntry19.setExtraFields(zipExtraFieldArray49);
        long long52 = zipArchiveEntry19.getTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime55 = zipArchiveEntry54.getLastAccessTime();
        java.io.InputStream inputStream56 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream58 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream56, (int) 'a');
        tarArchiveInputStream58.reset();
        byte[] byteArray61 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int62 = tarArchiveInputStream58.read(byteArray61);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream63 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream58);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = zipArchiveInputStream63.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream65 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream63);
        boolean boolean66 = cpioArchiveInputStream65.markSupported();
        boolean boolean67 = zipArchiveEntry54.equals((java.lang.Object) cpioArchiveInputStream65);
        long long68 = zipArchiveEntry54.getCompressedSize();
        long long69 = zipArchiveEntry54.getTime();
        int int70 = zipArchiveEntry54.getPlatform();
        long long71 = zipArchiveEntry54.getTime();
        zipArchiveEntry54.setTime((long) (short) 3);
        byte[] byteArray74 = zipArchiveEntry54.getExtra();
        boolean boolean75 = zipArchiveEntry54.isDirectory();
        zipArchiveEntry54.setCrc((long) (byte) 10);
        java.nio.file.attribute.FileTime fileTime78 = zipArchiveEntry54.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry79 = zipArchiveEntry19.setCreationTime(fileTime78);
        java.lang.String str80 = zipArchiveEntry19.getName();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream17.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertNull(fileTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(zipShort26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(zipShort40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(zipShort45);
        org.junit.Assert.assertNotNull(zipExtraField46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNull(fileTime55);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L) + "'", long71 == (-1L));
        org.junit.Assert.assertNull(byteArray74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(fileTime78);
        org.junit.Assert.assertNotNull(zipEntry79);
        org.junit.Assert.assertEquals(zipEntry79.toString(), "070702");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "070702" + "'", str80, "070702");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test671");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream24, (short) 2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream26.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test672");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj22 = asiExtraField21.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField25 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField18, asiExtraField20, asiExtraField21, asiExtraField23, asiExtraField24, asiExtraField25 };
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray26);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField28 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray27);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = unicodePathExtraField28.getCentralDirectoryLength();
        byte[] byteArray30 = zipShort29.getBytes();
        boolean boolean32 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray30, 511);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream16.write(byteArray30, 30062, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[5, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test673");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 64, 30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry14.getLastAccessTime();
        long long16 = zipArchiveEntry14.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField17 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = asiExtraField17.getHeaderId();
        byte[] byteArray19 = asiExtraField17.getLocalFileDataData();
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean28 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, (int) (short) 1);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray26, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField31 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray26);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort32 = unicodeCommentExtraField31.getHeaderId();
        byte[] byteArray33 = unicodeCommentExtraField31.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField34 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray35 = asiExtraField34.getLocalFileDataData();
        int int36 = asiExtraField34.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort37 = asiExtraField34.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField38 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort37);
        byte[] byteArray39 = zipExtraField38.getLocalFileDataData();
        byte[] byteArray40 = zipExtraField38.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray41 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField17, unicodeCommentExtraField31, zipExtraField38 };
        zipArchiveEntry14.setExtraFields(zipExtraFieldArray41);
        int int43 = zipArchiveEntry14.getInternalAttributes();
        java.lang.Object obj44 = zipArchiveEntry14.clone();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression method");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(zipShort32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(zipShort37);
        org.junit.Assert.assertNotNull(zipExtraField38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "070702");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "070702");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "070702");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test674");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        zipArchiveOutputStream16.setMethod(28789);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream16.putArchiveEntry(archiveEntry19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test675");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24);
        zipArchiveOutputStream25.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy28 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str29 = unicodeExtraFieldPolicy28.toString();
        zipArchiveOutputStream25.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy28);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy28);
        java.lang.String str32 = unicodeExtraFieldPolicy28.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "not encodeable" + "'", str19, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "not encodeable" + "'", str29, "not encodeable");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "not encodeable" + "'", str32, "not encodeable");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test676");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        arArchiveOutputStream13.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test677");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        boolean boolean7 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.setFallbackToUTF8(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream3.createArchiveEntry(file11, "org.apache.commons.compress.archivers.ArchiveException: org.apache.commons.compress.archivers.ArchiveException: UTF8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test678");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        boolean boolean12 = jarArchiveOutputStream11.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream11);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream11.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test679");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream7, (int) 'a');
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int16 = tarArchiveInputStream9.read(byteArray15);
        tarArchiveInputStream9.reset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9, (int) (byte) 0, (int) (short) 3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9, 10);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField27 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj28 = asiExtraField27.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField29 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField30 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj31 = asiExtraField30.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField32 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField33 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField34 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField27, asiExtraField29, asiExtraField30, asiExtraField32, asiExtraField33, asiExtraField34 };
        byte[] byteArray36 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray35);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField37 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray36);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField38 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray36);
        int int41 = tarArchiveInputStream9.read(byteArray36, 100, 8);
        tarArchiveOutputStream6.write(byteArray36, (int) (byte) 1, (int) (short) -1);
        tarArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream46 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream48, 22752, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test680");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test681");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        boolean boolean14 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.closeArchiveEntry();
        zipArchiveOutputStream3.setMethod(1024);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test682");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream3.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry16.getLastAccessTime();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream18, (int) 'a');
        tarArchiveInputStream20.reset();
        byte[] byteArray23 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int24 = tarArchiveInputStream20.read(byteArray23);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream20);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = zipArchiveInputStream25.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream25);
        boolean boolean28 = cpioArchiveInputStream27.markSupported();
        boolean boolean29 = zipArchiveEntry16.equals((java.lang.Object) cpioArchiveInputStream27);
        long long30 = zipArchiveEntry16.getCompressedSize();
        long long31 = zipArchiveEntry16.getTime();
        int int32 = zipArchiveEntry16.getPlatform();
        long long33 = zipArchiveEntry16.getTime();
        long long34 = zipArchiveEntry16.getCompressedSize();
        java.nio.file.attribute.FileTime fileTime35 = zipArchiveEntry16.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker36 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort37 = jarMarker36.getCentralDirectoryLength();
        byte[] byteArray38 = jarMarker36.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort39 = jarMarker36.getLocalFileDataLength();
        boolean boolean40 = zipArchiveEntry16.equals((java.lang.Object) jarMarker36);
        java.nio.file.attribute.FileTime fileTime41 = zipArchiveEntry16.getCreationTime();
        zipArchiveEntry16.setSize((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream14.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
        org.junit.Assert.assertNull(fileTime17);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNull(fileTime35);
        org.junit.Assert.assertNotNull(zipShort37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(zipShort39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(fileTime41);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test683");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.closeArchiveEntry();
        zipArchiveOutputStream1.setMethod((int) (short) 100);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry9.getLastAccessTime();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream11, (int) 'a');
        tarArchiveInputStream13.reset();
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int17 = tarArchiveInputStream13.read(byteArray16);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream13);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = zipArchiveInputStream18.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream18);
        boolean boolean21 = cpioArchiveInputStream20.markSupported();
        boolean boolean22 = zipArchiveEntry9.equals((java.lang.Object) cpioArchiveInputStream20);
        long long23 = zipArchiveEntry9.getCompressedSize();
        long long24 = zipArchiveEntry9.getTime();
        int int25 = zipArchiveEntry9.getPlatform();
        long long26 = zipArchiveEntry9.getTime();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression method");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test684");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream13);
        arArchiveOutputStream13.closeArchiveEntry();
        arArchiveOutputStream13.closeArchiveEntry();
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream13.write(byteArray18, (int) '4', 40960);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 0, 0, 0]");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test685");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setFallbackToUTF8(true);
        java.lang.String str24 = zipArchiveOutputStream3.getEncoding();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "not encodeable" + "'", str19, "not encodeable");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTF8" + "'", str24, "UTF8");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test686");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 29127, 2048);
        tarArchiveOutputStream3.setLongFileMode(49152);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test687");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        arArchiveOutputStream25.flush();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test688");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream7, (int) 'a');
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int16 = tarArchiveInputStream9.read(byteArray15);
        tarArchiveInputStream9.reset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9, (int) (byte) 0, (int) (short) 3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9, 10);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField27 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj28 = asiExtraField27.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField29 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField30 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj31 = asiExtraField30.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField32 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField33 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField34 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField27, asiExtraField29, asiExtraField30, asiExtraField32, asiExtraField33, asiExtraField34 };
        byte[] byteArray36 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray35);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField37 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray36);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField38 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray36);
        int int41 = tarArchiveInputStream9.read(byteArray36, 100, 8);
        tarArchiveOutputStream6.write(byteArray36, (int) (byte) 1, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream45 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        tarArchiveOutputStream6.closeArchiveEntry();
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test689");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, (int) '4');
        tarArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField7 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj8 = asiExtraField7.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField10 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj11 = asiExtraField10.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField14 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField7, asiExtraField9, asiExtraField10, asiExtraField12, asiExtraField13, asiExtraField14 };
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray16);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray16);
        tarArchiveOutputStream3.write(byteArray16, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray16);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray23 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray16);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField24 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("org.apache.commons.compress.archivers.ArchiveException: UTF8", byteArray16);
        unicodePathExtraField24.setNameCRC32((long) (-1));
        java.lang.Class<?> wildcardClass27 = unicodePathExtraField24.getClass();
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test690");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 26742);
        arArchiveOutputStream26.closeArchiveEntry();
        arArchiveOutputStream26.closeArchiveEntry();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test691");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 64, 30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 420, 493);
        tarArchiveOutputStream15.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField19 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj20 = asiExtraField19.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField22 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj23 = asiExtraField22.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField25 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField26 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField19, asiExtraField21, asiExtraField22, asiExtraField24, asiExtraField25, asiExtraField26 };
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray27);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray28);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField30 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray28);
        byte[] byteArray31 = unicodePathExtraField30.getLocalFileDataData();
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean40 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray38, (int) (short) 1);
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray38, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField43 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray38);
        unicodePathExtraField30.setUnicodeName(byteArray38);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort45 = unicodePathExtraField30.getCentralDirectoryLength();
        byte[] byteArray46 = zipShort45.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream15.write(byteArray46, 512, 28789);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '28789' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 69, 102, 25, 55, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zipShort45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[10, 0]");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test692");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream3.setMethod((int) (byte) -1);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test693");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.setEncoding("org.apache.commons.compress.archivers.ArchiveException: 070701");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: org.apache.commons.compress.archivers.ArchiveException: 070701");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test694");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test695");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream4.setMethod(2);
        zipArchiveOutputStream4.setComment("070701");
        zipArchiveOutputStream4.closeArchiveEntry();
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test696");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj13 = asiExtraField12.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField14 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField15 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj16 = asiExtraField15.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField17 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField19 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField12, asiExtraField14, asiExtraField15, asiExtraField17, asiExtraField18, asiExtraField19 };
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray20);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong22 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray21);
        boolean boolean24 = zipLong22.equals((java.lang.Object) 24576);
        byte[] byteArray25 = zipLong22.getBytes();
        boolean boolean27 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray25, 8192);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray25, 128, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[110, 117, 14, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test697");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14);
        zipArchiveOutputStream15.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        zipArchiveOutputStream15.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream15.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy26 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        java.lang.String str28 = unicodeExtraFieldPolicy26.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy26);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "not encodeable" + "'", str19, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "never" + "'", str28, "never");
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test698");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.lang.String str7 = zipArchiveOutputStream3.getEncoding();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test699");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 64);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream13.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test700");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry12.getLastAccessTime();
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream14, (int) 'a');
        tarArchiveInputStream16.reset();
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int20 = tarArchiveInputStream16.read(byteArray19);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream16);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = zipArchiveInputStream21.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream21);
        boolean boolean24 = cpioArchiveInputStream23.markSupported();
        boolean boolean25 = zipArchiveEntry12.equals((java.lang.Object) cpioArchiveInputStream23);
        long long26 = zipArchiveEntry12.getCompressedSize();
        long long27 = zipArchiveEntry12.getTime();
        int int28 = zipArchiveEntry12.getPlatform();
        long long29 = zipArchiveEntry12.getTime();
        zipArchiveEntry12.setTime((long) (short) 3);
        java.lang.String str32 = zipArchiveEntry12.getComment();
        byte[] byteArray33 = zipArchiveEntry12.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField34 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("070702", byteArray33);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray33, (int) (short) 3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray33, 32768, (int) (short) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test701");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        tarArchiveOutputStream2.setLongFileMode(3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream23, 0);
        tarArchiveOutputStream25.setLongFileMode((int) (short) 10);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test702");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField26 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj27 = asiExtraField26.clone();
        int int28 = asiExtraField26.getGroupId();
        asiExtraField26.setMode((int) 'a');
        zipArchiveEntry25.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) asiExtraField26);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField32 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj33 = asiExtraField32.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField34 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField35 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj36 = asiExtraField35.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField37 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField38 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField39 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray40 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField32, asiExtraField34, asiExtraField35, asiExtraField37, asiExtraField38, asiExtraField39 };
        byte[] byteArray41 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray40);
        byte[] byteArray42 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray40);
        byte[] byteArray43 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray40);
        zipArchiveEntry25.setCentralDirectoryExtra(byteArray43);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream23.write(byteArray43, 0, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "not encodeable" + "'", str19, "not encodeable");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(zipExtraFieldArray40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test703");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, 512);
        tarArchiveOutputStream4.flush();
        tarArchiveOutputStream4.closeArchiveEntry();
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test704");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test705");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setEncoding("UTF8");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test706");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        long long3 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField4 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = asiExtraField4.getHeaderId();
        byte[] byteArray6 = asiExtraField4.getLocalFileDataData();
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean15 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, (int) (short) 1);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray13);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = unicodeCommentExtraField18.getHeaderId();
        byte[] byteArray20 = unicodeCommentExtraField18.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray22 = asiExtraField21.getLocalFileDataData();
        int int23 = asiExtraField21.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort24 = asiExtraField21.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField25 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort24);
        byte[] byteArray26 = zipExtraField25.getLocalFileDataData();
        byte[] byteArray27 = zipExtraField25.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField4, unicodeCommentExtraField18, zipExtraField25 };
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray28);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
        zipArchiveEntry1.setCrc(16777216L);
        java.io.InputStream inputStream33 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream33, (int) 'a');
        tarArchiveInputStream35.close();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream37 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream35);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry38 = jarArchiveInputStream37.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry39 = jarArchiveInputStream37.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry40 = jarArchiveInputStream37.getNextJarEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) jarArchiveInputStream37);
        java.io.OutputStream outputStream42 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream42, (int) '4');
        tarArchiveOutputStream44.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField48 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj49 = asiExtraField48.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField50 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField51 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj52 = asiExtraField51.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField53 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField54 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField55 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray56 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField48, asiExtraField50, asiExtraField51, asiExtraField53, asiExtraField54, asiExtraField55 };
        byte[] byteArray57 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray56);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField58 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray57);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField59 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray57);
        tarArchiveOutputStream44.write(byteArray57, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort63 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray57);
        boolean boolean65 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray57, (int) (byte) 1);
        int int68 = jarArchiveInputStream37.read(byteArray57, (int) (byte) 100, 100);
        boolean boolean69 = zipArchiveEntry1.equals((java.lang.Object) jarArchiveInputStream37);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray70 = zipArchiveEntry1.getExtraFields();
        byte[] byteArray71 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setComment("org.apache.commons.compress.archivers.ArchiveException: TRAILER!!!");
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 77, -85, -30, 110, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(zipShort24);
        org.junit.Assert.assertNotNull(zipExtraField25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertNull(jarArchiveEntry38);
        org.junit.Assert.assertNull(jarArchiveEntry39);
        org.junit.Assert.assertNull(jarArchiveEntry40);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(zipExtraFieldArray56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray70);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 117, 99, 8, 0, 1, 77, -85, -30, 110, 104, 105, 33]");
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test707");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream10, (int) 'a');
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int19 = tarArchiveInputStream12.read(byteArray18);
        tarArchiveInputStream12.reset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12, (int) (byte) 0, (int) (short) 3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12, 10);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField30 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj31 = asiExtraField30.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField32 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField33 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj34 = asiExtraField33.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField35 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField36 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField37 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField30, asiExtraField32, asiExtraField33, asiExtraField35, asiExtraField36, asiExtraField37 };
        byte[] byteArray39 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray38);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField40 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray39);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField41 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray39);
        byte[] byteArray42 = unicodePathExtraField41.getLocalFileDataData();
        byte[] byteArray43 = unicodePathExtraField41.getUnicodeName();
        int int44 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray43);
        int int47 = tarArchiveInputStream27.read(byteArray43, (int) (short) 3, 100);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray43, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 69, 102, 25, 55, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[104, 105, 33]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 26984 + "'", int44 == 26984);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test708");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        int int5 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test709");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("org.apache.commons.compress.archivers.ArchiveException: not encodeable");
        zipArchiveEntry12.setTime(0L);
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry12.getLastModifiedTime();
        java.lang.String str16 = zipArchiveEntry12.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry12);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(fileTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.compress.archivers.ArchiveException: not encodeable" + "'", str16, "org.apache.commons.compress.archivers.ArchiveException: not encodeable");
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test710");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test711");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = cpioArchiveOutputStream9.createArchiveEntry(file10, "TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test712");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream19.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test713");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream4.setLevel(0);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test714");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test715");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test716");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream23.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "not encodeable" + "'", str19, "not encodeable");
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test717");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 64, 30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 420, 493);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream12.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test718");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 26742);
        arArchiveOutputStream26.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry32 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime33 = zipArchiveEntry32.getLastAccessTime();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream34, (int) 'a');
        tarArchiveInputStream36.reset();
        byte[] byteArray39 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int40 = tarArchiveInputStream36.read(byteArray39);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream41 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = zipArchiveInputStream41.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream41);
        boolean boolean44 = cpioArchiveInputStream43.markSupported();
        boolean boolean45 = zipArchiveEntry32.equals((java.lang.Object) cpioArchiveInputStream43);
        long long46 = zipArchiveEntry32.getCompressedSize();
        long long47 = zipArchiveEntry32.getTime();
        int int48 = zipArchiveEntry32.getPlatform();
        long long49 = zipArchiveEntry32.getTime();
        java.lang.String str50 = zipArchiveEntry32.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry32);
        zipArchiveEntry51.setCrc((long) 2);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream26.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry51);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertNull(fileTime33);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "070702" + "'", str50, "070702");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test719");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream15.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream17);
        jarArchiveOutputStream17.setEncoding("UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test720");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        tarArchiveOutputStream2.setLongFileMode(51966);
        int int6 = tarArchiveOutputStream2.getRecordSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test721");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setComment("070701");
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test722");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        tarArchiveOutputStream22.closeArchiveEntry();
        tarArchiveOutputStream22.closeArchiveEntry();
        int int26 = tarArchiveOutputStream22.getRecordSize();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 512 + "'", int26 == 512);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test723");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        boolean boolean12 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test724");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        tarArchiveOutputStream2.closeArchiveEntry();
        int int5 = tarArchiveOutputStream2.getRecordSize();
        int int6 = tarArchiveOutputStream2.getRecordSize();
        int int7 = tarArchiveOutputStream2.getRecordSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test725");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.closeArchiveEntry();
        zipArchiveOutputStream1.setMethod((int) (short) 100);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, 493);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 256, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test726");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test727");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        zipArchiveOutputStream3.setMethod(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (short) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime19 = zipArchiveEntry18.getLastAccessTime();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream20, (int) 'a');
        tarArchiveInputStream22.reset();
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int26 = tarArchiveInputStream22.read(byteArray25);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream22);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = zipArchiveInputStream27.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream27);
        boolean boolean30 = cpioArchiveInputStream29.markSupported();
        boolean boolean31 = zipArchiveEntry18.equals((java.lang.Object) cpioArchiveInputStream29);
        long long32 = zipArchiveEntry18.getCompressedSize();
        long long33 = zipArchiveEntry18.getTime();
        int int34 = zipArchiveEntry18.getPlatform();
        long long35 = zipArchiveEntry18.getTime();
        zipArchiveEntry18.setTime((long) (short) 3);
        long long38 = zipArchiveEntry18.getCompressedSize();
        boolean boolean39 = zipArchiveEntry18.isDirectory();
        long long40 = zipArchiveEntry18.getCompressedSize();
        zipArchiveEntry18.setUnixMode(493);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression method");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
        org.junit.Assert.assertNull(fileTime19);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test728");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) 'a', (int) '#');
        tarArchiveOutputStream3.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test729");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        java.lang.String str9 = unicodeExtraFieldPolicy6.toString();
        java.lang.String str10 = unicodeExtraFieldPolicy6.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "not encodeable" + "'", str9, "not encodeable");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test730");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 64, 30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 420, 493);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime18 = zipArchiveEntry17.getLastAccessTime();
        long long19 = zipArchiveEntry17.getSize();
        byte[] byteArray20 = zipArchiveEntry17.getLocalFileDataExtra();
        zipArchiveEntry17.setTime((long) (byte) 0);
        long long23 = zipArchiveEntry17.getCompressedSize();
        java.lang.Object obj24 = zipArchiveEntry17.clone();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker25 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort26 = jarMarker25.getCentralDirectoryLength();
        byte[] byteArray27 = jarMarker25.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField28 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = asiExtraField28.getHeaderId();
        asiExtraField28.setGroupId(256);
        byte[] byteArray32 = asiExtraField28.getCentralDirectoryData();
        jarMarker25.parseFromCentralDirectoryData(byteArray32, 0, 0);
        byte[] byteArray36 = jarMarker25.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort37 = jarMarker25.getHeaderId();
        zipArchiveEntry17.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) jarMarker25);
        byte[] byteArray39 = jarMarker25.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort40 = jarMarker25.getLocalFileDataLength();
        byte[] byteArray41 = jarMarker25.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream12.write(byteArray41, 51966, 28789);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '28789' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNull(fileTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "070702");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "070702");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "070702");
        org.junit.Assert.assertNotNull(zipShort26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(zipShort29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-32, 88, -115, -108, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(zipShort37);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(zipShort40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test731");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy10 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str11 = unicodeExtraFieldPolicy10.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (int) (short) 12, 2);
        zipArchiveOutputStream3.setFallbackToUTF8(false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "not encodeable" + "'", str11, "not encodeable");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test732");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((-1L));
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray1);
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream3, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        zipArchiveOutputStream6.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        boolean boolean19 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        zipArchiveOutputStream6.setComment("TRAILER!!!");
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(false);
        boolean boolean25 = zipShort2.equals((java.lang.Object) zipArchiveOutputStream6);
        java.lang.String str26 = zipArchiveOutputStream6.getEncoding();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6, (int) (short) 12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 33, 0, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTF8" + "'", str26, "UTF8");
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test733");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream11);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test734");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1, (int) '4');
        tarArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField7 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj8 = asiExtraField7.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField10 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj11 = asiExtraField10.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField14 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField7, asiExtraField9, asiExtraField10, asiExtraField12, asiExtraField13, asiExtraField14 };
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray16);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray16);
        tarArchiveOutputStream3.write(byteArray16, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray16);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray23 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray16);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField24 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("org.apache.commons.compress.archivers.ArchiveException: UTF8", byteArray16);
        unicodePathExtraField24.setNameCRC32((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = unicodePathExtraField29.getHeaderId();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField31 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray32 = asiExtraField31.getCentralDirectoryData();
        unicodePathExtraField29.setUnicodeName(byteArray32);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort34 = unicodePathExtraField29.getHeaderId();
        zipArchiveEntry28.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodePathExtraField29);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort36 = unicodePathExtraField29.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField37 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray38 = asiExtraField37.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort39 = asiExtraField37.getHeaderId();
        byte[] byteArray40 = asiExtraField37.getCentralDirectoryData();
        long long41 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray40);
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray40, 4);
        unicodePathExtraField29.setUnicodeName(byteArray40);
        unicodePathExtraField24.setUnicodeName(byteArray40);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray23);
        org.junit.Assert.assertNotNull(zipShort30);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort34);
        org.junit.Assert.assertNotNull(zipShort36);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 3817498742L + "'", long41 == 3817498742L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test735");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        zipArchiveOutputStream3.setComment("070702");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray14 = asiExtraField13.getLocalFileDataData();
        int int15 = asiExtraField13.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = asiExtraField13.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        int int20 = asiExtraField18.getGroupId();
        boolean boolean21 = zipShort16.equals((java.lang.Object) asiExtraField18);
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24);
        zipArchiveOutputStream25.closeArchiveEntry();
        boolean boolean27 = zipShort16.equals((java.lang.Object) zipArchiveOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy29 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        zipArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        java.lang.String str31 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 511);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream34, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream36.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "not encodeable" + "'", str31, "not encodeable");
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test736");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        zipArchiveOutputStream15.setComment("UTF8");
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream18 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream15);
        byte[] byteArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream18.write(byteArray19, 49152, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test737");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream5);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test738");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.lang.String str7 = zipArchiveOutputStream3.getEncoding();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test739");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test740");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        zipArchiveOutputStream3.closeArchiveEntry();
        zipArchiveOutputStream3.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.setLevel(4096);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 4096");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test741");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (byte) 0);
        java.util.Date date2 = org.apache.commons.compress.archivers.zip.ZipUtil.fromDosTime(zipLong1);
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream3, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        zipArchiveOutputStream6.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream10, (int) 'a');
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int19 = tarArchiveInputStream12.read(byteArray18);
        tarArchiveInputStream12.reset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12, (int) (byte) 0, (int) (short) 3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12, 10);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField30 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj31 = asiExtraField30.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField32 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField33 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj34 = asiExtraField33.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField35 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField36 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField37 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField30, asiExtraField32, asiExtraField33, asiExtraField35, asiExtraField36, asiExtraField37 };
        byte[] byteArray39 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray38);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField40 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray39);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField41 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray39);
        int int44 = tarArchiveInputStream12.read(byteArray39, 100, 8);
        tarArchiveOutputStream9.write(byteArray39, (int) (byte) 1, (int) (short) -1);
        int int48 = tarArchiveOutputStream9.getRecordSize();
        boolean boolean49 = zipLong1.equals((java.lang.Object) int48);
        long long50 = zipLong1.getValue();
        java.util.Date date51 = org.apache.commons.compress.archivers.zip.ZipUtil.fromDosTime(zipLong1);
        long long52 = zipLong1.getValue();
        byte[] byteArray53 = zipLong1.getBytes();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Fri Nov 30 00:00:00 PST 1979");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 512 + "'", int48 == 512);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Fri Nov 30 00:00:00 PST 1979");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0, 0, 0, 0]");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test742");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField1 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj2 = asiExtraField1.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField3 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField4 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj5 = asiExtraField4.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField7 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField1, asiExtraField3, asiExtraField4, asiExtraField6, asiExtraField7, asiExtraField8 };
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray9);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField11 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray10);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = unicodePathExtraField11.getHeaderId();
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream15);
        zipArchiveOutputStream16.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy19 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str20 = unicodeExtraFieldPolicy19.toString();
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy19);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream16);
        boolean boolean23 = zipShort12.equals((java.lang.Object) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22, (int) (short) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream22.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "not encodeable" + "'", str20, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test743");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.closeArchiveEntry();
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = zipArchiveOutputStream3.createArchiveEntry(file13, "never");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test744");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        java.lang.String str14 = zipArchiveOutputStream3.getEncoding();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime19 = zipArchiveEntry18.getLastAccessTime();
        long long20 = zipArchiveEntry18.getSize();
        byte[] byteArray21 = zipArchiveEntry18.getLocalFileDataExtra();
        zipArchiveEntry18.setTime((long) (byte) 0);
        long long24 = zipArchiveEntry18.getCompressedSize();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid compression method");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
        org.junit.Assert.assertNull(fileTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test745");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField5 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj6 = asiExtraField5.clone();
        int int7 = asiExtraField5.getGroupId();
        boolean boolean8 = zipShort3.equals((java.lang.Object) asiExtraField5);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.closeArchiveEntry();
        boolean boolean14 = zipShort3.equals((java.lang.Object) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy16 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy16);
        zipArchiveOutputStream15.setLevel(0);
        zipArchiveOutputStream15.setComment("hi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy16);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test746");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean33 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray31, (int) (short) 1);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray31, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField36 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("hi!", byteArray31);
        int int37 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream2.write(byteArray31, (int) (byte) 1, 64);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '64' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, -1, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 65280 + "'", int37 == 65280);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test747");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream3.setComment("");
        zipArchiveOutputStream3.setComment("070702");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray14 = asiExtraField13.getLocalFileDataData();
        int int15 = asiExtraField13.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = asiExtraField13.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        int int20 = asiExtraField18.getGroupId();
        boolean boolean21 = zipShort16.equals((java.lang.Object) asiExtraField18);
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream22, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream24);
        zipArchiveOutputStream25.closeArchiveEntry();
        boolean boolean27 = zipShort16.equals((java.lang.Object) zipArchiveOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream25);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy29 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        zipArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        java.lang.String str31 = unicodeExtraFieldPolicy29.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy29);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 511);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream34, (short) 1);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField40 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj41 = asiExtraField40.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField42 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField43 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj44 = asiExtraField43.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField45 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField46 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField47 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray48 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField40, asiExtraField42, asiExtraField43, asiExtraField45, asiExtraField46, asiExtraField47 };
        byte[] byteArray49 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray48);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField50 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray49);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField51 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray49);
        byte[] byteArray52 = unicodePathExtraField51.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField53 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray52);
        byte[] byteArray54 = unicodeCommentExtraField53.getLocalFileDataData();
        long long55 = unicodeCommentExtraField53.getNameCRC32();
        byte[] byteArray56 = unicodeCommentExtraField53.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream36.write(byteArray56, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "not encodeable" + "'", str31, "not encodeable");
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(zipExtraFieldArray48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1, 69, 102, 25, 55, 104, 105, 33]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[1, -83, 6, -120, -33]");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 3750233773L + "'", long55 == 3750233773L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1, -83, 6, -120, -33]");
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test748");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test749");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        tarArchiveOutputStream22.closeArchiveEntry();
        int int25 = tarArchiveOutputStream22.getRecordSize();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test750");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test751");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        boolean boolean16 = zipArchiveOutputStream3.isSeekable();
        java.lang.String str17 = zipArchiveOutputStream3.getEncoding();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (int) '4');
        zipArchiveOutputStream3.closeArchiveEntry();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF8" + "'", str17, "UTF8");
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test752");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        boolean boolean16 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.closeArchiveEntry();
        zipArchiveOutputStream3.setComment("TRAILER!!!");
        java.io.OutputStream outputStream20 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream20, (int) '4');
        tarArchiveOutputStream22.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField26 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj27 = asiExtraField26.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField28 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField29 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj30 = asiExtraField29.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField31 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField32 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField33 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray34 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField26, asiExtraField28, asiExtraField29, asiExtraField31, asiExtraField32, asiExtraField33 };
        byte[] byteArray35 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray34);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField36 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray35);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField37 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray35);
        tarArchiveOutputStream22.write(byteArray35, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort41 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray35);
        int int42 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray35);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort44 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray35, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.write(byteArray35, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(zipExtraFieldArray34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 30062 + "'", int42 == 30062);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test753");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        zipArchiveOutputStream5.closeArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream8 = archiveStreamFactory0.createArchiveOutputStream("org.apache.commons.compress.archivers.ArchiveException: UTF8", (java.io.OutputStream) zipArchiveOutputStream5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: org.apache.commons.compress.archivers.ArchiveException: UTF8 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test754");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 64, 30062);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test755");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.lang.String str18 = jarArchiveOutputStream17.getEncoding();
        jarArchiveOutputStream17.setLevel(0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF8" + "'", str18, "UTF8");
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test756");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        boolean boolean9 = zipArchiveOutputStream3.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.setEncoding("org.apache.commons.compress.archivers.ArchiveException: hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: org.apache.commons.compress.archivers.ArchiveException: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test757");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) 'a');
        tarArchiveInputStream2.close();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = jarArchiveInputStream4.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry6 = jarArchiveInputStream4.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = jarArchiveInputStream4.getNextJarEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) jarArchiveInputStream4);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        tarArchiveOutputStream11.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField15 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj16 = asiExtraField15.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField17 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField22 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray23 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField15, asiExtraField17, asiExtraField18, asiExtraField20, asiExtraField21, asiExtraField22 };
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray23);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField25 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray24);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray24);
        tarArchiveOutputStream11.write(byteArray24, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray24);
        boolean boolean32 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray24, (int) (byte) 1);
        int int35 = jarArchiveInputStream4.read(byteArray24, (int) (byte) 100, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream4, 49152, (int) (short) 8);
        org.junit.Assert.assertNull(jarArchiveEntry5);
        org.junit.Assert.assertNull(jarArchiveEntry6);
        org.junit.Assert.assertNull(jarArchiveEntry7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(zipExtraFieldArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test758");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream13);
        zipArchiveOutputStream14.setComment("org.apache.commons.compress.archivers.ArchiveException: hi!");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream14);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream14.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test759");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream7, (int) 'a');
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int16 = tarArchiveInputStream9.read(byteArray15);
        tarArchiveInputStream9.reset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9, (int) (byte) 0, (int) (short) 3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9, 10);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField27 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj28 = asiExtraField27.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField29 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField30 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj31 = asiExtraField30.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField32 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField33 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField34 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField27, asiExtraField29, asiExtraField30, asiExtraField32, asiExtraField33, asiExtraField34 };
        byte[] byteArray36 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray35);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField37 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray36);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField38 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray36);
        int int41 = tarArchiveInputStream9.read(byteArray36, 100, 8);
        tarArchiveOutputStream6.write(byteArray36, (int) (byte) 1, (int) (short) -1);
        tarArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream46 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField47 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray48 = asiExtraField47.getLocalFileDataData();
        int int49 = asiExtraField47.getMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort50 = asiExtraField47.getHeaderId();
        byte[] byteArray51 = asiExtraField47.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort52 = asiExtraField47.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry54 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime55 = zipArchiveEntry54.getLastAccessTime();
        java.io.InputStream inputStream56 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream58 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream56, (int) 'a');
        tarArchiveInputStream58.reset();
        byte[] byteArray61 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (short) 10);
        int int62 = tarArchiveInputStream58.read(byteArray61);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream63 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream58);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = zipArchiveInputStream63.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream65 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream63);
        boolean boolean66 = cpioArchiveInputStream65.markSupported();
        boolean boolean67 = zipArchiveEntry54.equals((java.lang.Object) cpioArchiveInputStream65);
        long long68 = zipArchiveEntry54.getCompressedSize();
        long long69 = zipArchiveEntry54.getTime();
        int int70 = zipArchiveEntry54.getPlatform();
        long long71 = zipArchiveEntry54.getTime();
        long long72 = zipArchiveEntry54.getCompressedSize();
        java.nio.file.attribute.FileTime fileTime73 = zipArchiveEntry54.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker74 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort75 = jarMarker74.getCentralDirectoryLength();
        byte[] byteArray76 = jarMarker74.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort77 = jarMarker74.getLocalFileDataLength();
        boolean boolean78 = zipArchiveEntry54.equals((java.lang.Object) jarMarker74);
        java.lang.Object obj79 = zipArchiveEntry54.clone();
        boolean boolean80 = zipShort52.equals((java.lang.Object) zipArchiveEntry54);
        zipArchiveEntry54.setUnixMode(2048);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream46.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry54);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '4' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(zipShort50);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort52);
        org.junit.Assert.assertNull(fileTime55);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1L) + "'", long68 == (-1L));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L) + "'", long71 == (-1L));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertNull(fileTime73);
        org.junit.Assert.assertNotNull(zipShort75);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[]");
        org.junit.Assert.assertNotNull(zipShort77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertEquals(obj79.toString(), "070702");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj79), "070702");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj79), "070702");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test760");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        zipArchiveOutputStream1.close();
        zipArchiveOutputStream1.closeArchiveEntry();
        zipArchiveOutputStream1.setMethod((int) (short) 100);
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setMethod(4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test761");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, (int) (short) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        java.nio.file.attribute.FileTime fileTime27 = zipArchiveEntry26.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField28 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray29 = asiExtraField28.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = asiExtraField28.getHeaderId();
        byte[] byteArray31 = asiExtraField28.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField32 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = asiExtraField32.getHeaderId();
        asiExtraField32.setGroupId(256);
        byte[] byteArray36 = asiExtraField32.getCentralDirectoryData();
        byte[] byteArray37 = asiExtraField32.getLocalFileDataData();
        byte[] byteArray38 = asiExtraField32.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray39 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField28, asiExtraField32 };
        byte[] byteArray40 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray39);
        boolean boolean41 = zipArchiveEntry26.equals((java.lang.Object) zipExtraFieldArray39);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream24.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(fileTime27);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-32, 88, -115, -108, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-32, 88, -115, -108, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-32, 88, -115, -108, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, -32, 88, -115, -108, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test762");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = tarArchiveOutputStream9.createArchiveEntry(file11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test763");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        boolean boolean16 = zipArchiveOutputStream3.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test764");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((-1L));
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray1);
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream3, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5);
        zipArchiveOutputStream6.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(true);
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        boolean boolean19 = zipArchiveOutputStream6.isSeekable();
        zipArchiveOutputStream6.closeArchiveEntry();
        zipArchiveOutputStream6.setComment("TRAILER!!!");
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(false);
        boolean boolean25 = zipShort2.equals((java.lang.Object) zipArchiveOutputStream6);
        java.lang.String str26 = zipArchiveOutputStream6.getEncoding();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6, (int) (short) 12);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream28.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 33, 0, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTF8" + "'", str26, "UTF8");
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test765");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test766");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 28789, 22752);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, (short) 1);
        arArchiveOutputStream26.closeArchiveEntry();
        arArchiveOutputStream26.closeArchiveEntry();
        java.io.File file34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = arArchiveOutputStream26.createArchiveEntry(file34, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test767");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 10);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker20 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = jarMarker20.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = jarMarker20.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = jarMarker20.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort24 = jarMarker20.getCentralDirectoryLength();
        byte[] byteArray25 = zipShort24.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream19.write(byteArray25, 30062, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertNotNull(zipShort21);
        org.junit.Assert.assertNotNull(zipShort22);
        org.junit.Assert.assertNotNull(zipShort23);
        org.junit.Assert.assertNotNull(zipShort24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0]");
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test768");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 64);
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = tarArchiveOutputStream13.createArchiveEntry(file14, "org.apache.commons.compress.archivers.ArchiveException: org.apache.commons.compress.archivers.ArchiveException: not encodeable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test769");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.setEncoding("070702");
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test770");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray24 = asiExtraField23.getCentralDirectoryData();
        byte[] byteArray25 = asiExtraField23.getLocalFileDataData();
        tarArchiveOutputStream22.write(byteArray25, 0, 0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream29 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        java.io.File file30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = arArchiveOutputStream29.createArchiveEntry(file30, "never");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test771");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray24 = asiExtraField23.getCentralDirectoryData();
        byte[] byteArray25 = asiExtraField23.getLocalFileDataData();
        tarArchiveOutputStream22.write(byteArray25, 0, 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        java.io.File file30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = cpioArchiveOutputStream29.createArchiveEntry(file30, "org.apache.commons.compress.archivers.ArchiveException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test772");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) 'a');
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        int int9 = tarArchiveInputStream2.read(byteArray8);
        int int10 = tarArchiveInputStream2.available();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream12, (int) '4');
        tarArchiveOutputStream14.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField18 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj19 = asiExtraField18.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField21 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj22 = asiExtraField21.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField23 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField24 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField25 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField18, asiExtraField20, asiExtraField21, asiExtraField23, asiExtraField24, asiExtraField25 };
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray26);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField28 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray27);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray27);
        tarArchiveOutputStream14.write(byteArray27, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray27);
        int int36 = tarArchiveInputStream2.read(byteArray27, 16384, 0);
        int int38 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray27, 2);
        boolean boolean40 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray27, 30062);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 0, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 14 + "'", int38 == 14);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test773");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        tarArchiveOutputStream2.setLongFileMode(0);
        int int25 = tarArchiveOutputStream2.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 28789, 22752);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream29, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 512 + "'", int25 == 512);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test774");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        zipArchiveOutputStream3.closeArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        tarArchiveOutputStream13.finish();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test775");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 64, 30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12, 420, 493);
        tarArchiveOutputStream15.closeArchiveEntry();
        tarArchiveOutputStream15.setLongFileMode(61440);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "not encodeable" + "'", str7, "not encodeable");
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test776");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        boolean boolean7 = zipArchiveOutputStream3.isSeekable();
        boolean boolean8 = zipArchiveOutputStream3.isSeekable();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test777");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2);
        zipArchiveOutputStream3.setMethod(30062);
        java.lang.String str6 = zipArchiveOutputStream3.getEncoding();
        zipArchiveOutputStream3.setComment("not encodeable");
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream9, (int) '4');
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        zipArchiveOutputStream12.setMethod(30062);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy15 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str16 = unicodeExtraFieldPolicy15.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy18 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str19 = unicodeExtraFieldPolicy18.toString();
        zipArchiveOutputStream12.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        zipArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy18);
        boolean boolean22 = zipArchiveOutputStream3.isSeekable();
        zipArchiveOutputStream3.setUseLanguageEncodingFlag(false);
        java.lang.String str25 = zipArchiveOutputStream3.getEncoding();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "not encodeable" + "'", str19, "not encodeable");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTF8" + "'", str25, "UTF8");
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test778");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, 26742);
        tarArchiveOutputStream2.setLongFileMode((int) (short) 10);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test779");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
        tarArchiveOutputStream2.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField6 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj7 = asiExtraField6.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField8 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField9 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj10 = asiExtraField9.clone();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField11 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField13 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { asiExtraField6, asiExtraField8, asiExtraField9, asiExtraField11, asiExtraField12, asiExtraField13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray15);
        tarArchiveOutputStream2.write(byteArray15, 0, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 420);
        int int23 = tarArchiveOutputStream22.getRecordSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream26, 26742);
        arArchiveOutputStream26.closeArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("070702");
        int int32 = zipArchiveEntry31.getMethod();
        int int33 = zipArchiveEntry31.getPlatform();
        int int34 = zipArchiveEntry31.getInternalAttributes();
        java.lang.Object obj35 = zipArchiveEntry31.clone();
        boolean boolean36 = zipArchiveEntry31.isDirectory();
        zipArchiveEntry31.setUnixMode((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream26.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.zip.ZipArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 110, 117, 14, 0, 118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 512 + "'", int23 == 512);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "070702");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "070702");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "070702");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }
}

