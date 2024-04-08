import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month('#', 'a', ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime2);
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId5);
        long long7 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId5);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId11);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId11);
        java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId11);
        long long15 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId11);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime2);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        java.time.ZoneId zoneId21 = com.alibaba.fastjson2.util.DateUtils.OFFSET_8_ZONE_ID;
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(1L, zoneId21);
        long long23 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime19, zoneId21);
        long long24 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId21);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 100, zoneId21);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str3, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31" + "'", str6, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-50372000L) + "'", long7 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-100772000L) + "'", long15 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str16, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-100772000L) + "'", long23 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-100772000L) + "'", long24 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "19700101" + "'", str25, "19700101");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.time.ZoneId zoneId1 = null;
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("", zoneId1);
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 2097249);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 6357089);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) '4');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (int) (short) 100);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 28800);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) 1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 3407924);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (short) 100);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray4, 29143, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 3407907, 0, zoneId8);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, (int) 'a');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, (int) (byte) -1, (int) (short) 0);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, 10);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("1970-01-01 09:45:57.024");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray0, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(2097204, (int) (short) 1, (int) (byte) 0, 3407969, (int) (byte) 1, 2097184);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20972");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format((-44043000L), dateTimeFormatPattern4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(2293857, (int) (short) 100, (int) (byte) 10, dateTimeFormatPattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22938");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31" + "'", str5, "1969-12-31");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, (int) (byte) 10, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 6357027);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) (byte) 100, 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0100-01-00" + "'", str3, "0100-01-00");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1969-12-31 18:00:28");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01" + "'", str1, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 18:00:28" + "'", str3, "1969-12-31 18:00:28");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("0010/01/01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0010/01/01");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("4071-01-09 00:00:00", (int) (byte) 10, 6357089);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 4071-01-09 00:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray8, 100);
        java.util.Date date15 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId18);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId18);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date15, zoneId18);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId18);
        java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray8, 2097249, 1, zoneId18);
        java.util.Date date24 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 04:00:28", zoneId18);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("2006-02-28", zoneId18);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 2006-02-28");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 14:00:00" + "'", str21, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
        org.junit.Assert.assertNull(zonedDateTime23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Tue Dec 30 14:00:28 CST 1969");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1968-01-15 15:00:14", (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1968-01-15 15:00:14");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((long) (short) 10, dateTimeFormatPattern6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format((long) ' ', dateTimeFormatPattern6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format((long) (byte) 10, dateTimeFormatPattern6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format((int) (byte) -1, (int) (byte) 100, (int) (byte) 0, dateTimeFormatPattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern6 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern6.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "31.12.1969 18:00:00" + "'", str7, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31.12.1969 18:00:00" + "'", str8, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31.12.1969 18:00:00" + "'", str9, "31.12.1969 18:00:00");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((int) (byte) 100, (int) (byte) 1, 6357024, 2097249, 0, (int) '4');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 489195489860L + "'", long6 == 489195489860L);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month(' ', ' ', 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 2097204);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 6357024);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(100, 3407907, (int) '4', (int) '4', 0, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969-12-31T19:45:57");
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 6357044);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, 2097184, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5505088");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("-0001-10-3");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input -0001-10-3");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        char[] charArray0 = new char[] {};
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (short) 0, (int) '4');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 3407907, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern2 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH;
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((-44043000L), dateTimeFormatPattern2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(5478713135728003L, dateTimeFormatPattern2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1755");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern2 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH + "'", dateTimeFormatPattern2.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31" + "'", str3, "1969-12-31");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, 2097184);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', '#', '4', '4', 'a', 'a', ' ', 'a', '4', ' ', 'a', '4', '#', ' ');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 3407969);
        java.time.ZoneId zoneId10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, (int) '4', zoneId10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, 6357024, 100);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, (int) (short) 10);
        char[] charArray22 = null;
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId30);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId30);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId30);
        java.time.ZonedDateTime zonedDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("0001-01-01 00:00:00", zoneId30);
        long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray22, (int) (byte) 0, 2293857, zoneId30);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 3407969, 2097249, zoneId30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "19700101" + "'", str32, "19700101");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str33, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097184);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 6357024);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 2097184);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 6357024);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, 2293857);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, (int) (short) 0);
        java.nio.charset.Charset charset19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 3407969, 6357044, charset19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month('4', ' ', 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1970-01-01 09:45:57");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 09:45:57");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("0000-52-00", (int) (short) 1);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.util.Date date3 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId8);
        java.time.ZonedDateTime zonedDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId8);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3, zoneId8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969", "1970-01-02 04:00:00", zoneId8);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '31.12.1969' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 14:00:00" + "'", str4, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "19700101" + "'", str10, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-02 04:00:00" + "'", str12, "1970-01-02 04:00:00");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('#', '4', ' ', ' ', 'a', ' ', ' ', 'a');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, 2097204, 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -50");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray6, 28800, 6357024);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357024");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) '4');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 28800);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 0);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 3407969);
        java.nio.charset.Charset charset23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 28800, (int) (byte) -1, charset23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28800");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(2097249, 3407907, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 0, (int) (byte) 0, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 2097249);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 28800);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, 2293857, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 3407907);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 3407969);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) -1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) '4');
        java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId25);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId25);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date22, zoneId25);
        long long36 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId25, (int) ' ', (int) (byte) 0, 2097249, (int) (byte) 100, 6357024, (int) ' ', 3407907);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime37 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 29143, (int) (byte) 100, zoneId25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "19700101" + "'", str27, "19700101");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 14:00:00" + "'", str28, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 120424011872003L + "'", long36 == 120424011872003L);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 6357024);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '4', '#', 'a', 'a', 'a', 'a', 'a', ' ', ' ', '#', 'a', 'a', '#', '#', '4', '#', 'a', ' ', '#', ' ', 'a', 'a');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 6357024);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407969");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray0, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime(' ', 'a', 'a', '#', '4', 'a', 'a', 'a', 'a', 'a', 'a', '#', ' ', 'a', 'a', '#', '4', 'a', '#', '4', '#', ' ', ' ');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) 'a');
        byte[] byteArray15 = null;
        java.nio.charset.Charset charset18 = null;
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId24);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId24);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21, zoneId24);
        long long35 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId24, (int) ' ', (int) (byte) 0, 2097249, (int) (byte) 100, 6357024, (int) ' ', 3407907);
        long long43 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId24, 3407924, 3407924, 0, (int) (byte) 1, (int) (short) -1, (int) (short) 0, 10);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(66301905206252L, zoneId24);
        long long45 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray15, 0, (-1), charset18, zoneId24);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime46 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) '#', 100, zoneId24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "19700101" + "'", str26, "19700101");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01 14:00:00" + "'", str27, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 120424011872003L + "'", long35 == 120424011872003L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 116486622349140000L + "'", long43 == 116486622349140000L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "4071-01-09" + "'", str44, "4071-01-09");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray6, (int) (byte) 0, (-1));
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray6, 3407904);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray6, 0, 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("4071-01-09", 2293857);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 3407904);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 6357027);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 6357089, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357089");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, 2293857);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1968-01-15 20:30:27");
        org.junit.Assert.assertNotNull(zonedDateTime1);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, (-1));
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray6, 6357027);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime(' ', 'a', 'a', '#', ' ', '#', '#', ' ');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.nio.charset.Charset charset11 = null;
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) '4', (int) (byte) 0, charset11);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 28800, (int) (short) -1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 2293857);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 33");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 28800);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, 2293857);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2293857");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date13, zoneId16);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId16);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, 2097249, 1, zoneId16);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray6, (int) (byte) 10);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray6, 2097204);
        char[] charArray31 = new char[] { '4', ' ' };
        java.time.LocalDate localDate33 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray31, (int) (byte) 1);
        java.time.LocalDateTime localDateTime36 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray31, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime38 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray31, (int) (byte) 1);
        java.time.LocalDate localDate40 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray31, 100);
        long long43 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray31, 100, 0);
        java.time.LocalDateTime localDateTime45 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray31, 100);
        java.time.LocalDateTime localDateTime47 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray31, 10);
        java.time.ZoneId zoneId50 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long51 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray31, (int) (short) 100, (int) (short) 0, zoneId50);
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 100, zoneId50);
        long long53 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00.1", zoneId50);
        // The following exception was thrown during execution in test generation
        try {
            long long54 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray6, 0, zoneId50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19700101" + "'", str18, "19700101");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 14:00:00" + "'", str19, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
        org.junit.Assert.assertNull(zonedDateTime21);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertNull(localTime25);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[4,  ]");
        org.junit.Assert.assertNull(localDate33);
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime38);
        org.junit.Assert.assertNull(localDate40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(localDateTime45);
        org.junit.Assert.assertNull(localDateTime47);
        org.junit.Assert.assertNotNull(zoneId50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970-01-01" + "'", str52, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 100L + "'", long53 == 100L);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 0);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) '#');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) -1);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 3407907);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:00");
        char[] charArray3 = null;
        java.util.Date date11 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date11);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.format(date11);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.toString(date11);
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId18);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId18);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date11, zoneId18);
        long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId18);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, true, zoneId18);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId18);
        long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray3, 100, 28800, zoneId18);
        long long26 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId18);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1969-12-31", zoneId18);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1969-12-31");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 00:00:00" + "'", str12, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01 00:00:00" + "'", str13, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 00:00:00" + "'", str14, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 14:00:00" + "'", str21, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-50401000L) + "'", long22 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str23, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19700101" + "'", str24, "19700101");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-100800000L) + "'", long26 == (-100800000L));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 100);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 10);
        java.time.ZoneId zoneId21 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (int) (short) 100, (int) (short) 0, zoneId21);
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(localDate24);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(3407907, 0, (int) '4', 2097249, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 107479952338418L + "'", long6 == 107479952338418L);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 09:45:57.024");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01 00:00:00" + "'", str1, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 09:45:57.024" + "'", str9, "1970-01-01 09:45:57.024");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId6);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId6);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-59161791000L), zoneId6);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "19700101" + "'", str8, "19700101");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str9, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1968-02-16" + "'", str11, "1968-02-16");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("19691230");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 18:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "1970-01-01 08:00:00+08:00");
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str3, "1970-01-01 08:00:00+08:00");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) ' ');
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) ' ');
        java.time.ZoneId zoneId21 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId21);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId21);
        long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId21);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId21, 0, (int) 'a', 2293857, 2097204, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1);
        java.time.ZonedDateTime zonedDateTime33 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00.001+08:00", zoneId21);
        long long41 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId21, 3407969, 3407907, (int) (byte) 10, 6357024, (int) ' ', (int) 'a', (int) (short) -1);
        long long42 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1968-01-16 05:00:14.557+08:00", zoneId21);
        java.util.Date date43 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId21);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime44 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 6357044, 6357024, zoneId21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357044");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "19700101" + "'", str23, "19700101");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-50400000L) + "'", long24 == (-50400000L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 135235494809000L + "'", long32 == 135235494809000L);
        org.junit.Assert.assertNotNull(zonedDateTime33);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 116489408803937000L + "'", long41 == 116489408803937000L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-61873185443L) + "'", long42 == (-61873185443L));
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Wed Dec 31 04:00:00 CST 1969");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format((-62109154705L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1968-01-12 21:27:25" + "'", str1, "1968-01-12 21:27:25");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date2);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date2);
        char[] charArray9 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray9, (int) ' ');
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray9, (int) (short) 1);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray9, (int) (byte) 0, (int) (byte) 0, zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(66119193478870L, zoneId16);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01 14:00:00" + "'", str18, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4065-03-26" + "'", str19, "4065-03-26");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 0, 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (-1));
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) '#');
        java.time.ZoneId zoneId22 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId22);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId22);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.toString((-28800000L), false, zoneId22);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 1, zoneId22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01" + "'", str23, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str24, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01 00:00:00" + "'", str25, "1970-01-01 00:00:00");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format(5999128540344000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1920");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, (int) (short) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, (int) '#');
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month('#', 'a', 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, 0, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3407924");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.util.Date date7 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(date7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString(date7);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId14);
        java.util.Date date16 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId14);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date7, zoneId14);
        long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId14);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, true, zoneId14);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId14);
        long long21 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId14);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId14, 1, (int) ' ', 28800, 10, (int) 'a', 6357024, (-1));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 32");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01 14:00:00" + "'", str17, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-50401000L) + "'", long18 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str19, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-100772000L) + "'", long21 == (-100772000L));
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId4);
        long long6 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId4);
        long long7 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        long long8 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("5375-12-04");
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date13, zoneId16);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date13);
        java.time.ZoneId zoneId26 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId26);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId26);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId26);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date13, zoneId26);
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime11, zoneId26);
        java.time.ZonedDateTime zonedDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00+08:00", zoneId26);
        long long33 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId26);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str2, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31" + "'", str5, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-50372000L) + "'", long6 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-50372000L) + "'", long7 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-50372000L) + "'", long8 == (-50372000L));
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19700101" + "'", str18, "19700101");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 14:00:00" + "'", str19, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1969-12-31" + "'", str27, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1969-12-31 18:00:00.01" + "'", str28, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1969-12-31 17:59:59.999" + "'", str29, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01 00:00:00" + "'", str30, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 107480584800000L + "'", long31 == 107480584800000L);
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-50372000L) + "'", long33 == (-50372000L));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        byte[] byteArray0 = null;
        char[] charArray6 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) ' ');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, (int) (short) 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, 2097184);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray6, (-1));
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray6, 0);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray26, 100);
        java.util.Date date33 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId36);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date33, zoneId36);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId36);
        java.time.ZonedDateTime zonedDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray26, 2097249, 1, zoneId36);
        long long42 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("0000-01-01 00:00:00", zoneId36);
        long long43 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, 29143, 0, zoneId36);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, (int) 'a', zoneId36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "19700101" + "'", str38, "19700101");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01 14:00:00" + "'", str39, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "19700101" + "'", str40, "19700101");
        org.junit.Assert.assertNull(zonedDateTime41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-62167248343000L) + "'", long42 == (-62167248343000L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date13, zoneId16);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId16);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, 2097249, 1, zoneId16);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19700101" + "'", str18, "19700101");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 14:00:00" + "'", str19, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
        org.junit.Assert.assertNull(zonedDateTime21);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("0000-35-35");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 3407904, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407904");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1970-01-01 09:45:57+08:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 09:45:57+08:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.toString((-28800000L), false, zoneId8);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 1, zoneId8);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.032+08:00", zoneId8);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0000-35-00", zoneId8);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 35");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str10, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "19700101" + "'", str12, "19700101");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 18:00:00 CST 1969");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.time.ZoneId zoneId9 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId9);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId9);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.toString((-28800000L), false, zoneId9);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 1, zoneId9);
        java.util.Date date14 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.032+08:00", zoneId9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 09:45:57.024+08:00", "1970-01-01 09:45:57", zoneId9);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1970-01-01 09:45:57.024+08:00' could not be parsed, unparsed text found at index 19");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str11, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 00:00:00" + "'", str12, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 18:00:00 CST 1969");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (byte) 10);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) (short) 1);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 28800);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(3407904, (int) (byte) 1, 2097184, 6357044, 6357044, 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 107663884222960L + "'", long6 == 107663884222960L);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (byte) 0);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 3407924);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, 6357044, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6357045");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("1973-10-02");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date13, zoneId16);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId16);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, 2097249, 1, zoneId16);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray6, 100);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray6, 100);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray6, 3407904);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray6, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357021");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19700101" + "'", str18, "19700101");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 14:00:00" + "'", str19, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
        org.junit.Assert.assertNull(zonedDateTime21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime27);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "19700101");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1969/12/31");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "19691231");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19700101" + "'", str3, "19700101");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969/12/31" + "'", str5, "1969/12/31");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19691231" + "'", str7, "19691231");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (short) 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 3407907);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 6357024);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) 'a');
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 6357024);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) '#');
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (-1));
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 0);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) '#');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 3407907);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, 6357024);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) 'a');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, (int) (short) 100);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray6, 2097249, 1);
        java.time.LocalDate localDate28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray6, 1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ###44");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNull(localDate28);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((int) '4', 3407969, 3407907, 0, 6357089, 6357024);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9239519164764L + "'", long6 == 9239519164764L);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:34:57");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 18:34:57 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31" + "'", str2, "1969-12-31");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, (int) (byte) 10, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (-1));
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray2, 6357044, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((int) (short) 0, (-1), (int) 'a', (int) (short) -1, 100, 6357044);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-62157749356L) + "'", long6 == (-62157749356L));
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, 0, zoneId11);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) 'a');
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId21 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId21);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId21);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date18, zoneId21);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId21, (int) ' ', (int) (byte) 0, 2097249, (int) (byte) 100, 6357024, (int) ' ', 3407907);
        long long40 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId21, 3407924, 3407924, 0, (int) (byte) 1, (int) (short) -1, (int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            long long41 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 10, 2097204, zoneId21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "19700101" + "'", str23, "19700101");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 14:00:00" + "'", str24, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 120424011872003L + "'", long32 == 120424011872003L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 116486622349140000L + "'", long40 == 116486622349140000L);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray6, (int) (byte) 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray6, 2293857);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, 6357024);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray6, 3407969, 0);
        java.util.Date date25 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId28);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId28);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date25, zoneId28);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (byte) 0, (int) (short) -1, zoneId28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(zonedDateTime21);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "19700101" + "'", str30, "19700101");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01 14:00:00" + "'", str31, "1970-01-01 14:00:00");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime3, "1970-01-01 08:00:00.001+08:00");
        char[] charArray10 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray10, (int) ' ');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray10, (int) (short) 1);
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray10, (int) (byte) 0, (int) (byte) 0, zoneId17);
        long long19 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId17);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", zoneId17);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str5, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-100772000L) + "'", long19 == (-100772000L));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Jan 02 09:54:17 CST 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0000-12-31 10:03:41" + "'", str21, "0000-12-31 10:03:41");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 3407907);
        java.nio.charset.Charset charset17 = null;
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.format(date20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(date20);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.toString(date20);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId27);
        java.util.Date date29 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId27);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20, zoneId27);
        long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId27);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 3407924, 2293857, charset17, zoneId27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407924");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 00:00:00" + "'", str21, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 00:00:00" + "'", str22, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 00:00:00" + "'", str23, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01" + "'", str28, "1970-01-01");
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01 14:00:00" + "'", str30, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-50401000L) + "'", long31 == (-50401000L));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        byte[] byteArray0 = null;
        long long3 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 3407904, 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.util.Date date6 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId9 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId9);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId9);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date6, zoneId9);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId9);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) ' ', zoneId9);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-28800000L), zoneId9);
        java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1968-01-15 15:00:14", zoneId9);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId9);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId9, 1, (int) (short) 100, 0, (int) (short) -1, 2097249, (int) (byte) 100, 3407904);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19700101" + "'", str11, "19700101");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 14:00:00" + "'", str12, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-50400000L) + "'", long17 == (-50400000L));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) (short) 10);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, (-1), 2097249);
        char[] charArray26 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray26, (int) ' ');
        java.time.LocalTime localTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray26, (int) (short) 1);
        java.time.ZoneId zoneId33 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray26, (int) (byte) 0, (int) (byte) 0, zoneId33);
        java.time.ZonedDateTime zonedDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 3407907, (int) (short) 1, zoneId33);
        java.time.LocalDateTime localDateTime37 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime39 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertNotNull(zoneId33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNull(zonedDateTime35);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(localDateTime39);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 100, zoneId3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1968-01-26 00:00:00", zoneId3);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1968-01-26 00:00:00");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((int) (short) -1, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (byte) 10);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) (short) 1);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 28800);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, (int) (short) 10);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 3407904);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localTime23);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (short) 0, (int) '4');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097249);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 4a4a");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (short) 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 3407907);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 6357024);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) 'a');
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 1);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 2097204);
        java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 2293857);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNull(localDateTime28);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-01-12 21:27:25");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Fri Jan 12 21:27:25 CST 1968");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("-0001-12-3 10:03:41");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("4071-01-09", (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 4071-01-09");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(6357089, (int) '#', 3407904, dateTimeFormatPattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969/12/31" + "'", str5, "1969/12/31");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("+3693372-0 16:12:17");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) ' ');
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) '#');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 6357024);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "1970-01-01 08:00:00.001+08:00");
        char[] charArray9 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray9, (int) ' ');
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray9, (int) (short) 1);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray9, (int) (byte) 0, (int) (byte) 0, zoneId16);
        long long18 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId16);
        long long19 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
        java.lang.Class<?> wildcardClass20 = localDateTime2.getClass();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str4, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-100772000L) + "'", long18 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-50372000L) + "'", long19 == (-50372000L));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 100);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097200");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, (int) (short) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, (int) '#');
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime2);
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId5);
        long long7 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId5);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray14, 100);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId24);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId24);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21, zoneId24);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId24);
        java.time.ZonedDateTime zonedDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray14, 2097249, 1, zoneId24);
        long long30 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId24);
        java.util.Date date33 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId36);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date33, zoneId36);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId36);
        long long41 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId36);
        long long42 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "+08:00");
        java.time.ZoneId zoneId51 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId51);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId51);
        java.lang.String str54 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId51);
        java.util.Date date55 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId51);
        java.lang.String str56 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date55);
        java.lang.String str57 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date55);
        java.lang.String str58 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date55);
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate67 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray65, 0);
        java.time.LocalDateTime localDateTime69 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray65, 0);
        java.time.ZoneId zoneId73 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str74 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId73);
        java.time.ZonedDateTime zonedDateTime75 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray65, 28800, 0, zoneId73);
        java.lang.String str76 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122090245797L, zoneId73);
        java.lang.String str77 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date55, zoneId73);
        long long78 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId73);
        // The following exception was thrown during execution in test generation
        try {
            long long79 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1969-12-31T19:45:57", zoneId73);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str3, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31" + "'", str6, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-50372000L) + "'", long7 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "19700101" + "'", str26, "19700101");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01 14:00:00" + "'", str27, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "19700101" + "'", str28, "19700101");
        org.junit.Assert.assertNull(zonedDateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-100772000L) + "'", long30 == (-100772000L));
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "19700101" + "'", str38, "19700101");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01 14:00:00" + "'", str39, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "19700101" + "'", str40, "19700101");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-100772000L) + "'", long41 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-50372000L) + "'", long42 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+08:00" + "'", str44, "+08:00");
        org.junit.Assert.assertNotNull(zoneId51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1969-12-31" + "'", str52, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1969-12-31 18:00:00.01" + "'", str53, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1969-12-31 17:59:59.999" + "'", str54, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "19700101" + "'", str56, "19700101");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1970-01-01 14:00:00" + "'", str57, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1970-01-01" + "'", str58, "1970-01-01");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate67);
        org.junit.Assert.assertNull(localDateTime69);
        org.junit.Assert.assertNotNull(zoneId73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "1969-12-31" + "'", str74, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "19731114" + "'", str76, "19731114");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "1970-01-02 04:00:00" + "'", str77, "1970-01-02 04:00:00");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-100772000L) + "'", long78 == (-100772000L));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1968-01-01 15:27:41.258-06:00", 1);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1970-01-01 08:00:00.001");
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray19, 100);
        java.util.Date date26 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId29);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId29);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date26, zoneId29);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId29);
        java.time.ZonedDateTime zonedDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray19, 2097249, 1, zoneId29);
        long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("0000-01-01 00:00:00", zoneId29);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId29);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 14:00:00" + "'", str7, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 08:00:00.001" + "'", str11, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01" + "'", str30, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "19700101" + "'", str31, "19700101");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01 14:00:00" + "'", str32, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "19700101" + "'", str33, "19700101");
        org.junit.Assert.assertNull(zonedDateTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-62167248343000L) + "'", long35 == (-62167248343000L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01 14:00:00" + "'", str36, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01 00:00:00" + "'", str37, "1970-01-01 00:00:00");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 28800);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 0);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 3407969);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) 'a');
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 6357044);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localTime24);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("0100-01-00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("0001-00-00");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((long) 1, dateTimeFormatPattern4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((long) (byte) 0, dateTimeFormatPattern4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format((long) (short) 100, dateTimeFormatPattern4);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "31.12.1969 18:00:00" + "'", str5, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "31.12.1969 18:00:00" + "'", str6, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "31.12.1969 18:00:00" + "'", str7, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31.12.1969 18:00:00" + "'", str8, "31.12.1969 18:00:00");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        long long7 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId4);
        long long15 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId4, 0, (int) 'a', 2293857, 2097204, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1968-01-01 15:27:41.258-06:00", zoneId4);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1968-01-01 15:27:41.258-06:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-50400000L) + "'", long7 == (-50400000L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 135235494809000L + "'", long15 == 135235494809000L);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern1 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format((-184370469531600L), dateTimeFormatPattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -38");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern1 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH + "'", dateTimeFormatPattern1.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1970-01-01 08:34:57+08:00", 29143);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.time.ZoneId zoneId9 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId9);
        java.time.ZonedDateTime zonedDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId9);
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId9);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId9);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId9);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-28800000L) + "'", long12 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 14:00:00" + "'", str14, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01 00:00:00" + "'", str15, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01 00:00:00" + "'", str16, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) '#', (int) (byte) 10, 6357044, (int) (byte) 0, 29143, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357044");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 6357024);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime20);
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId23);
        long long25 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime20, zoneId23);
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray32, 100);
        java.util.Date date39 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId42 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId42);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId42);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date39, zoneId42);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId42);
        java.time.ZonedDateTime zonedDateTime47 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray32, 2097249, 1, zoneId42);
        long long48 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime20, zoneId42);
        java.util.Date date51 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId54 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str55 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId54);
        java.lang.String str56 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId54);
        java.lang.String str57 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date51, zoneId54);
        java.lang.String str58 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId54);
        long long59 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime20, zoneId54);
        long long60 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime20);
        java.lang.String str62 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime20, "+08:00");
        java.time.ZoneId zoneId69 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str70 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId69);
        java.lang.String str71 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId69);
        java.lang.String str72 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId69);
        java.util.Date date73 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId69);
        java.lang.String str74 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date73);
        java.lang.String str75 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date73);
        java.lang.String str76 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date73);
        byte[] byteArray83 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate85 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray83, 0);
        java.time.LocalDateTime localDateTime87 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray83, 0);
        java.time.ZoneId zoneId91 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str92 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId91);
        java.time.ZonedDateTime zonedDateTime93 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray83, 28800, 0, zoneId91);
        java.lang.String str94 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122090245797L, zoneId91);
        java.lang.String str95 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date73, zoneId91);
        long long96 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime20, zoneId91);
        // The following exception was thrown during execution in test generation
        try {
            long long97 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, (int) '#', zoneId91);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str21, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1969-12-31" + "'", str24, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-50372000L) + "'", long25 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime34);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01" + "'", str43, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "19700101" + "'", str44, "19700101");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01 14:00:00" + "'", str45, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "19700101" + "'", str46, "19700101");
        org.junit.Assert.assertNull(zonedDateTime47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-100772000L) + "'", long48 == (-100772000L));
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1970-01-01" + "'", str55, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "19700101" + "'", str56, "19700101");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1970-01-01 14:00:00" + "'", str57, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "19700101" + "'", str58, "19700101");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-100772000L) + "'", long59 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-50372000L) + "'", long60 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "+08:00" + "'", str62, "+08:00");
        org.junit.Assert.assertNotNull(zoneId69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "1969-12-31" + "'", str70, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "1969-12-31 18:00:00.01" + "'", str71, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1969-12-31 17:59:59.999" + "'", str72, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "19700101" + "'", str74, "19700101");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "1970-01-01 14:00:00" + "'", str75, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "1970-01-01" + "'", str76, "1970-01-01");
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate85);
        org.junit.Assert.assertNull(localDateTime87);
        org.junit.Assert.assertNotNull(zoneId91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "1969-12-31" + "'", str92, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "19731114" + "'", str94, "19731114");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "1970-01-02 04:00:00" + "'", str95, "1970-01-02 04:00:00");
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + (-100772000L) + "'", long96 == (-100772000L));
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (byte) 100, 28800);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) ' ', 29143, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray6, (int) (byte) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray6, 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray6, 3407907);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray6, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097198");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = localTime11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localTime11);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((int) (short) 100, 28800, (int) '#', 28800, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 17193433300L + "'", long6 == 17193433300L);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date13, zoneId16);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId16);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, 2097249, 1, zoneId16);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray6, (int) (byte) -1);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime27);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId30);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime27, zoneId30);
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId36);
        java.time.ZonedDateTime zonedDateTime39 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId36);
        long long40 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime27, zoneId36);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, 2293857, 2293857, zoneId36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293857");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19700101" + "'", str18, "19700101");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 14:00:00" + "'", str19, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
        org.junit.Assert.assertNull(zonedDateTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str28, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1969-12-31" + "'", str31, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-50372000L) + "'", long32 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "19700101" + "'", str38, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-100772000L) + "'", long40 == (-100772000L));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) 100);
        java.time.ZoneId zoneId15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (short) 0, (int) (short) -1, zoneId15);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 4a4a");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        char[] charArray5 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray5, (int) ' ');
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray5, (int) (short) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime14);
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId17);
        long long19 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime14, zoneId17);
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray26, 100);
        java.util.Date date33 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId36);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date33, zoneId36);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId36);
        java.time.ZonedDateTime zonedDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray26, 2097249, 1, zoneId36);
        long long42 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime14, zoneId36);
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(66301905206252L, zoneId36);
        long long44 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray5, 2097184, (int) (short) 0, zoneId36);
        // The following exception was thrown during execution in test generation
        try {
            long long45 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 08:00:00.1", zoneId36);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 08:00:00.1");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str15, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31" + "'", str18, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-50372000L) + "'", long19 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "19700101" + "'", str38, "19700101");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01 14:00:00" + "'", str39, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "19700101" + "'", str40, "19700101");
        org.junit.Assert.assertNull(zonedDateTime41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-100772000L) + "'", long42 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "40710109" + "'", str43, "40710109");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("19731014");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 2097249);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 3407969);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 3407924);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 100);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long21 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId13, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId13);
        java.util.Date date23 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:34:57", zoneId13);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) 2097249, zoneId13);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, (int) ' ', zoneId13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 66118358169080000L + "'", long21 == 66118358169080000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 04:34:57 CST 1969");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19700101" + "'", str24, "19700101");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, (int) (short) 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray5, (int) (byte) -1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, 2097249, 2097249);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, 6357024);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray5, 3407907);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.util.Date date3 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId8);
        java.time.ZonedDateTime zonedDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId8);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3, zoneId8);
        long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 08:00:00", zoneId8);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 6357024, zoneId8);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 14:00:00" + "'", str4, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "19700101" + "'", str10, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-02 04:00:00" + "'", str12, "1970-01-02 04:00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long13 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId5, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId5);
        java.util.Date date15 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:34:57", zoneId5);
        java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 17:59:59", zoneId5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.01", "2006/03/01T13:08:55", zoneId5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66118358169080000L + "'", long13 == 66118358169080000L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "19700101" + "'", str14, "19700101");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Dec 31 04:34:57 CST 1969");
        org.junit.Assert.assertNotNull(zonedDateTime16);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 28800);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 2097249);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray5, 3407924);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, 3407904);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) (short) 10);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, (-1), 2097249);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) '4');
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 0);
        java.nio.charset.Charset charset26 = null;
        byte[] byteArray27 = null;
        java.nio.charset.Charset charset30 = null;
        java.time.ZoneId zoneId32 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-1000L), zoneId32);
        long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray27, (int) (short) 1, (int) ' ', charset30, zoneId32);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 1, (int) (byte) 100, charset26, zoneId32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "19691231" + "'", str33, "19691231");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(3407969, (int) (byte) 1, 3407904, 1, 6357027, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34079");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 2097249);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (short) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -96");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray5, (int) (byte) 0, 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray8, 100);
        java.util.Date date15 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId18);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId18);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date15, zoneId18);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId18);
        java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray8, 2097249, 1, zoneId18);
        long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis("19700101", zoneId18);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) 3407969, zoneId18);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 14:00:00" + "'", str21, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
        org.junit.Assert.assertNull(zonedDateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-28800000L) + "'", long24 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "19700101" + "'", str25, "19700101");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 3407924);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (byte) 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 28800);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (byte) 10, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357089");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format((-164183312498460L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 3407907);
        byte[] byteArray14 = new byte[] {};
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray14, (int) (byte) -1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray14, (int) (byte) 10);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray14, (int) ' ');
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray14, (int) (byte) 100);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray14, 10);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray14, (int) (short) -1);
        java.nio.charset.Charset charset29 = null;
        java.time.ZoneId zoneId33 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId33);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId33);
        long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray14, (int) ' ', (int) (short) 0, charset29, zoneId33);
        java.util.Date date37 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId33);
        long long38 = com.alibaba.fastjson2.util.DateUtils.parseMillis("", zoneId33);
        // The following exception was thrown during execution in test generation
        try {
            long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 3407907, zoneId33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNotNull(zoneId33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01" + "'", str34, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str35, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('#', 'a', '4', 'a', 'a', 'a', 'a', '#', '#', '4', '4', ' ', 'a', 'a', ' ', '4', '4', ' ', ' ', ' ', 'a', '4', '#');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) '4');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407969);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 6357024);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        char[] charArray0 = null;
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray0, 6357089, 2097204);
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.util.Date date3 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(date3);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId11);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId11);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId11);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId11);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3, zoneId11);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-28800000L), zoneId11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(72324968841610002L, zoneId11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22938");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-28800000L) + "'", long14 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01 14:00:00" + "'", str16, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "19700101" + "'", str17, "19700101");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.time.ZoneId zoneId3 = null;
        long long4 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId3);
        long long5 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long15 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId7, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date16 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId7);
        long long17 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId7);
        long long18 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str2, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-50372000L) + "'", long4 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-50372000L) + "'", long5 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 66118358169080000L + "'", long15 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-100772000L) + "'", long17 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-50372000L) + "'", long18 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-50372000L) + "'", long19 == (-50372000L));
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray6, 0);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray6, 2097249, 2293857);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("-0001-12-3 10:03:41");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: -0001-12-3 10:03:41");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('a', '4', '#', '#', '#', ' ', '4', '4');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray6, 3407969);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1968-01-14 08:03:22.384", 3407907);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -28");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.time.ZoneId zoneId1 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId1, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId1);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date10);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date10);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date10);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(date10);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66118358169080000L + "'", long9 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1969-12-31 04:00:28" + "'", str11, "1969-12-31 04:00:28");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1969-12-31 04:00:28" + "'", str12, "1969-12-31 04:00:28");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19691231" + "'", str13, "19691231");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31 04:00:28" + "'", str14, "1969-12-31 04:00:28");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(zonedDateTime1);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 2097184, 3407924);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 10);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (byte) 10, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407904");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds((-184370469531600L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29143 + "'", int1 == 29143);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId4);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId4);
        long long7 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId4);
        java.util.Date date8 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId4);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(date8, "1970-01-01 08:56:47.907");
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date8);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-28800000L) + "'", long7 == (-28800000L));
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1969-12-31 04:00:00" + "'", str9, "1969-12-31 04:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 08:56:47.907" + "'", str11, "1970-01-01 08:56:47.907");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1969-12-31 04:00:00" + "'", str12, "1969-12-31 04:00:00");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 0, 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) 'a');
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 0);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (-1));
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localTime24);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format((long) (short) 10, dateTimeFormatPattern4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((long) ' ', dateTimeFormatPattern4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(4L, dateTimeFormatPattern4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(5482764781252003L, dateTimeFormatPattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1757");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "31.12.1969 18:00:00" + "'", str5, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "31.12.1969 18:00:00" + "'", str6, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "31.12.1969 18:00:00" + "'", str7, "31.12.1969 18:00:00");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 3407907);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (-1), 29143);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.time.ZoneId zoneId2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = com.alibaba.fastjson2.util.DateUtils.parseDate("0010-35-52 10:10:10", "1968-02-16", zoneId2);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0010-35-52 10:10:10' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19731119");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Mon Nov 19 00:00:00 CST 1973");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1973-11-19 00:00:00" + "'", str2, "1973-11-19 00:00:00");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("+3693372-0 16:12:17");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) 'a');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, (int) (byte) 10, (int) (byte) 0);
        byte[] byteArray22 = new byte[] {};
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray22, 3407907);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray22, (int) (byte) -1);
        java.util.Date date32 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date32);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.format(date32);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date32);
        java.time.ZoneId zoneId40 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId40);
        java.time.ZonedDateTime zonedDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId40);
        long long43 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId40);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId40);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date32, zoneId40);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-28800000L), zoneId40);
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(6000431513341L, zoneId40);
        java.time.ZonedDateTime zonedDateTime48 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray22, (int) (short) 100, (int) (short) -1, zoneId40);
        java.util.Date date49 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001-01-01", zoneId40);
        java.util.Date date50 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-01-27", zoneId40);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime51 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) '4', 3407924, zoneId40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01" + "'", str33, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01 00:00:00" + "'", str34, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01 00:00:00" + "'", str35, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01" + "'", str41, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-28800000L) + "'", long43 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01" + "'", str44, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01 14:00:00" + "'", str45, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "19700101" + "'", str46, "19700101");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2160-02-23" + "'", str47, "2160-02-23");
        org.junit.Assert.assertNull(zonedDateTime48);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Sun Jan 02 09:54:17 CST 1");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Fri Jan 26 10:00:00 CST 1968");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19691231");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 23:28:11 CST 1969");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1968-01-27");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1968-01-27");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("+175711-11 11:00:52.003-06:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input +175711-11 11:00:52.003-06:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format((long) 2293857);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1969-12-31 18:38:13" + "'", str1, "1969-12-31 18:38:13");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31T19:45:57", 0);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("19680126", "1970-01-01 09:45:57.024");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '19680126' could not be parsed at index 2");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("0001/01/01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0001/01/01");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "0000-01-01 00:00:00");
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.OFFSET_8_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(1L, zoneId5);
        long long7 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId5);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-60890400000L), zoneId5);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-100772000L) + "'", long7 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1968-01-27" + "'", str8, "1968-01-27");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, (int) (short) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, (int) '#');
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime20, "1970-01-01 08:00:00.001+08:00");
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId27);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) 100, false, zoneId27);
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00.032+08:00", zoneId27);
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime20, zoneId27);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 100, 6357027, zoneId27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str22, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1969-12-31" + "'", str28, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1969-12-31 18:00:00.1" + "'", str29, "1969-12-31 18:00:00.1");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-50372000L) + "'", long31 == (-50372000L));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 6357024);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 6357024);
        char[] charArray18 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray18, (int) ' ');
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray18, (int) (short) 10);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray18, 3407907);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray18, (int) (byte) 10);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray18, 6357027, 28800);
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) 100, false, zoneId36);
        long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00.032+08:00", zoneId36);
        java.time.ZonedDateTime zonedDateTime40 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray18, 0, 0, zoneId36);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407969, (int) '4', zoneId36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1969-12-31" + "'", str37, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1969-12-31 18:00:00.1" + "'", str38, "1969-12-31 18:00:00.1");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertNull(zonedDateTime40);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1970-01-01 00:00:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 00:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("0010-35-52 10:10:10");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0010-35-52 10:10:10");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 0, (-1));
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, 3407969);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime4);
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId7);
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime4, zoneId7);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray16, 100);
        java.util.Date date23 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId26 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId26);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId26);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date23, zoneId26);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId26);
        java.time.ZonedDateTime zonedDateTime31 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray16, 2097249, 1, zoneId26);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime4, zoneId26);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(66301905206252L, zoneId26);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0L, zoneId26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date35 = com.alibaba.fastjson2.util.DateUtils.parseDate("+3693372-0 16:12:17", zoneId26);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input +3693372-0 16:12:17");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str5, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31" + "'", str8, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-50372000L) + "'", long9 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "19700101" + "'", str28, "19700101");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01 14:00:00" + "'", str29, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "19700101" + "'", str30, "19700101");
        org.junit.Assert.assertNull(zonedDateTime31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-100772000L) + "'", long32 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "40710109" + "'", str33, "40710109");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01" + "'", str34, "1970-01-01");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        long long5 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId3);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1970-01-01 08:00:00.01+08:00", zoneId3);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 08:00:00.01+08:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-62135625943000L) + "'", long5 == (-62135625943000L));
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) (short) 10);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 0, 2097204);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 10, 6357044);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) ' ');
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, (int) 'a');
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, 10);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, 6357024);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, 3407969);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray5, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407964");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 10, 1, -1]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 2097249);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 6357027);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (-1));
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 100);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId6);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId6);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("0000-00-52", zoneId6);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0000-00-52");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "19700101" + "'", str8, "19700101");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str9, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertNull(zonedDateTime10);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 3407969);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 2293857, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(zonedDateTime13);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "19700101");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1969/12/31");
        byte[] byteArray6 = null;
        java.nio.charset.Charset charset9 = null;
        java.util.Date date12 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId15);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId15);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date12, zoneId15);
        long long26 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId15, (int) ' ', (int) (byte) 0, 2097249, (int) (byte) 100, 6357024, (int) ' ', 3407907);
        long long34 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId15, 3407924, 3407924, 0, (int) (byte) 1, (int) (short) -1, (int) (short) 0, 10);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(66301905206252L, zoneId15);
        long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray6, 0, (-1), charset9, zoneId15);
        long long37 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId15);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1968-02-16 14:10:09");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19700101" + "'", str3, "19700101");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969/12/31" + "'", str5, "1969/12/31");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "19700101" + "'", str17, "19700101");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01 14:00:00" + "'", str18, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 120424011872003L + "'", long26 == 120424011872003L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 116486622349140000L + "'", long34 == 116486622349140000L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "4071-01-09" + "'", str35, "4071-01-09");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-100772000L) + "'", long37 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1968-02-16 14:10:09" + "'", str39, "1968-02-16 14:10:09");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("1973-11-19 00:00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(2097184, (int) ' ', (int) (short) 10, (int) (byte) 1, (int) (byte) 10, 3407904);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 66118653604104L + "'", long6 == 66118653604104L);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 28800, (int) (short) 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 18:00:00.1", (int) (short) 10, 0);
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 2293857);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 1);
        java.nio.charset.Charset charset23 = null;
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray30, 0);
        java.time.LocalDateTime localDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray30, 0);
        java.time.ZoneId zoneId38 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId38);
        java.time.ZonedDateTime zonedDateTime40 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray30, 28800, 0, zoneId38);
        long long48 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId38, 3407924, 1, 6357024, 3407907, 2097184, (int) (short) 10, (int) (byte) 1);
        long long49 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("4071-01-09 00:00:00", zoneId38);
        // The following exception was thrown during execution in test generation
        try {
            long long50 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 2097249, 2097249, charset23, zoneId38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097249");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertNull(localDateTime34);
        org.junit.Assert.assertNotNull(zoneId38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1969-12-31" + "'", str39, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime40);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 108030282971962000L + "'", long48 == 108030282971962000L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 66301862400000L + "'", long49 == 66301862400000L);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((int) (short) 10, 3407969, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date13, zoneId16);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId16);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, 2097249, 1, zoneId16);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray6, (int) (byte) -1);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray6, 2293857);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray6, (int) (short) 1, 28800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28800");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19700101" + "'", str18, "19700101");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 14:00:00" + "'", str19, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
        org.junit.Assert.assertNull(zonedDateTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 0, 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) 'a');
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 10);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, 2293857);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 28800);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 29143);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input d??");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, (int) (short) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, (int) '#');
        java.nio.charset.Charset charset16 = null;
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, 100, (int) (short) 0, charset16);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId4);
        long long6 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId4);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray13, 100);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId23);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId23);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20, zoneId23);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId23);
        java.time.ZonedDateTime zonedDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray13, 2097249, 1, zoneId23);
        long long29 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId23);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        long long33 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str2, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31" + "'", str5, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-50372000L) + "'", long6 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "19700101" + "'", str25, "19700101");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01 14:00:00" + "'", str26, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "19700101" + "'", str27, "19700101");
        org.junit.Assert.assertNull(zonedDateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-100772000L) + "'", long29 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str30, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str31, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-50372000L) + "'", long32 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-50372000L) + "'", long33 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str34, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 100);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (short) 0);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (short) -1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, (int) '#', 100);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) '4', (int) (short) 100);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, (int) (short) 100);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime27);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, (int) (short) 100);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, (int) (short) 100);
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, 2097249);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localTime25);
        org.junit.Assert.assertNull(localTime27);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(28800, (int) (byte) 10, 10, 2097249, 2097249, 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 845783446348L + "'", long6 == 845783446348L);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(6357024, 2097249, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097249");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId14);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId14);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId14);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId14);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId14, 6357044, 6357089, 3407904, (int) (short) 0, (int) (short) 1, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 6357089");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 14:00:00" + "'", str7, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1969-12-31" + "'", str15, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1969-12-31 18:00:00.01" + "'", str16, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969-12-31 17:59:59.999" + "'", str17, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01 00:00:00" + "'", str18, "1970-01-01 00:00:00");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(0, (int) (byte) 100, (int) (short) 0, (int) ' ', 2097249, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-61779822660L) + "'", long6 == (-61779822660L));
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 18:00:00");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "1969-12-31 17:59:59");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "1969/12/31");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "");
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 17:59:59" + "'", str3, "1969-12-31 17:59:59");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 18:00:00" + "'", str4, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969/12/31" + "'", str6, "1969/12/31");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("1969/12/31T18:56:47");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 3407907);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray6, (int) (byte) 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray6, 2293857);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, 6357024);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray6, 3407969, 0);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray6, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(zonedDateTime21);
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (byte) 100);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (byte) 1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 6357044);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) ' ');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("\000\000\000\000\000\000\000\000\000\000\00019:45:57");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ???????????19:45:57");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        char[] charArray8 = new char[] { '4', ' ' };
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray8, (int) (byte) 1);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId14);
        long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray8, 3407907, 0, zoneId14);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) -1, false, zoneId14);
        long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("4071-01-09 00:00:00", zoneId14);
        java.util.Date date19 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", zoneId14);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.toString(17193433300L, true, zoneId14);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  ]");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01 07:59:59.999" + "'", str17, "1970-01-01 07:59:59.999");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 66301862400000L + "'", long18 == 66301862400000L);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sun Jan 02 09:54:17 CST 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-07-19 07:57:13.3+08:00" + "'", str20, "1970-07-19 07:57:13.3+08:00");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format((long) (short) 10, dateTimeFormatPattern4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) (byte) 1, (-1), 29143, dateTimeFormatPattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "31.12.1969 18:00:00" + "'", str5, "31.12.1969 18:00:00");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("0035-00-00");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.time.ZoneId zoneId2 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId2);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/10/00", zoneId2);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31" + "'", str3, "1969-12-31");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) ' ');
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 2097184);
        byte[] byteArray21 = new byte[] {};
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray21, (int) (byte) -1);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray21, (int) (byte) 10);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray21, (int) ' ');
        java.time.LocalDate localDate29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray21, (int) 'a');
        java.time.LocalTime localTime31 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray21, (int) (short) 1);
        java.time.LocalTime localTime33 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray21, 1);
        java.time.LocalDateTime localDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray21, 6357044);
        java.time.LocalDateTime localDateTime37 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray21, (int) (byte) 0);
        java.time.LocalDateTime localDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray47 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate49 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray47, (int) ' ');
        java.time.LocalTime localTime51 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray47, (int) (short) 1);
        java.time.ZoneId zoneId54 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long55 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray47, (int) (byte) 100, 0, zoneId54);
        long long56 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime42, zoneId54);
        java.util.Date date58 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId61 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str62 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId61);
        java.lang.String str63 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId61);
        java.lang.String str64 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date58, zoneId61);
        java.lang.String str65 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date58);
        java.time.ZoneId zoneId71 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str72 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId71);
        java.lang.String str73 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId71);
        java.lang.String str74 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId71);
        java.lang.String str75 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date58, zoneId71);
        long long76 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime42, zoneId71);
        java.lang.String str77 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime42);
        java.time.LocalDateTime localDateTime80 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str81 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime80);
        java.time.ZoneId zoneId83 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str84 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId83);
        long long85 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime80, zoneId83);
        long long86 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 00:00:00", zoneId83);
        long long87 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime42, zoneId83);
        java.time.ZonedDateTime zonedDateTime88 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray21, 3407969, 10, zoneId83);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime89 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 10, 3407969, zoneId83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertNull(localTime31);
        org.junit.Assert.assertNull(localTime33);
        org.junit.Assert.assertNull(localDateTime35);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertNull(localTime51);
        org.junit.Assert.assertNotNull(zoneId54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-50372000L) + "'", long56 == (-50372000L));
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1970-01-01" + "'", str62, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "19700101" + "'", str63, "19700101");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1970-01-01 14:00:00" + "'", str64, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1970-01-01" + "'", str65, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1969-12-31" + "'", str72, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "1969-12-31 18:00:00.01" + "'", str73, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "1969-12-31 17:59:59.999" + "'", str74, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "1970-01-01 00:00:00" + "'", str75, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-50372000L) + "'", long76 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str77, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str81, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "1969-12-31" + "'", str84, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + (-50372000L) + "'", long85 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 21600000L + "'", long86 == 21600000L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-50372000L) + "'", long87 == (-50372000L));
        org.junit.Assert.assertNull(zonedDateTime88);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (-1));
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 6357024);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("31.12.1969 18:34:57", 3407969);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("0000-00-52");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', 'a', 'a', 'a', '4', '4', 'a', 'a', 'a', ' ', '4', 'a', '4', ' ', ' ', ' ', 'a', '#', '#', 'a', '4', 'a', '#');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime(' ', '4', ' ', ' ', ' ', '4', '#', 'a', 'a', 'a', 'a', '#', '#', ' ', '#', '4', '#', '#', '#', ' ', ' ', '4', 'a');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 2097184);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 3407924);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (short) 100);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, 3407904, (int) '#');
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 6357024);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localTime24);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "19700101");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId5);
        long long7 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId5);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1970-01-01 00:00:00");
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1970-01-01 08:00:00.001+08:00");
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray20 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray20, (int) ' ');
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray20, (int) (short) 1);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long28 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray20, (int) (byte) 100, 0, zoneId27);
        long long29 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime15, zoneId27);
        long long30 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId27);
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19700101" + "'", str3, "19700101");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-100772000L) + "'", long7 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str8, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str12, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-50372000L) + "'", long29 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-50372000L) + "'", long30 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-50372000L) + "'", long31 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str32, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format((-61779822660L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1968-01-16 16:56:17" + "'", str1, "1968-01-16 16:56:17");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, 6357027);
        char[] charArray14 = null;
        java.util.Date date19 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.format(date19);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.format(date19);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.toString(date19);
        java.time.ZoneId zoneId26 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId26);
        java.util.Date date28 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId26);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date19, zoneId26);
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId26);
        java.time.ZonedDateTime zonedDateTime31 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray14, 1, 28800, zoneId26);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, (-1), 29143, zoneId26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 00:00:00" + "'", str20, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 00:00:00" + "'", str21, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 00:00:00" + "'", str22, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertNull(date28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01 14:00:00" + "'", str29, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-50401000L) + "'", long30 == (-50401000L));
        org.junit.Assert.assertNull(zonedDateTime31);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (byte) 10);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) (byte) 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 6357024);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) '4');
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 100);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localTime21);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 3407924);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (byte) 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 28800);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(17193433300L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (byte) 10);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) (byte) 10);
        java.time.ZoneId zoneId20 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId20);
        long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId20);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray2, (int) (short) 0, zoneId20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-50400000L) + "'", long23 == (-50400000L));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0, 29143, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId15);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId15);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray3, 0, zoneId15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1969-12-31" + "'", str16, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969-12-31 18:00:00.01" + "'", str17, "1969-12-31 18:00:00.01");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("-0001-10-3");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input -0001-10-3");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 100);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 3407907);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 28800);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 3407907);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (byte) -1);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.format(date20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(date20);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.toString(date20);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId27);
        java.util.Date date29 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId27);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20, zoneId27);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date20);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date20);
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId36);
        long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId36);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20, zoneId36);
        java.time.ZonedDateTime zonedDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 0, (int) (byte) 1, zoneId36);
        java.time.LocalTime localTime43 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 0);
        java.time.LocalDateTime localDateTime45 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 6357024);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime47 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, 29143);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -29143");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 00:00:00" + "'", str21, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 00:00:00" + "'", str22, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 00:00:00" + "'", str23, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01" + "'", str28, "1970-01-01");
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01 14:00:00" + "'", str30, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "19700101" + "'", str32, "19700101");
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "19700101" + "'", str38, "19700101");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-50400000L) + "'", long39 == (-50400000L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01 14:00:00" + "'", str40, "1970-01-01 14:00:00");
        org.junit.Assert.assertNull(zonedDateTime41);
        org.junit.Assert.assertNull(localTime43);
        org.junit.Assert.assertNull(localDateTime45);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 2097204);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 6357024);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 3407969);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, 6357024, 100);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, 6357089, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 8454338");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        byte[] byteArray2 = new byte[] {};
        java.time.LocalTime localTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray2, (int) (byte) 10);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray2, (int) ' ');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray2, (int) (short) 1);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray2, (int) (short) 1, (int) (byte) 10, zoneId13);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId13);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(localTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNull(zonedDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01 14:00:00" + "'", str15, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01 14:00:00" + "'", str16, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01 14:00:00" + "'", str17, "1970-01-01 14:00:00");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 0);
        java.nio.charset.Charset charset15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 6357024, (int) (short) 1, charset15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357024");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (short) 100);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (-1));
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 2097249);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format(72000000L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01 14:00:00" + "'", str1, "1970-01-01 14:00:00");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("1968-02-16 14:10:09");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId3);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId3);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "1969-12-31 19:45:57");
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "2006/03/01T13:08:55");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31 19:45:57" + "'", str8, "1969-12-31 19:45:57");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 00:00:00" + "'", str12, "1970-01-01 00:00:00");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime2);
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId5);
        long long7 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId5);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray14, 100);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId24);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId24);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21, zoneId24);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId24);
        java.time.ZonedDateTime zonedDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray14, 2097249, 1, zoneId24);
        long long30 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId24);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1970-01-01 13:28:11.231", zoneId24);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1970-01-01 13:28:11.231");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str3, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31" + "'", str6, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-50372000L) + "'", long7 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "19700101" + "'", str26, "19700101");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01 14:00:00" + "'", str27, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "19700101" + "'", str28, "19700101");
        org.junit.Assert.assertNull(zonedDateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-100772000L) + "'", long30 == (-100772000L));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(122570285040L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray6, (int) (byte) 0, (-1));
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray6, 3407904);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray6, 28800);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("+3693372-0 16:12:17");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input +3693372-0 16:12:17");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray10 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray10, (int) ' ');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray10, (int) (short) 1);
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray10, (int) (byte) 100, 0, zoneId17);
        long long19 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime5, zoneId17);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.toString(5482764781252003L, true, zoneId17);
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("5375-12-04 00:00:00", zoneId17);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-50372000L) + "'", long19 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+175711-11 11:00:52.003-06:00" + "'", str20, "+175711-11 11:00:52.003-06:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 107480584800000L + "'", long21 == 107480584800000L);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray0, 6357024);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("4071-01-08 10:00:00", (int) (byte) -1, 6357027);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 4071-01-08 10:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0032/10/00");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, 2097204, 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) ' ');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 100);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 10);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 6357024);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("0000-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', '4', '4', 'a', '#', ' ', '#', '4', 'a', 'a', '4', 'a', '4', '#', ' ', ' ', ' ', '4', ' ', ' ', 'a', ' ', '#');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.nio.charset.Charset charset13 = null;
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray19, (int) (byte) 1);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray19, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray19, (int) (byte) -1);
        java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray19, 0);
        java.time.LocalDate localDate30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray19, (int) 'a');
        char[] charArray37 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate39 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray37, (int) ' ');
        java.time.LocalTime localTime41 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray37, (int) (short) 1);
        java.time.ZoneId zoneId44 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long45 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray37, (int) (byte) 0, (int) (byte) 0, zoneId44);
        java.time.ZonedDateTime zonedDateTime46 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray19, (int) (byte) 0, 0, zoneId44);
        java.util.Date date47 = com.alibaba.fastjson2.util.DateUtils.parseDate("5786-01-31", zoneId44);
        long long48 = com.alibaba.fastjson2.util.DateUtils.parseMillis("2006-03-02", zoneId44);
        // The following exception was thrown during execution in test generation
        try {
            long long49 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 2293857, 6357089, charset13, zoneId44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293857");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate39);
        org.junit.Assert.assertNull(localTime41);
        org.junit.Assert.assertNotNull(zoneId44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNull(zonedDateTime46);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Mon Jan 30 10:00:00 CST 5786");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1141228800000L + "'", long48 == 1141228800000L);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.util.Date date7 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(date7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString(date7);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId14);
        java.util.Date date16 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId14);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date7, zoneId14);
        long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId14);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, true, zoneId14);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId14);
        long long21 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId14);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1970-01-01 13:28:11.231");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01 14:00:00" + "'", str17, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-50401000L) + "'", long18 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str19, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-100772000L) + "'", long21 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 13:28:11.231" + "'", str23, "1970-01-01 13:28:11.231");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) '#', 2293857, (int) '#', 0, 29143, 2097184);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293857");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.01");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date2);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.toString(date2);
        java.util.Date date8 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(date8);
        java.time.ZoneId zoneId12 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId12);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date8, zoneId12);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.toString(116489408803937000L, false, zoneId12);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId12);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("19700101", zoneId12);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 19700101");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19691231" + "'", str3, "19691231");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 18:00:00.01" + "'", str4, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 14:00:00" + "'", str10, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-02 04:00:00" + "'", str14, "1970-01-02 04:00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+3693372-0 16:12:17" + "'", str15, "+3693372-0 16:12:17");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01 08:00:00" + "'", str16, "1970-01-01 08:00:00");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", "");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2);
        java.time.ZoneId zoneId10 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId10);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId10);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId10);
        java.util.Date date14 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId10);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId10);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.toString(date2);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.format(date2, "1969-12-31 18:00:00.01");
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.format(date2, "1968-01-15 20:30:27");
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Sun Jan 02 23:50:36 CST 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0001-01-01 00:00:00" + "'", str3, "0001-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1969-12-31" + "'", str11, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1969-12-31 18:00:00.01" + "'", str12, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1969-12-31 17:59:59.999" + "'", str13, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0001-01-01 00:00:00" + "'", str15, "0001-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0001-01-01 00:00:00" + "'", str16, "0001-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31 18:00:00.01" + "'", str18, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1968-01-15 20:30:27" + "'", str20, "1968-01-15 20:30:27");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) ' ');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId4);
        long long6 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId4);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray13, 100);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId23);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId23);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20, zoneId23);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId23);
        java.time.ZonedDateTime zonedDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray13, 2097249, 1, zoneId23);
        long long29 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId23);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "0001-00-01");
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        long long35 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str2, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31" + "'", str5, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-50372000L) + "'", long6 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "19700101" + "'", str25, "19700101");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01 14:00:00" + "'", str26, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "19700101" + "'", str27, "19700101");
        org.junit.Assert.assertNull(zonedDateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-100772000L) + "'", long29 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str30, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str31, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0001-00-01" + "'", str33, "0001-00-01");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str34, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-50372000L) + "'", long35 == (-50372000L));
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime(' ', '4', 'a', 'a', '4', ' ', '#', '#');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (short) 0, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(date4);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.toString(116489408803937000L, false, zoneId8);
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1968-01-01 15:27:41", zoneId8);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 14:00:00" + "'", str6, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-02 04:00:00" + "'", str10, "1970-01-02 04:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+3693372-0 16:12:17" + "'", str11, "+3693372-0 16:12:17");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-63131539000L) + "'", long12 == (-63131539000L));
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 100);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 3407907);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(1141240135347L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 2097184);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 3407924);
        java.util.Date date24 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.format(date24);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.format(date24);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.toString(date24);
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId31);
        java.util.Date date33 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId31);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date24, zoneId31);
        long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId31);
        long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1970-01-01 14:00:00", zoneId31);
        long long37 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 18:00:00", zoneId31);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 6357027, (int) ' ', zoneId31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01 00:00:00" + "'", str25, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01 00:00:00" + "'", str26, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01 00:00:00" + "'", str27, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01 14:00:00" + "'", str34, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-50401000L) + "'", long35 == (-50401000L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 21600000L + "'", long36 == 21600000L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-50400000L) + "'", long37 == (-50400000L));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 2097249);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) ' ', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray4, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (byte) -1);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.format(date20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(date20);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.toString(date20);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId27);
        java.util.Date date29 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId27);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20, zoneId27);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date20);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date20);
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId36);
        long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId36);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20, zoneId36);
        java.time.ZonedDateTime zonedDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 0, (int) (byte) 1, zoneId36);
        java.time.LocalTime localTime43 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 0);
        java.time.LocalTime localTime45 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 28800);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 00:00:00" + "'", str21, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 00:00:00" + "'", str22, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 00:00:00" + "'", str23, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01" + "'", str28, "1970-01-01");
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01 14:00:00" + "'", str30, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "19700101" + "'", str32, "19700101");
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "19700101" + "'", str38, "19700101");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-50400000L) + "'", long39 == (-50400000L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01 14:00:00" + "'", str40, "1970-01-01 14:00:00");
        org.junit.Assert.assertNull(zonedDateTime41);
        org.junit.Assert.assertNull(localTime43);
        org.junit.Assert.assertNull(localTime45);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format((long) 6357024, dateTimeFormatPattern4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(2097204, 3407904, 3407904, dateTimeFormatPattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407904");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "31.12.1969" + "'", str5, "31.12.1969");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 28800);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) '#', 3407904);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969/12/31T18:00:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1969/12/31T18:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 6357044);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 0, (int) (byte) 0, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 2097249);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) 'a');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) ' ');
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, (int) (short) 100);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray2, (int) (byte) 1, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("\000\000\000\000\000\000\000\000\000\000\00004:00:28");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: ???????????04:00:28");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097200");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) (short) 10, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray5, 6357024);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 0, 0);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 100);
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId24);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId24);
        long long27 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId24);
        long long35 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId24, 0, (int) 'a', 2293857, 2097204, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1);
        java.time.ZonedDateTime zonedDateTime36 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00.001+08:00", zoneId24);
        long long44 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId24, 2293857, 10, 100, (int) (byte) 100, (int) (byte) 1, (int) '4', 1);
        // The following exception was thrown during execution in test generation
        try {
            long long45 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (short) -1, 10, zoneId24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(zonedDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "19700101" + "'", str26, "19700101");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-50400000L) + "'", long27 == (-50400000L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 135235494809000L + "'", long35 == 135235494809000L);
        org.junit.Assert.assertNotNull(zonedDateTime36);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 72325000555312000L + "'", long44 == 72325000555312000L);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 3407924);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, (int) (short) 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray5, (int) (byte) -1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, 2097249, 2097249);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, 6357024);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, 6357089);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1973-10-02");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1973-10-02");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, (int) (short) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray3, (int) (byte) 10, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357089");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray7 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray7, (int) ' ');
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray7, (int) (short) 1);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray7, (int) (byte) 100, 0, zoneId14);
        long long16 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId14);
        char[] charArray21 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray21, (int) ' ');
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray21, (int) (short) 1);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime30);
        java.time.ZoneId zoneId33 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId33);
        long long35 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime30, zoneId33);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime44 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray42, 100);
        java.util.Date date49 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId52 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId52);
        java.lang.String str54 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId52);
        java.lang.String str55 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date49, zoneId52);
        java.lang.String str56 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId52);
        java.time.ZonedDateTime zonedDateTime57 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray42, 2097249, 1, zoneId52);
        long long58 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime30, zoneId52);
        java.lang.String str59 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(66301905206252L, zoneId52);
        long long60 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray21, 2097184, (int) (short) 0, zoneId52);
        long long61 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId52);
        long long62 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-50372000L) + "'", long16 == (-50372000L));
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertNull(localTime25);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str31, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1969-12-31" + "'", str34, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-50372000L) + "'", long35 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime44);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1970-01-01" + "'", str53, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "19700101" + "'", str54, "19700101");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1970-01-01 14:00:00" + "'", str55, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "19700101" + "'", str56, "19700101");
        org.junit.Assert.assertNull(zonedDateTime57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-100772000L) + "'", long58 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "40710109" + "'", str59, "40710109");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-100772000L) + "'", long61 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-50372000L) + "'", long62 == (-50372000L));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime(' ', 'a', 'a', '#', 'a', 'a', ' ', 'a', '4', '4', '#', '4', ' ', ' ');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, 2293857);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, (int) (short) 0);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 28800);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(1, 2293857, (int) ' ', (int) ' ', 6357089, 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5999533572541L + "'", long6 == 5999533572541L);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 6357027);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("-0001-10-3", (int) ' ');
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 28800);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 0);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 3407969);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId4);
        long long6 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId4);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray13, 100);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId23);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId23);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20, zoneId23);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId23);
        java.time.ZonedDateTime zonedDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray13, 2097249, 1, zoneId23);
        long long29 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId23);
        java.util.Date date32 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId35 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId35);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId35);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date32, zoneId35);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId35);
        long long40 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId35);
        long long41 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.time.ZoneId zoneId47 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId47);
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId47);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId47);
        java.time.ZonedDateTime zonedDateTime51 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("0001-01-01 00:00:00", zoneId47);
        long long52 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId47);
        java.lang.String str54 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1970-01-01 09:45:57.024");
        java.lang.String str55 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str2, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31" + "'", str5, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-50372000L) + "'", long6 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "19700101" + "'", str25, "19700101");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01 14:00:00" + "'", str26, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "19700101" + "'", str27, "19700101");
        org.junit.Assert.assertNull(zonedDateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-100772000L) + "'", long29 == (-100772000L));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01" + "'", str36, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "19700101" + "'", str37, "19700101");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01 14:00:00" + "'", str38, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "19700101" + "'", str39, "19700101");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-100772000L) + "'", long40 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-50372000L) + "'", long41 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1970-01-01" + "'", str48, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "19700101" + "'", str49, "19700101");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str50, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertNotNull(zonedDateTime51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-100772000L) + "'", long52 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1970-01-01 09:45:57.024" + "'", str54, "1970-01-01 09:45:57.024");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str55, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) 'a');
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (short) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 6357027, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format(21600000L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01 00:00:00" + "'", str1, "1970-01-01 00:00:00");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (short) 100);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.format(date20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(date20);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.toString(date20);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId27);
        java.util.Date date29 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId27);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20, zoneId27);
        long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId27);
        long long32 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1970-01-01 14:00:00", zoneId27);
        long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1969-12-31 18:34:57", zoneId27);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(120636367637L, zoneId27);
        long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (-1), (int) (short) 0, zoneId27);
        java.time.LocalDateTime localDateTime37 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime39 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, 6357044);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357040");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 00:00:00" + "'", str21, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 00:00:00" + "'", str22, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 00:00:00" + "'", str23, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01" + "'", str28, "1970-01-01");
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01 14:00:00" + "'", str30, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-50401000L) + "'", long31 == (-50401000L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 21600000L + "'", long32 == 21600000L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-48303000L) + "'", long33 == (-48303000L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "19731028" + "'", str34, "19731028");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(localDateTime37);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1970-01-01 08:34:57+08:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 08:34:57+08:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', ' ', '#', '#', 'a', 'a', '#', ' ', '#', '4', '#', '4', 'a', 'a');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.time.ZoneId zoneId2 = com.alibaba.fastjson2.util.DateUtils.OFFSET_8_ZONE_ID;
        java.util.Date date3 = com.alibaba.fastjson2.util.DateUtils.parseDate("", zoneId2);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(0L, zoneId2);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 14:00:00" + "'", str7, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "19700101" + "'", str10, "19700101");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, 28800, 3407907);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 4a4a");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        char[] charArray0 = null;
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray0, (int) (byte) 1, 2097249);
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 08:00:00.001");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 08:00:00.001" + "'", str4, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) (short) 10);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 0, 2097204);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) '4');
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (short) -1);
        java.time.ZonedDateTime zonedDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNull(zonedDateTime28);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (short) 1, (int) (byte) 100);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) (byte) 1);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 28800);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (short) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray4, 29143, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097204");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) (short) -1, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localTime6);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 6357024);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 10, 29143);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray6, 0);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, 3407924);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localTime23);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        int int2 = com.alibaba.fastjson2.util.DateUtils.hourAfterNoon(' ', '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2097187 + "'", int2 == 2097187);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 3407907, 0, zoneId8);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, (int) '4');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 2097249);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 3407924, 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray6, (int) (byte) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray6, (int) 'a');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, (int) 'a');
        char[] charArray21 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray21, (int) ' ');
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray21, (int) (short) 1);
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long29 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray21, (int) (byte) 0, (int) (byte) 0, zoneId28);
        java.time.ZonedDateTime zonedDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, (int) (byte) 0, 0, zoneId28);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ??");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertNull(localTime25);
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(zonedDateTime30);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407907");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (byte) 10);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) (byte) 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 6357024);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 29143, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 6357024);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime20, "19700101");
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId24);
        long long26 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime20, zoneId24);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, 3407904, zoneId24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407904");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-100772000L) + "'", long26 == (-100772000L));
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        byte[] byteArray1 = new byte[] {};
        java.time.LocalTime localTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray1, (int) (byte) -1);
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray1, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray1, (int) ' ');
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray1, (int) 'a');
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray1, 100);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray1, 28800);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray1, 0);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray1, (int) (short) 10);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray1, 0, 2097204);
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long33 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId25, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long41 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId25, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.toString(0L, true, zoneId25);
        java.time.ZonedDateTime zonedDateTime43 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray1, 3407904, (int) (short) 1, zoneId25);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("0001-00-01", zoneId25);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0001-00-01");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(localTime3);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 66118358169080000L + "'", long33 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 5482764781252003L + "'", long41 == 5482764781252003L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str42, "1970-01-01 08:00:00+08:00");
        org.junit.Assert.assertNull(zonedDateTime43);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        byte[] byteArray0 = null;
        long long3 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 3407907, 3407924);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "19700101");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId5);
        long long7 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId5);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1970-01-01 00:00:00");
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1970-01-01 08:00:00.001+08:00");
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray20 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray20, (int) ' ');
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray20, (int) (short) 1);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long28 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray20, (int) (byte) 100, 0, zoneId27);
        long long29 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime15, zoneId27);
        long long30 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId27);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "+08:00");
        long long33 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1970-07-19 07:57:13.3+08:00");
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "5375-12-04 00:00:00");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19700101" + "'", str3, "19700101");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-100772000L) + "'", long7 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str8, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str12, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-50372000L) + "'", long29 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-50372000L) + "'", long30 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+08:00" + "'", str32, "+08:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-50372000L) + "'", long33 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-07-19 07:57:13.3+08:00" + "'", str35, "1970-07-19 07:57:13.3+08:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "5375-12-04 00:00:00" + "'", str37, "5375-12-04 00:00:00");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 10);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, 6357024, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357089");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (-1));
        java.nio.charset.Charset charset17 = null;
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId23);
        java.time.ZonedDateTime zonedDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId23);
        long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId23);
        long long27 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01", zoneId23);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) 3407907, zoneId23);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 2097204, (int) '#', charset17, zoneId23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097204");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-28800000L) + "'", long26 == (-28800000L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-28800000L) + "'", long27 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "19700101" + "'", str28, "19700101");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 3407924);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 6357044);
        java.util.Date date23 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId26 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId26);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId26);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date23, zoneId26);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId26);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime31 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, 3407969, zoneId26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "19700101" + "'", str28, "19700101");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01 14:00:00" + "'", str29, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "19700101" + "'", str30, "19700101");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray6, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray6, 0);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId14);
        java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, 28800, 0, zoneId14);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.getZoneId("-3417-03-3 21:42:43.043", zoneId14);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: -3417-03-3 21:42:43.043");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1969-12-31" + "'", str15, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime16);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId4, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId4);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50400000L), zoneId4);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(1141240135347L, zoneId4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.getZoneId("-0001-97-0", zoneId4);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: -0001-97-0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66118358169080000L + "'", long12 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31" + "'", str14, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2006-03-02" + "'", str15, "2006-03-02");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 18:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31 18:00:28" + "'", str2, "1969-12-31 18:00:28");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('#', '4', '#', ' ', 'a', 'a', ' ', '4', '#', '#', '4', ' ', 'a', 'a', 'a', ' ', ' ', 'a', '4', '4', ' ', ' ', 'a');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern7 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format((long) (short) 10, dateTimeFormatPattern7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format((long) ' ', dateTimeFormatPattern7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(4L, dateTimeFormatPattern7);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format((-62109154705L), dateTimeFormatPattern7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(100, (int) (byte) 100, 6357089, dateTimeFormatPattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern7 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern7.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31.12.1969 18:00:00" + "'", str8, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31.12.1969 18:00:00" + "'", str9, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "31.12.1969 18:00:00" + "'", str10, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "12.01.1968 21:27:25" + "'", str11, "12.01.1968 21:27:25");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 2097249);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (short) 10, (int) '#');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 2097204);
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId25);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId25);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.toString((-28800000L), false, zoneId25);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0L, zoneId25);
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0000-01-01 00:00:00", zoneId25);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 0, 2097187, zoneId25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str27, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 00:00:00" + "'", str28, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-62167248343000L) + "'", long30 == (-62167248343000L));
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(0, 3407907, 0, (int) ' ', (-1), 29143);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (short) 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -96");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("1968-01-15 15:00:14");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(3407924, 6357089, 2097187);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34079");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 2097249);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 3407969);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 29143);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("0000-52-00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, (int) (short) 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray5, (int) (byte) -1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, 2097249, 2097249);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, 6357024);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray5, 6357044);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357039");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        char[] charArray6 = new char[] { '#', '#', ' ', 'a', ' ', ' ' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, (int) (short) -1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray6, 3407907, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (byte) 100, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "## a  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "## a  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #,  , a,  ,  ]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1973-11-19 23:18:05.04");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 14:00:00" + "'", str7, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1973-11-19 23:18:05.04" + "'", str12, "1973-11-19 23:18:05.04");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month(' ', 'a', 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray0, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        char[] charArray8 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray8, (int) ' ');
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray8, (int) (short) 1);
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray8, (int) (byte) 0, (int) (byte) 0, zoneId15);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId15);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01 00:00:00" + "'", str2, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01 14:00:00" + "'", str17, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19700101" + "'", str18, "19700101");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 00:00:00" + "'", str19, "1970-01-01 00:00:00");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, 6357024);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray6, 6357044);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray6, 100);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray6, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(29143, 6357044, 6357024);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 291");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 6357024);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId13);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 28800, 0, zoneId13);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (short) 100);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) (byte) 10, (int) (short) 0);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, 10);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31" + "'", str14, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long11 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId3, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.toString((-62034997616L), false, zoneId3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("\000\000\000\000\000\000\000\000\000\000\00008:00:00", zoneId3);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ???????????08:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66118358169080000L + "'", long11 == 66118358169080000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1968-01-14 08:03:22.384" + "'", str12, "1968-01-14 08:03:22.384");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) (short) 10);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, (-1), 2097249);
        char[] charArray26 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray26, (int) ' ');
        java.time.LocalTime localTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray26, (int) (short) 1);
        java.time.ZoneId zoneId33 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray26, (int) (byte) 0, (int) (byte) 0, zoneId33);
        java.time.ZonedDateTime zonedDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 3407907, (int) (short) 1, zoneId33);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime37 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097204");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertNotNull(zoneId33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNull(zonedDateTime35);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 101");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(date4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(date4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.toString(date4);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId11);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId11);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId11);
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId11);
        long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1970-01-01 14:00:00", zoneId11);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1968-02-16", zoneId11);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1968-02-16");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 14:00:00" + "'", str14, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-50401000L) + "'", long15 == (-50401000L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 21600000L + "'", long16 == 21600000L);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 6357027);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("57860131", (int) '#');
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 6357024);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        char[] charArray0 = new char[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, (int) (short) 100);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, 6357044);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray0, 6357044);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        long long7 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.getZoneId("\000\000\000\000\000\000\000\000\000\000\00008:00:00", zoneId4);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: ???????????08:00:00");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-50400000L) + "'", long7 == (-50400000L));
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 3407907, 0, zoneId8);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (int) '#', 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray6, (int) (byte) -1);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(date21);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.format(date21);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.toString(date21);
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId28);
        java.util.Date date30 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId28);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21, zoneId28);
        long long32 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId28);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, true, zoneId28);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId28);
        java.time.ZonedDateTime zonedDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 09:45:57.024+08:00", zoneId28);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime36 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray6, 6357027, (int) ' ', zoneId28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 00:00:00" + "'", str22, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 00:00:00" + "'", str23, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 00:00:00" + "'", str24, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01 14:00:00" + "'", str31, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-50401000L) + "'", long32 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str33, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "19700101" + "'", str34, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime35);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("-3417-03-3 21:42:43.043");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 0);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 28800);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray18, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray18, 10);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray18, 3407907);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray18, (int) (byte) 10);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray18, (-1));
        java.time.LocalTime localTime31 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray18, (int) (short) -1);
        java.time.LocalTime localTime33 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray18, 2097204);
        java.time.LocalDateTime localDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray18, (int) (short) -1);
        java.time.LocalDateTime localDateTime39 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("2006/03/01T13:08:55");
        long long40 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime39);
        java.time.ZoneId zoneId44 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long52 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId44, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId44);
        java.lang.String str54 = com.alibaba.fastjson2.util.DateUtils.toString(10L, true, zoneId44);
        long long55 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime39, zoneId44);
        java.time.ZonedDateTime zonedDateTime56 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray18, (int) (byte) 10, (int) (byte) 10, zoneId44);
        // The following exception was thrown during execution in test generation
        try {
            long long57 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 2097184, 10, zoneId44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097184");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNull(localTime31);
        org.junit.Assert.assertNull(localTime33);
        org.junit.Assert.assertNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1141240135000L + "'", long40 == 1141240135000L);
        org.junit.Assert.assertNotNull(zoneId44);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 66118358169080000L + "'", long52 == 66118358169080000L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "19700101" + "'", str53, "19700101");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1970-01-01 08:00:00.01+08:00" + "'", str54, "1970-01-01 08:00:00.01+08:00");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1141189735000L + "'", long55 == 1141189735000L);
        org.junit.Assert.assertNull(zonedDateTime56);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 2097249);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) ' ', (int) (byte) 1);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) 'a');
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 1);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 3407904);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 0, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localTime25);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        char[] charArray5 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray5, (int) ' ');
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray5, (int) (short) 1);
        java.time.ZoneId zoneId12 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray5, (int) (byte) 100, 0, zoneId12);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("0100-01-00", zoneId12);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0100-01-00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 6357024, 2097187, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357024");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01 00:00:00" + "'", str2, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.util.Date date5 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date5, zoneId8);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId8);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(date1, "2006-02-28");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "19700101" + "'", str10, "19700101");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 14:00:00" + "'", str11, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 14:00:00" + "'", str12, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2006-02-28" + "'", str14, "2006-02-28");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-01-15 15:00:14", "1969-12-30 13:59:59");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1968-01-15 15:00:14' could not be parsed at index 3");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357027");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(zonedDateTime12);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((int) (short) -1, 28800, 6357044);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28800");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) '4', 0, (int) (short) 1, 3407904, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('a', 'a', 'a', ' ', '4', ' ', ' ', '4');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', '#', '4', 'a', ' ', 'a', 'a', ' ', '#', '4', 'a', 'a', '#', 'a');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) 1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 3407904);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (-1));
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 2097187);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) ' ');
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        char[] charArray8 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray8, (int) ' ');
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray8, (int) (short) 1);
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray8, (int) (byte) 0, (int) (byte) 0, zoneId15);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId15);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01 00:00:00" + "'", str2, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01 14:00:00" + "'", str17, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19700101" + "'", str18, "19700101");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 00:00:00" + "'", str19, "1970-01-01 00:00:00");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('a', ' ', ' ', '#', '#', ' ', 'a', '4');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969/12/31T18:56:47");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3407000L + "'", long1 == 3407000L);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 2293857, 2097187);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293857");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, 6357027);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, 6357024);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) ' ', 2097184);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray5, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("1969-12-31 18:38:13");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 3407924);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (byte) 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, 3407969);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 6357044);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('#', ' ', ' ', ' ', '4', '#', 'a', '4', 'a', 'a', '4', '#', '#', ' ', ' ', 'a', '4', '4', 'a', '#', '#', 'a', ' ');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) -1, (int) (byte) 0);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 3407969, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(zonedDateTime23);
        org.junit.Assert.assertNull(localTime25);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('4', '4', '#', ' ', '#', 'a', 'a', '#');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 4a4a");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        char[] charArray3 = new char[] { '4', ' ' };
        java.time.LocalDate localDate5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray3, (int) (byte) 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray3, 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray3, (int) ' ');
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray3, (int) '4');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray3, 2097204);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray3, (int) (byte) -1);
        java.util.Date date23 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.format(date23);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.format(date23);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.toString(date23);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId30);
        java.util.Date date32 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId30);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date23, zoneId30);
        long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId30);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-60928207130L), zoneId30);
        long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray3, 3407969, (int) (short) 0, zoneId30);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId37 = com.alibaba.fastjson2.util.DateUtils.getZoneId("4071-01-09", zoneId30);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 4071-01-09");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  ]");
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 00:00:00" + "'", str24, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01 00:00:00" + "'", str25, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01 00:00:00" + "'", str26, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01 14:00:00" + "'", str33, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-50401000L) + "'", long34 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1968-01-27" + "'", str35, "1968-01-27");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray0, (int) (short) 100, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray6, 6357044);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357038");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, (int) (short) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, 3407924);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray3, (int) '#');
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray3, (int) (short) -1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, (int) 'a');
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, (int) (byte) 0);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, 1, 2293857);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId3);
        java.util.Date date5 = com.alibaba.fastjson2.util.DateUtils.parseDate("0000-01-01 00:00:00", "", zoneId3);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31" + "'", str4, "1969-12-31");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Jan 02 09:54:17 CST 1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-0001-12-3 10:03:41" + "'", str6, "-0001-12-3 10:03:41");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId3);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId3);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "");
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "2006/03/01T13:08:55");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) '#');
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 2097204);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray2, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.util.Date date6 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date6);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId14);
        java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId14);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId14);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId14);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date6, zoneId14);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.toString(21600000L, false, zoneId14);
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00.1", zoneId14);
        java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101", zoneId14);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1969-12-31 03:59:59", zoneId14);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1969-12-31 03:59:59");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-28800000L) + "'", long17 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01" + "'", str18, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 14:00:00" + "'", str19, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 14:00:00" + "'", str20, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Wed Dec 31 10:00:00 CST 1969");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("4071-01-08 10:00:00", 6357089);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (short) 100, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097204");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId5);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 14:00:00" + "'", str3, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-02 04:00:00" + "'", str7, "1970-01-02 04:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 14:00:00" + "'", str8, "1970-01-01 14:00:00");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray7, 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray7, 0);
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId15);
        java.time.ZonedDateTime zonedDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray7, 28800, 0, zoneId15);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122090245797L, zoneId15);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId19 = com.alibaba.fastjson2.util.DateUtils.getZoneId("0035-00-00", zoneId15);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 0035-00-00");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1969-12-31" + "'", str16, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19731114" + "'", str18, "19731114");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        byte[] byteArray0 = null;
        java.time.LocalDate localDate3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, (int) (short) 100, 3407907);
        org.junit.Assert.assertNull(localDate3);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        char[] charArray6 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) ' ');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, (int) (short) 1);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (byte) 100, 0, zoneId13);
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00", zoneId13);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("19700101", zoneId13);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 19700101");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 50400000L + "'", long15 == 50400000L);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern2 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH;
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((-58750206317L), dateTimeFormatPattern2);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format((long) 100, dateTimeFormatPattern2);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern2 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH + "'", dateTimeFormatPattern2.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1968/02/20" + "'", str3, "1968/02/20");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969/12/31" + "'", str4, "1969/12/31");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (short) 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 2097204);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, 2097249);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, 2097187);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        java.util.Date date3 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(date3);
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3, zoneId7);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1969-12-31 04:00:00", zoneId7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1969-12-31 04:00:28", zoneId7);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1969-12-31 04:00:28");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 14:00:00" + "'", str5, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-02 04:00:00" + "'", str9, "1970-01-02 04:00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100800000L) + "'", long10 == (-100800000L));
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("1969/12/31T19:45:57");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 6357044);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 0);
        java.nio.charset.Charset charset19 = null;
        char[] charArray24 = new char[] { '4', ' ' };
        java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray24, (int) (byte) 1);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId30);
        long long32 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray24, 3407907, 0, zoneId30);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) -1, false, zoneId30);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 0, (-1), charset19, zoneId30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4,  ]");
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01 07:59:59.999" + "'", str33, "1970-01-01 07:59:59.999");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime4, "1970-01-01 08:00:00.001+08:00");
        char[] charArray11 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray11, (int) ' ');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray11, (int) (short) 1);
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray11, (int) (byte) 0, (int) (byte) 0, zoneId18);
        long long20 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime4, zoneId18);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(107480576433327L, zoneId18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDate("\000\000\000\000\000\000\000\000\000\000\00014:00:00", zoneId18);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ???????????14:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str6, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-100772000L) + "'", long20 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "5375-12-04" + "'", str21, "5375-12-04");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format((-58750206317L), dateTimeFormatPattern4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(29143, (int) (byte) 100, (int) (short) 100, dateTimeFormatPattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 291");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1968/02/20" + "'", str5, "1968/02/20");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 2097184);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (-1));
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, (int) (byte) 10);
        java.nio.charset.Charset charset17 = null;
        java.time.ZoneId zoneId18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 6357027, (int) (byte) 10, charset17, zoneId18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) ' ');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 2097249);
        char[] charArray22 = new char[] { '4', ' ' };
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray22, (int) (byte) 1);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray22, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray22, (int) (byte) 1);
        java.time.LocalDate localDate31 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray22, 100);
        long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray22, 100, 0);
        java.time.LocalDateTime localDateTime36 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray22, 100);
        java.time.LocalDateTime localDateTime38 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray22, 10);
        java.time.ZoneId zoneId41 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long42 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray22, (int) (short) 100, (int) (short) 0, zoneId41);
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 100, zoneId41);
        long long44 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00.1", zoneId41);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.toString((-50401000L), false, zoneId41);
        // The following exception was thrown during execution in test generation
        try {
            long long46 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray2, 2097184, zoneId41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097184");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4,  ]");
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime38);
        org.junit.Assert.assertNotNull(zoneId41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01" + "'", str43, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1969-12-31 17:59:59" + "'", str45, "1969-12-31 17:59:59");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        byte[] byteArray2 = new byte[] {};
        java.time.LocalTime localTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray2, (int) (byte) 10);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray2, (int) ' ');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray2, (int) (short) 1);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray2, (int) (short) 1, (int) (byte) 10, zoneId13);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId13);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(localTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNull(zonedDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01 14:00:00" + "'", str15, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01 14:00:00" + "'", str16, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "19700101" + "'", str17, "19700101");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 2097204);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 6357024);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray2, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097247");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', '4', ' ', '#', '4', 'a', '4', 'a', ' ', '#', '#', ' ', '#', '#', '#', 'a', 'a', 'a', 'a', 'a', ' ', '#', '#');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 0, (-1));
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray5, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.format(date18);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.format(date18);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.toString(date18);
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId25);
        java.util.Date date27 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId25);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date18, zoneId25);
        long long29 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId25);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, true, zoneId25);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(119416895664L, zoneId25);
        long long32 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (int) '4', 0, zoneId25);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 00:00:00" + "'", str19, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 00:00:00" + "'", str20, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 00:00:00" + "'", str21, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 14:00:00" + "'", str28, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-50401000L) + "'", long29 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str30, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "19731014" + "'", str31, "19731014");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(10, 2097204, (int) (short) 1, 2097204, (-1), 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097204");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 0);
        java.time.ZoneId zoneId15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 10, 6357089, zoneId15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 100);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime17);
        java.time.ZoneId zoneId19 = null;
        long long20 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime17, zoneId19);
        long long21 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime17);
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId23, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date32 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId23);
        long long33 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime17, zoneId23);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray2, 29143, zoneId23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str18, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-50372000L) + "'", long20 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-50372000L) + "'", long21 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 66118358169080000L + "'", long31 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-100772000L) + "'", long33 == (-100772000L));
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("0001-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 0, (int) (short) -1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 3407904, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407904");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 100);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 3407907);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 28800);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 29143);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(6357089, 2097204, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        char[] charArray0 = new char[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, (int) (short) 100);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, 6357044);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId14);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId14);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId14);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray0, (int) (short) 10, (int) (short) 10, zoneId14);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1969-12-31" + "'", str15, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1969-12-31 18:00:00.01" + "'", str16, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969-12-31 17:59:59.999" + "'", str17, "1969-12-31 17:59:59.999");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 28800);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 04:00:00");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 04:00:00 CST 1969");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -33");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1968-01-27");
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.util.Date date9 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(date9);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(date9);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.toString(date9);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId16);
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date9, zoneId16);
        long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId16);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, true, zoneId16);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId16);
        long long23 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 09:45:57.024+08:00", "0000-52-00", zoneId16);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1970-01-01 09:45:57.024+08:00' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 00:00:00" + "'", str12, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 14:00:00" + "'", str19, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-50401000L) + "'", long20 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str21, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-100772000L) + "'", long23 == (-100772000L));
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(2097187, 3407907, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20971");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-01-15 15:00:14");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Mon Jan 15 15:00:14 CST 1968");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 6357024);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 2293857);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 1);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, 3407907);
        java.nio.charset.Charset charset25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 0, 6357027, charset25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) -1, (int) (byte) 0);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 3407907, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(zonedDateTime23);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -46");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (byte) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (byte) 10);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray4, 100, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097249");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.lang.Class<?> wildcardClass22 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '4', '#', ' ', 'a', 'a', ' ', ' ', 'a', '4', '4', 'a', ' ', '#');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (byte) 10);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) (byte) 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 6357024);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (byte) 100);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray26, 0);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray26, 0);
        java.time.ZoneId zoneId34 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId34);
        java.time.ZonedDateTime zonedDateTime36 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray26, 28800, 0, zoneId34);
        java.time.LocalTime localTime38 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray26, (int) (short) 100);
        java.time.LocalTime localTime40 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray26, 2097184);
        java.time.LocalDateTime localDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray26, 0);
        java.time.LocalTime localTime44 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray26, (-1));
        java.time.LocalDateTime localDateTime48 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime48, "19700101");
        java.time.ZoneId zoneId52 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId52);
        long long54 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime48, zoneId52);
        java.time.ZonedDateTime zonedDateTime55 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray26, (int) '#', (int) (byte) 1, zoneId52);
        // The following exception was thrown during execution in test generation
        try {
            long long56 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray2, 2097184, zoneId52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097184");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1969-12-31" + "'", str35, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime36);
        org.junit.Assert.assertNull(localTime38);
        org.junit.Assert.assertNull(localTime40);
        org.junit.Assert.assertNull(localDateTime42);
        org.junit.Assert.assertNull(localTime44);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "19700101" + "'", str50, "19700101");
        org.junit.Assert.assertNotNull(zoneId52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1970-01-01" + "'", str53, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-100772000L) + "'", long54 == (-100772000L));
        org.junit.Assert.assertNull(zonedDateTime55);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 28800);
        java.time.ZoneId zoneId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 3407924, (int) (short) -1, zoneId13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407920");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097204);
        java.time.ZoneId zoneId13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 0, 2097187, zoneId13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime2);
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId5);
        long long7 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId5);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId11);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId11);
        java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId11);
        long long15 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId11);
        char[] charArray22 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray22, (int) ' ');
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray22, (int) (short) 1);
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray22, (int) (byte) 0, (int) (byte) 0, zoneId29);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) 1, false, zoneId29);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId29);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1970-01-01 09:45:57.024", zoneId29);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 09:45:57.024");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str3, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31" + "'", str6, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-50372000L) + "'", long7 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-100772000L) + "'", long15 == (-100772000L));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localTime26);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01 08:00:00.001" + "'", str31, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-100772000L) + "'", long32 == (-100772000L));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('#', '4', ' ', 'a', 'a', '#', 'a', '4');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(2097184, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20971");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        char[] charArray8 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray8, (int) ' ');
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray8, (int) (short) 1);
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray8, (int) (byte) 0, (int) (byte) 0, zoneId15);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId15);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01 00:00:00" + "'", str2, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01 14:00:00" + "'", str17, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01" + "'", str18, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) ' ');
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407969);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 3407924);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime17, "19700101");
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime17, "1969/12/31");
        byte[] byteArray22 = null;
        java.nio.charset.Charset charset25 = null;
        java.util.Date date28 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId31);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId31);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date28, zoneId31);
        long long42 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId31, (int) ' ', (int) (byte) 0, 2097249, (int) (byte) 100, 6357024, (int) ' ', 3407907);
        long long50 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId31, 3407924, 3407924, 0, (int) (byte) 1, (int) (short) -1, (int) (short) 0, 10);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(66301905206252L, zoneId31);
        long long52 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray22, 0, (-1), charset25, zoneId31);
        long long53 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime17, zoneId31);
        // The following exception was thrown during execution in test generation
        try {
            long long54 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, (int) (short) 100, zoneId31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "19700101" + "'", str19, "19700101");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1969/12/31" + "'", str21, "1969/12/31");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "19700101" + "'", str33, "19700101");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01 14:00:00" + "'", str34, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 120424011872003L + "'", long42 == 120424011872003L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 116486622349140000L + "'", long50 == 116486622349140000L);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "4071-01-09" + "'", str51, "4071-01-09");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-100772000L) + "'", long53 == (-100772000L));
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (short) 0, (int) '4');
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 2097204, 6357044);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds((long) 3407904);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(0, 1, 28800, 28800, 3407924, 2097187);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-59368732973L) + "'", long6 == (-59368732973L));
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("0000-00-52");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(0, (int) '#', (int) (short) 1, (int) (short) 1, (int) '4', 2293857);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-62075149023L) + "'", long6 == (-62075149023L));
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 28800, (int) (short) 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (byte) 1, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357089");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray0, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.time.ZoneId zoneId1 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId1, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId1);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date10);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date10);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date10);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date10);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date10);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66118358169080000L + "'", long9 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1969-12-31 04:00:28" + "'", str11, "1969-12-31 04:00:28");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1969-12-31 04:00:28" + "'", str12, "1969-12-31 04:00:28");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19691231" + "'", str13, "19691231");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "19691231" + "'", str14, "19691231");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "19691231" + "'", str15, "19691231");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.util.Date date8 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(date8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(date8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.toString(date8);
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId15);
        java.util.Date date17 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId15);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date8, zoneId15);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId15);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, true, zoneId15);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId15);
        long long22 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId15);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("", zoneId15);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01 14:00:00" + "'", str18, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-50401000L) + "'", long19 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str20, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "19700101" + "'", str21, "19700101");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-100772000L) + "'", long22 == (-100772000L));
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-1), 2097184, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097184");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(28800, 3407969, 100, (int) (byte) 0, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 288");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(605032704, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        long long5 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.getZoneId("", zoneId3);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: ");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-62135625943000L) + "'", long5 == (-62135625943000L));
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        char[] charArray0 = null;
        long long3 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray0, (int) (short) 10, 3407907);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray0, 2097184);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('#', 'a', '#', 'a', 'a', '#', '4', 'a', 'a', 'a', '4', '#', '4', ' ');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (short) 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 2097204);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, 2097249);
        java.nio.charset.Charset charset21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 3407904, (int) (short) 1, charset21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407904");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, 2097249);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 3407924);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, (int) (byte) 10, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 6357027);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (short) 100);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 3407907);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 3407969);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1970-01-01 08:00:00+08:00", (int) (short) 0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "1968-02-16 14:10:09");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1968-02-16 14:10:09" + "'", str4, "1968-02-16 14:10:09");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00008:00:00" + "'", str5, "\000\000\000\000\000\000\000\000\000\000\00008:00:00");
    }
}

